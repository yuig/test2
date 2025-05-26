package ua2;

import com.pinterest.ui.grid.LegoPinGridCell;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class h0 extends f1 {

    /* renamed from: f, reason: collision with root package name */
    public final LegoPinGridCell f121502f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f121503g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(LegoPinGridCell legoGridCell, b1 orientation) {
        super(legoGridCell, orientation);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f121502f = legoGridCell;
        this.f121503g = true;
    }

    public boolean A() {
        return this.f121503g;
    }

    public /* bridge */ /* synthetic */ boolean B() {
        return false;
    }

    public abstract boolean C(int i13, int i14);

    public /* bridge */ /* synthetic */ Integer D() {
        return null;
    }
}
