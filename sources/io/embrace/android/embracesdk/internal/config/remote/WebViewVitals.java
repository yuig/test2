package io.embrace.android.embracesdk.internal.config.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/WebViewVitals;", "", "", "pctEnabled", "", "maxVitals", "copy", "(Ljava/lang/Float;Ljava/lang/Integer;)Lio/embrace/android/embracesdk/internal/config/remote/WebViewVitals;", "<init>", "(Ljava/lang/Float;Ljava/lang/Integer;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class WebViewVitals {

    /* renamed from: a, reason: collision with root package name */
    public final Float f73095a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f73096b;

    public WebViewVitals(@p(name = "pct_enabled") Float f13) {
        this(f13, null, 2, 0 == true ? 1 : 0);
    }

    @NotNull
    public final WebViewVitals copy(@p(name = "pct_enabled") Float pctEnabled, @p(name = "max_vitals") Integer maxVitals) {
        return new WebViewVitals(pctEnabled, maxVitals);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewVitals)) {
            return false;
        }
        WebViewVitals webViewVitals = (WebViewVitals) obj;
        return Intrinsics.d(this.f73095a, webViewVitals.f73095a) && Intrinsics.d(this.f73096b, webViewVitals.f73096b);
    }

    public final int hashCode() {
        Float f13 = this.f73095a;
        int hashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        Integer num = this.f73096b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "WebViewVitals(pctEnabled=" + this.f73095a + ", maxVitals=" + this.f73096b + ')';
    }

    public WebViewVitals(@p(name = "pct_enabled") Float f13, @p(name = "max_vitals") Integer num) {
        this.f73095a = f13;
        this.f73096b = num;
    }

    public /* synthetic */ WebViewVitals(Float f13, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : f13, (i13 & 2) != 0 ? null : num);
    }
}
