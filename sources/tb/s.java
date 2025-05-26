package tb;

import a.cb;
import androidx.lifecycle.n1;
import kb.l0;
import kb.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: y */
    public static final String f117014y;

    /* renamed from: z */
    public static final p f117015z;

    /* renamed from: a */
    public final String f117016a;

    /* renamed from: b */
    public s0 f117017b;

    /* renamed from: c */
    public final String f117018c;

    /* renamed from: d */
    public String f117019d;

    /* renamed from: e */
    public kb.l f117020e;

    /* renamed from: f */
    public final kb.l f117021f;

    /* renamed from: g */
    public long f117022g;

    /* renamed from: h */
    public long f117023h;

    /* renamed from: i */
    public long f117024i;

    /* renamed from: j */
    public kb.g f117025j;

    /* renamed from: k */
    public final int f117026k;

    /* renamed from: l */
    public kb.a f117027l;

    /* renamed from: m */
    public long f117028m;

    /* renamed from: n */
    public long f117029n;

    /* renamed from: o */
    public final long f117030o;

    /* renamed from: p */
    public final long f117031p;

    /* renamed from: q */
    public boolean f117032q;

    /* renamed from: r */
    public final l0 f117033r;

    /* renamed from: s */
    public final int f117034s;

    /* renamed from: t */
    public final int f117035t;

    /* renamed from: u */
    public long f117036u;

    /* renamed from: v */
    public int f117037v;

    /* renamed from: w */
    public final int f117038w;

    /* renamed from: x */
    public String f117039x;

    static {
        String h10 = kb.b0.h("WorkSpec");
        Intrinsics.checkNotNullExpressionValue(h10, "tagWithPrefix(\"WorkSpec\")");
        f117014y = h10;
        f117015z = new p();
    }

    public s(String id3, s0 state, String workerClassName, String inputMergerClassName, kb.l input, kb.l output, long j13, long j14, long j15, kb.g constraints, int i13, kb.a backoffPolicy, long j16, long j17, long j18, long j19, boolean z13, l0 outOfQuotaPolicy, int i14, int i15, long j23, int i16, int i17, String str) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f117016a = id3;
        this.f117017b = state;
        this.f117018c = workerClassName;
        this.f117019d = inputMergerClassName;
        this.f117020e = input;
        this.f117021f = output;
        this.f117022g = j13;
        this.f117023h = j14;
        this.f117024i = j15;
        this.f117025j = constraints;
        this.f117026k = i13;
        this.f117027l = backoffPolicy;
        this.f117028m = j16;
        this.f117029n = j17;
        this.f117030o = j18;
        this.f117031p = j19;
        this.f117032q = z13;
        this.f117033r = outOfQuotaPolicy;
        this.f117034s = i14;
        this.f117035t = i15;
        this.f117036u = j23;
        this.f117037v = i16;
        this.f117038w = i17;
        this.f117039x = str;
    }

    public static s b(s sVar, String str, s0 s0Var, String str2, kb.l lVar, int i13, long j13, int i14, int i15, long j14, int i16, int i17) {
        boolean z13;
        int i18;
        String id3 = (i17 & 1) != 0 ? sVar.f117016a : str;
        s0 state = (i17 & 2) != 0 ? sVar.f117017b : s0Var;
        String workerClassName = (i17 & 4) != 0 ? sVar.f117018c : str2;
        String inputMergerClassName = sVar.f117019d;
        kb.l input = (i17 & 16) != 0 ? sVar.f117020e : lVar;
        kb.l output = sVar.f117021f;
        long j15 = sVar.f117022g;
        long j16 = sVar.f117023h;
        long j17 = sVar.f117024i;
        kb.g constraints = sVar.f117025j;
        int i19 = (i17 & 1024) != 0 ? sVar.f117026k : i13;
        kb.a backoffPolicy = sVar.f117027l;
        long j18 = sVar.f117028m;
        long j19 = (i17 & 8192) != 0 ? sVar.f117029n : j13;
        long j23 = sVar.f117030o;
        long j24 = sVar.f117031p;
        boolean z14 = sVar.f117032q;
        l0 outOfQuotaPolicy = sVar.f117033r;
        if ((i17 & 262144) != 0) {
            z13 = z14;
            i18 = sVar.f117034s;
        } else {
            z13 = z14;
            i18 = i14;
        }
        int i23 = (524288 & i17) != 0 ? sVar.f117035t : i15;
        long j25 = (1048576 & i17) != 0 ? sVar.f117036u : j14;
        int i24 = (i17 & 2097152) != 0 ? sVar.f117037v : i16;
        int i25 = sVar.f117038w;
        String str3 = sVar.f117039x;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(inputMergerClassName, "inputMergerClassName");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new s(id3, state, workerClassName, inputMergerClassName, input, output, j15, j16, j17, constraints, i19, backoffPolicy, j18, j19, j23, j24, z13, outOfQuotaPolicy, i18, i23, j25, i24, i25, str3);
    }

    public final long a() {
        return n1.e(this.f117017b == s0.ENQUEUED && this.f117026k > 0, this.f117026k, this.f117027l, this.f117028m, this.f117029n, this.f117034s, f(), this.f117022g, this.f117024i, this.f117023h, this.f117036u);
    }

    public final int c() {
        return this.f117035t;
    }

    public final String d() {
        return this.f117039x;
    }

    public final boolean e() {
        return !Intrinsics.d(kb.g.f78988j, this.f117025j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f117016a, sVar.f117016a) && this.f117017b == sVar.f117017b && Intrinsics.d(this.f117018c, sVar.f117018c) && Intrinsics.d(this.f117019d, sVar.f117019d) && Intrinsics.d(this.f117020e, sVar.f117020e) && Intrinsics.d(this.f117021f, sVar.f117021f) && this.f117022g == sVar.f117022g && this.f117023h == sVar.f117023h && this.f117024i == sVar.f117024i && Intrinsics.d(this.f117025j, sVar.f117025j) && this.f117026k == sVar.f117026k && this.f117027l == sVar.f117027l && this.f117028m == sVar.f117028m && this.f117029n == sVar.f117029n && this.f117030o == sVar.f117030o && this.f117031p == sVar.f117031p && this.f117032q == sVar.f117032q && this.f117033r == sVar.f117033r && this.f117034s == sVar.f117034s && this.f117035t == sVar.f117035t && this.f117036u == sVar.f117036u && this.f117037v == sVar.f117037v && this.f117038w == sVar.f117038w && Intrinsics.d(this.f117039x, sVar.f117039x);
    }

    public final boolean f() {
        return this.f117023h != 0;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f117038w, ep.b.b(this.f117037v, a.a.c(this.f117036u, ep.b.b(this.f117035t, ep.b.b(this.f117034s, (this.f117033r.hashCode() + ep.b.e(this.f117032q, a.a.c(this.f117031p, a.a.c(this.f117030o, a.a.c(this.f117029n, a.a.c(this.f117028m, (this.f117027l.hashCode() + ep.b.b(this.f117026k, (this.f117025j.hashCode() + a.a.c(this.f117024i, a.a.c(this.f117023h, a.a.c(this.f117022g, (this.f117021f.hashCode() + ((this.f117020e.hashCode() + cb.d(this.f117019d, cb.d(this.f117018c, (this.f117017b.hashCode() + (this.f117016a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31);
        String str = this.f117039x;
        return b13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("{WorkSpec: "), this.f117016a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ s(java.lang.String r36, kb.s0 r37, java.lang.String r38, java.lang.String r39, kb.l r40, kb.l r41, long r42, long r44, long r46, kb.g r48, int r49, kb.a r50, long r51, long r53, long r55, long r57, boolean r59, kb.l0 r60, int r61, long r62, int r64, int r65, java.lang.String r66, int r67) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.s.<init>(java.lang.String, kb.s0, java.lang.String, java.lang.String, kb.l, kb.l, long, long, long, kb.g, int, kb.a, long, long, long, long, boolean, kb.l0, int, long, int, int, java.lang.String, int):void");
    }
}
