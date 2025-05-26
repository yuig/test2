package lo2;

/* loaded from: classes4.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h f84183r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f84184s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f84185t;

    /* renamed from: u, reason: collision with root package name */
    public int f84186u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, bl2.c cVar) {
        super(cVar);
        this.f84185t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f84184s = obj;
        this.f84186u |= Integer.MIN_VALUE;
        return this.f84185t.d(this);
    }
}
