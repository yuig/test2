package ow;

/* loaded from: classes3.dex */
public final class r extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public p0 f97884r;

    /* renamed from: s, reason: collision with root package name */
    public ww.b f97885s;

    /* renamed from: t, reason: collision with root package name */
    public ww.g f97886t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f97887u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p0 f97888v;

    /* renamed from: w, reason: collision with root package name */
    public int f97889w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p0 p0Var, bl2.c cVar) {
        super(cVar);
        this.f97888v = p0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f97887u = obj;
        this.f97889w |= Integer.MIN_VALUE;
        return p0.b(this.f97888v, null, null, null, this);
    }
}
