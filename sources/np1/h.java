package np1;

/* loaded from: classes5.dex */
public final class h extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f91785r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f91786s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f91787t;

    /* renamed from: u, reason: collision with root package name */
    public int f91788u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, bl2.c cVar) {
        super(cVar);
        this.f91787t = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f91786s = obj;
        this.f91788u |= Integer.MIN_VALUE;
        return this.f91787t.g(this);
    }
}
