package c31;

/* loaded from: classes5.dex */
public final class l extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f25589r;

    /* renamed from: s, reason: collision with root package name */
    public int f25590s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m f25591t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, bl2.c cVar) {
        super(cVar);
        this.f25591t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f25589r = obj;
        this.f25590s |= Integer.MIN_VALUE;
        return this.f25591t.emit(null, this);
    }
}
