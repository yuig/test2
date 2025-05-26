package zo2;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f142330a;

    static {
        int i13 = yo2.a.f139604a;
        f142330a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static char[] a(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i13 = 0;
        for (byte b13 : bArr) {
            int i14 = i13 + 1;
            char[] cArr2 = f142330a;
            cArr[i13] = cArr2[(b13 & 240) >>> 4];
            i13 += 2;
            cArr[i14] = cArr2[b13 & 15];
        }
        return cArr;
    }
}
