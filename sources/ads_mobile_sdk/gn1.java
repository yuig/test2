package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class gn1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public un1 f5628a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f5629b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5630c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un1 f5631d;

    /* renamed from: e, reason: collision with root package name */
    public int f5632e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn1(un1 un1Var, bl2.c cVar) {
        super(cVar);
        this.f5631d = un1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5630c = obj;
        this.f5632e |= Integer.MIN_VALUE;
        return this.f5631d.a(this);
    }
}
