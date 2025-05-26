package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class b32 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r32 f2696b;

    /* renamed from: c, reason: collision with root package name */
    public int f2697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b32(r32 r32Var, bl2.c cVar) {
        super(cVar);
        this.f2696b = r32Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f2695a = obj;
        this.f2697c |= Integer.MIN_VALUE;
        return r32.a(this.f2696b, this);
    }
}
