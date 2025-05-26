package nb0;

/* loaded from: classes5.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public t f90242r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f90243s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f90244t;

    /* renamed from: u, reason: collision with root package name */
    public int f90245u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90244t = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90243s = obj;
        this.f90245u |= Integer.MIN_VALUE;
        return this.f90244t.r(null, this);
    }
}
