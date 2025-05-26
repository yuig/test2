package m1;

/* loaded from: classes2.dex */
public final class v1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public long f85607r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85608s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w1 f85609t;

    /* renamed from: u, reason: collision with root package name */
    public int f85610u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, bl2.c cVar) {
        super(cVar);
        this.f85609t = w1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f85608s = obj;
        this.f85610u |= Integer.MIN_VALUE;
        return this.f85609t.y0(0L, 0L, this);
    }
}
