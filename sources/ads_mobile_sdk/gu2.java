package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class gu2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public nu2 f5699a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nu2 f5701c;

    /* renamed from: d, reason: collision with root package name */
    public int f5702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu2(nu2 nu2Var, bl2.c cVar) {
        super(cVar);
        this.f5701c = nu2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5700b = obj;
        this.f5702d |= Integer.MIN_VALUE;
        return nu2.a(this.f5701c, (bl2.c) this);
    }
}
