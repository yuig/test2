package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class qg2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f10072a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f10073b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f10074c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2 f10075d;

    /* renamed from: e, reason: collision with root package name */
    public int f10076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg2(xg2 xg2Var, bl2.c cVar) {
        super(cVar);
        this.f10075d = xg2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f10074c = obj;
        this.f10076e |= Integer.MIN_VALUE;
        return xg2.b(this.f10075d, false, this);
    }
}
