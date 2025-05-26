package np1;

/* loaded from: classes2.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f91771r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f91772s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f91773t;

    /* renamed from: u, reason: collision with root package name */
    public int f91774u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, bl2.c cVar) {
        super(cVar);
        this.f91773t = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f91772s = obj;
        this.f91774u |= Integer.MIN_VALUE;
        return this.f91773t.b(this);
    }
}
