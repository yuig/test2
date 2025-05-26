package ads_mobile_sdk;

import okhttp3.Request;

/* loaded from: classes2.dex */
public final class yc1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public ad1 f14193a;

    /* renamed from: b, reason: collision with root package name */
    public Request.Builder f14194b;

    /* renamed from: c, reason: collision with root package name */
    public String f14195c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f14196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad1 f14197e;

    /* renamed from: f, reason: collision with root package name */
    public int f14198f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc1(ad1 ad1Var, bl2.c cVar) {
        super(cVar);
        this.f14197e = ad1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14196d = obj;
        this.f14198f |= Integer.MIN_VALUE;
        return this.f14197e.a(null, null, this);
    }
}
