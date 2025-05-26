package t3;

/* loaded from: classes2.dex */
public final class i1 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f116034r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k1 f116035s;

    /* renamed from: t, reason: collision with root package name */
    public int f116036t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(k1 k1Var, bl2.c cVar) {
        super(cVar);
        this.f116035s = k1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116034r = obj;
        this.f116036t |= Integer.MIN_VALUE;
        return this.f116035s.c(null, this);
    }
}
