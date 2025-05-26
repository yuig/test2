package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class vr2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public wr2 f12617a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wr2 f12619c;

    /* renamed from: d, reason: collision with root package name */
    public int f12620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr2(wr2 wr2Var, bl2.c cVar) {
        super(cVar);
        this.f12619c = wr2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12618b = obj;
        this.f12620d |= Integer.MIN_VALUE;
        return this.f12619c.c(this);
    }
}
