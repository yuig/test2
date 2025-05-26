package tx0;

/* loaded from: classes5.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f119654r;

    /* renamed from: s, reason: collision with root package name */
    public int f119655s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f119656t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f119656t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f119654r = obj;
        this.f119655s |= Integer.MIN_VALUE;
        return this.f119656t.emit(null, this);
    }
}
