package mu;

import a.cb;
import com.pinterest.api.model.f30;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f88237a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88238b;

    /* renamed from: c, reason: collision with root package name */
    public final List f88239c;

    public r0(f30 pin, String previewColor, ArrayList carouselImageDisplayStates) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(previewColor, "previewColor");
        Intrinsics.checkNotNullParameter(carouselImageDisplayStates, "carouselImageDisplayStates");
        this.f88237a = pin;
        this.f88238b = previewColor;
        this.f88239c = carouselImageDisplayStates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f88237a, r0Var.f88237a) && Intrinsics.d(this.f88238b, r0Var.f88238b) && Intrinsics.d(this.f88239c, r0Var.f88239c);
    }

    public final int hashCode() {
        return this.f88239c.hashCode() + cb.d(this.f88238b, this.f88237a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Initialize(pin=");
        sb3.append(this.f88237a);
        sb3.append(", previewColor=");
        sb3.append(this.f88238b);
        sb3.append(", carouselImageDisplayStates=");
        return a.c.j(sb3, this.f88239c, ")");
    }
}
