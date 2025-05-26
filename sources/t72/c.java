package t72;

/* loaded from: classes4.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116629r;

    /* renamed from: s, reason: collision with root package name */
    public int f116630s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c31.m f116631t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c31.m mVar, bl2.c cVar) {
        super(cVar);
        this.f116631t = mVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116629r = obj;
        this.f116630s |= Integer.MIN_VALUE;
        return this.f116631t.emit(null, this);
    }
}
