import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên không âm có tối đa 3 chữ số: ");
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("Số không hợp lệ");
        } else {
            String result = "";
            int hundreds = number / 100;
            int tens = (number % 100) / 10;
            int ones = number % 10;

            if (hundreds > 0) {
                switch (hundreds) {
                    case 1:
                        result += "một trăm ";
                        break;
                    case 2:
                        result += "hai trăm ";
                        break;
                    case 3:
                        result += "ba trăm ";
                        break;
                    case 4:
                        result += "bốn trăm ";
                        break;
                    case 5:
                        result += "năm trăm ";
                        break;
                    case 6:
                        result += "sáu trăm ";
                        break;
                    case 7:
                        result += "bảy trăm ";
                        break;
                    case 8:
                        result += "tám trăm ";
                        break;
                    case 9:
                        result += "chín trăm ";
                        break;
                }
            }

            if (tens > 0 || ones > 0) {
                if (tens == 1) {
                    switch (ones) {
                        case 0:
                            result += "mười";
                            break;
                        case 1:
                            result += "mười một";
                            break;
                        case 2:
                            result += "mười hai";
                            break;
                        case 3:
                            result += "mười ba";
                            break;
                        case 4:
                            result += "mười bốn";
                            break;
                        case 5:
                            result += "mười lăm";
                            break;
                        case 6:
                            result += "mười sáu";
                            break;
                        case 7:
                            result += "mười bảy";
                            break;
                        case 8:
                            result += "mười tám";
                            break;
                        case 9:
                            result += "mười chín";
                            break;
                    }
                } else {
                    switch (tens) {
                        case 2:
                            result += "hai mươi ";
                            break;
                        case 3:
                            result += "ba mươi ";
                            break;
                        case 4:
                            result += "bốn mươi ";
                            break;
                        case 5:
                            result += "năm mươi ";
                            break;
                        case 6:
                            result += "sáu mươi ";
                            break;
                        case 7:
                            result += "bảy mươi ";
                            break;
                        case 8:
                            result += "tám mươi ";
                            break;
                        case 9:
                            result += "chín mươi ";
                            break;
                    }

                    switch (ones) {
                        case 1:
                            result += "một";
                            break;
                        case 2:
                            result += "hai";
                            break;
                        case 3:
                            result += "ba";
                            break;
                        case 4:
                            result += "bốn";
                            break;
                        case 5:
                            result += "năm";
                            break;
                        case 6:
                            result += "sáu";
                            break;
                        case 7:
                            result += "bảy";
                            break;
                        case 8:
                            result += "tám";
                            break;
                        case 9:
                            result += "chín";
                            break;
                    }
                }
            }

            if (result.equals("")) {
                result = "không";
            }

            System.out.println(result);
        }
    }
}