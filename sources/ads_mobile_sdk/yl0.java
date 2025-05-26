package ads_mobile_sdk;

import a.l0;

/* loaded from: classes2.dex */
public final class yl0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f14308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f14309b;

    /* renamed from: c, reason: collision with root package name */
    public int f14310c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl0(l0 l0Var, bl2.c cVar) {
        super(cVar);
        this.f14309b = l0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14308a = obj;
        this.f14310c |= Integer.MIN_VALUE;
        return this.f14309b.a(0L, null, this);
    }
}
