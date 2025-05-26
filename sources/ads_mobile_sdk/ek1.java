package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ek1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f4877a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f4878b;

    /* renamed from: c, reason: collision with root package name */
    public cs2 f4879c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mk1 f4881e;

    /* renamed from: f, reason: collision with root package name */
    public int f4882f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek1(mk1 mk1Var, bl2.c cVar) {
        super(cVar);
        this.f4881e = mk1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4880d = obj;
        this.f4882f |= Integer.MIN_VALUE;
        return mk1.a(this.f4881e, this);
    }
}
