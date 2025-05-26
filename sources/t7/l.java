package t7;

import android.net.Uri;
import androidx.media3.common.DrmInitData;
import d7.d0;
import d7.k0;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import lb.l0;
import n7.q0;
import pk.c1;
import pk.v2;
import pk.y0;
import v9.f0;

/* loaded from: classes3.dex */
public final class l extends h8.p {
    public static final AtomicInteger M = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public final long C;
    public m D;
    public t E;
    public int F;
    public boolean G;
    public volatile boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public c1 f116505J;
    public boolean K;
    public boolean L;

    /* renamed from: k, reason: collision with root package name */
    public final int f116506k;

    /* renamed from: l, reason: collision with root package name */
    public final int f116507l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f116508m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f116509n;

    /* renamed from: o, reason: collision with root package name */
    public final int f116510o;

    /* renamed from: p, reason: collision with root package name */
    public final g7.f f116511p;

    /* renamed from: q, reason: collision with root package name */
    public final g7.i f116512q;

    /* renamed from: r, reason: collision with root package name */
    public final m f116513r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f116514s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f116515t;

    /* renamed from: u, reason: collision with root package name */
    public final k0 f116516u;

    /* renamed from: v, reason: collision with root package name */
    public final k f116517v;

    /* renamed from: w, reason: collision with root package name */
    public final List f116518w;

    /* renamed from: x, reason: collision with root package name */
    public final DrmInitData f116519x;

    /* renamed from: y, reason: collision with root package name */
    public final d9.i f116520y;

    /* renamed from: z, reason: collision with root package name */
    public final d0 f116521z;

    public l(k kVar, g7.f fVar, g7.i iVar, androidx.media3.common.b bVar, boolean z13, g7.f fVar2, g7.i iVar2, boolean z14, Uri uri, List list, int i13, Object obj, long j13, long j14, long j15, int i14, boolean z15, int i15, boolean z16, boolean z17, k0 k0Var, long j16, DrmInitData drmInitData, m mVar, d9.i iVar3, d0 d0Var, boolean z18, q0 q0Var) {
        super(fVar, iVar, bVar, i13, obj, j13, j14, j15);
        this.A = z13;
        this.f116510o = i14;
        this.L = z15;
        this.f116507l = i15;
        this.f116512q = iVar2;
        this.f116511p = fVar2;
        this.G = iVar2 != null;
        this.B = z14;
        this.f116508m = uri;
        this.f116514s = z17;
        this.f116516u = k0Var;
        this.C = j16;
        this.f116515t = z16;
        this.f116517v = kVar;
        this.f116518w = list;
        this.f116519x = drmInitData;
        this.f116513r = mVar;
        this.f116520y = iVar3;
        this.f116521z = d0Var;
        this.f116509n = z18;
        y0 y0Var = c1.f100372b;
        this.f116505J = v2.f100502e;
        this.f116506k = M.getAndIncrement();
    }

    public static byte[] d(String str) {
        if (com.bumptech.glide.c.q1(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // h8.p
    public final boolean b() {
        throw null;
    }

    public final void c(g7.f fVar, g7.i iVar, boolean z13, boolean z14) {
        g7.i d2;
        long j13;
        long j14;
        if (z13) {
            r0 = this.F != 0;
            d2 = iVar;
        } else {
            d2 = iVar.d(this.F);
        }
        try {
            q8.o f13 = f(fVar, d2, z14);
            if (r0) {
                f13.p(this.F);
            }
            while (!this.H && ((b) this.D).f116462a.d(f13, b.f116461f) == 0) {
                try {
                    try {
                    } catch (EOFException e13) {
                        if ((this.f68026d.f18756f & 16384) == 0) {
                            throw e13;
                        }
                        ((b) this.D).f116462a.b(0L, 0L);
                        j13 = f13.f102981d;
                        j14 = iVar.f63791f;
                    }
                } catch (Throwable th3) {
                    this.F = (int) (f13.f102981d - iVar.f63791f);
                    throw th3;
                }
            }
            j13 = f13.f102981d;
            j14 = iVar.f63791f;
            this.F = (int) (j13 - j14);
        } finally {
            l0.H(fVar);
        }
    }

    public final int e(int i13) {
        bf.b.t(!this.f116509n);
        if (i13 >= this.f116505J.size()) {
            return 0;
        }
        return ((Integer) this.f116505J.get(i13)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0263  */
    /* JADX WARN: Type inference failed for: r3v14, types: [l9.j] */
    /* JADX WARN: Type inference failed for: r3v27, types: [l9.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q8.o f(g7.f r31, g7.i r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.l.f(g7.f, g7.i, boolean):q8.o");
    }

    @Override // l8.u
    public final void h() {
        m mVar;
        this.E.getClass();
        if (this.D == null && (mVar = this.f116513r) != null) {
            q8.s sVar = ((b) mVar).f116462a;
            sVar.getClass();
            if ((sVar instanceof f0) || (sVar instanceof j9.i)) {
                this.D = this.f116513r;
                this.G = false;
            }
        }
        if (this.G) {
            g7.f fVar = this.f116511p;
            fVar.getClass();
            g7.i iVar = this.f116512q;
            iVar.getClass();
            c(fVar, iVar, this.B, false);
            this.F = 0;
            this.G = false;
        }
        if (this.H) {
            return;
        }
        if (!this.f116515t) {
            c(this.f68031i, this.f68024b, this.A, true);
        }
        this.I = !this.H;
    }

    @Override // l8.u
    public final void o() {
        this.H = true;
    }
}
