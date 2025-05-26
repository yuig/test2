package ma1;

/* loaded from: classes5.dex */
public final class m extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f86791r;

    /* renamed from: s, reason: collision with root package name */
    public int f86792s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f86793t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f86793t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f86791r = obj;
        this.f86792s |= Integer.MIN_VALUE;
        return this.f86793t.emit(null, this);
    }
}
