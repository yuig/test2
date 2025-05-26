package ct0;

/* loaded from: classes5.dex */
public final class m extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f53155r;

    /* renamed from: s, reason: collision with root package name */
    public int f53156s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f53157t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f53157t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f53155r = obj;
        this.f53156s |= Integer.MIN_VALUE;
        return this.f53157t.emit(null, this);
    }
}
