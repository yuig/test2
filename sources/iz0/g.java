package iz0;

/* loaded from: classes5.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f73907r;

    /* renamed from: s, reason: collision with root package name */
    public int f73908s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f73909t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f73909t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f73907r = obj;
        this.f73908s |= Integer.MIN_VALUE;
        return this.f73909t.emit(null, this);
    }
}
