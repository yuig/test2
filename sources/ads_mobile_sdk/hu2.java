package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class hu2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public nu2 f6100a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nu2 f6102c;

    /* renamed from: d, reason: collision with root package name */
    public int f6103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu2(nu2 nu2Var, bl2.c cVar) {
        super(cVar);
        this.f6102c = nu2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6101b = obj;
        this.f6103d |= Integer.MIN_VALUE;
        return nu2.b(this.f6102c, (bl2.c) this);
    }
}
