package lb;

/* loaded from: classes.dex */
public final class x0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public a1 f82683r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f82684s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1 f82685t;

    /* renamed from: u, reason: collision with root package name */
    public int f82686u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(a1 a1Var, bl2.c cVar) {
        super(cVar);
        this.f82685t = a1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f82684s = obj;
        this.f82686u |= Integer.MIN_VALUE;
        return a1.b(this.f82685t, this);
    }
}
