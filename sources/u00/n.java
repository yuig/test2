package u00;

/* loaded from: classes.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Object f119859r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f119860s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f119861t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f119862u;

    /* renamed from: v, reason: collision with root package name */
    public int f119863v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, bl2.c cVar) {
        super(cVar);
        this.f119862u = pVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f119861t = obj;
        this.f119863v |= Integer.MIN_VALUE;
        return this.f119862u.b(null, null, null, null, this);
    }
}
