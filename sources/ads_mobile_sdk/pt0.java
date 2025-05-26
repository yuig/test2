package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class pt0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ku0 f9805a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f9806b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f9807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku0 f9808d;

    /* renamed from: e, reason: collision with root package name */
    public int f9809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(ku0 ku0Var, bl2.c cVar) {
        super(cVar);
        this.f9808d = ku0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9807c = obj;
        this.f9809e |= Integer.MIN_VALUE;
        return this.f9808d.i(this);
    }
}
