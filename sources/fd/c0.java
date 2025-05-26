package fd;

/* loaded from: classes3.dex */
public final class c0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public d0 f61755r;

    /* renamed from: s, reason: collision with root package name */
    public d0 f61756s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f61757t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d0 f61758u;

    /* renamed from: v, reason: collision with root package name */
    public int f61759v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, bl2.c cVar) {
        super(cVar);
        this.f61758u = d0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f61757t = obj;
        this.f61759v |= Integer.MIN_VALUE;
        return d0.c(this.f61758u, this);
    }
}
