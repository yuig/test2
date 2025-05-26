package ny0;

/* loaded from: classes5.dex */
public final class q extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f92613r;

    /* renamed from: s, reason: collision with root package name */
    public int f92614s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f92615t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f92615t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f92613r = obj;
        this.f92614s |= Integer.MIN_VALUE;
        return this.f92615t.emit(null, this);
    }
}
