package np1;

/* loaded from: classes5.dex */
public final class e extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public i f91775r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f91776s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f91777t;

    /* renamed from: u, reason: collision with root package name */
    public int f91778u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, bl2.c cVar) {
        super(cVar);
        this.f91777t = iVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f91776s = obj;
        this.f91778u |= Integer.MIN_VALUE;
        return this.f91777t.c(this);
    }
}
