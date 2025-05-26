package z82;

/* loaded from: classes4.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j f141113r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f141114s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f141115t;

    /* renamed from: u, reason: collision with root package name */
    public int f141116u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, bl2.c cVar) {
        super(cVar);
        this.f141115t = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f141114s = obj;
        this.f141116u |= Integer.MIN_VALUE;
        return this.f141115t.c(this);
    }
}
