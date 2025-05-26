package fu;

import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdsBrowserBottomSheet f62942a;

    public a(AdsBrowserBottomSheet adsBrowserBottomSheet) {
        this.f62942a = adsBrowserBottomSheet;
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return new p(0, this.f62942a, AdsBrowserBottomSheet.class, "collapse", "collapse$ads_release()V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof a) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(c(), ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
