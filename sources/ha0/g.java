package ha0;

/* loaded from: classes5.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public String f68376r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f68377s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r90.g f68378t;

    /* renamed from: u, reason: collision with root package name */
    public int f68379u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r90.g gVar, bl2.c cVar) {
        super(cVar);
        this.f68378t = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f68377s = obj;
        this.f68379u |= Integer.MIN_VALUE;
        return this.f68378t.i(null, this);
    }
}
