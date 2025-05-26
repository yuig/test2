package y3;

/* loaded from: classes2.dex */
public final class j extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public k f136720r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f136721s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f136722t;

    /* renamed from: u, reason: collision with root package name */
    public int f136723u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, bl2.c cVar) {
        super(cVar);
        this.f136722t = kVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f136721s = obj;
        this.f136723u |= Integer.MIN_VALUE;
        return this.f136722t.a(0.0f, this);
    }
}
