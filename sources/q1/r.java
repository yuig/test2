package q1;

import java.util.List;

/* loaded from: classes2.dex */
public final class r implements androidx.compose.foundation.lazy.layout.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f101971a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.c0 f101972b;

    /* renamed from: c, reason: collision with root package name */
    public final long f101973c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f101974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.c0 f101975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f101977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u2.c f101978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.d f101979i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f101980j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f101981k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f101982l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f101983m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h0 f101984n;

    public r(long j13, boolean z13, m mVar, androidx.compose.foundation.lazy.layout.c0 c0Var, int i13, int i14, u2.c cVar, u2.d dVar, boolean z14, int i15, int i16, long j14, h0 h0Var) {
        this.f101974d = z13;
        this.f101975e = c0Var;
        this.f101976f = i13;
        this.f101977g = i14;
        this.f101978h = cVar;
        this.f101979i = dVar;
        this.f101980j = z14;
        this.f101981k = i15;
        this.f101982l = i16;
        this.f101983m = j14;
        this.f101984n = h0Var;
        this.f101971a = mVar;
        this.f101972b = c0Var;
        this.f101973c = bs1.c.b(z13 ? n4.a.h(j13) : Integer.MAX_VALUE, z13 ? Integer.MAX_VALUE : n4.a.g(j13), 5);
    }

    public final w a(int i13, long j13) {
        m mVar = this.f101971a;
        Object c13 = mVar.c(i13);
        Object k13 = mVar.f101945b.k(i13);
        List a13 = ((androidx.compose.foundation.lazy.layout.d0) this.f101972b).a(i13, j13);
        int i14 = i13 == this.f101976f + (-1) ? 0 : this.f101977g;
        return new w(i13, a13, this.f101974d, this.f101978h, this.f101979i, ((androidx.compose.foundation.lazy.layout.d0) this.f101975e).f17231b.getLayoutDirection(), this.f101980j, this.f101981k, this.f101982l, i14, this.f101983m, c13, k13, this.f101984n.f101920m, j13);
    }
}
