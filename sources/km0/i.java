package km0;

/* loaded from: classes5.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f80191r;

    /* renamed from: s, reason: collision with root package name */
    public int f80192s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dj0.b f80193t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dj0.b bVar, bl2.c cVar) {
        super(cVar);
        this.f80193t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f80191r = obj;
        this.f80192s |= Integer.MIN_VALUE;
        return this.f80193t.emit(null, this);
    }
}
