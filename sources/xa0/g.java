package xa0;

/* loaded from: classes5.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public k f134401r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f134402s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f134403t;

    /* renamed from: u, reason: collision with root package name */
    public int f134404u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, bl2.c cVar) {
        super(cVar);
        this.f134403t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f134402s = obj;
        this.f134404u |= Integer.MIN_VALUE;
        return this.f134403t.a(0, null, null, null, this);
    }
}
