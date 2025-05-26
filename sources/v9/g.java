package v9;

import a7.o0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import q8.k0;
import t3.l0;

/* loaded from: classes3.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final d7.d0 f124605a;

    /* renamed from: c, reason: collision with root package name */
    public final String f124607c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124608d;

    /* renamed from: f, reason: collision with root package name */
    public String f124610f;

    /* renamed from: g, reason: collision with root package name */
    public k0 f124611g;

    /* renamed from: i, reason: collision with root package name */
    public int f124613i;

    /* renamed from: j, reason: collision with root package name */
    public int f124614j;

    /* renamed from: k, reason: collision with root package name */
    public long f124615k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.media3.common.b f124616l;

    /* renamed from: m, reason: collision with root package name */
    public int f124617m;

    /* renamed from: n, reason: collision with root package name */
    public int f124618n;

    /* renamed from: h, reason: collision with root package name */
    public int f124612h = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f124621q = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f124606b = new AtomicInteger();

    /* renamed from: o, reason: collision with root package name */
    public int f124619o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f124620p = -1;

    /* renamed from: e, reason: collision with root package name */
    public final String f124609e = "video/mp2t";

    public g(String str, int i13, int i14) {
        this.f124605a = new d7.d0(new byte[i14]);
        this.f124607c = str;
        this.f124608d = i13;
    }

    public final boolean a(int i13, d7.d0 d0Var, byte[] bArr) {
        int min = Math.min(d0Var.a(), i13 - this.f124613i);
        d0Var.i(bArr, this.f124613i, min);
        int i14 = this.f124613i + min;
        this.f124613i = i14;
        return i14 == i13;
    }

    public final void b(l0 l0Var) {
        int i13;
        int i14 = l0Var.f116063a;
        if (i14 == -2147483647 || (i13 = l0Var.f116064b) == -1) {
            return;
        }
        androidx.media3.common.b bVar = this.f124616l;
        Object obj = l0Var.f116068f;
        if (bVar != null && i13 == bVar.E && i14 == bVar.F && Objects.equals((String) obj, bVar.f18765o)) {
            return;
        }
        androidx.media3.common.b bVar2 = this.f124616l;
        a7.q qVar = bVar2 == null ? new a7.q() : bVar2.a();
        qVar.f1168a = this.f124610f;
        qVar.f1180m = o0.r(this.f124609e);
        qVar.f1181n = o0.r((String) obj);
        qVar.D = i13;
        qVar.E = i14;
        qVar.f1171d = this.f124607c;
        qVar.f1173f = this.f124608d;
        androidx.media3.common.b bVar3 = new androidx.media3.common.b(qVar);
        this.f124616l = bVar3;
        this.f124611g.b(bVar3);
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0494  */
    @Override // v9.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(d7.d0 r35) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.g.e(d7.d0):void");
    }

    @Override // v9.i
    public final void f() {
        this.f124612h = 0;
        this.f124613i = 0;
        this.f124614j = 0;
        this.f124621q = -9223372036854775807L;
        this.f124606b.set(0);
    }

    @Override // v9.i
    public final void g(q8.u uVar, h0 h0Var) {
        h0Var.a();
        h0Var.b();
        this.f124610f = h0Var.f124635e;
        h0Var.b();
        this.f124611g = uVar.D(h0Var.f124634d, 1);
    }

    @Override // v9.i
    public final void h(boolean z13) {
    }

    @Override // v9.i
    public final void i(int i13, long j13) {
        this.f124621q = j13;
    }
}
