package pm0;

/* loaded from: classes5.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j f100648r;

    /* renamed from: s, reason: collision with root package name */
    public r f100649s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f100650t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f100651u;

    /* renamed from: v, reason: collision with root package name */
    public int f100652v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, bl2.c cVar) {
        super(cVar);
        this.f100651u = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f100650t = obj;
        this.f100652v |= Integer.MIN_VALUE;
        return j.j(this.f100651u, null, null, this);
    }
}
