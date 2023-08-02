class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s; 
        }

        StringBuilder[] sbs = new StringBuilder[numRows];
        int row = 0; 
        int dir = 0;

        for(int i = 0; i < sbs.length; i++){
            sbs[i] = new StringBuilder();
        }

        for(int i = 0; i < s.length(); i++){
            row += dir;
            sbs[row].append(s.charAt(i));

            if(row == 0 || row == numRows - 1){
                dir = (dir == 0) ? 1 : -dir;
            }
        }
        return convertString(sbs);
    }

    private String convertString(StringBuilder[] sbs){
        StringBuilder result = new StringBuilder();

        for(StringBuilder sb: sbs){
            result.append(sb.toString());
        }
        return result.toString();
    }

}