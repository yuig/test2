package t72;

/* loaded from: classes4.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116626r;

    /* renamed from: s, reason: collision with root package name */
    public int f116627s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f116628t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f116628t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116626r = obj;
        this.f116627s |= Integer.MIN_VALUE;
        return this.f116628t.emit(null, this);
    }
}
