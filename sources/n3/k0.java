package n3;

/* loaded from: classes2.dex */
public final class k0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89077r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0 f89078s;

    /* renamed from: t, reason: collision with root package name */
    public int f89079t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, bl2.c cVar) {
        super(cVar);
        this.f89078s = l0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f89077r = obj;
        this.f89079t |= Integer.MIN_VALUE;
        return this.f89078s.z(0L, null, this);
    }
}
