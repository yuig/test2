package ads_mobile_sdk;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v52 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f12357a;

    /* renamed from: b, reason: collision with root package name */
    public final fg f12358b;

    /* renamed from: c, reason: collision with root package name */
    public final xg2 f12359c;

    /* renamed from: d, reason: collision with root package name */
    public final a.kf f12360d;

    public v52(j0 backgroundScope, fg appState, xg2 signalCache, a.kf publicJavascriptBridgeFactory) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(appState, "appState");
        Intrinsics.checkNotNullParameter(signalCache, "signalCache");
        Intrinsics.checkNotNullParameter(publicJavascriptBridgeFactory, "publicJavascriptBridgeFactory");
        this.f12357a = backgroundScope;
        this.f12358b = appState;
        this.f12359c = signalCache;
        this.f12360d = publicJavascriptBridgeFactory;
    }
}
