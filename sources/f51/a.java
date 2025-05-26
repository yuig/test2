package f51;

import dl1.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rg0.n;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final n f61205a;

    public a(@NotNull n experienceValue) {
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        this.f61205a = experienceValue;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return String.valueOf(this.f61205a.f108060b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f61205a, ((a) obj).f61205a);
    }

    public final int hashCode() {
        return this.f61205a.hashCode();
    }

    public final String toString() {
        return "GroupMyProfilePinsUpsellModel(experienceValue=" + this.f61205a + ")";
    }
}
