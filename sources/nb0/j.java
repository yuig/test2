package nb0;

/* loaded from: classes5.dex */
public final class j extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f90231r;

    /* renamed from: s, reason: collision with root package name */
    public int f90232s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.f f90233t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f90233t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90231r = obj;
        this.f90232s |= Integer.MIN_VALUE;
        return this.f90233t.emit(null, this);
    }
}
