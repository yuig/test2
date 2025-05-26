package nl0;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f91239r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v60.d f91240s;

    /* renamed from: t, reason: collision with root package name */
    public int f91241t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(v60.d dVar, bl2.c cVar) {
        super(cVar);
        this.f91240s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f91239r = obj;
        this.f91241t |= Integer.MIN_VALUE;
        return this.f91240s.a(0, null, null, null, this);
    }
}
