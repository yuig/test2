package a6;

/* loaded from: classes.dex */
public final class f0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Object f830r;

    /* renamed from: s, reason: collision with root package name */
    public Object f831s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f832t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j0 f833u;

    /* renamed from: v, reason: collision with root package name */
    public int f834v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f833u = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f832t = obj;
        this.f834v |= Integer.MIN_VALUE;
        return this.f833u.i(this);
    }
}
