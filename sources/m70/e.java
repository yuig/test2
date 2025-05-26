package m70;

/* loaded from: classes5.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f86512r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v60.d f86513s;

    /* renamed from: t, reason: collision with root package name */
    public int f86514t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v60.d dVar, bl2.c cVar) {
        super(cVar);
        this.f86513s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f86512r = obj;
        this.f86514t |= Integer.MIN_VALUE;
        return this.f86513s.a(0, null, null, null, this);
    }
}
