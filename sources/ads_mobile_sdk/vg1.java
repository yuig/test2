package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class vg1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dh1 f12501b;

    /* renamed from: c, reason: collision with root package name */
    public int f12502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg1(dh1 dh1Var, bl2.c cVar) {
        super(cVar);
        this.f12501b = dh1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12500a = obj;
        this.f12502c |= Integer.MIN_VALUE;
        return this.f12501b.f(this);
    }
}
