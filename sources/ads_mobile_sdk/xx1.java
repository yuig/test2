package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class xx1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f13872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yx1 f13873b;

    /* renamed from: c, reason: collision with root package name */
    public int f13874c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx1(yx1 yx1Var, bl2.c cVar) {
        super(cVar);
        this.f13873b = yx1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13872a = obj;
        this.f13874c |= Integer.MIN_VALUE;
        return this.f13873b.a((a.ce) null, this);
    }
}
