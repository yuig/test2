package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class bb0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f2807a;

    /* renamed from: b, reason: collision with root package name */
    public sy0 f2808b;

    /* renamed from: c, reason: collision with root package name */
    public mo2.a f2809c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kb0 f2811e;

    /* renamed from: f, reason: collision with root package name */
    public int f2812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb0(kb0 kb0Var, bl2.c cVar) {
        super(cVar);
        this.f2811e = kb0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2810d = obj;
        this.f2812f |= Integer.MIN_VALUE;
        return this.f2811e.c(null, this);
    }
}
