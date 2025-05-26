package do2;

/* loaded from: classes4.dex */
public final class z0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56018r;

    /* renamed from: s, reason: collision with root package name */
    public int f56019s;

    /* renamed from: t, reason: collision with root package name */
    public j f56020t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o1.f f56021u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(o1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f56021u = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f56018r = obj;
        this.f56019s |= Integer.MIN_VALUE;
        return this.f56021u.emit(null, this);
    }
}
