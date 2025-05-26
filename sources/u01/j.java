package u01;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class j extends r {

    /* renamed from: b, reason: collision with root package name */
    public final rg0.n f119903b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(@NotNull rg0.n experienceValue) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        this.f119903b = experienceValue;
        this.f119904c = 88;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f119903b, ((j) obj).f119903b);
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119904c;
    }

    public final int hashCode() {
        return this.f119903b.hashCode();
    }

    public final String toString() {
        return "PinCloseupExperienceValueModel(experienceValue=" + this.f119903b + ")";
    }
}
