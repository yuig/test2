package s62;

import java.util.Arrays;
import kg.q;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f111255e;

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f111256f;

    public h(int i13, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.f111255e = i13;
        this.f111256f = formatArgs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(h.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.shuffles.core.ui.Text.Resource");
        h hVar = (h) obj;
        return this.f111255e == hVar.f111255e && Arrays.equals(this.f111256f, hVar.f111256f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f111256f) + (this.f111255e * 31);
    }
}
