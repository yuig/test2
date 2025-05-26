package ads_mobile_sdk;

import android.content.Context;
import ao2.j0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class rp2 implements a.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f10743a;

    /* renamed from: b, reason: collision with root package name */
    public final n1 f10744b;

    /* renamed from: c, reason: collision with root package name */
    public final a.le f10745c;

    /* renamed from: d, reason: collision with root package name */
    public final a.fd f10746d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10747e;

    public rp2(j0 backgroundScope, n1 adEventEmitter, a.le thirdPartyEventEmitter, a.fd thirdPartyFullscreenShowMethod) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(thirdPartyEventEmitter, "thirdPartyEventEmitter");
        Intrinsics.checkNotNullParameter(thirdPartyFullscreenShowMethod, "thirdPartyFullscreenShowMethod");
        this.f10743a = backgroundScope;
        this.f10744b = adEventEmitter;
        this.f10745c = thirdPartyEventEmitter;
        this.f10746d = thirdPartyFullscreenShowMethod;
        this.f10747e = new AtomicBoolean(false);
    }

    @Override // a.d2
    public final void a(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f10747e.getAndSet(true)) {
            gk0.a("This ad has already been shown.", null);
            ft2.a(this.f10743a, new op2(this, null));
            Intrinsics.checkNotNullParameter("The ad has already been shown", "message");
            ft2.a(true, "The ad has already been shown", null);
            return;
        }
        try {
            this.f10746d.a();
            j0 j0Var = this.f10743a;
            qp2 block = new qp2(this, null);
            kotlin.coroutines.j context2 = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var, "<this>");
            Intrinsics.checkNotNullParameter(context2, "context");
            Intrinsics.checkNotNullParameter(block, "block");
            kotlin.jvm.internal.j.z(j0Var, context2, null, new et2(block, null), 2);
        } catch (Exception e13) {
            Intrinsics.checkNotNullParameter("Mediation Fullscreen Ad failed to show.", "message");
            cs2 a13 = qs2.a();
            a13.f().f6994p.add("Mediation Fullscreen Ad failed to show.");
            a13.f().f6988j = false;
            a13.a(e13);
            j0 j0Var2 = this.f10743a;
            pp2 block2 = new pp2(this, null);
            kotlin.coroutines.j context3 = kotlin.coroutines.j.f80412a;
            Intrinsics.checkNotNullParameter(j0Var2, "<this>");
            Intrinsics.checkNotNullParameter(context3, "context");
            Intrinsics.checkNotNullParameter(block2, "block");
            kotlin.jvm.internal.j.z(j0Var2, context3, null, new et2(block2, null), 2);
        }
    }
}
