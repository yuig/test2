package xu1;

/* loaded from: classes4.dex */
public final class w extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f135982r;

    /* renamed from: s, reason: collision with root package name */
    public int f135983s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f135984t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f135984t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f135982r = obj;
        this.f135983s |= Integer.MIN_VALUE;
        return this.f135984t.emit(null, this);
    }
}
