package kc1;

/* loaded from: classes5.dex */
public final class v extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79178r;

    /* renamed from: s, reason: collision with root package name */
    public int f79179s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f79180t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f79180t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f79178r = obj;
        this.f79179s |= Integer.MIN_VALUE;
        return this.f79180t.emit(null, this);
    }
}
