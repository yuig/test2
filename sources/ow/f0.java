package ow;

/* loaded from: classes3.dex */
public final class f0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public p0 f97784r;

    /* renamed from: s, reason: collision with root package name */
    public ww.g f97785s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f97786t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p0 f97787u;

    /* renamed from: v, reason: collision with root package name */
    public int f97788v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p0 p0Var, bl2.c cVar) {
        super(cVar);
        this.f97787u = p0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f97786t = obj;
        this.f97788v |= Integer.MIN_VALUE;
        return p0.h(this.f97787u, null, null, this);
    }
}
