package do2;

/* loaded from: classes4.dex */
public final class y2 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f56012r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z2 f56013s;

    /* renamed from: t, reason: collision with root package name */
    public int f56014t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(z2 z2Var, bl2.c cVar) {
        super(cVar);
        this.f56013s = z2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f56012r = obj;
        this.f56014t |= Integer.MIN_VALUE;
        return this.f56013s.collect(null, this);
    }
}
