package l62;

/* loaded from: classes4.dex */
public final class y extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public a0 f81694r;

    /* renamed from: s, reason: collision with root package name */
    public a f81695s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f81696t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a0 f81697u;

    /* renamed from: v, reason: collision with root package name */
    public int f81698v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, bl2.c cVar) {
        super(cVar);
        this.f81697u = a0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f81696t = obj;
        this.f81698v |= Integer.MIN_VALUE;
        return a0.a(this.f81697u, null, this);
    }
}
