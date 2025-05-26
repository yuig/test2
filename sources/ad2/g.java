package ad2;

/* loaded from: classes4.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2097r;

    /* renamed from: s, reason: collision with root package name */
    public int f2098s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f2099t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f2099t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2097r = obj;
        this.f2098s |= Integer.MIN_VALUE;
        return this.f2099t.emit(null, this);
    }
}
