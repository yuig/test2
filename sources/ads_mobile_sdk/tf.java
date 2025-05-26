package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class tf extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public eg f11521a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f11522b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg f11524d;

    /* renamed from: e, reason: collision with root package name */
    public int f11525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(eg egVar, bl2.c cVar) {
        super(cVar);
        this.f11524d = egVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11523c = obj;
        this.f11525e |= Integer.MIN_VALUE;
        return eg.b(this.f11524d, this);
    }
}
