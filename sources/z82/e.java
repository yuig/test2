package z82;

/* loaded from: classes2.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public j f141109r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f141110s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f141111t;

    /* renamed from: u, reason: collision with root package name */
    public int f141112u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, bl2.c cVar) {
        super(cVar);
        this.f141111t = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f141110s = obj;
        this.f141112u |= Integer.MIN_VALUE;
        return this.f141111t.b(this);
    }
}
