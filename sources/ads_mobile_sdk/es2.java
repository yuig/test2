package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class es2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public a.j3 f4935a;

    /* renamed from: b, reason: collision with root package name */
    public String f4936b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f4937c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.j3 f4938d;

    /* renamed from: e, reason: collision with root package name */
    public int f4939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es2(a.j3 j3Var, bl2.c cVar) {
        super(cVar);
        this.f4938d = j3Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4937c = obj;
        this.f4939e |= Integer.MIN_VALUE;
        return a.j3.a(this.f4938d, null, null, this);
    }
}
