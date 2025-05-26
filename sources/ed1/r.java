package ed1;

/* loaded from: classes5.dex */
public final class r extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public v f58699r;

    /* renamed from: s, reason: collision with root package name */
    public dl1.s f58700s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f58701t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v f58702u;

    /* renamed from: v, reason: collision with root package name */
    public int f58703v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, bl2.c cVar) {
        super(cVar);
        this.f58702u = vVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f58701t = obj;
        this.f58703v |= Integer.MIN_VALUE;
        return this.f58702u.q3(null, this);
    }
}
