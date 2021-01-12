import mypack.Simple;
class Test
{
    public static void main(String[] args) {
        int arr[]=Simple.inputArray();
        arr=moveZeros(arr);
        Simple.printArray(arr);
    }

    static int[] moveZeros(int arr[])
    {
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(arr[i]==0 && arr[j]!=0)
            {
                arr[i]=arr[j];
                arr[j]=0;
                i++;
            }
            if(arr[i]!=0)
            i++;

        }

        return arr;
    }
}