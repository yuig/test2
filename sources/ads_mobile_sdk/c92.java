package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class c92 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public d92 f3825a;

    /* renamed from: b, reason: collision with root package name */
    public String f3826b;

    /* renamed from: c, reason: collision with root package name */
    public mo2.a f3827c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f3828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d92 f3829e;

    /* renamed from: f, reason: collision with root package name */
    public int f3830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c92(d92 d92Var, bl2.c cVar) {
        super(cVar);
        this.f3829e = d92Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3828d = obj;
        this.f3830f |= Integer.MIN_VALUE;
        return d92.c(this.f3829e, null, this);
    }
}
