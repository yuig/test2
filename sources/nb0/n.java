package nb0;

/* loaded from: classes5.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public String f90278r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f90279s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f90280t;

    /* renamed from: u, reason: collision with root package name */
    public int f90281u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90280t = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90279s = obj;
        this.f90281u |= Integer.MIN_VALUE;
        return t.u(this.f90280t, null, null, this);
    }
}
