package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class cd2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ed2 f3873a;

    /* renamed from: b, reason: collision with root package name */
    public mo2.a f3874b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f3875c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed2 f3876d;

    /* renamed from: e, reason: collision with root package name */
    public int f3877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd2(ed2 ed2Var, bl2.c cVar) {
        super(cVar);
        this.f3876d = ed2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3875c = obj;
        this.f3877e |= Integer.MIN_VALUE;
        return this.f3876d.b(this);
    }
}
