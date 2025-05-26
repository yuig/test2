package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class zi0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cj0 f14788a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14789b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cj0 f14790c;

    /* renamed from: d, reason: collision with root package name */
    public int f14791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(cj0 cj0Var, bl2.c cVar) {
        super(cVar);
        this.f14790c = cj0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14789b = obj;
        this.f14791d |= Integer.MIN_VALUE;
        return cj0.b(this.f14790c, this);
    }
}
