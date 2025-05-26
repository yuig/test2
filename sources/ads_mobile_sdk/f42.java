package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class f42 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o42 f5041b;

    /* renamed from: c, reason: collision with root package name */
    public int f5042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f42(o42 o42Var, bl2.c cVar) {
        super(cVar);
        this.f5041b = o42Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5040a = obj;
        this.f5042c |= Integer.MIN_VALUE;
        return o42.a(this.f5041b, (bl2.c) this);
    }
}
