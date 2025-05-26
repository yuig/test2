package co2;

/* loaded from: classes2.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f28306r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f28307s;

    /* renamed from: t, reason: collision with root package name */
    public int f28308t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, bl2.c cVar) {
        super(cVar);
        this.f28307s = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f28306r = obj;
        this.f28308t |= Integer.MIN_VALUE;
        Object N = m.N(this.f28307s, this);
        return N == cl2.a.COROUTINE_SUSPENDED ? N : new t(N);
    }
}
