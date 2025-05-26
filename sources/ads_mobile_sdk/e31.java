package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class e31 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public g31 f4589a;

    /* renamed from: b, reason: collision with root package name */
    public long f4590b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g31 f4592d;

    /* renamed from: e, reason: collision with root package name */
    public int f4593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e31(g31 g31Var, bl2.c cVar) {
        super(cVar);
        this.f4592d = g31Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4591c = obj;
        this.f4593e |= Integer.MIN_VALUE;
        return g31.a(this.f4592d, this);
    }
}
