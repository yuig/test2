package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ww0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f13276a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13277b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13278c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw0 f13279d;

    /* renamed from: e, reason: collision with root package name */
    public int f13280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww0(yw0 yw0Var, bl2.c cVar) {
        super(cVar);
        this.f13279d = yw0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13278c = obj;
        this.f13280e |= Integer.MIN_VALUE;
        return this.f13279d.a(this);
    }
}
