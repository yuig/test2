package go0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f65825a;

    /* renamed from: b, reason: collision with root package name */
    public final String f65826b;

    public b(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f65825a = text;
        this.f65826b = text;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f65826b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f65825a, ((b) obj).f65825a);
    }

    public final int hashCode() {
        return this.f65825a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardSectionPickerEmptyStateModel(text="), this.f65825a, ")");
    }
}
