package pd1;

/* loaded from: classes5.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public e f99805r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f99806s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f99807t;

    /* renamed from: u, reason: collision with root package name */
    public int f99808u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, bl2.c cVar) {
        super(cVar);
        this.f99807t = eVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f99806s = obj;
        this.f99808u |= Integer.MIN_VALUE;
        return this.f99807t.a(0, null, null, null, this);
    }
}
