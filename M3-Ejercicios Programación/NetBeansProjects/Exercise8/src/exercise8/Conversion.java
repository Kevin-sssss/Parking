/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8;
import java.lang.Integer;
/**
 *
 * @author Kevin
 */
public class Conversion 
{
 public String intToHex(int n)
 {    
return Integer.toHexString(n).toUpperCase();
 }
  
 public String intToOct (int n){
 return Integer.toOctalString(n);
 }
   
public String intToBin(int n) 
{
return Integer.toBinaryString(n);
}    
}
