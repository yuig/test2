package dd1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import os.g;

/* loaded from: classes5.dex */
public final class a extends g {

    /* renamed from: f, reason: collision with root package name */
    public final g f54448f;

    /* renamed from: g, reason: collision with root package name */
    public final int f54449g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull g iconText, int i13) {
        super(iconText.f97484a, iconText.f97485b, iconText.f97486c, iconText.f97487d, iconText.f97488e);
        Intrinsics.checkNotNullParameter(iconText, "iconText");
        this.f54448f = iconText;
        this.f54449g = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f54448f, aVar.f54448f) && this.f54449g == aVar.f54449g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54449g) + (this.f54448f.hashCode() * 31);
    }

    public final String toString() {
        return "IconTextWrapper(iconText=" + this.f54448f + ", badge=" + this.f54449g + ")";
    }
}
