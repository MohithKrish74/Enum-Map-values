package com.keyword;

import java.util.EnumMap;
import java.util.Iterator;

enum AccessModifiers{PUBLIC,PRIVATE,PROTECTED,DEFAULT}
public class EnumMapValues
{
    public static void main(String[] args)
    {
        EnumMap<AccessModifiers,String> map = new EnumMap<AccessModifiers, String>(AccessModifiers.class);
        map.put(AccessModifiers.PUBLIC,"Public Access Modifier");
        map.put(AccessModifiers.PRIVATE,"Private Access Modifier");
        map.put(AccessModifiers.PROTECTED,"Protected Access Modifier");
        map.put(AccessModifiers.DEFAULT,"Default Access Modifier");
        Iterator<String> iterate = map.values().iterator();
        System.out.println("The Map is "+map);
        System.out.println("The Values are: ");
        while(iterate.hasNext())
        {
            System.out.println(iterate.next());
        }
    }
}
