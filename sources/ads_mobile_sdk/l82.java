package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class l82 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f7727a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7728b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f7729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n82 f7730d;

    /* renamed from: e, reason: collision with root package name */
    public int f7731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l82(n82 n82Var, bl2.c cVar) {
        super(cVar);
        this.f7730d = n82Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7729c = obj;
        this.f7731e |= Integer.MIN_VALUE;
        return this.f7730d.a((a.ad) null, this);
    }
}
