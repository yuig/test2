package r8;

import androidx.media3.common.ParserException;
import d7.n0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import l0.k;
import q8.b0;
import q8.e0;
import q8.k0;
import q8.n;
import q8.r;
import q8.s;
import q8.t;
import q8.u;

/* loaded from: classes3.dex */
public final class a implements s {

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f106729s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f106730t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: u, reason: collision with root package name */
    public static final byte[] f106731u;

    /* renamed from: v, reason: collision with root package name */
    public static final byte[] f106732v;

    /* renamed from: c, reason: collision with root package name */
    public final r f106735c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f106736d;

    /* renamed from: e, reason: collision with root package name */
    public long f106737e;

    /* renamed from: f, reason: collision with root package name */
    public int f106738f;

    /* renamed from: g, reason: collision with root package name */
    public int f106739g;

    /* renamed from: h, reason: collision with root package name */
    public long f106740h;

    /* renamed from: j, reason: collision with root package name */
    public int f106742j;

    /* renamed from: k, reason: collision with root package name */
    public long f106743k;

    /* renamed from: l, reason: collision with root package name */
    public u f106744l;

    /* renamed from: m, reason: collision with root package name */
    public k0 f106745m;

    /* renamed from: n, reason: collision with root package name */
    public k0 f106746n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f106747o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f106748p;

    /* renamed from: q, reason: collision with root package name */
    public long f106749q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f106750r;

    /* renamed from: b, reason: collision with root package name */
    public final int f106734b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f106733a = new byte[1];

    /* renamed from: i, reason: collision with root package name */
    public int f106741i = -1;

    static {
        int i13 = n0.f53866a;
        Charset charset = StandardCharsets.UTF_8;
        f106731u = "#!AMR\n".getBytes(charset);
        f106732v = "#!AMR-WB\n".getBytes(charset);
    }

    public a() {
        r rVar = new r();
        this.f106735c = rVar;
        this.f106746n = rVar;
    }

    @Override // q8.s
    public final void a() {
    }

    @Override // q8.s
    public final void b(long j13, long j14) {
        this.f106737e = 0L;
        this.f106738f = 0;
        this.f106739g = 0;
        this.f106749q = j14;
        e0 e0Var = this.f106747o;
        if (!(e0Var instanceof b0)) {
            if (j13 == 0 || !(e0Var instanceof n)) {
                this.f106743k = 0L;
                return;
            } else {
                this.f106743k = (Math.max(0L, j13 - ((n) e0Var).f102965b) * 8000000) / r7.f102968e;
                return;
            }
        }
        b0 b0Var = (b0) e0Var;
        k kVar = b0Var.f102885b;
        long m13 = kVar.f81235b == 0 ? -9223372036854775807L : kVar.m(n0.b(b0Var.f102884a, j13));
        this.f106743k = m13;
        if (Math.abs(this.f106749q - m13) < 20000) {
            return;
        }
        this.f106748p = true;
        this.f106746n = this.f106735c;
    }

    public final int c(t tVar) {
        boolean z13;
        tVar.g();
        byte[] bArr = this.f106733a;
        tVar.s(bArr, 0, 1);
        byte b13 = bArr[0];
        if ((b13 & 131) > 0) {
            throw ParserException.a("Invalid padding bits for frame header " + ((int) b13), null);
        }
        int i13 = (b13 >> 3) & 15;
        if (i13 >= 0 && i13 <= 15 && (((z13 = this.f106736d) && (i13 < 10 || i13 > 13)) || (!z13 && (i13 < 12 || i13 > 14)))) {
            return z13 ? f106730t[i13] : f106729s[i13];
        }
        StringBuilder sb3 = new StringBuilder("Illegal AMR ");
        sb3.append(this.f106736d ? "WB" : "NB");
        sb3.append(" frame type ");
        sb3.append(i13);
        throw ParserException.a(sb3.toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017a  */
    @Override // q8.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(q8.t r19, q8.c0 r20) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r8.a.d(q8.t, q8.c0):int");
    }

    public final boolean e(t tVar) {
        tVar.g();
        byte[] bArr = f106731u;
        byte[] bArr2 = new byte[bArr.length];
        tVar.s(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f106736d = false;
            tVar.p(bArr.length);
            return true;
        }
        tVar.g();
        byte[] bArr3 = f106732v;
        byte[] bArr4 = new byte[bArr3.length];
        tVar.s(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f106736d = true;
        tVar.p(bArr3.length);
        return true;
    }

    @Override // q8.s
    public final void f(u uVar) {
        this.f106744l = uVar;
        k0 D = uVar.D(0, 1);
        this.f106745m = D;
        this.f106746n = D;
        uVar.A();
    }

    @Override // q8.s
    public final boolean i(t tVar) {
        return e(tVar);
    }
}
