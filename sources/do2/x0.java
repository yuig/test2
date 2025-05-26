package do2;

/* loaded from: classes4.dex */
public final class x0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56000r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y0 f56001s;

    /* renamed from: t, reason: collision with root package name */
    public int f56002t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y0 y0Var, bl2.c cVar) {
        super(cVar);
        this.f56001s = y0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f56000r = obj;
        this.f56002t |= Integer.MIN_VALUE;
        return this.f56001s.emit(null, this);
    }
}
