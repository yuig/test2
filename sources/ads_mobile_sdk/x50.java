package ads_mobile_sdk;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class x50 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public Object f13484a;

    /* renamed from: b, reason: collision with root package name */
    public Closeable f13485b;

    /* renamed from: c, reason: collision with root package name */
    public Object f13486c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13487d;

    /* renamed from: e, reason: collision with root package name */
    public yp0 f13488e;

    /* renamed from: f, reason: collision with root package name */
    public int f13489f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13490g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t60 f13491h;

    /* renamed from: i, reason: collision with root package name */
    public int f13492i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x50(t60 t60Var, bl2.c cVar) {
        super(cVar);
        this.f13491h = t60Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13490g = obj;
        this.f13492i |= Integer.MIN_VALUE;
        return this.f13491h.a(this);
    }
}
