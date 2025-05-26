package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class d31 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f4103a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f4104b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g31 f4106d;

    /* renamed from: e, reason: collision with root package name */
    public int f4107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d31(g31 g31Var, bl2.c cVar) {
        super(cVar);
        this.f4106d = g31Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4105c = obj;
        this.f4107e |= Integer.MIN_VALUE;
        return this.f4106d.c((String) null, this);
    }
}
