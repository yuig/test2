package hv0;

import com.pinterest.api.model.so;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.wx;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d extends wx {

    /* renamed from: a, reason: collision with root package name */
    public final tp f70453a;

    /* renamed from: b, reason: collision with root package name */
    public final so f70454b;

    public d(@NotNull tp page, @NotNull so canvasAspectRatio) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(canvasAspectRatio, "canvasAspectRatio");
        this.f70453a = page;
        this.f70454b = canvasAspectRatio;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f70453a.getId();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f70453a, dVar.f70453a) && Intrinsics.d(this.f70454b, dVar.f70454b);
    }

    public final int hashCode() {
        return this.f70454b.hashCode() + (this.f70453a.hashCode() * 31);
    }

    public final String toString() {
        return "IdeaPinLocalPageViewModel(page=" + this.f70453a + ", canvasAspectRatio=" + this.f70454b + ")";
    }
}
