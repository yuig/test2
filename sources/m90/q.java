package m90;

/* loaded from: classes5.dex */
public final class q extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f86686r;

    /* renamed from: s, reason: collision with root package name */
    public int f86687s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f86688t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f86688t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f86686r = obj;
        this.f86687s |= Integer.MIN_VALUE;
        return this.f86688t.emit(null, this);
    }
}
