package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class xr extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f13769a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f13770b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f13771c;

    /* renamed from: d, reason: collision with root package name */
    public mo2.a f13772d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zr f13774f;

    /* renamed from: g, reason: collision with root package name */
    public int f13775g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr(zr zrVar, bl2.c cVar) {
        super(cVar);
        this.f13774f = zrVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13773e = obj;
        this.f13775g |= Integer.MIN_VALUE;
        return zr.a(this.f13774f, this);
    }
}
