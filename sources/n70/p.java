package n70;

/* loaded from: classes5.dex */
public final class p extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89648r;

    /* renamed from: s, reason: collision with root package name */
    public int f89649s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ wb.b f89650t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wb.b bVar, bl2.c cVar) {
        super(cVar);
        this.f89650t = bVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f89648r = obj;
        this.f89649s |= Integer.MIN_VALUE;
        return this.f89650t.emit(null, this);
    }
}
