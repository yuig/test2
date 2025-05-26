package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class he1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f5939a;

    /* renamed from: b, reason: collision with root package name */
    public int f5940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ie1 f5941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he1(ie1 ie1Var, bl2.c cVar) {
        super(cVar);
        this.f5941c = ie1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5939a = obj;
        this.f5940b |= Integer.MIN_VALUE;
        return this.f5941c.emit(null, this);
    }
}
