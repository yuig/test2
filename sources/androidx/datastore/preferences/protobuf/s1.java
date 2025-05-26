package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final q1 f18135a = new q1();

    /* renamed from: b, reason: collision with root package name */
    public static final r1 f18136b = new r1();

    public static void a(byte b13, byte b14, byte b15, byte b16, char[] cArr, int i13) {
        if (!e(b14)) {
            if ((((b14 + 112) + (b13 << 28)) >> 30) == 0 && !e(b15) && !e(b16)) {
                int i14 = ((b13 & 7) << 18) | ((b14 & 63) << 12) | ((b15 & 63) << 6) | (b16 & 63);
                cArr[i13] = (char) ((i14 >>> 10) + 55232);
                cArr[i13 + 1] = (char) ((i14 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public static boolean b(byte b13) {
        return b13 >= 0;
    }

    public static void c(byte b13, byte b14, char[] cArr, int i13) {
        if (b13 < -62 || e(b14)) {
            throw InvalidProtocolBufferException.c();
        }
        cArr[i13] = (char) (((b13 & 31) << 6) | (b14 & 63));
    }

    public static void d(byte b13, byte b14, byte b15, char[] cArr, int i13) {
        if (e(b14) || ((b13 == -32 && b14 < -96) || ((b13 == -19 && b14 >= -96) || e(b15)))) {
            throw InvalidProtocolBufferException.c();
        }
        cArr[i13] = (char) (((b13 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
    }

    public static boolean e(byte b13) {
        return b13 > -65;
    }

    public abstract void f(byte[] bArr, int i13, int i14);
}
