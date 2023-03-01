package Bai3;
import java.util.StringTokenizer;
public class Vanban {
        private String input;

        public Vanban() {
        }

        public Vanban(String input) {
            this.input = input;
        }

        public String getInput() {
            return input;
        }

        public void setInput(String input) {
            this.input = input;
        }
        public int dem(String input) {
            StringTokenizer stringTokenizer =new StringTokenizer(input);
            int dem = stringTokenizer.countTokens();
            return dem;
        }
        public String tieuChuan (String input){
            input.trim();
            input.replace("  "," ");
            return input;
        }
        public String chuHoa (String input){
            return input.toUpperCase();
        }
        public String chuThuong (String input){
            return input.toLowerCase();
        }
        public String vietHoaTuDauTien (String input){
            String chucaidau = input.substring(0,1);
            String remainingLetters = input.substring(1, input.length());
            chucaidau = chucaidau.toUpperCase();
            input = chucaidau +remainingLetters;
            return input;
        }

        @Override
        public String toString() {
            return "Van ban sau khi sua doi[ " +  input + " ]";
        }
    }
