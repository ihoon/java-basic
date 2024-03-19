package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        //음악 플레어 켜기
        on(data);

        //volume 증가
        volumeUp(data);

        //volume 증가
        volumeUp(data);
        //volume 감소
        volumeDown(data);

        //음악플레이어 상태
        showStatus(data);

        //음악플레이어 끄기
        off(data);

    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작 합니다.");
    }
    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료 합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: "+ data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨: "+ data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println(" 음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println(" 음악플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println(" 음악 플레이어 OFF ");
        }
    }
}
