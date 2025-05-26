package n72;

/* loaded from: classes4.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public g f89713r;

    /* renamed from: s, reason: collision with root package name */
    public mo2.a f89714s;

    /* renamed from: t, reason: collision with root package name */
    public c f89715t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f89716u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f89717v;

    /* renamed from: w, reason: collision with root package name */
    public int f89718w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, bl2.c cVar) {
        super(cVar);
        this.f89717v = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f89716u = obj;
        this.f89718w |= Integer.MIN_VALUE;
        return g.a(this.f89717v, this);
    }
}
