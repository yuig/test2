package ads_mobile_sdk;

/* loaded from: classes2.dex */
public final class w72 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y72 f12893b;

    /* renamed from: c, reason: collision with root package name */
    public int f12894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w72(y72 y72Var, bl2.c cVar) {
        super(cVar);
        this.f12893b = y72Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12892a = obj;
        this.f12894c |= Integer.MIN_VALUE;
        return this.f12893b.a(null, this);
    }
}
