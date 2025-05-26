package e72;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* renamed from: a, reason: collision with root package name */
    public final String f57685a;

    public r(int i13, String str) {
        if ((i13 & 1) == 0) {
            this.f57685a = null;
        } else {
            this.f57685a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f57685a, ((r) obj).f57685a);
    }

    public final int hashCode() {
        String str = this.f57685a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RichMetadataEntity(title="), this.f57685a, ")");
    }
}
