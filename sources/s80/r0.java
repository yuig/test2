package s80;

import com.pinterest.api.model.go;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final go f111778a;

    public r0(go brushType) {
        Intrinsics.checkNotNullParameter(brushType, "brushType");
        this.f111778a = brushType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && this.f111778a == ((r0) obj).f111778a;
    }

    public final int hashCode() {
        return this.f111778a.hashCode();
    }

    public final String toString() {
        return "BrushTypeSelected(brushType=" + this.f111778a + ")";
    }
}
