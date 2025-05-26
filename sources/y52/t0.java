package y52;

/* loaded from: classes4.dex */
public final class t0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137849r;

    /* renamed from: s, reason: collision with root package name */
    public int f137850s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f137851t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f137851t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f137849r = obj;
        this.f137850s |= Integer.MIN_VALUE;
        return this.f137851t.emit(null, this);
    }
}
