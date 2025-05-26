package j72;

/* loaded from: classes4.dex */
public final class q extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f74902r;

    /* renamed from: s, reason: collision with root package name */
    public int f74903s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f74904t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f74904t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f74902r = obj;
        this.f74903s |= Integer.MIN_VALUE;
        return this.f74904t.emit(null, this);
    }
}
