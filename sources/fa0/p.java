package fa0;

/* loaded from: classes5.dex */
public final class p extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f61520r;

    /* renamed from: s, reason: collision with root package name */
    public int f61521s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f61522t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f61522t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f61520r = obj;
        this.f61521s |= Integer.MIN_VALUE;
        return this.f61522t.emit(null, this);
    }
}
