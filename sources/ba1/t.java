package ba1;

/* loaded from: classes5.dex */
public final class t extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22398r;

    /* renamed from: s, reason: collision with root package name */
    public int f22399s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f22400t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f22400t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f22398r = obj;
        this.f22399s |= Integer.MIN_VALUE;
        return this.f22400t.emit(null, this);
    }
}
