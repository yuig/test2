package ua2;

import android.graphics.drawable.Drawable;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f121499i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCell f121500j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f121501k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(LegoPinGridCellImpl legoPinGridCellImpl, i iVar, int i13) {
        super(0);
        this.f121499i = i13;
        this.f121500j = legoPinGridCellImpl;
        this.f121501k = iVar;
    }

    public final Drawable b() {
        LegoPinGridCell legoPinGridCell = this.f121500j;
        int i13 = this.f121499i;
        i iVar = this.f121501k;
        switch (i13) {
            case 0:
                return bs1.c.f0(legoPinGridCell, iVar.f121505z ? wy1.c.indicator_muted_icon_vr : wy1.c.indicator_muted_icon, null, null, 6);
            default:
                return bs1.c.f0(legoPinGridCell, iVar.f121505z ? wy1.c.indicator_sound_icon_vr : wy1.c.indicator_sound_icon, null, null, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f121499i) {
        }
        return b();
    }
}
