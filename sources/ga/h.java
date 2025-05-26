package ga;

/* loaded from: classes3.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f64585r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f64586s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f64587t;

    /* renamed from: u, reason: collision with root package name */
    public int f64588u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, bl2.c cVar) {
        super(cVar);
        this.f64587t = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f64586s = obj;
        this.f64588u |= Integer.MIN_VALUE;
        return i.c(this.f64587t, null, this);
    }
}
