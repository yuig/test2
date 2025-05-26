package nb0;

/* loaded from: classes5.dex */
public final class q extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public t f90315r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f90316s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f90317t;

    /* renamed from: u, reason: collision with root package name */
    public int f90318u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90317t = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90316s = obj;
        this.f90318u |= Integer.MIN_VALUE;
        return this.f90317t.w(null, this);
    }
}
