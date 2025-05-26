package u52;

/* loaded from: classes4.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f120696r;

    /* renamed from: s, reason: collision with root package name */
    public int f120697s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f120698t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f120698t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f120696r = obj;
        this.f120697s |= Integer.MIN_VALUE;
        return this.f120698t.emit(null, this);
    }
}
