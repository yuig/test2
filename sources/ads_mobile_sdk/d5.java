package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class d5 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public e5 f4155a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f4156b;

    /* renamed from: c, reason: collision with root package name */
    public cs2 f4157c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e5 f4159e;

    /* renamed from: f, reason: collision with root package name */
    public int f4160f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(e5 e5Var, bl2.c cVar) {
        super(cVar);
        this.f4159e = e5Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4158d = obj;
        this.f4160f |= Integer.MIN_VALUE;
        return this.f4159e.a(this);
    }
}
