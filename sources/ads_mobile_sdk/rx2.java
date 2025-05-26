package ads_mobile_sdk;

/* loaded from: classes2.dex */
public abstract class rx2 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.b9 f10845a;

    static {
        f10845a = (mw2.f8410e && mw2.f8409d && !vc.b()) ? new a.u9(1) : new a.u9(0);
    }

    public static int a(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    public static int a(int i13, int i14, int i15) {
        if (i13 > -12 || i14 > -65 || i15 > -65) {
            return -1;
        }
        return (i13 ^ (i14 << 8)) ^ (i15 << 16);
    }

    public static int a(String str) {
        int length = str.length();
        int i13 = 0;
        int i14 = 0;
        while (i14 < length && str.charAt(i14) < 128) {
            i14++;
        }
        int i15 = length;
        while (true) {
            if (i14 >= length) {
                break;
            }
            char charAt = str.charAt(i14);
            if (charAt < 2048) {
                i15 += (127 - charAt) >>> 31;
                i14++;
            } else {
                int length2 = str.length();
                while (i14 < length2) {
                    char charAt2 = str.charAt(i14);
                    if (charAt2 < 2048) {
                        i13 += (127 - charAt2) >>> 31;
                    } else {
                        i13 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i14) < 65536) {
                                throw new px2(i14, length2);
                            }
                            i14++;
                        }
                    }
                    i14++;
                }
                i15 += i13;
            }
        }
        if (i15 >= length) {
            return i15;
        }
        throw new IllegalArgumentException(a.a.g("UTF-8 length does not fit in int: ", i15 + 4294967296L));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01f6, code lost:
    
        if (r4 > (-12)) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01fa, code lost:
    
        if (r2 != 0) goto L153;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rx2.a(byte[], int, int):boolean");
    }
}
