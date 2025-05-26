package do2;

/* loaded from: classes4.dex */
public final class a1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55723r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c31.m f55724s;

    /* renamed from: t, reason: collision with root package name */
    public int f55725t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f55724s = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55723r = obj;
        this.f55725t |= Integer.MIN_VALUE;
        return this.f55724s.a(null, this);
    }
}
