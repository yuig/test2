package yc;

/* loaded from: classes3.dex */
public final class o extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138650r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f138651s;

    /* renamed from: t, reason: collision with root package name */
    public int f138652t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, bl2.c cVar) {
        super(cVar);
        this.f138651s = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f138650r = obj;
        this.f138652t |= Integer.MIN_VALUE;
        return this.f138651s.b(null, null, null, null, this);
    }
}
