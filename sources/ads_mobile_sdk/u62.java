package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class u62 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public c72 f11863a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f11864b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11865c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f11866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c72 f11867e;

    /* renamed from: f, reason: collision with root package name */
    public int f11868f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u62(c72 c72Var, bl2.c cVar) {
        super(cVar);
        this.f11867e = c72Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11866d = obj;
        this.f11868f |= Integer.MIN_VALUE;
        return this.f11867e.a(false, (bl2.c) this);
    }
}
