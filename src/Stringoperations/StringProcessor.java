package Stringoperations;

public class StringProcessor implements StringManipulator{
    public String reverse (String input)
    {
        String result = " ";
        for(int i = input.length()-1; i>=0; i--)
        {
            result = result + input.charAt(i);
        }
        return result;
    }
    public String toUppercase(String input)
    {
        return input.toUpperCase();
    }
    public String toLowercase(String input)
    {
        return input.toLowerCase();
    }
    public String concatenate(String str1, String str2)
    {
        return str1+str2;
    }
    public int countVowels(String input)
    {
        int count =0;
        input = input.toLowerCase();
        for(int i =0; i< input.length(); i++)
        {
            char ch = input.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }
        return count;
    }
    public int wordCount(String input)
    {
        if(input==null||input.trim().isEmpty()){
            return 0;
        }
        String words[] = input.trim().split("\\s+");
        return words.length;
    }

}

