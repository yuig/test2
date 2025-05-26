package m1;

/* loaded from: classes2.dex */
public final class h1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j1 f85365r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85366s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j1 f85367t;

    /* renamed from: u, reason: collision with root package name */
    public int f85368u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(j1 j1Var, bl2.c cVar) {
        super(cVar);
        this.f85367t = j1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f85366s = obj;
        this.f85368u |= Integer.MIN_VALUE;
        return this.f85367t.a(this);
    }
}
