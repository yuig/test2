package ads_mobile_sdk;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes2.dex */
public final class wp0 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public OkHttpClient f13154a;

    /* renamed from: b, reason: collision with root package name */
    public Request.Builder f13155b;

    /* renamed from: c, reason: collision with root package name */
    public String f13156c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f13157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yp0 f13158e;

    /* renamed from: f, reason: collision with root package name */
    public int f13159f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(yp0 yp0Var, bl2.c cVar) {
        super(cVar);
        this.f13158e = yp0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f13157d = obj;
        this.f13159f |= Integer.MIN_VALUE;
        return yp0.a(this.f13158e, (Request) null, (zn2.b) null, (OkHttpClient) null, this);
    }
}
