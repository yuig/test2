package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class ui2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs2 f12079a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f12080b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12081c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi2 f12082d;

    /* renamed from: e, reason: collision with root package name */
    public int f12083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui2(vi2 vi2Var, bl2.c cVar) {
        super(cVar);
        this.f12082d = vi2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12081c = obj;
        this.f12083e |= Integer.MIN_VALUE;
        return vi2.a(this.f12082d, this);
    }
}
