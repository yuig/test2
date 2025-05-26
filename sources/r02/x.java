package r02;

/* loaded from: classes4.dex */
public final class x extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f105824r;

    /* renamed from: s, reason: collision with root package name */
    public int f105825s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f105826t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f105826t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f105824r = obj;
        this.f105825s |= Integer.MIN_VALUE;
        return this.f105826t.emit(null, this);
    }
}
