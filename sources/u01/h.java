package u01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class h extends r {

    /* renamed from: b, reason: collision with root package name */
    public final f30 f119894b;

    /* renamed from: c, reason: collision with root package name */
    public final b11.g f119895c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119896d;

    /* renamed from: e, reason: collision with root package name */
    public final int f119897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@NotNull f30 pin, @NotNull b11.g monolithHeaderConfig, boolean z13) {
        super(true, null);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(monolithHeaderConfig, "monolithHeaderConfig");
        this.f119894b = pin;
        this.f119895c = monolithHeaderConfig;
        this.f119896d = z13;
        this.f119897e = 93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f119894b, hVar.f119894b) && Intrinsics.d(this.f119895c, hVar.f119895c) && this.f119896d == hVar.f119896d;
    }

    @Override // u01.r
    public final int getViewType() {
        return this.f119897e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119896d) + ((this.f119895c.hashCode() + (this.f119894b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupCommentsModel(pin=");
        sb3.append(this.f119894b);
        sb3.append(", monolithHeaderConfig=");
        sb3.append(this.f119895c);
        sb3.append(", isFullPin=");
        return a.a.r(sb3, this.f119896d, ")");
    }
}
