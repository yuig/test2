package do2;

/* loaded from: classes4.dex */
public final class w2 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public x2 f55992r;

    /* renamed from: s, reason: collision with root package name */
    public eo2.k0 f55993s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f55994t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x2 f55995u;

    /* renamed from: v, reason: collision with root package name */
    public int f55996v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(x2 x2Var, bl2.c cVar) {
        super(cVar);
        this.f55995u = x2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55994t = obj;
        this.f55996v |= Integer.MIN_VALUE;
        return this.f55995u.a(this);
    }
}
