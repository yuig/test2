package do2;

/* loaded from: classes2.dex */
public final class d1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public e1 f55754r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f55755s;

    /* renamed from: t, reason: collision with root package name */
    public int f55756t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e1 f55757u;

    /* renamed from: v, reason: collision with root package name */
    public Object f55758v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(e1 e1Var, bl2.c cVar) {
        super(cVar);
        this.f55757u = e1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55755s = obj;
        this.f55756t |= Integer.MIN_VALUE;
        return this.f55757u.emit(null, this);
    }
}
