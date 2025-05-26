package fd0;

import a.cb;
import dl1.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class f implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f61846a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f61847b;

    public f(@NotNull Function0<Unit> createPinAction, @NotNull Function1<? super md0.a, Unit> logAction) {
        Intrinsics.checkNotNullParameter(createPinAction, "createPinAction");
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        this.f61846a = createPinAction;
        this.f61847b = logAction;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return cb.g("toString(...)");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f61846a, fVar.f61846a) && Intrinsics.d(this.f61847b, fVar.f61847b);
    }

    public final int hashCode() {
        return this.f61847b.hashCode() + (this.f61846a.hashCode() * 31);
    }

    public final String toString() {
        return "RecentPinEmptyState(createPinAction=" + this.f61846a + ", logAction=" + this.f61847b + ")";
    }
}
