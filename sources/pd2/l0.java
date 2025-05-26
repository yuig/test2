package pd2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class l0 extends p0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* renamed from: b, reason: collision with root package name */
    public hd2.f f99854b;

    public l0(hd2.f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f99854b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f99854b, ((l0) obj).f99854b);
    }

    public final int hashCode() {
        return this.f99854b.hashCode();
    }

    public final String toString() {
        return "Line(value=" + this.f99854b + ')';
    }
}
