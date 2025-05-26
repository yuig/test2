package s1;

/* loaded from: classes2.dex */
public final class t0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f110540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u0 f110541s;

    /* renamed from: t, reason: collision with root package name */
    public int f110542t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, bl2.c cVar) {
        super(cVar);
        this.f110541s = u0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f110540r = obj;
        this.f110542t |= Integer.MIN_VALUE;
        return this.f110541s.a(null, 0.0f, this);
    }
}
