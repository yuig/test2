package c2;

/* loaded from: classes2.dex */
public final class f5 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f24731i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f24732j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o1.k f24733k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m1 f24734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f24735m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f24736n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(boolean z13, boolean z14, o1.l lVar, m1 m1Var, float f13, float f14) {
        super(3);
        this.f24731i = z13;
        this.f24732j = z14;
        this.f24733k = lVar;
        this.f24734l = m1Var;
        this.f24735m = f13;
        this.f24736n = f14;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        i2.s sVar = (i2.s) ((i2.o) obj2);
        sVar.W(1398930845);
        i2.q1 j13 = j1.j(this.f24731i, this.f24732j, this.f24733k, this.f24734l, this.f24735m, this.f24736n, sVar, 0);
        u2.n nVar = u2.n.f120041b;
        k1.y yVar = (k1.y) j13.getValue();
        float f13 = s5.f25220a;
        u2.q f14 = androidx.compose.ui.draw.a.f(nVar, new h5(yVar.f78091a, yVar, 1));
        sVar.r(false);
        return f14;
    }
}
