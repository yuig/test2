package u62;

/* loaded from: classes4.dex */
public final class m extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public String f120846r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f120847s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f120848t;

    /* renamed from: u, reason: collision with root package name */
    public int f120849u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, bl2.c cVar) {
        super(cVar);
        this.f120848t = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f120847s = obj;
        this.f120849u |= Integer.MIN_VALUE;
        return t.a(null, this.f120848t, null, this);
    }
}
