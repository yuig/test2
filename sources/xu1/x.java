package xu1;

/* loaded from: classes4.dex */
public final class x extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f135985r;

    /* renamed from: s, reason: collision with root package name */
    public int f135986s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f135987t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f135987t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f135985r = obj;
        this.f135986s |= Integer.MIN_VALUE;
        return this.f135987t.emit(null, this);
    }
}
