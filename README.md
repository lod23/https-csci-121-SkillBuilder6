# Skill Builder 6 - Arrays

## The $i^{th}$ Prefix Average

The $i^{th}$ prefix average of an array, <span style="font-family: 'courier new', courier;">a</span>, is defined as the average of the first $i+1$ elements of the array.
$$ p[i] = \frac{𝑎[0]+𝑎[1]+𝑎[2]+⋯+𝑎[𝑖]}{i+1} $$ (**See README.pdf for a rendering of equations**)
Where $p$ is the prefix average array and $p[i]$ is the $i^{th}$ prefix average. Such prefix averages have applications in financial analysis. The SkillBuilder6 class below has a template method,


```java
public static double[] prefixAverage(double[] data)
```

Implement the method so that it returns an array containing the prefix averages.  Consider for example, 

```java
double[] myDatum = {2, 4, 6, 8, 10};
double[] pa = SkillBuilder6.prefixAverage(myDatum);

```

The array `pa` will contain the following prefix average values:

<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
pa <br/>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">2.0</span><span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">3.0</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">4.0</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">5.0</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">6.0</span>
</p>

For another example,

```java
double[] myDatum = {3.4, 5.2, 6.4, 9.6, 12.8};
double[] pa = SkillBuilder6.prefixAverage(myDatum);

```

<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
pa <br/>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">3.4</span><span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">4.3</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">5.0</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">6.15</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">7.48</span>
</p>

## Searching an Array

The SkillBuilder6 class below contains a method with the following signature,

```java
public static int  indexOf(int searchValue, int[] anArray)
```

Implement the method so that it takes an integer argument,  `searchValue`, and an integer array,  `anArray` and returns an integer that is the index of the first occurrence of  `searchValue` in  `anArray`. 

For example,

```java
int loc = SkillBuilder6.indexOf(5, {8,99,45,5,34,87,5,22,1})
```

should result in a  `3` returned and assigned to  `loc`.

## Searching an Array of Strings

The SkillBuilder6 class below contains a method with the following signature,

```java
public static int  indexOf(String s, String[] anArray)
```

Implement the method so that it takes a String argument, `s`, and returns an integer that is the index of the first occurrence of the String `s` in  `anArray`.

For example,

```java
int loc = SkillBuilder6.indexOf("python", {"za","hello","bye","anaconda","python","pycharm","python"});
```

should result in `4` returned and assigned to  `loc`.

## Remove an Item From an Array

The SkillBuilder6 class below contains a method with the following signature,

```java
public static String[] remove(String s, String[] anArray)
```

Implement this method so that after invoking this method, all occurrences of `s` in array `anArray` are removed leaving all remaining elements in the array in the same sequence.

For example,

```java
String[] myArray = {"French","English","Spanish","Greek","Russian","Spanish"};
myArray = SkillBuilder6.remove("Spanish",myArray)
```

results in the array `myArray` having the following elements,

<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
myArray <br/>
<span style="margin-left:25px;">
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">"French"</span><span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">"English"</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">"Greek"</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">"Russian"</span>
</span>
</p>

Notice that the method `remove()` returns a completely new array containing all the original elements except those matching `s`.  The returned array should match the size of the remaining elements and **NOT** have the original size of the array passed to `remove`.

## Let's Reverse It!

The SkillBuilder6 class below contains a method with the following signature,

```java
public static void reverse(int[] anArray)
```

Implement this method so that the contents of array `anArray` are reversed.  In other words, the first element becomes the last element and the last element becomes the first element, the second element becomes the second to the last element and the second to the last element becomes the second element, and so on.

For example,

```java
int[] na = {1,2,3,4,5,6};
SkillBuilder6.reverse(na);
```

The result is that the array `na` now looks like,

<p style="font-family: 'courier new', courier;background-color:#f5f5f5;padding:10px 10px 10px 10px;border:solid 1px #dddddd;color:green;font-weight:bold;">
na <br/>
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">*</span>---->
<span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">6</span><span style="padding:3px 3px 3px 3px;border:black solid 1px; background-color:#eeeeee;">5</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">4</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">3</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">2</span><span style="padding:3px 3px 3px 3px; border:black solid 1px; background-color:#eeeeee;">1</span>
</p>

Notice again that the method `reverse()` has the side effect of modifying the array passed to it!  Another way of saying this is the method `reverse()` reverses the array in-place.
