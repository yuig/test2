package ca0;

import com.pinterest.api.model.PinnableImage;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final PinnableImage f27147a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27148b;

    public o(PinnableImage pinnableImage, String str) {
        Intrinsics.checkNotNullParameter(pinnableImage, "pinnableImage");
        this.f27147a = pinnableImage;
        this.f27148b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f27147a, oVar.f27147a) && Intrinsics.d(this.f27148b, oVar.f27148b);
    }

    public final int hashCode() {
        int hashCode = this.f27147a.hashCode() * 31;
        String str = this.f27148b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "PinCreateAttempted(pinnableImage=" + this.f27147a + ", boardId=" + this.f27148b + ")";
    }
}
