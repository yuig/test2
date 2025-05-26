package x52;

/* loaded from: classes4.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public k f133865r;

    /* renamed from: s, reason: collision with root package name */
    public fn0.g f133866s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f133867t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f133868u;

    /* renamed from: v, reason: collision with root package name */
    public int f133869v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, bl2.c cVar) {
        super(cVar);
        this.f133868u = kVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f133867t = obj;
        this.f133869v |= Integer.MIN_VALUE;
        return this.f133868u.emit(null, this);
    }
}
