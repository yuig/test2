package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class xi0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cj0 f13679a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cj0 f13681c;

    /* renamed from: d, reason: collision with root package name */
    public int f13682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi0(cj0 cj0Var, bl2.c cVar) {
        super(cVar);
        this.f13681c = cj0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13680b = obj;
        this.f13682d |= Integer.MIN_VALUE;
        return cj0.a(this.f13681c, (bl2.c) this);
    }
}
