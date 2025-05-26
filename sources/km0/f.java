package km0;

/* loaded from: classes5.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public e f80183r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f80184s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f80185t;

    /* renamed from: u, reason: collision with root package name */
    public int f80186u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, bl2.c cVar) {
        super(cVar);
        this.f80185t = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f80184s = obj;
        this.f80186u |= Integer.MIN_VALUE;
        return this.f80185t.a(0, null, null, null, this);
    }
}
