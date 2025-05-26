package x91;

/* loaded from: classes5.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f134344r;

    /* renamed from: s, reason: collision with root package name */
    public int f134345s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f134346t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f134346t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f134344r = obj;
        this.f134345s |= Integer.MIN_VALUE;
        return this.f134346t.emit(null, this);
    }
}
