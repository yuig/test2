package kc1;

/* loaded from: classes5.dex */
public final class b0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f79138r;

    /* renamed from: s, reason: collision with root package name */
    public int f79139s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f79140t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f79140t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f79138r = obj;
        this.f79139s |= Integer.MIN_VALUE;
        return this.f79140t.emit(null, this);
    }
}
