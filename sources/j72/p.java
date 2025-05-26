package j72;

/* loaded from: classes4.dex */
public final class p extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f74899r;

    /* renamed from: s, reason: collision with root package name */
    public int f74900s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f74901t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f74901t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f74899r = obj;
        this.f74900s |= Integer.MIN_VALUE;
        return this.f74901t.emit(null, this);
    }
}
