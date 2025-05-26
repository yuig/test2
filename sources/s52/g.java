package s52;

/* loaded from: classes4.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f111172r;

    /* renamed from: s, reason: collision with root package name */
    public int f111173s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f111174t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f111174t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f111172r = obj;
        this.f111173s |= Integer.MIN_VALUE;
        return this.f111174t.emit(null, this);
    }
}
