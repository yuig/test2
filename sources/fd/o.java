package fd;

/* loaded from: classes3.dex */
public final class o extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f61789r;

    /* renamed from: s, reason: collision with root package name */
    public int f61790s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.f f61791t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(o1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f61791t = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f61789r = obj;
        this.f61790s |= Integer.MIN_VALUE;
        return this.f61791t.emit(null, this);
    }
}
