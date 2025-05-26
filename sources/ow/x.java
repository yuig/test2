package ow;

/* loaded from: classes3.dex */
public final class x extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public p0 f97905r;

    /* renamed from: s, reason: collision with root package name */
    public ww.g f97906s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f97907t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p0 f97908u;

    /* renamed from: v, reason: collision with root package name */
    public int f97909v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p0 p0Var, bl2.c cVar) {
        super(cVar);
        this.f97908u = p0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f97907t = obj;
        this.f97909v |= Integer.MIN_VALUE;
        return p0.d(this.f97908u, null, null, this);
    }
}
