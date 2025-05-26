package nt;

/* loaded from: classes3.dex */
public final class j0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public q0 f92073r;

    /* renamed from: s, reason: collision with root package name */
    public String f92074s;

    /* renamed from: t, reason: collision with root package name */
    public vd0.c f92075t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f92076u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q0 f92077v;

    /* renamed from: w, reason: collision with root package name */
    public int f92078w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(q0 q0Var, bl2.c cVar) {
        super(cVar);
        this.f92077v = q0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f92076u = obj;
        this.f92078w |= Integer.MIN_VALUE;
        return this.f92077v.o(null, this);
    }
}
