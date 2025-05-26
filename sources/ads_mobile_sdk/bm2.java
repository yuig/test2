package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class bm2 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public dm2 f3525a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f3526b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f3527c;

    /* renamed from: d, reason: collision with root package name */
    public ym0 f3528d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dm2 f3530f;

    /* renamed from: g, reason: collision with root package name */
    public int f3531g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm2(dm2 dm2Var, bl2.c cVar) {
        super(cVar);
        this.f3530f = dm2Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3529e = obj;
        this.f3531g |= Integer.MIN_VALUE;
        return dm2.a(this.f3530f, this);
    }
}
