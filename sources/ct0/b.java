package ct0;

/* loaded from: classes5.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public d f53133r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f53134s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f53135t;

    /* renamed from: u, reason: collision with root package name */
    public int f53136u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, bl2.c cVar) {
        super(cVar);
        this.f53135t = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f53134s = obj;
        this.f53136u |= Integer.MIN_VALUE;
        return this.f53135t.a(0, null, null, null, this);
    }
}
