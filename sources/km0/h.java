package km0;

/* loaded from: classes5.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f80188r;

    /* renamed from: s, reason: collision with root package name */
    public int f80189s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ dj0.b f80190t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(dj0.b bVar, bl2.c cVar) {
        super(cVar);
        this.f80190t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f80188r = obj;
        this.f80189s |= Integer.MIN_VALUE;
        return this.f80190t.emit(null, this);
    }
}
