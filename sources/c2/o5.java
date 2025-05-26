package c2;

/* loaded from: classes2.dex */
public final class o5 extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m1 f25048i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f25049j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f25050k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o1.k f25051l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(m1 m1Var, boolean z13, boolean z14, o1.k kVar) {
        super(3);
        this.f25048i = m1Var;
        this.f25049j = z13;
        this.f25050k = z14;
        this.f25051l = kVar;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        v2 v2Var = (v2) obj;
        ((Number) obj3).intValue();
        i2.s sVar = (i2.s) ((i2.o) obj2);
        sVar.W(-1272940975);
        boolean z13 = v2Var == v2.UnfocusedEmpty ? false : this.f25050k;
        m1 m1Var = this.f25048i;
        m1Var.getClass();
        sVar.W(727091888);
        i2.q1 K1 = bs1.c.K1(new b3.w(!this.f25049j ? m1Var.f24954r : z13 ? m1Var.f24955s : ((Boolean) kotlin.jvm.internal.r.o(this.f25051l, sVar, 0).getValue()).booleanValue() ? m1Var.f24952p : m1Var.f24953q), sVar);
        sVar.r(false);
        long j13 = ((b3.w) K1.getValue()).f21392a;
        sVar.r(false);
        return new b3.w(j13);
    }
}
