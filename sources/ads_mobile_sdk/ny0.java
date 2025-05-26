package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ny0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public sy0 f9050a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9051b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9052c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sy0 f9053d;

    /* renamed from: e, reason: collision with root package name */
    public int f9054e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(sy0 sy0Var, bl2.c cVar) {
        super(cVar);
        this.f9053d = sy0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9052c = obj;
        this.f9054e |= Integer.MIN_VALUE;
        return this.f9053d.b(this);
    }
}
