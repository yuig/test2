package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class zy0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f14983a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f14984b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f14985c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0 f14986d;

    /* renamed from: e, reason: collision with root package name */
    public int f14987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(mz0 mz0Var, bl2.c cVar) {
        super(cVar);
        this.f14986d = mz0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14985c = obj;
        this.f14987e |= Integer.MIN_VALUE;
        return this.f14986d.a(null, this);
    }
}
