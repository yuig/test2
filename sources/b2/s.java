package b2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f21207i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f21208j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f21209k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e0 f21210l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xk2.k f21211m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m mVar, int i13, int i14, o0 o0Var, xk2.k kVar) {
        super(0);
        this.f21207i = mVar;
        this.f21208j = i13;
        this.f21209k = i14;
        this.f21210l = o0Var;
        this.f21211m = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int intValue = ((Number) this.f21211m.getValue()).intValue();
        o0 o0Var = (o0) this.f21210l;
        boolean z13 = o0Var.f21191a;
        boolean z14 = o0Var.a() == i.CROSSED;
        m mVar = this.f21207i;
        b4.m0 m0Var = mVar.f21178d;
        int i13 = this.f21208j;
        long l13 = m0Var.l(i13);
        int i14 = b4.p0.f21640c;
        int i15 = (int) (l13 >> 32);
        b4.m0 m0Var2 = mVar.f21178d;
        int f13 = m0Var2.f(i15);
        b4.o oVar = m0Var2.f21616b;
        if (f13 != intValue) {
            int i16 = oVar.f21630f;
            i15 = intValue >= i16 ? m0Var2.i(i16 - 1) : m0Var2.i(intValue);
        }
        int i17 = (int) (l13 & 4294967295L);
        if (m0Var2.f(i17) != intValue) {
            int i18 = oVar.f21630f;
            i17 = intValue >= i18 ? m0Var2.e(i18 - 1, false) : m0Var2.e(intValue, false);
        }
        int i19 = this.f21209k;
        if (i15 == i19) {
            return mVar.a(i17);
        }
        if (i17 == i19) {
            return mVar.a(i15);
        }
        if (!(z13 ^ z14) ? i13 >= i15 : i13 > i17) {
            i15 = i17;
        }
        return mVar.a(i15);
    }
}
