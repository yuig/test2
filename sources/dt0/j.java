package dt0;

/* loaded from: classes5.dex */
public final class j extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56242r;

    /* renamed from: s, reason: collision with root package name */
    public int f56243s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f56244t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f56244t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f56242r = obj;
        this.f56243s |= Integer.MIN_VALUE;
        return this.f56244t.emit(null, this);
    }
}
