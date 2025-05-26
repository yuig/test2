package do2;

/* loaded from: classes2.dex */
public final class e2 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f2 f55768r;

    /* renamed from: s, reason: collision with root package name */
    public j f55769s;

    /* renamed from: t, reason: collision with root package name */
    public h2 f55770t;

    /* renamed from: u, reason: collision with root package name */
    public ao2.o1 f55771u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f55772v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f2 f55773w;

    /* renamed from: x, reason: collision with root package name */
    public int f55774x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, bl2.c cVar) {
        super(cVar);
        this.f55773w = f2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55772v = obj;
        this.f55774x |= Integer.MIN_VALUE;
        return f2.j(this.f55773w, null, this);
    }
}
