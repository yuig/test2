package ed;

/* loaded from: classes3.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f58466r;

    /* renamed from: s, reason: collision with root package name */
    public int f58467s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f58468t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, bl2.c cVar) {
        super(cVar);
        this.f58468t = hVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f58466r = obj;
        this.f58467s |= Integer.MIN_VALUE;
        return this.f58468t.emit(null, this);
    }
}
