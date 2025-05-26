package km0;

/* loaded from: classes5.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f80195r;

    /* renamed from: s, reason: collision with root package name */
    public int f80196s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dj0.b f80197t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(dj0.b bVar, bl2.c cVar) {
        super(cVar);
        this.f80197t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f80195r = obj;
        this.f80196s |= Integer.MIN_VALUE;
        return this.f80197t.emit(null, this);
    }
}
