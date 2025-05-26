package q8;

import a7.o0;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f102997a;

    /* renamed from: b, reason: collision with root package name */
    public final int f102998b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102999c;

    /* renamed from: d, reason: collision with root package name */
    public final int f103000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f103001e;

    /* renamed from: f, reason: collision with root package name */
    public final int f103002f;

    /* renamed from: g, reason: collision with root package name */
    public final int f103003g;

    /* renamed from: h, reason: collision with root package name */
    public final int f103004h;

    /* renamed from: i, reason: collision with root package name */
    public final int f103005i;

    /* renamed from: j, reason: collision with root package name */
    public final long f103006j;

    /* renamed from: k, reason: collision with root package name */
    public final sp2.i f103007k;

    /* renamed from: l, reason: collision with root package name */
    public final a7.n0 f103008l;

    public x(byte[] bArr, int i13) {
        d7.c0 c0Var = new d7.c0(bArr, 0, 0);
        c0Var.m(i13 * 8);
        this.f102997a = c0Var.g(16);
        this.f102998b = c0Var.g(16);
        this.f102999c = c0Var.g(24);
        this.f103000d = c0Var.g(24);
        int g13 = c0Var.g(20);
        this.f103001e = g13;
        this.f103002f = d(g13);
        this.f103003g = c0Var.g(3) + 1;
        int g14 = c0Var.g(5) + 1;
        this.f103004h = g14;
        this.f103005i = a(g14);
        this.f103006j = c0Var.i(36);
        this.f103007k = null;
        this.f103008l = null;
    }

    public static int a(int i13) {
        if (i13 == 8) {
            return 1;
        }
        if (i13 == 12) {
            return 2;
        }
        if (i13 == 16) {
            return 4;
        }
        if (i13 == 20) {
            return 5;
        }
        if (i13 != 24) {
            return i13 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i13) {
        switch (i13) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j13 = this.f103006j;
        if (j13 == 0) {
            return -9223372036854775807L;
        }
        return (j13 * 1000000) / this.f103001e;
    }

    public final androidx.media3.common.b c(byte[] bArr, a7.n0 n0Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i13 = this.f103000d;
        if (i13 <= 0) {
            i13 = -1;
        }
        a7.n0 n0Var2 = this.f103008l;
        if (n0Var2 != null) {
            n0Var = n0Var2.b(n0Var);
        }
        a7.q qVar = new a7.q();
        qVar.f1181n = o0.r("audio/flac");
        qVar.f1182o = i13;
        qVar.D = this.f103003g;
        qVar.E = this.f103001e;
        qVar.F = d7.n0.F(this.f103004h);
        qVar.f1184q = Collections.singletonList(bArr);
        qVar.f1178k = n0Var;
        return new androidx.media3.common.b(qVar);
    }

    public x(int i13, int i14, int i15, int i16, int i17, int i18, int i19, long j13, sp2.i iVar, a7.n0 n0Var) {
        this.f102997a = i13;
        this.f102998b = i14;
        this.f102999c = i15;
        this.f103000d = i16;
        this.f103001e = i17;
        this.f103002f = d(i17);
        this.f103003g = i18;
        this.f103004h = i19;
        this.f103005i = a(i19);
        this.f103006j = j13;
        this.f103007k = iVar;
        this.f103008l = n0Var;
    }
}
