package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class eb0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f4783a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4784b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4785c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb0 f4786d;

    /* renamed from: e, reason: collision with root package name */
    public int f4787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(kb0 kb0Var, bl2.c cVar) {
        super(cVar);
        this.f4786d = kb0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4785c = obj;
        this.f4787e |= Integer.MIN_VALUE;
        return this.f4786d.b(this);
    }
}
