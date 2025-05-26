package ads_mobile_sdk;

import ao2.j0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ar2 implements wi.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final if1 f2504a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f2505b;

    public ar2(if1 nativeAdAssets, j0 uiScope) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        this.f2504a = nativeAdAssets;
        this.f2505b = uiScope;
    }

    @Override // wi.c0
    public final void onVideoEnd() {
        wi.c0 videoLifecycleCallbacks;
        wi.d0 d0Var = this.f2504a.f6380m;
        if (d0Var == null || (videoLifecycleCallbacks = d0Var.getVideoLifecycleCallbacks()) == null) {
            return;
        }
        j0 j0Var = this.f2505b;
        tq2 block = new tq2(videoLifecycleCallbacks, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // wi.c0
    public final void onVideoMute(boolean z13) {
        wi.c0 videoLifecycleCallbacks;
        wi.d0 d0Var = this.f2504a.f6380m;
        if (d0Var == null || (videoLifecycleCallbacks = d0Var.getVideoLifecycleCallbacks()) == null) {
            return;
        }
        j0 j0Var = this.f2505b;
        vq2 block = new vq2(videoLifecycleCallbacks, null, z13);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // wi.c0
    public final void onVideoPause() {
        wi.c0 videoLifecycleCallbacks;
        wi.d0 d0Var = this.f2504a.f6380m;
        if (d0Var == null || (videoLifecycleCallbacks = d0Var.getVideoLifecycleCallbacks()) == null) {
            return;
        }
        j0 j0Var = this.f2505b;
        xq2 block = new xq2(videoLifecycleCallbacks, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // wi.c0
    public final void onVideoPlay() {
        wi.c0 videoLifecycleCallbacks;
        wi.d0 d0Var = this.f2504a.f6380m;
        if (d0Var == null || (videoLifecycleCallbacks = d0Var.getVideoLifecycleCallbacks()) == null) {
            return;
        }
        j0 j0Var = this.f2505b;
        zq2 block = new zq2(videoLifecycleCallbacks, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(j0Var, context, null, new et2(block, null), 2);
    }

    @Override // wi.c0
    public final void onVideoStart() {
    }
}
