package l80;

import com.pinterest.api.model.b1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f82112a;

    public e(b1 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f82112a = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f82112a, ((e) obj).f82112a);
    }

    public final int hashCode() {
        return this.f82112a.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.f82112a + ")";
    }
}
