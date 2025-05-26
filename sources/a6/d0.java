package a6;

/* loaded from: classes3.dex */
public final class d0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j0 f812r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f813s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f814t;

    /* renamed from: u, reason: collision with root package name */
    public int f815u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f814t = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f813s = obj;
        this.f815u |= Integer.MIN_VALUE;
        return this.f814t.g(this);
    }
}
