package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class uj1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public wj1 f12090a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f12091b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f12092c;

    /* renamed from: d, reason: collision with root package name */
    public ym0 f12093d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f12094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj1 f12095f;

    /* renamed from: g, reason: collision with root package name */
    public int f12096g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj1(wj1 wj1Var, bl2.c cVar) {
        super(cVar);
        this.f12095f = wj1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12094e = obj;
        this.f12096g |= Integer.MIN_VALUE;
        return wj1.a(this.f12095f, null, this);
    }
}
