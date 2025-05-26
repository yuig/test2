package w90;

/* loaded from: classes5.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f128558r;

    /* renamed from: s, reason: collision with root package name */
    public int f128559s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f128560t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f128560t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f128558r = obj;
        this.f128559s |= Integer.MIN_VALUE;
        return this.f128560t.emit(null, this);
    }
}
