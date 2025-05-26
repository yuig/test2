package va1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class q extends j1 {

    /* renamed from: e, reason: collision with root package name */
    public final bd1.a f125228e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i13, @NotNull bd1.a actionType) {
        super(Integer.valueOf(i13), null, 2, null);
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        this.f125228e = actionType;
    }

    public final bd1.a j() {
        return this.f125228e;
    }
}
