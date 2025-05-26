package ua2;

import android.content.Context;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121604i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCell f121605j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(LegoPinGridCellImpl legoPinGridCellImpl, int i13) {
        super(0);
        this.f121604i = i13;
        this.f121605j = legoPinGridCellImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f121604i;
        LegoPinGridCell legoPinGridCell = this.f121605j;
        switch (i13) {
            case 0:
                Context context = legoPinGridCell.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new va2.h(context);
            default:
                return bs1.c.f0(legoPinGridCell, wy1.c.indicator_fullscreen_icon, null, null, 6);
        }
    }
}
