package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class mu0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f8387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu0 f8388b;

    /* renamed from: c, reason: collision with root package name */
    public int f8389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(nu0 nu0Var, bl2.c cVar) {
        super(cVar);
        this.f8388b = nu0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8387a = obj;
        this.f8389c |= Integer.MIN_VALUE;
        return this.f8388b.a((a.ce) null, this);
    }
}
