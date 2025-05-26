package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class o62 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public c72 f9156a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9157b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9158c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f9159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c72 f9160e;

    /* renamed from: f, reason: collision with root package name */
    public int f9161f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o62(c72 c72Var, bl2.c cVar) {
        super(cVar);
        this.f9160e = c72Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9159d = obj;
        this.f9161f |= Integer.MIN_VALUE;
        return this.f9160e.c(false, this);
    }
}
