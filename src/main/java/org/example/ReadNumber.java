package org.example;
import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cân nặng: ");
        int weight = scanner.nextInt();
        System.out.println(weightConversionsToWords(weight,""));
    }
    protected static String weightConversionsToWords(int weight,String Words){

        int  integerPart;
        int remainder=0;
        if (weight>999) return Words="out of ability";
        else if(weight>=100){
            integerPart=(int)(weight/100)*100;
            remainder=weight%100;
        }
        else if(weight>=20) {
            integerPart=(int)(weight/10)*10;
            remainder=weight%10;
        }
        else integerPart=weight;
        switch (integerPart) {
            case 0:
                Words+="Zero";
                break;
            case 1:
                Words+="one";
                break;
            case 2:
                Words+="two";
                break;
            case 3:
                Words+="three";
                break;
            case 4:
                Words+="four";
                break;
            case 5:
                Words+="five";
                break;
            case 6:
                Words+="six";
                break;
            case 7:
                Words+="seven";
                break;
            case 8:
                Words+="eight";
                break;
            case 9:
                Words+="nine";
                break;
            case  10:
                Words+="ten";
                break;
            case 11:
                Words+="eleven";
                break;
            case 12:
                Words+="twelve";
                break;
            case 13:
                Words+="thirteen";
                break;
            case 14:
                Words+="fourteen";
                break;
            case 15:
                Words+="fifteen";
                break;
            case 16:
                Words+="sixteen";
                break;
            case 17:
                Words+="seventeen";
                break;
            case 18:
                Words+="eighteen";
                break;
            case 19:
                Words+="nineteen";
                break;
            case 20:
                Words+="twenty";
                break;
            case 30:
                Words+="thirty";
                break;
            case 40:
                Words+="forty";
                break;
            case 50:
                Words+="fifty";
                break;
            case 60:
                Words+="sixty";
                break;
            case 70:
                Words+="seventy";
                break;
            case 80:
                Words+="eighty";
                break;
            case 90:
                Words+="ninety";
                break;
            case 100:
                Words+="one hundred";
                break;
            case 200:
                Words+="two hundred";
                break;
            case 300:
                Words+="three hundred";
                break;
            case 400:
                Words+="four hundred";
                break;
            case 500:
                Words+="five hundred";
                break;
            case 600:
                Words+="six hundred";
                break;
            case 700:
                Words+="seven hundred";
                break;
            case 800:
                Words+="eight hundred";
                break;
            case 900:
                Words+="night hundred";
                break;

        }
        if(integerPart<20) return Words;
        else return  weightConversionsToWords( remainder,Words+" ");

    }
}
