package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class fq0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gq0 f5238b;

    /* renamed from: c, reason: collision with root package name */
    public int f5239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq0(gq0 gq0Var, bl2.c cVar) {
        super(cVar);
        this.f5238b = gq0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5237a = obj;
        this.f5239c |= Integer.MIN_VALUE;
        return this.f5238b.a(null, null, this);
    }
}
