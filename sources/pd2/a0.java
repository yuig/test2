package pd2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class a0 extends p0 {

    @NotNull
    public static final z Companion = new z();

    /* renamed from: b, reason: collision with root package name */
    public id2.c f99825b;

    public a0(id2.c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f99825b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f99825b, ((a0) obj).f99825b);
    }

    public final int hashCode() {
        return this.f99825b.hashCode();
    }

    public final String toString() {
        return "Color(value=" + this.f99825b + ')';
    }
}
