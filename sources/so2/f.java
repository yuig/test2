package so2;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f114784a = new char[RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN];

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f114785b = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL];

    static {
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            a('u', i14);
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        while (true) {
            byte[] bArr = f114785b;
            if (i13 >= 33) {
                bArr[9] = 3;
                bArr[10] = 3;
                bArr[13] = 3;
                bArr[32] = 3;
                bArr[44] = 4;
                bArr[58] = 5;
                bArr[123] = 6;
                bArr[125] = 7;
                bArr[91] = 8;
                bArr[93] = 9;
                bArr[34] = 1;
                bArr[92] = 2;
                return;
            }
            bArr[i13] = Byte.MAX_VALUE;
            i13++;
        }
    }

    public static void a(char c13, int i13) {
        if (c13 != 'u') {
            f114784a[c13] = (char) i13;
        }
    }
}
