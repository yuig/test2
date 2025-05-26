package yc;

/* loaded from: classes3.dex */
public final class n extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f138647r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f138648s;

    /* renamed from: t, reason: collision with root package name */
    public int f138649t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, bl2.c cVar) {
        super(cVar);
        this.f138648s = qVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f138647r = obj;
        this.f138649t |= Integer.MIN_VALUE;
        return this.f138648s.a(null, this);
    }
}
