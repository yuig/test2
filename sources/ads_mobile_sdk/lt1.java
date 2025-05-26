package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class lt1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public pt1 f7955a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pt1 f7957c;

    /* renamed from: d, reason: collision with root package name */
    public int f7958d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt1(pt1 pt1Var, bl2.c cVar) {
        super(cVar);
        this.f7957c = pt1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f7956b = obj;
        this.f7958d |= Integer.MIN_VALUE;
        return pt1.a(this.f7957c, (bl2.c) this);
    }
}
