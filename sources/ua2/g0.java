package ua2;

import com.pinterest.ui.grid.LegoPinGridCell;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class g0 extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public int f121497h;

    /* renamed from: i, reason: collision with root package name */
    public int f121498i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(LegoPinGridCell legoGridCell) {
        super(legoGridCell, b1.VERTICAL);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
    }

    @Override // ua2.f1
    public final z0 v(int i13, int i14) {
        z0 y13 = y(i13, i14);
        this.f121495d = y13;
        this.f121497h = i14;
        this.f121498i = i14 + y13.f121641b;
        return y13;
    }
}
