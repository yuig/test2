package u01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class l extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119910b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119911c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119912d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(false, 1, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119910b = pin;
        this.f119911c = monolithHeaderConfig;
        this.f119912d = z13;
        this.f119913e = 99;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f119910b, lVar.f119910b) && Intrinsics.d(this.f119911c, lVar.f119911c) && this.f119912d == lVar.f119912d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119913e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119912d) + ((this.f119911c.hashCode() + (this.f119910b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupNoteAndFavoriteModel(pin=");
        sb3.append(this.f119910b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119911c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119912d, ")");
    }
}
