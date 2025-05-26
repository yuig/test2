package s3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public u2.p f110791a;

    /* renamed from: b, reason: collision with root package name */
    public int f110792b;

    /* renamed from: c, reason: collision with root package name */
    public k2.e f110793c;

    /* renamed from: d, reason: collision with root package name */
    public k2.e f110794d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f110795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j1 f110796f;

    public i1(j1 j1Var, u2.p pVar, int i13, k2.e eVar, k2.e eVar2, boolean z13) {
        this.f110796f = j1Var;
        this.f110791a = pVar;
        this.f110792b = i13;
        this.f110793c = eVar;
        this.f110794d = eVar2;
        this.f110795e = z13;
    }

    public final boolean a(int i13, int i14) {
        k2.e eVar = this.f110793c;
        int i15 = this.f110792b;
        u2.o oVar = (u2.o) eVar.f78182a[i13 + i15];
        u2.o oVar2 = (u2.o) this.f110794d.f78182a[i15 + i14];
        k1 k1Var = l1.f110839a;
        return Intrinsics.d(oVar, oVar2) || bs1.c.l(oVar, oVar2);
    }
}
