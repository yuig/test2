package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class xt2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public au2 f13816a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13817b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ au2 f13818c;

    /* renamed from: d, reason: collision with root package name */
    public int f13819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt2(au2 au2Var, bl2.c cVar) {
        super(cVar);
        this.f13818c = au2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13817b = obj;
        this.f13819d |= Integer.MIN_VALUE;
        return this.f13818c.a(this);
    }
}
