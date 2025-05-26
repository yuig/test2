package fx;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.o;

/* loaded from: classes3.dex */
public final class f implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f63077a;

    /* renamed from: b, reason: collision with root package name */
    public final List f63078b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f63079c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f63080d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.c f63081e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f63082f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f63083g;

    /* renamed from: h, reason: collision with root package name */
    public final int f63084h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u50.h0, u50.i0] */
    public f(i0 text, List backgroundColors, f0 pinImageUrl, f0 contentDescription, boolean z13, int i13, int i14) {
        backgroundColors = (i14 & 2) != 0 ? kotlin.collections.f0.j("#ffe9e9e9", "#ff767676") : backgroundColors;
        int i15 = i14 & 4;
        ?? tag = h0.f120562a;
        pinImageUrl = i15 != 0 ? tag : pinImageUrl;
        contentDescription = (i14 & 8) != 0 ? tag : contentDescription;
        fm1.c visibility = fm1.c.VISIBLE;
        z13 = (i14 & 64) != 0 ? false : z13;
        i13 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? Integer.MIN_VALUE : i13;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundColors, "backgroundColors");
        Intrinsics.checkNotNullParameter(pinImageUrl, "pinImageUrl");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f63077a = text;
        this.f63078b = backgroundColors;
        this.f63079c = pinImageUrl;
        this.f63080d = contentDescription;
        this.f63081e = visibility;
        this.f63082f = tag;
        this.f63083g = z13;
        this.f63084h = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f63077a, fVar.f63077a) && Intrinsics.d(this.f63078b, fVar.f63078b) && Intrinsics.d(this.f63079c, fVar.f63079c) && Intrinsics.d(this.f63080d, fVar.f63080d) && this.f63081e == fVar.f63081e && Intrinsics.d(this.f63082f, fVar.f63082f) && this.f63083g == fVar.f63083g && this.f63084h == fVar.f63084h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63084h) + ep.b.e(this.f63083g, ep.b.d(this.f63082f, g.a(this.f63081e, ep.b.d(this.f63080d, ep.b.d(this.f63079c, ep.b.c(this.f63078b, this.f63077a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "DisplayState(text=" + this.f63077a + ", backgroundColors=" + this.f63078b + ", pinImageUrl=" + this.f63079c + ", contentDescription=" + this.f63080d + ", visibility=" + this.f63081e + ", tag=" + this.f63082f + ", selectedState=" + this.f63083g + ", id=" + this.f63084h + ")";
    }
}
