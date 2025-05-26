package h90;

/* loaded from: classes5.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f68276r;

    /* renamed from: s, reason: collision with root package name */
    public int f68277s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f68278t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f68278t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f68276r = obj;
        this.f68277s |= Integer.MIN_VALUE;
        return this.f68278t.emit(null, this);
    }
}
