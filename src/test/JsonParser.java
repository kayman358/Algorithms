/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kolade
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//import static org.codehaus.groovy.runtime.DefaultGroovyMethods.toList;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;

public class JsonParser {
    public Object parse(String input) {
        // IMPLEMENT ME
            return null;
        }
    public static void main(String[] args) {
        final JsonParser jsonParser = new JsonParser();
        System.out.println("First Step");
        Object result = jsonParser.parse(" [ 10, 20, 0.2 ] ");
        if (result != null) {
            List<Object> list = (List<Object>) result;
            for (int i = 0; i < 3; i++) {
                System.out.println(list.get(i));
            }
        }
        
        System.out.println("Second Step");
        result = jsonParser.parse(" [ 10 , 20, \"hello\", 30.1 ] ");
        if (result != null) {
            List<Object> list = (List<Object>) result;
            for (int i = 0; i < 4; i++) {
                System.out.println(list.get(i));
            }
        }
        
        System.out.println("Third Step");
        result = jsonParser.parse("{" +
                                  " \"hello\": \"world\"," +
                                  " \"key1\": 20," +
                                  " \"key2\": 20.3," +
                                  " \"foo\": \"bar\"" +
                                  "}");
        if (result != null) {
            Map<String, Object> map = (Map<String, Object>) result;
            System.out.println(map.get("hello"));
            System.out.println(map.get("key1"));
            System.out.println(map.get("key2"));
            System.out.println(map.get("foo"));
        }
        
        System.out.println("Fourth Step");
        result = jsonParser.parse("{" +
                                  " \"hello\" : \"world\"," +
                                  " \"key1\" : 20, " +
                                  " \"key2\": 20.3, " +
                                  " \"foo\": {" +
                                  "             \"hello1\": \"world1\"," +
                                  "             \"key3\": [200, 300]" +
                                  "          }" +
                                  "}");
        if (result != null) {
            Map<String, Object> map = (Map<String, Object>) result;
            System.out.println(map.get("hello"));
            System.out.println(map.get("key1"));
            System.out.println(map.get("key2"));
            Map<String, Object> nestedMap = (Map<String, Object>) map.get("foo");
            System.out.println(nestedMap.get("hello1"));
            List<Object> nestedList = (List<Object>) nestedMap.get("key3");
            for (int i = 0; i < 2; i++) {
                System.out.println(nestedList.get(i));
            }
        }
        
    }
    }
    
    
    
    
