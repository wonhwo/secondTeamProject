public class View {


    public static void start() {
        while (true) {
            showMainScreen();
            selectMenu();
        }
    }

    private static void selectMenu() {
        String menuNum = Utility.input("- 메뉴 번호 : ");

        switch (menuNum) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case  "5":
                break;
            default:
                System.out.println("없는 번호임");
        }
    }

    private static void showMainScreen() {
        System.out.println("\n =============== 은행 업무 ===============");
        System.out.println("# 1. 환율 / 환전");
        System.out.println("# 2. 세계 시간");
        System.out.println("# 3. 예금");
        System.out.println("# 4. 대출");
        System.out.println("# 5. 시스템 종료");
    }
}