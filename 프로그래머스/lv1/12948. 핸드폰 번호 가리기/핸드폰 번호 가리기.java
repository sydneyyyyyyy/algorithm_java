class Solution {
    public String solution(String phone_number) {
        String result = "";
        for(int i=0; i<phone_number.length(); i++){
            if(phone_number.length() - i <= 4){
                result += phone_number.charAt(i);
            }else{
                result += phone_number.charAt(i);
                result = result.replace(result.charAt(i),'*');
            }
        }
        return result;
    }
}