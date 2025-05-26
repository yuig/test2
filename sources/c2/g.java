package c2;

/* loaded from: classes2.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public h f24739r;

    /* renamed from: s, reason: collision with root package name */
    public Object f24740s;

    /* renamed from: t, reason: collision with root package name */
    public ao2.o1 f24741t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f24742u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f24743v;

    /* renamed from: w, reason: collision with root package name */
    public int f24744w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, bl2.c cVar) {
        super(cVar);
        this.f24743v = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f24742u = obj;
        this.f24744w |= Integer.MIN_VALUE;
        return this.f24743v.emit(null, this);
    }
}
