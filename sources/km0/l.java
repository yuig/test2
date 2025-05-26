package km0;

/* loaded from: classes5.dex */
public final class l extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f80198r;

    /* renamed from: s, reason: collision with root package name */
    public int f80199s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dj0.b f80200t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dj0.b bVar, bl2.c cVar) {
        super(cVar);
        this.f80200t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f80198r = obj;
        this.f80199s |= Integer.MIN_VALUE;
        return this.f80200t.emit(null, this);
    }
}
