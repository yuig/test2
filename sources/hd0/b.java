package hd0;

import a.cb;
import dl1.s;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final List f68847a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f68848b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68849c;

    public b(@NotNull List<k> toolStates, @NotNull Function0<Unit> logAction, int i13) {
        Intrinsics.checkNotNullParameter(toolStates, "toolStates");
        Intrinsics.checkNotNullParameter(logAction, "logAction");
        this.f68847a = toolStates;
        this.f68848b = logAction;
        this.f68849c = i13;
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f68847a, bVar.f68847a) && Intrinsics.d(this.f68848b, bVar.f68848b) && this.f68849c == bVar.f68849c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68849c) + d7.g.b(this.f68848b, this.f68847a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CreatorToolsModuleState(toolStates=");
        sb3.append(this.f68847a);
        sb3.append(", logAction=");
        sb3.append(this.f68848b);
        sb3.append(", viewType=");
        return a.a.n(sb3, this.f68849c, ")");
    }
}
