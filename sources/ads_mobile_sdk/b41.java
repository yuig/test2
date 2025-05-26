package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class b41 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public g41 f2737a;

    /* renamed from: b, reason: collision with root package name */
    public String f2738b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2739c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g41 f2740d;

    /* renamed from: e, reason: collision with root package name */
    public int f2741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b41(g41 g41Var, bl2.c cVar) {
        super(cVar);
        this.f2740d = g41Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2739c = obj;
        this.f2741e |= Integer.MIN_VALUE;
        return g41.a(this.f2740d, (String) null, this);
    }
}
