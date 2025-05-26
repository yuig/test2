package do2;

/* loaded from: classes4.dex */
public final class w0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55987r;

    /* renamed from: s, reason: collision with root package name */
    public int f55988s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q0 f55989t;

    /* renamed from: u, reason: collision with root package name */
    public Object f55990u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(q0 q0Var, bl2.c cVar) {
        super(cVar);
        this.f55989t = q0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55987r = obj;
        this.f55988s |= Integer.MIN_VALUE;
        return this.f55989t.collect(null, this);
    }
}
