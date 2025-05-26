package u01;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class r implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f119934a;

    public /* synthetic */ r(boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z13, null);
    }

    @Override // dl1.s
    public final String b() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public abstract int getViewType();

    public /* synthetic */ r(boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z13);
    }

    private r(boolean z13) {
        this.f119934a = z13;
    }
}
