package java_questions_group_2;

public class SortLetter2 {
    public static boolean isValid(String str){
        boolean isValid = false;
        if(str.length() >= 6 && !str.contains(" ")){
            int count = 0, upperCount = 0, lowerCount = 0, digitCount = 0, specialchar = 0;

            for(char each : str.toCharArray()){
                if(Character.isUpperCase(each)){
                    upperCount += 1;
                }
                if(Character.isLowerCase(each)){
                    lowerCount += 1;
                }
                if(Character.isDigit(each)){
                    digitCount += 1;
                }
                for(char i = 33; i < 48; i++){
                    if(each == i){
                        specialchar += 1;
                    }
                }
            }
            if(upperCount >= 1){
                count += 1;
            }
            if(lowerCount >= 1){
                count += 1;
            }
            if(digitCount >= 1){
                count += 1;
            }
            if(specialchar >= 1){
                count += 1;
            }
            if(count == 4){
                isValid = true;
            }
        }
        return isValid;
    }
    }

