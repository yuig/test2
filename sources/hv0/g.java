package hv0;

import com.pinterest.api.model.qq;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final qq f70457a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f70458b;

    public g(qq data, Function1 function1) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f70457a = data;
        this.f70458b = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f70457a, gVar.f70457a) && Intrinsics.d(this.f70458b, gVar.f70458b);
    }

    public final int hashCode() {
        int hashCode = this.f70457a.hashCode() * 31;
        Function1 function1 = this.f70458b;
        return hashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        return "OverlayBlockViewModel(data=" + this.f70457a + ", tapCallback=" + this.f70458b + ")";
    }
}
