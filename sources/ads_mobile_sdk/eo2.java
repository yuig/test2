package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class eo2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fo2 f4912b;

    /* renamed from: c, reason: collision with root package name */
    public int f4913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo2(fo2 fo2Var, bl2.c cVar) {
        super(cVar);
        this.f4912b = fo2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f4911a = obj;
        this.f4913c |= Integer.MIN_VALUE;
        return this.f4912b.c(this);
    }
}
