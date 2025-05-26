package an;

/* loaded from: classes3.dex */
public abstract class g extends j {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f15617g = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: h, reason: collision with root package name */
    public static final int[][] f15618h = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    public static String t0(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb3 = new StringBuilder(12);
        sb3.append(str.charAt(0));
        char c13 = cArr[5];
        switch (c13) {
            case '0':
            case '1':
            case '2':
                sb3.append(cArr, 0, 2);
                sb3.append(c13);
                sb3.append("0000");
                sb3.append(cArr, 2, 3);
                break;
            case '3':
                sb3.append(cArr, 0, 3);
                sb3.append("00000");
                sb3.append(cArr, 3, 2);
                break;
            case '4':
                sb3.append(cArr, 0, 4);
                sb3.append("00000");
                sb3.append(cArr[4]);
                break;
            default:
                sb3.append(cArr, 0, 5);
                sb3.append("0000");
                sb3.append(c13);
                break;
        }
        if (str.length() >= 8) {
            sb3.append(str.charAt(7));
        }
        return sb3.toString();
    }
}
