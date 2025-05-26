package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class v6 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public z6 f12361a;

    /* renamed from: b, reason: collision with root package name */
    public cs2 f12362b;

    /* renamed from: c, reason: collision with root package name */
    public Closeable f12363c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f12364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z6 f12365e;

    /* renamed from: f, reason: collision with root package name */
    public int f12366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(z6 z6Var, bl2.c cVar) {
        super(cVar);
        this.f12365e = z6Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f12364d = obj;
        this.f12366f |= Integer.MIN_VALUE;
        return z6.a(this.f12365e, this);
    }
}
