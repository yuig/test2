package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ag extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public eg f2385a;

    /* renamed from: b, reason: collision with root package name */
    public gf f2386b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f2387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg f2388d;

    /* renamed from: e, reason: collision with root package name */
    public int f2389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(eg egVar, bl2.c cVar) {
        super(cVar);
        this.f2388d = egVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2387c = obj;
        this.f2389e |= Integer.MIN_VALUE;
        return eg.a(this.f2388d, null, 0L, this);
    }
}
