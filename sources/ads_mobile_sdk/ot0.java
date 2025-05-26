package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ot0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ku0 f9428a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9429b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku0 f9431d;

    /* renamed from: e, reason: collision with root package name */
    public int f9432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot0(ku0 ku0Var, bl2.c cVar) {
        super(cVar);
        this.f9431d = ku0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9430c = obj;
        this.f9432e |= Integer.MIN_VALUE;
        return this.f9431d.h(this);
    }
}
