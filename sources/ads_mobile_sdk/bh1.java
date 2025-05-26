package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class bh1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public dh1 f2880a;

    /* renamed from: b, reason: collision with root package name */
    public ug1 f2881b;

    /* renamed from: c, reason: collision with root package name */
    public mo2.a f2882c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f2883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh1 f2884e;

    /* renamed from: f, reason: collision with root package name */
    public int f2885f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh1(dh1 dh1Var, bl2.c cVar) {
        super(cVar);
        this.f2884e = dh1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2883d = obj;
        this.f2885f |= Integer.MIN_VALUE;
        return this.f2884e.a(null, this, false);
    }
}
