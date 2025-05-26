package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class jr0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kr0 f6934b;

    /* renamed from: c, reason: collision with root package name */
    public int f6935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr0(kr0 kr0Var, bl2.c cVar) {
        super(cVar);
        this.f6934b = kr0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f6933a = obj;
        this.f6935c |= Integer.MIN_VALUE;
        return this.f6934b.c(this);
    }
}
