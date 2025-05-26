package do2;

/* loaded from: classes4.dex */
public final class e0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55761r;

    /* renamed from: s, reason: collision with root package name */
    public int f55762s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f0 f55763t;

    /* renamed from: u, reason: collision with root package name */
    public Object f55764u;

    /* renamed from: v, reason: collision with root package name */
    public j f55765v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, bl2.c cVar) {
        super(cVar);
        this.f55763t = f0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55761r = obj;
        this.f55762s |= Integer.MIN_VALUE;
        return this.f55763t.collect(null, this);
    }
}
