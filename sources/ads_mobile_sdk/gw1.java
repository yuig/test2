package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class gw1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hw1 f5727b;

    /* renamed from: c, reason: collision with root package name */
    public int f5728c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw1(hw1 hw1Var, bl2.c cVar) {
        super(cVar);
        this.f5727b = hw1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5726a = obj;
        this.f5728c |= Integer.MIN_VALUE;
        return this.f5727b.c(this);
    }
}
