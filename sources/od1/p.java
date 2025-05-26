package od1;

/* loaded from: classes5.dex */
public final class p extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f94165r;

    /* renamed from: s, reason: collision with root package name */
    public int f94166s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f94167t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f94167t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f94165r = obj;
        this.f94166s |= Integer.MIN_VALUE;
        return this.f94167t.emit(null, this);
    }
}
