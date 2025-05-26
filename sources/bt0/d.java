package bt0;

/* loaded from: classes5.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f23863r;

    /* renamed from: s, reason: collision with root package name */
    public int f23864s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f23865t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f23865t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f23863r = obj;
        this.f23864s |= Integer.MIN_VALUE;
        return this.f23865t.emit(null, this);
    }
}
