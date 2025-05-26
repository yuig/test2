package c61;

/* loaded from: classes5.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f26522r;

    /* renamed from: s, reason: collision with root package name */
    public int f26523s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f26524t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f26524t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f26522r = obj;
        this.f26523s |= Integer.MIN_VALUE;
        return this.f26524t.emit(null, this);
    }
}
