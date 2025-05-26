package m1;

/* loaded from: classes2.dex */
public final class o0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public t0 f85488r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85489s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t0 f85490t;

    /* renamed from: u, reason: collision with root package name */
    public int f85491u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(t0 t0Var, bl2.c cVar) {
        super(cVar);
        this.f85490t = t0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f85489s = obj;
        this.f85491u |= Integer.MIN_VALUE;
        return t0.P0(this.f85490t, this);
    }
}
