package la0;

/* loaded from: classes5.dex */
public final class b0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f82371r;

    /* renamed from: s, reason: collision with root package name */
    public int f82372s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f82373t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f82373t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f82371r = obj;
        this.f82372s |= Integer.MIN_VALUE;
        return this.f82373t.emit(null, this);
    }
}
