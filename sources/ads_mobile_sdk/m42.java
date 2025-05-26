package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class m42 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public sx0 f8074a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f8075b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o42 f8076c;

    /* renamed from: d, reason: collision with root package name */
    public int f8077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m42(o42 o42Var, bl2.c cVar) {
        super(cVar);
        this.f8076c = o42Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f8075b = obj;
        this.f8077d |= Integer.MIN_VALUE;
        return this.f8076c.b(null, this);
    }
}
