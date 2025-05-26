package v41;

/* loaded from: classes5.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124115r;

    /* renamed from: s, reason: collision with root package name */
    public int f124116s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f124117t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f124117t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f124115r = obj;
        this.f124116s |= Integer.MIN_VALUE;
        return this.f124117t.emit(null, this);
    }
}
