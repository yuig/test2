package a6;

/* loaded from: classes.dex */
public final class y extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Object f890r;

    /* renamed from: s, reason: collision with root package name */
    public j0 f891s;

    /* renamed from: t, reason: collision with root package name */
    public ao2.v f892t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f893u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j0 f894v;

    /* renamed from: w, reason: collision with root package name */
    public int f895w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f894v = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f893u = obj;
        this.f895w |= Integer.MIN_VALUE;
        return j0.c(this.f894v, null, this);
    }
}
