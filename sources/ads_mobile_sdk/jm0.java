package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class jm0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ym0 f6877a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f6878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym0 f6879c;

    /* renamed from: d, reason: collision with root package name */
    public int f6880d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm0(ym0 ym0Var, bl2.c cVar) {
        super(cVar);
        this.f6879c = ym0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6878b = obj;
        this.f6880d |= Integer.MIN_VALUE;
        return this.f6879c.a(this);
    }
}
