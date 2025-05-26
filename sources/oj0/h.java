package oj0;

import androidx.appcompat.widget.c2;
import com.pinterest.feature.pin.j;
import com.pinterest.feature.pin.r;
import kotlin.jvm.internal.Intrinsics;
import nx.d1;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final uk1.d f95387a;

    /* renamed from: b, reason: collision with root package name */
    public final d1 f95388b;

    /* renamed from: c, reason: collision with root package name */
    public final r f95389c;

    /* renamed from: d, reason: collision with root package name */
    public final j f95390d;

    /* renamed from: e, reason: collision with root package name */
    public final k11.b f95391e;

    /* renamed from: f, reason: collision with root package name */
    public final c2 f95392f;

    public h(uk1.d presenterPinalytics, d1 trackingParamAttacher, r repinAnimationUtil, j pinAction, k11.b bVar, c2 repinToastHelper) {
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(repinAnimationUtil, "repinAnimationUtil");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(repinToastHelper, "repinToastHelper");
        this.f95387a = presenterPinalytics;
        this.f95388b = trackingParamAttacher;
        this.f95389c = repinAnimationUtil;
        this.f95390d = pinAction;
        this.f95391e = bVar;
        this.f95392f = repinToastHelper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f95387a, hVar.f95387a) && Intrinsics.d(this.f95388b, hVar.f95388b) && Intrinsics.d(this.f95389c, hVar.f95389c) && Intrinsics.d(this.f95390d, hVar.f95390d) && Intrinsics.d(this.f95391e, hVar.f95391e) && Intrinsics.d(this.f95392f, hVar.f95392f);
    }

    public final int hashCode() {
        int hashCode = (this.f95390d.hashCode() + ((this.f95389c.hashCode() + ((this.f95388b.hashCode() + (this.f95387a.hashCode() * 31)) * 31)) * 31)) * 31;
        k11.b bVar = this.f95391e;
        return this.f95392f.hashCode() + ((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }

    public final String toString() {
        return "OneTapSaveConfig(presenterPinalytics=" + this.f95387a + ", trackingParamAttacher=" + this.f95388b + ", repinAnimationUtil=" + this.f95389c + ", pinAction=" + this.f95390d + ", easyGiftGuideUpsellUtil=" + this.f95391e + ", repinToastHelper=" + this.f95392f + ")";
    }
}
