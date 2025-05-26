package ns;

/* loaded from: classes3.dex */
public final class j extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91921r;

    /* renamed from: s, reason: collision with root package name */
    public int f91922s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f91923t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f91923t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f91921r = obj;
        this.f91922s |= Integer.MIN_VALUE;
        return this.f91923t.emit(null, this);
    }
}
