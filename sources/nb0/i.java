package nb0;

/* loaded from: classes5.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public boolean f90226r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f90227s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f90228t;

    /* renamed from: u, reason: collision with root package name */
    public int f90229u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90228t = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90227s = obj;
        this.f90229u |= Integer.MIN_VALUE;
        return t.q(this.f90228t, null, false, this);
    }
}
