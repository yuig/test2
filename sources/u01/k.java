package u01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class k extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119905b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119906c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119907d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f119908e;

    /* renamed from: f, reason: collision with root package name */
    public final int f119909f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13, boolean z14) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119905b = pin;
        this.f119906c = monolithHeaderConfig;
        this.f119907d = z13;
        this.f119908e = z14;
        this.f119909f = 87;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f119905b, kVar.f119905b) && Intrinsics.d(this.f119906c, kVar.f119906c) && this.f119907d == kVar.f119907d && this.f119908e == kVar.f119908e;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119909f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119908e) + ep.b.e(this.f119907d, (this.f119906c.hashCode() + (this.f119905b.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupMonolithicHeaderModel(pin=");
        sb3.append(this.f119905b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119906c);
        sb3.append(", shouldShowPinchToZoomInteraction=");
        sb3.append(this.f119907d);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119908e, ")");
    }
}
