import java.util.Scanner;

public class ZHONG{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums1 = new int[n];
            for(int i=0; i<n; ++i) {
                nums1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] nums2 = new int[m];
            for(int i=0; i<m; ++i) {
                nums2[i] = sc.nextInt();
            }
            System.out.println(findMedianSortedArrays(nums1, nums2));
        }
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int c = (m+n-1)/2+1;
        int d = (m+n)/2+1;
        int a = FindKthElm(nums1,0, m-1, nums2, 0, n-1, c);
        int b = FindKthElm(nums1,0, m-1, nums2, 0, n-1, d);
        return ((double)(a + b))/2;
    }

    private static int FindKthElm(int A[], int aBeg, int aEnd, int B[], int bBeg, int bEnd, int k)
    {
        if (aBeg > aEnd)
        {
            return B[bBeg + k - 1];
        }
        if (bBeg > bEnd)
        {
            return A[aBeg + k - 1];
        }

        int aMid = aBeg + (aEnd - aBeg)/2;
        int bMid = bBeg + (bEnd - bBeg)/2;

        int halfLen = aMid - aBeg + bMid - bBeg + 2;

        if (A[aMid] < B[bMid])
        {
            if (halfLen > k)
            {

                return FindKthElm(A, aBeg, aEnd, B, bBeg, bMid - 1, k);
            }
            else
            {
                return FindKthElm(A, aMid + 1, aEnd, B, bBeg, bEnd, k - (aMid - aBeg + 1));
            }
        }
        else
        {
            if (halfLen > k)
            {
                return FindKthElm(A, aBeg, aMid - 1, B, bBeg, bEnd, k);
            }
            else
            {
                return FindKthElm(A, aBeg, aEnd, B, bMid + 1, bEnd, k - (bMid - bBeg + 1));
            }
        }
    }
}