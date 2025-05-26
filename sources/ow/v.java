package ow;

/* loaded from: classes3.dex */
public final class v extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public p0 f97898r;

    /* renamed from: s, reason: collision with root package name */
    public ww.g f97899s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f97900t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p0 f97901u;

    /* renamed from: v, reason: collision with root package name */
    public int f97902v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(p0 p0Var, bl2.c cVar) {
        super(cVar);
        this.f97901u = p0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f97900t = obj;
        this.f97902v |= Integer.MIN_VALUE;
        return p0.c(this.f97901u, null, null, this);
    }
}
