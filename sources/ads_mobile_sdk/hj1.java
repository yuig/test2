package ads_mobile_sdk;

import java.util.Map;

/* loaded from: classes2.dex */
public final class hj1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ij1 f5992a;

    /* renamed from: b, reason: collision with root package name */
    public Map f5993b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f5994c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij1 f5995d;

    /* renamed from: e, reason: collision with root package name */
    public int f5996e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj1(ij1 ij1Var, bl2.c cVar) {
        super(cVar);
        this.f5995d = ij1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f5994c = obj;
        this.f5996e |= Integer.MIN_VALUE;
        return this.f5995d.a(null, null, this);
    }
}
