package c31;

import com.pinterest.api.model.f30;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements z {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f25575a;

    /* renamed from: b, reason: collision with root package name */
    public final List f25576b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.i0 f25577c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25578d;

    public d0(f30 pin, List feed, h32.i0 pinalyticsContext, String str) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(feed, "feed");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f25575a = pin;
        this.f25576b = feed;
        this.f25577c = pinalyticsContext;
        this.f25578d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f25575a, d0Var.f25575a) && Intrinsics.d(this.f25576b, d0Var.f25576b) && Intrinsics.d(this.f25577c, d0Var.f25577c) && Intrinsics.d(this.f25578d, d0Var.f25578d);
    }

    public final int hashCode() {
        int hashCode = (this.f25577c.hashCode() + ep.b.c(this.f25576b, this.f25575a.hashCode() * 31, 31)) * 31;
        String str = this.f25578d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "NavigateToPinSideEffectRequest(pin=" + this.f25575a + ", feed=" + this.f25576b + ", pinalyticsContext=" + this.f25577c + ", uniqueScreenKey=" + this.f25578d + ")";
    }
}
