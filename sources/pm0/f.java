package pm0;

/* loaded from: classes5.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j f100653r;

    /* renamed from: s, reason: collision with root package name */
    public r f100654s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f100655t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f100656u;

    /* renamed from: v, reason: collision with root package name */
    public int f100657v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, bl2.c cVar) {
        super(cVar);
        this.f100656u = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f100655t = obj;
        this.f100657v |= Integer.MIN_VALUE;
        return j.k(this.f100656u, null, null, this);
    }
}
