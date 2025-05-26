package do2;

/* loaded from: classes2.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55775r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i1.d0 f55776s;

    /* renamed from: t, reason: collision with root package name */
    public int f55777t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i1.d0 d0Var, bl2.c cVar) {
        super(cVar);
        this.f55776s = d0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55775r = obj;
        this.f55777t |= Integer.MIN_VALUE;
        return this.f55776s.emit(null, this);
    }
}
