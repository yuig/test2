package u52;

/* loaded from: classes4.dex */
public final class j extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f120702r;

    /* renamed from: s, reason: collision with root package name */
    public int f120703s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f120704t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f120704t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f120702r = obj;
        this.f120703s |= Integer.MIN_VALUE;
        return this.f120704t.emit(null, this);
    }
}
