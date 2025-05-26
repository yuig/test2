package k1;

/* loaded from: classes2.dex */
public final class b1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public f1 f77818r;

    /* renamed from: s, reason: collision with root package name */
    public o1.h f77819s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f77820t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f1 f77821u;

    /* renamed from: v, reason: collision with root package name */
    public int f77822v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(f1 f1Var, bl2.c cVar) {
        super(cVar);
        this.f77821u = f1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f77820t = obj;
        this.f77822v |= Integer.MIN_VALUE;
        return f1.M0(this.f77821u, this);
    }
}
