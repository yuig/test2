package h21;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f66566a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66567b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull f30 pin) {
        super(null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f66566a = pin;
        this.f66567b = RecyclerViewTypes.VIEW_TYPE_PIN_MINI_CELL;
    }

    @Override // h21.e, dl1.s
    /* renamed from: b */
    public final String getId() {
        String id3 = this.f66566a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f66566a, ((d) obj).f66566a);
    }

    @Override // h21.e
    public final int getViewType() {
        return this.f66567b;
    }

    public final int hashCode() {
        return this.f66566a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("MiniPinCellModel(pin="), this.f66566a, ")");
    }
}
