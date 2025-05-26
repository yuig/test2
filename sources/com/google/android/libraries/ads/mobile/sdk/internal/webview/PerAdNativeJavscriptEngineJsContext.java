package com.google.android.libraries.ads.mobile.sdk.internal.webview;

import a.cd;
import a.ce;
import ads_mobile_sdk.fm0;
import ads_mobile_sdk.ym0;
import android.net.Uri;
import androidx.annotation.Keep;
import ao2.v;
import fi.b;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mo2.c;
import mo2.d;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/webview/PerAdNativeJavscriptEngineJsContext;", "La/ce;", "", "La/cd;", "perAdGmsgHandlers", "Ljava/util/Set;", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PerAdNativeJavscriptEngineJsContext implements ce {

    /* renamed from: a, reason: collision with root package name */
    public final ce f32092a;

    /* renamed from: b, reason: collision with root package name */
    public final c f32093b;

    @Keep
    @NotNull
    private final Set<cd> perAdGmsgHandlers;

    public PerAdNativeJavscriptEngineJsContext(ce jsContext) {
        Intrinsics.checkNotNullParameter(jsContext, "jsContext");
        this.f32092a = jsContext;
        b bVar = d.f87812a;
        this.f32093b = new c(false);
        this.perAdGmsgHandlers = new LinkedHashSet();
    }

    @Override // a.ce
    public final Object a(ym0 ym0Var, Uri uri, bl2.c cVar) {
        return this.f32092a.a(ym0Var, uri, cVar);
    }

    @Override // a.ce
    public final Object a(ym0 ym0Var, String str, bl2.c cVar) {
        return this.f32092a.a(ym0Var, str, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // a.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, a.cd r8, bl2.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.zv1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.zv1 r0 = (ads_mobile_sdk.zv1) r0
            int r1 = r0.f14955g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14955g = r1
            goto L18
        L13:
            ads_mobile_sdk.zv1 r0 = new ads_mobile_sdk.zv1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f14953e
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f14955g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            ue.c.H(r9)
            goto L8c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            mo2.a r7 = r0.f14952d
            a.cd r8 = r0.f14951c
            java.lang.String r2 = r0.f14950b
            com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext r4 = r0.f14949a
            ue.c.H(r9)
            goto L65
        L3f:
            ue.c.H(r9)
            java.lang.String r9 = r8.d()
            if (r9 == 0) goto L78
            boolean r9 = kotlin.text.z.j(r9)
            if (r9 == 0) goto L4f
            goto L78
        L4f:
            r0.f14949a = r6
            r0.f14950b = r7
            r0.f14951c = r8
            mo2.c r9 = r6.f32093b
            r0.f14952d = r9
            r0.f14955g = r4
            java.lang.Object r2 = r9.f(r5, r0)
            if (r2 != r1) goto L62
            return r1
        L62:
            r4 = r6
            r2 = r7
            r7 = r9
        L65:
            java.util.Set<a.cd> r9 = r4.perAdGmsgHandlers     // Catch: java.lang.Throwable -> L71
            r9.add(r8)     // Catch: java.lang.Throwable -> L71
            mo2.c r7 = (mo2.c) r7
            r7.i(r5)
            r7 = r2
            goto L79
        L71:
            r8 = move-exception
            mo2.c r7 = (mo2.c) r7
            r7.i(r5)
            throw r8
        L78:
            r4 = r6
        L79:
            r0.f14949a = r5
            r0.f14950b = r5
            r0.f14951c = r5
            r0.f14952d = r5
            r0.f14955g = r3
            a.ce r9 = r4.f32092a
            java.lang.Object r7 = r9.a(r7, r8, r0)
            if (r7 != r1) goto L8c
            return r1
        L8c:
            kotlin.Unit r7 = kotlin.Unit.f80348a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext.a(java.lang.String, a.cd, bl2.c):java.lang.Object");
    }

    @Override // a.ce
    public final Object a(String str, v vVar, fm0 fm0Var) {
        return this.f32092a.a(str, vVar, fm0Var);
    }
}
