package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class hn1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public un1 f6023a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6024b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ un1 f6025c;

    /* renamed from: d, reason: collision with root package name */
    public int f6026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn1(un1 un1Var, bl2.c cVar) {
        super(cVar);
        this.f6025c = un1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6024b = obj;
        this.f6026d |= Integer.MIN_VALUE;
        return this.f6025c.b(this);
    }
}
