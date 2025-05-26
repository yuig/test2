package o90;

/* loaded from: classes5.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public e f93785r;

    /* renamed from: s, reason: collision with root package name */
    public k f93786s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f93787t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e f93788u;

    /* renamed from: v, reason: collision with root package name */
    public int f93789v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, bl2.c cVar) {
        super(cVar);
        this.f93788u = eVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f93787t = obj;
        this.f93789v |= Integer.MIN_VALUE;
        return this.f93788u.a(0, null, null, null, this);
    }
}
