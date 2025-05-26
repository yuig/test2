package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class d70 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public e70 f4182a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e70 f4184c;

    /* renamed from: d, reason: collision with root package name */
    public int f4185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d70(e70 e70Var, bl2.c cVar) {
        super(cVar);
        this.f4184c = e70Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4183b = obj;
        this.f4185d |= Integer.MIN_VALUE;
        return this.f4184c.a(null, null, null, this);
    }
}
