package ua2;

import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 extends n0 {

    /* renamed from: l, reason: collision with root package name */
    public final Function0 f121592l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(LegoPinGridCellImpl legoGridCell, int i13, qa2.w navigateToCloseupComprehensive) {
        super(legoGridCell, i13);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(navigateToCloseupComprehensive, "navigateToCloseupComprehensive");
        this.f121592l = navigateToCloseupComprehensive;
    }

    @Override // ua2.h0
    public final boolean B() {
        return ((Boolean) this.f121592l.invoke()).booleanValue();
    }

    @Override // ua2.n0, ua2.h0
    public final boolean C(int i13, int i14) {
        return this.f121583k.getBounds().contains(i13, i14);
    }
}
