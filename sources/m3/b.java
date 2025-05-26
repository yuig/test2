package m3;

/* loaded from: classes2.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f85720r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f85721s;

    /* renamed from: t, reason: collision with root package name */
    public int f85722t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, bl2.c cVar) {
        super(cVar);
        this.f85721s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f85720r = obj;
        this.f85722t |= Integer.MIN_VALUE;
        return this.f85721s.a(0L, 0L, this);
    }
}
