package z82;

/* loaded from: classes4.dex */
public final class i extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j f141122r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f141123s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f141124t;

    /* renamed from: u, reason: collision with root package name */
    public int f141125u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, bl2.c cVar) {
        super(cVar);
        this.f141124t = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f141123s = obj;
        this.f141125u |= Integer.MIN_VALUE;
        return this.f141124t.e(this);
    }
}
