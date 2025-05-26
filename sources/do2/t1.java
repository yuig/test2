package do2;

/* loaded from: classes2.dex */
public final class t1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public u1 f55951r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.j0 f55952s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f55953t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u1 f55954u;

    /* renamed from: v, reason: collision with root package name */
    public int f55955v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, bl2.c cVar) {
        super(cVar);
        this.f55954u = u1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55953t = obj;
        this.f55955v |= Integer.MIN_VALUE;
        return this.f55954u.emit(null, this);
    }
}
