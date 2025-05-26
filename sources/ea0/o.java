package ea0;

/* loaded from: classes5.dex */
public final class o extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f57982r;

    /* renamed from: s, reason: collision with root package name */
    public int f57983s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f57984t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f57984t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f57982r = obj;
        this.f57983s |= Integer.MIN_VALUE;
        return this.f57984t.emit(null, this);
    }
}
