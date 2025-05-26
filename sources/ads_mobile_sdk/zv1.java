package ads_mobile_sdk;

import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;

/* loaded from: classes2.dex */
public final class zv1 extends dl2.d {

    /* renamed from: a, reason: collision with root package name */
    public PerAdNativeJavscriptEngineJsContext f14949a;

    /* renamed from: b, reason: collision with root package name */
    public String f14950b;

    /* renamed from: c, reason: collision with root package name */
    public a.cd f14951c;

    /* renamed from: d, reason: collision with root package name */
    public mo2.a f14952d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f14953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PerAdNativeJavscriptEngineJsContext f14954f;

    /* renamed from: g, reason: collision with root package name */
    public int f14955g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv1(PerAdNativeJavscriptEngineJsContext perAdNativeJavscriptEngineJsContext, bl2.c cVar) {
        super(cVar);
        this.f14954f = perAdNativeJavscriptEngineJsContext;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f14953e = obj;
        this.f14955g |= Integer.MIN_VALUE;
        return this.f14954f.a((String) null, (a.cd) null, this);
    }
}
