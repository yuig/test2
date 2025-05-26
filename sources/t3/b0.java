package t3;

/* loaded from: classes2.dex */
public final class b0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f115852r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c0 f115853s;

    /* renamed from: t, reason: collision with root package name */
    public int f115854t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, bl2.c cVar) {
        super(cVar);
        this.f115853s = c0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f115852r = obj;
        this.f115854t |= Integer.MIN_VALUE;
        return this.f115853s.K(null, this);
    }
}
