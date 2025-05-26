package ws;

/* loaded from: classes3.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f131060r;

    /* renamed from: s, reason: collision with root package name */
    public int f131061s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f131062t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f131062t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f131060r = obj;
        this.f131061s |= Integer.MIN_VALUE;
        return this.f131062t.emit(null, this);
    }
}
