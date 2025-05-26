package do2;

/* loaded from: classes2.dex */
public final class l0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public m0 f55840r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f55841s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ m0 f55842t;

    /* renamed from: u, reason: collision with root package name */
    public int f55843u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, bl2.c cVar) {
        super(cVar);
        this.f55842t = m0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55841s = obj;
        this.f55843u |= Integer.MIN_VALUE;
        return this.f55842t.emit(null, this);
    }
}
