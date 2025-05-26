package k1;

/* loaded from: classes2.dex */
public final class c1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f1 f77832r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f77833s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f1 f77834t;

    /* renamed from: u, reason: collision with root package name */
    public int f77835u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(f1 f1Var, bl2.c cVar) {
        super(cVar);
        this.f77834t = f1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f77833s = obj;
        this.f77835u |= Integer.MIN_VALUE;
        return f1.N0(this.f77834t, this);
    }
}
