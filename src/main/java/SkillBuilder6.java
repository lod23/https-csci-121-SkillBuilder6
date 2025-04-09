/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder6
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        if (data == null || data.length == 0) {
            return new double[0];
        }

        double[] prefixAverages = new double[data.length];
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            prefixAverages[i] = sum / (i + 1);
        }

        return prefixAverages;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        if (anArray == null) {
            return -1;
        }

        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == searchValue) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        if (anArray == null || s == null) {
            return -1;
        }

        for (int i = 0; i < anArray.length; i++) {
            if (s.equals(anArray[i])) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        if (anArray == null) {
            return new String[0];
        }

        // First count how many elements we need to keep
        int count = 0;
        for (String item : anArray) {
            if (item == null) {
                if (s == null) continue;
            } else if (item.equals(s)) {
                continue;
            }
            count++;
        }
        // Create new array with the correct size
        String[] result = new String[count];
        int index = 0;

        // Fill the new array
        for (String item : anArray) {
            if (item == null) {
                if (s == null) continue;
            } else if (item.equals(s)) {
                continue;
            }
            result[index++] = item;
        }

        return result;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        if (anArray == null || anArray.length <= 1) {
            return;
        }

        int left = 0;
        int right = anArray.length - 1;

        while (left < right) {
            // Swap elements
            int temp = anArray[left];
            anArray[left] = anArray[right];
            anArray[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }
}
