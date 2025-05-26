package a92;

/* loaded from: classes4.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h f1601r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1602s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f1603t;

    /* renamed from: u, reason: collision with root package name */
    public int f1604u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, bl2.c cVar) {
        super(cVar);
        this.f1603t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f1602s = obj;
        this.f1604u |= Integer.MIN_VALUE;
        return this.f1603t.e(null, this);
    }
}
