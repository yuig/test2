package cl;

import el.c1;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f27956a = b(1, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f27957b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f27958c;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f27959d;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f27960e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f27961f;

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f27962g;

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f27963h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f27964i;

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f27965j;

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f27966k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f27967l;

    /* renamed from: m, reason: collision with root package name */
    public static final byte[] f27968m;

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f27969n;

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f27970o;

    static {
        b(1, 2);
        f27957b = b(2, 32);
        f27958c = b(2, 16);
        f27959d = b(2, 17);
        f27960e = b(2, 18);
        f27961f = b(2, 1);
        f27962g = b(2, 2);
        f27963h = b(2, 3);
        f27964i = b(2, 1);
        f27965j = b(2, 2);
        f27966k = b(2, 3);
        f27967l = new byte[0];
        Charset charset = c1.f59463a;
        f27968m = "KEM".getBytes(charset);
        f27969n = "HPKE".getBytes(charset);
        f27970o = "HPKE-v1".getBytes(charset);
    }

    public static int a(bl.k kVar) {
        if (kVar == bl.k.f23444g || kVar == bl.k.f23441d) {
            return 32;
        }
        if (kVar == bl.k.f23442e) {
            return 48;
        }
        if (kVar == bl.k.f23443f) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static byte[] b(int i13, int i14) {
        if (i13 > 4 || i13 < 0) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i14 < 0 || (i13 < 4 && i14 >= (1 << (i13 * 8)))) {
            throw new IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) ((i14 >> (((i13 - i15) - 1) * 8)) & 255);
        }
        return bArr;
    }
}
