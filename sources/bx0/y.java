package bx0;

import a.cb;
import com.pinterest.api.model.vh;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class y implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final vh f24091a;

    /* renamed from: b, reason: collision with root package name */
    public final z f24092b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24093c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f24094d;

    /* renamed from: e, reason: collision with root package name */
    public final x f24095e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24096f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24097g;

    /* renamed from: h, reason: collision with root package name */
    public final String f24098h;

    /* renamed from: i, reason: collision with root package name */
    public final mj0.g f24099i;

    public y(vh dynamicStory, z moduleVariant, String clientTrackingParams, Integer num, x surface, oj0.f oneTapSaveListener) {
        Intrinsics.checkNotNullParameter(dynamicStory, "dynamicStory");
        Intrinsics.checkNotNullParameter(moduleVariant, "moduleVariant");
        Intrinsics.checkNotNullParameter(clientTrackingParams, "clientTrackingParams");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter("", "pinBookmark");
        Intrinsics.checkNotNullParameter(oneTapSaveListener, "oneTapSaveListener");
        this.f24091a = dynamicStory;
        this.f24092b = moduleVariant;
        this.f24093c = clientTrackingParams;
        this.f24094d = num;
        this.f24095e = surface;
        this.f24096f = false;
        this.f24097g = false;
        this.f24098h = "";
        this.f24099i = oneTapSaveListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f24091a, yVar.f24091a) && this.f24092b == yVar.f24092b && Intrinsics.d(this.f24093c, yVar.f24093c) && Intrinsics.d(this.f24094d, yVar.f24094d) && this.f24095e == yVar.f24095e && this.f24096f == yVar.f24096f && this.f24097g == yVar.f24097g && Intrinsics.d(this.f24098h, yVar.f24098h) && Intrinsics.d(this.f24099i, yVar.f24099i);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f24093c, (this.f24092b.hashCode() + (this.f24091a.hashCode() * 31)) * 31, 31);
        Integer num = this.f24094d;
        return this.f24099i.hashCode() + cb.d(this.f24098h, ep.b.e(this.f24097g, ep.b.e(this.f24096f, (this.f24095e.hashCode() + ((d2 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "STLFocusModuleVMState(dynamicStory=" + this.f24091a + ", moduleVariant=" + this.f24092b + ", clientTrackingParams=" + this.f24093c + ", position=" + this.f24094d + ", surface=" + this.f24095e + ", shouldUseStaticSubtitle=" + this.f24096f + ", isInEnabledCTAGroup=" + this.f24097g + ", pinBookmark=" + this.f24098h + ", oneTapSaveListener=" + this.f24099i + ")";
    }
}
