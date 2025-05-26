package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ii0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f6418a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f6419b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f6420c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi0 f6421d;

    /* renamed from: e, reason: collision with root package name */
    public int f6422e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(wi0 wi0Var, bl2.c cVar) {
        super(cVar);
        this.f6421d = wi0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6420c = obj;
        this.f6422e |= Integer.MIN_VALUE;
        return wi0.a(this.f6421d, this);
    }
}
