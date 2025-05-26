package qa2;

import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class t implements kotlin.jvm.internal.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCellImpl f103354a;

    public t(LegoPinGridCellImpl legoPinGridCellImpl) {
        this.f103354a = legoPinGridCellImpl;
    }

    @Override // kotlin.jvm.internal.m
    public final xk2.g c() {
        return new kotlin.jvm.internal.p(1, this.f103354a, LegoPinGridCellImpl.class, "setCollectionPosition", "setCollectionPosition(Ljava/lang/Integer;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof t) && (obj instanceof kotlin.jvm.internal.m)) {
            return Intrinsics.d(c(), ((kotlin.jvm.internal.m) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
