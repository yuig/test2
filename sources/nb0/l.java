package nb0;

/* loaded from: classes5.dex */
public final class l extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public int f90254r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f90255s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f90256t;

    /* renamed from: u, reason: collision with root package name */
    public int f90257u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90256t = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90255s = obj;
        this.f90257u |= Integer.MIN_VALUE;
        return t.s(this.f90256t, null, 0, this);
    }
}
