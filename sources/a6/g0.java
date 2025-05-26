package a6;

/* loaded from: classes.dex */
public final class g0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j0 f836r;

    /* renamed from: s, reason: collision with root package name */
    public Object f837s;

    /* renamed from: t, reason: collision with root package name */
    public Object f838t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f839u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j0 f840v;

    /* renamed from: w, reason: collision with root package name */
    public int f841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f840v = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f839u = obj;
        this.f841w |= Integer.MIN_VALUE;
        return this.f840v.j(this, null, null);
    }
}
