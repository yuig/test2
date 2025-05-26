package kd1;

/* loaded from: classes5.dex */
public final class d extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79239r;

    /* renamed from: s, reason: collision with root package name */
    public int f79240s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f79241t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f79241t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f79239r = obj;
        this.f79240s |= Integer.MIN_VALUE;
        return this.f79241t.emit(null, this);
    }
}
