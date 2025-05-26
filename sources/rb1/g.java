package rb1;

/* loaded from: classes5.dex */
public final class g extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f107082r;

    /* renamed from: s, reason: collision with root package name */
    public int f107083s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f107084t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f107084t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f107082r = obj;
        this.f107083s |= Integer.MIN_VALUE;
        return this.f107084t.emit(null, this);
    }
}
