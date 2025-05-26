package ads_mobile_sdk;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class sx0 extends lw0 {

    /* renamed from: j, reason: collision with root package name */
    public final View f11274j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx0(View view, String adId, r0 adConfiguration, vo commonConfiguration, ss2 traceMetaSet, Optional gmaWebView, n1 adEventEmitter, f80 delegatingAdEventListener, rw1 phantomReferences, ed2 safeBrowsingManager) {
        super(adId, adConfiguration, commonConfiguration, traceMetaSet, gmaWebView, adEventEmitter, delegatingAdEventListener, phantomReferences, safeBrowsingManager);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(gmaWebView, "gmaWebView");
        Intrinsics.checkNotNullParameter(adEventEmitter, "adEventEmitter");
        Intrinsics.checkNotNullParameter(delegatingAdEventListener, "delegatingAdEventListener");
        Intrinsics.checkNotNullParameter(phantomReferences, "phantomReferences");
        Intrinsics.checkNotNullParameter(safeBrowsingManager, "safeBrowsingManager");
        this.f11274j = view;
    }

    public final vi.a h() {
        if (b().f10382n0) {
            List list = b().W;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (StringsKt.E((String) it.next(), "FirstParty", false)) {
                    }
                }
            }
            return new vi.a(this.f11274j.getWidth(), this.f11274j.getHeight(), null);
        }
        x0 x0Var = (x0) b().f10399y.get(0);
        return new vi.a(x0Var.f13330a, x0Var.f13331b, null);
    }

    public final View i() {
        return this.f11274j;
    }
}
