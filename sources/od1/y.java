package od1;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements z {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f94181a;

    /* renamed from: b, reason: collision with root package name */
    public final List f94182b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.i0 f94183c;

    /* renamed from: d, reason: collision with root package name */
    public final String f94184d;

    public y(f30 pin, List feed, h32.i0 pinalyticsContext, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(feed, "feed");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f94181a = pin;
        this.f94182b = feed;
        this.f94183c = pinalyticsContext;
        this.f94184d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f94181a, yVar.f94181a) && Intrinsics.d(this.f94182b, yVar.f94182b) && Intrinsics.d(this.f94183c, yVar.f94183c) && Intrinsics.d(this.f94184d, yVar.f94184d);
    }

    public final int hashCode() {
        int hashCode = (this.f94183c.hashCode() + ep.b.c(this.f94182b, this.f94181a.hashCode() * 31, 31)) * 31;
        String str = this.f94184d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NavigateToPinSideEffectRequest(pin=" + this.f94181a + ", feed=" + this.f94182b + ", pinalyticsContext=" + this.f94183c + ", uniqueScreenKey=" + this.f94184d + ")";
    }
}
