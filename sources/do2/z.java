package do2;

/* loaded from: classes4.dex */
public final class z extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f56016s;

    /* renamed from: t, reason: collision with root package name */
    public int f56017t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t tVar, bl2.c cVar) {
        super(cVar);
        this.f56016s = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f56015r = obj;
        this.f56017t |= Integer.MIN_VALUE;
        return this.f56016s.emit(null, this);
    }
}
