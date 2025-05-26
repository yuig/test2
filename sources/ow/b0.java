package ow;

/* loaded from: classes3.dex */
public final class b0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public p0 f97755r;

    /* renamed from: s, reason: collision with root package name */
    public ww.g f97756s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f97757t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p0 f97758u;

    /* renamed from: v, reason: collision with root package name */
    public int f97759v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p0 p0Var, bl2.c cVar) {
        super(cVar);
        this.f97758u = p0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f97757t = obj;
        this.f97759v |= Integer.MIN_VALUE;
        return p0.f(this.f97758u, null, false, this);
    }
}
