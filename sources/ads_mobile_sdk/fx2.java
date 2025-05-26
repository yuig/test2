package ads_mobile_sdk;

import ao2.p0;

/* loaded from: classes2.dex */
public final class fx2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f5300a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5301b;

    /* renamed from: c, reason: collision with root package name */
    public p0 f5302c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f5303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix2 f5304e;

    /* renamed from: f, reason: collision with root package name */
    public int f5305f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx2(ix2 ix2Var, bl2.c cVar) {
        super(cVar);
        this.f5304e = ix2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5303d = obj;
        this.f5305f |= Integer.MIN_VALUE;
        return ix2.a(this.f5304e, this);
    }
}
