package fd;

/* loaded from: classes3.dex */
public final class b0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public d0 f61748r;

    /* renamed from: s, reason: collision with root package name */
    public d0 f61749s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f61750t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d0 f61751u;

    /* renamed from: v, reason: collision with root package name */
    public int f61752v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(d0 d0Var, bl2.c cVar) {
        super(cVar);
        this.f61751u = d0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f61750t = obj;
        this.f61752v |= Integer.MIN_VALUE;
        return this.f61751u.b(this);
    }
}
