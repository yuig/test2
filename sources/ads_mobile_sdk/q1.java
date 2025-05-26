package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class q1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f9901a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f9902b;

    /* renamed from: c, reason: collision with root package name */
    public int f9903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, bl2.c cVar) {
        super(cVar);
        this.f9902b = s1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f9901a = obj;
        this.f9903c |= Integer.MIN_VALUE;
        return this.f9902b.c(this);
    }
}
