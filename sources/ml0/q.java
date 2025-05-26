package ml0;

/* loaded from: classes5.dex */
public final class q extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f87490r;

    /* renamed from: s, reason: collision with root package name */
    public int f87491s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f87492t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f87492t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f87490r = obj;
        this.f87491s |= Integer.MIN_VALUE;
        return this.f87492t.emit(null, this);
    }
}
