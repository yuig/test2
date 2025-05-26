package m7;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes.dex */
public abstract class h implements q1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f86171b;

    /* renamed from: d, reason: collision with root package name */
    public v1 f86173d;

    /* renamed from: e, reason: collision with root package name */
    public int f86174e;

    /* renamed from: f, reason: collision with root package name */
    public n7.q0 f86175f;

    /* renamed from: g, reason: collision with root package name */
    public d7.e f86176g;

    /* renamed from: h, reason: collision with root package name */
    public int f86177h;

    /* renamed from: i, reason: collision with root package name */
    public g8.b1 f86178i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.media3.common.b[] f86179j;

    /* renamed from: k, reason: collision with root package name */
    public long f86180k;

    /* renamed from: l, reason: collision with root package name */
    public long f86181l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f86183n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f86184o;

    /* renamed from: q, reason: collision with root package name */
    public u1 f86186q;

    /* renamed from: a, reason: collision with root package name */
    public final Object f86170a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final qq2.c f86172c = new qq2.c(2);

    /* renamed from: m, reason: collision with root package name */
    public long f86182m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public a7.b1 f86185p = a7.b1.f958a;

    public h(int i13) {
        this.f86171b = i13;
    }

    public static int f(int i13, int i14, int i15, int i16) {
        return i13 | i14 | i15 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN | i16;
    }

    public static int i(int i13) {
        return i13 & 384;
    }

    public static int k(int i13) {
        return i13 & 64;
    }

    public static boolean p(int i13, boolean z13) {
        int i14 = i13 & 7;
        return i14 == 4 || (z13 && i14 == 3);
    }

    public abstract void A(long j13, long j14);

    public final void B(androidx.media3.common.b[] bVarArr, g8.b1 b1Var, long j13, long j14, g8.e0 e0Var) {
        bf.b.t(!this.f86183n);
        this.f86178i = b1Var;
        if (this.f86182m == Long.MIN_VALUE) {
            this.f86182m = j13;
        }
        this.f86179j = bVarArr;
        this.f86180k = j14;
        y(bVarArr, j13, j14, e0Var);
    }

    public final void C() {
        bf.b.t(this.f86177h == 0);
        this.f86172c.c();
        v();
    }

    public /* bridge */ /* synthetic */ void D(float f13, float f14) {
    }

    public final int E(long j13) {
        g8.b1 b1Var = this.f86178i;
        b1Var.getClass();
        return b1Var.o(j13 - this.f86180k);
    }

    public abstract int F(androidx.media3.common.b bVar);

    public int G() {
        return 0;
    }

    @Override // m7.q1
    public void b(int i13, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.ExoPlaybackException g(int r13, androidx.media3.common.b r14, java.lang.Throwable r15, boolean r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f86184o
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f86184o = r3
            r3 = 0
            int r4 = r12.F(r14)     // Catch: java.lang.Throwable -> L16 androidx.media3.exoplayer.ExoPlaybackException -> L1b
            r4 = r4 & 7
            r1.f86184o = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f86184o = r3
            throw r2
        L1b:
            r1.f86184o = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.m()
            int r7 = r1.f86174e
            androidx.media3.exoplayer.ExoPlaybackException r11 = new androidx.media3.exoplayer.ExoPlaybackException
            if (r0 != 0) goto L2a
            r9 = r2
            goto L2b
        L2a:
            r9 = r4
        L2b:
            r3 = 1
            r2 = r11
            r4 = r15
            r5 = r13
            r8 = r14
            r10 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m7.h.g(int, androidx.media3.common.b, java.lang.Throwable, boolean):androidx.media3.exoplayer.ExoPlaybackException");
    }

    public /* bridge */ /* synthetic */ void h() {
    }

    public /* bridge */ /* synthetic */ long j(long j13, long j14) {
        return 10000L;
    }

    public z0 l() {
        return null;
    }

    public abstract String m();

    public final boolean n() {
        return this.f86182m == Long.MIN_VALUE;
    }

    public abstract boolean o();

    public abstract boolean q();

    public abstract void r();

    public void s(boolean z13, boolean z14) {
    }

    public abstract void t(long j13, boolean z13);

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public void x() {
    }

    public void y(androidx.media3.common.b[] bVarArr, long j13, long j14, g8.e0 e0Var) {
    }

    public final int z(qq2.c cVar, k7.e eVar, int i13) {
        g8.b1 b1Var = this.f86178i;
        b1Var.getClass();
        int i14 = b1Var.i(cVar, eVar, i13);
        if (i14 == -4) {
            if (eVar.i(4)) {
                this.f86182m = Long.MIN_VALUE;
                return this.f86183n ? -4 : -3;
            }
            long j13 = eVar.f78456g + this.f86180k;
            eVar.f78456g = j13;
            this.f86182m = Math.max(this.f86182m, j13);
        } else if (i14 == -5) {
            androidx.media3.common.b bVar = (androidx.media3.common.b) cVar.f104884c;
            bVar.getClass();
            long j14 = bVar.f18770t;
            if (j14 != Long.MAX_VALUE) {
                a7.q a13 = bVar.a();
                a13.f1186s = j14 + this.f86180k;
                cVar.f104884c = a13.a();
            }
        }
        return i14;
    }
}
