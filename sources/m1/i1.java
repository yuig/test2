package m1;

/* loaded from: classes2.dex */
public final class i1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j1 f85373r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85374s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j1 f85375t;

    /* renamed from: u, reason: collision with root package name */
    public int f85376u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, bl2.c cVar) {
        super(cVar);
        this.f85375t = j1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f85374s = obj;
        this.f85376u |= Integer.MIN_VALUE;
        return this.f85375t.c(this);
    }
}
