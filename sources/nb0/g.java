package nb0;

/* loaded from: classes5.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f90212r;

    /* renamed from: s, reason: collision with root package name */
    public int f90213s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.f f90214t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f90214t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90212r = obj;
        this.f90213s |= Integer.MIN_VALUE;
        return this.f90214t.emit(null, this);
    }
}
