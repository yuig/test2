package do2;

/* loaded from: classes2.dex */
public final class s2 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public t2 f55936r;

    /* renamed from: s, reason: collision with root package name */
    public j f55937s;

    /* renamed from: t, reason: collision with root package name */
    public v2 f55938t;

    /* renamed from: u, reason: collision with root package name */
    public ao2.o1 f55939u;

    /* renamed from: v, reason: collision with root package name */
    public Object f55940v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f55941w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t2 f55942x;

    /* renamed from: y, reason: collision with root package name */
    public int f55943y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2 t2Var, bl2.c cVar) {
        super(cVar);
        this.f55942x = t2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55941w = obj;
        this.f55943y |= Integer.MIN_VALUE;
        return this.f55942x.collect(null, this);
    }
}
