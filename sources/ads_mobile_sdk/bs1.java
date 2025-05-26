package ads_mobile_sdk;

import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class bs1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public cs1 f3573a;

    /* renamed from: b, reason: collision with root package name */
    public WebView f3574b;

    /* renamed from: c, reason: collision with root package name */
    public mo2.a f3575c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3576d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cs1 f3578f;

    /* renamed from: g, reason: collision with root package name */
    public int f3579g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs1(cs1 cs1Var, bl2.c cVar) {
        super(cVar);
        this.f3578f = cs1Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f3577e = obj;
        this.f3579g |= Integer.MIN_VALUE;
        return cs1.a(this.f3578f, null, false, this);
    }
}
