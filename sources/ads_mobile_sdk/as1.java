package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class as1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs1 f2530a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f2531b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2532c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cs1 f2533d;

    /* renamed from: e, reason: collision with root package name */
    public int f2534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as1(cs1 cs1Var, bl2.c cVar) {
        super(cVar);
        this.f2533d = cs1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2532c = obj;
        this.f2534e |= Integer.MIN_VALUE;
        return cs1.a(this.f2533d, this);
    }
}
