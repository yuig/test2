package do2;

/* loaded from: classes2.dex */
public final class q1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55906r;

    /* renamed from: s, reason: collision with root package name */
    public int f55907s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l5.c f55908t;

    /* renamed from: u, reason: collision with root package name */
    public Object f55909u;

    /* renamed from: v, reason: collision with root package name */
    public j f55910v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(l5.c cVar, bl2.c cVar2) {
        super(cVar2);
        this.f55908t = cVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55906r = obj;
        this.f55907s |= Integer.MIN_VALUE;
        return this.f55908t.emit(null, this);
    }
}
