package yc;

/* loaded from: classes3.dex */
public final class r extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138664r;

    /* renamed from: s, reason: collision with root package name */
    public int f138665s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vc.j f138666t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(vc.j jVar, bl2.c cVar) {
        super(cVar);
        this.f138666t = jVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f138664r = obj;
        this.f138665s |= Integer.MIN_VALUE;
        return this.f138666t.emit(null, this);
    }
}
