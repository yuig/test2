package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class kw0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public lw0 f7550a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lw0 f7552c;

    /* renamed from: d, reason: collision with root package name */
    public int f7553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw0(lw0 lw0Var, bl2.c cVar) {
        super(cVar);
        this.f7552c = lw0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7551b = obj;
        this.f7553d |= Integer.MIN_VALUE;
        return lw0.a(this.f7552c, this);
    }
}
