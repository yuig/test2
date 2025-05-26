package xc2;

import a.cb;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final List f134572a;

    /* renamed from: b, reason: collision with root package name */
    public final int f134573b;

    /* renamed from: c, reason: collision with root package name */
    public final int f134574c;

    /* renamed from: d, reason: collision with root package name */
    public final String f134575d;

    /* renamed from: e, reason: collision with root package name */
    public final int f134576e;

    /* renamed from: f, reason: collision with root package name */
    public final Function1 f134577f;

    public q(List appWidgetIds, int i13, int i14, String widgetStyle, int i15, Function1 getWidgetImageSizes) {
        Intrinsics.checkNotNullParameter(appWidgetIds, "appWidgetIds");
        Intrinsics.checkNotNullParameter(widgetStyle, "widgetStyle");
        Intrinsics.checkNotNullParameter(getWidgetImageSizes, "getWidgetImageSizes");
        this.f134572a = appWidgetIds;
        this.f134573b = i13;
        this.f134574c = i14;
        this.f134575d = widgetStyle;
        this.f134576e = i15;
        this.f134577f = getWidgetImageSizes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f134572a, qVar.f134572a) && this.f134573b == qVar.f134573b && this.f134574c == qVar.f134574c && Intrinsics.d(this.f134575d, qVar.f134575d) && this.f134576e == qVar.f134576e && Intrinsics.d(this.f134577f, qVar.f134577f);
    }

    public final int hashCode() {
        return this.f134577f.hashCode() + ep.b.b(this.f134576e, cb.d(this.f134575d, ep.b.b(this.f134574c, ep.b.b(this.f134573b, this.f134572a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "WidgetRefreshRequest(appWidgetIds=" + this.f134572a + ", pinRequestSize=" + this.f134573b + ", pinsPerWidget=" + this.f134574c + ", widgetStyle=" + this.f134575d + ", widgetStyleCount=" + this.f134576e + ", getWidgetImageSizes=" + this.f134577f + ")";
    }
}
