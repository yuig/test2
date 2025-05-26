package u01;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119888b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119889c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119890d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119888b = pin;
        this.f119889c = monolithHeaderConfig;
        this.f119890d = z13;
        this.f119891e = RecyclerViewTypes.VIEW_TYPE_BOARD_CONVERSATION_THREAD;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f119888b, fVar.f119888b) && Intrinsics.d(this.f119889c, fVar.f119889c) && this.f119890d == fVar.f119890d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119891e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119890d) + ((this.f119889c.hashCode() + (this.f119888b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupBoardConversationThreadModel(pin=");
        sb3.append(this.f119888b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119889c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119890d, ")");
    }
}
