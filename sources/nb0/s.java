package nb0;

/* loaded from: classes5.dex */
public final class s extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f90321r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f90322s;

    /* renamed from: t, reason: collision with root package name */
    public int f90323t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, bl2.c cVar) {
        super(cVar);
        this.f90322s = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f90321r = obj;
        this.f90323t |= Integer.MIN_VALUE;
        return t.x(this.f90322s, null, null, null, null, this);
    }
}
