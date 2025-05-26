package do2;

/* loaded from: classes4.dex */
public final class r0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55918r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ by1.f f55919s;

    /* renamed from: t, reason: collision with root package name */
    public int f55920t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(by1.f fVar, bl2.c cVar) {
        super(cVar);
        this.f55919s = fVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55918r = obj;
        this.f55920t |= Integer.MIN_VALUE;
        return this.f55919s.emit(null, this);
    }
}
