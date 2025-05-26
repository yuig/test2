package ow;

/* loaded from: classes3.dex */
public final class d0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public p0 f97768r;

    /* renamed from: s, reason: collision with root package name */
    public ww.g f97769s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f97770t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p0 f97771u;

    /* renamed from: v, reason: collision with root package name */
    public int f97772v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p0 p0Var, bl2.c cVar) {
        super(cVar);
        this.f97771u = p0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f97770t = obj;
        this.f97772v |= Integer.MIN_VALUE;
        return p0.g(this.f97771u, null, this);
    }
}
