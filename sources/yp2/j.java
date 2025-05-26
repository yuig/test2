package yp2;

/* loaded from: classes4.dex */
public abstract class j {
    static {
        Runtime.getRuntime().maxMemory();
    }

    public static int a(int i13) {
        int i14 = 1;
        if (i13 > 127) {
            int i15 = 1;
            while (true) {
                i13 >>>= 8;
                if (i13 == 0) {
                    break;
                }
                i15++;
            }
            for (int i16 = (i15 - 1) * 8; i16 >= 0; i16 -= 8) {
                i14++;
            }
        }
        return i14;
    }
}
