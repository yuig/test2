package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class h7 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public i7 f5866a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i7 f5868c;

    /* renamed from: d, reason: collision with root package name */
    public int f5869d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(i7 i7Var, bl2.c cVar) {
        super(cVar);
        this.f5868c = i7Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5867b = obj;
        this.f5869d |= Integer.MIN_VALUE;
        return this.f5868c.c(this);
    }
}
