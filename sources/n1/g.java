package n1;

/* loaded from: classes2.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f88891r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f88892s;

    /* renamed from: t, reason: collision with root package name */
    public int f88893t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, bl2.c cVar) {
        super(cVar);
        this.f88892s = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f88891r = obj;
        this.f88893t |= Integer.MIN_VALUE;
        return h.b(this.f88892s, null, 0.0f, 0.0f, null, this);
    }
}
