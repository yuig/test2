package w41;

/* loaded from: classes5.dex */
public final class f0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f128002r;

    /* renamed from: s, reason: collision with root package name */
    public int f128003s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f128004t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f128004t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f128002r = obj;
        this.f128003s |= Integer.MIN_VALUE;
        return this.f128004t.emit(null, this);
    }
}
