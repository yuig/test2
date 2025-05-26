package cv0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class z implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final int f53309a;

    public /* synthetic */ z(int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13);
    }

    @Override // dl1.s
    public final String b() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    private z(int i13) {
        this.f53309a = i13;
    }
}
