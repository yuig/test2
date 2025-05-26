package u01;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class m extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119914b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119915c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119916d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119914b = pin;
        this.f119915c = monolithHeaderConfig;
        this.f119916d = z13;
        this.f119917e = RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f119914b, mVar.f119914b) && Intrinsics.d(this.f119915c, mVar.f119915c) && this.f119916d == mVar.f119916d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119917e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119916d) + ((this.f119915c.hashCode() + (this.f119914b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupPearStylesModel(pin=");
        sb3.append(this.f119914b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119915c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119916d, ")");
    }
}
