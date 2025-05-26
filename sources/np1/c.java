package np1;

/* loaded from: classes2.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f91767r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f91768s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f91769t;

    /* renamed from: u, reason: collision with root package name */
    public int f91770u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, bl2.c cVar) {
        super(cVar);
        this.f91769t = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f91768s = obj;
        this.f91770u |= Integer.MIN_VALUE;
        return this.f91769t.a(this);
    }
}
