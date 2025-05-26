package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class xu1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f13821a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f13822b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13823c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv1 f13824d;

    /* renamed from: e, reason: collision with root package name */
    public int f13825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu1(hv1 hv1Var, bl2.c cVar) {
        super(cVar);
        this.f13824d = hv1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13823c = obj;
        this.f13825e |= Integer.MIN_VALUE;
        return this.f13824d.a(this);
    }
}
