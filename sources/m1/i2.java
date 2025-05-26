package m1;

/* loaded from: classes2.dex */
public final class i2 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.i0 f85377r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f85378s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o2 f85379t;

    /* renamed from: u, reason: collision with root package name */
    public int f85380u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(o2 o2Var, bl2.c cVar) {
        super(cVar);
        this.f85379t = o2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f85378s = obj;
        this.f85380u |= Integer.MIN_VALUE;
        return this.f85379t.b(0L, this);
    }
}
