package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class sm0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f11150a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f11151b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11152c;

    /* renamed from: d, reason: collision with root package name */
    public ao2.v f11153d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f11154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym0 f11155f;

    /* renamed from: g, reason: collision with root package name */
    public int f11156g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm0(ym0 ym0Var, bl2.c cVar) {
        super(cVar);
        this.f11155f = ym0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f11154e = obj;
        this.f11156g |= Integer.MIN_VALUE;
        return this.f11155f.b(null, this);
    }
}
