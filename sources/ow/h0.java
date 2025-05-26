package ow;

/* loaded from: classes3.dex */
public final class h0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public p0 f97797r;

    /* renamed from: s, reason: collision with root package name */
    public ww.g f97798s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f97799t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p0 f97800u;

    /* renamed from: v, reason: collision with root package name */
    public int f97801v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(p0 p0Var, bl2.c cVar) {
        super(cVar);
        this.f97800u = p0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f97799t = obj;
        this.f97801v |= Integer.MIN_VALUE;
        return p0.i(this.f97800u, null, null, this);
    }
}
