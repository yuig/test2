package y52;

/* loaded from: classes4.dex */
public final class w0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public x0 f137864r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f137865s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0 f137866t;

    /* renamed from: u, reason: collision with root package name */
    public int f137867u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, bl2.c cVar) {
        super(cVar);
        this.f137866t = x0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f137865s = obj;
        this.f137867u |= Integer.MIN_VALUE;
        return x0.d8(this.f137866t, this);
    }
}
