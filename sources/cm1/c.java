package cm1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import hn1.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f28010i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltButtonGroup f28011j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GestaltButtonGroup gestaltButtonGroup, int i13) {
        super(1);
        this.f28010i = i13;
        this.f28011j = gestaltButtonGroup;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f28010i;
        GestaltButtonGroup gestaltButtonGroup = this.f28011j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                e eVar = GestaltButtonGroup.f49332j;
                int i14 = zl1.c.GestaltButtonGroup_gestalt_buttonGroupPrimaryText;
                int i15 = zl1.c.GestaltButtonGroup_gestalt_buttonGroupPrimaryContentDesc;
                int i16 = zl1.c.GestaltButtonGroup_gestalt_buttonGroupPrimaryEnabled;
                int i17 = zl1.c.GestaltButtonGroup_gestalt_buttonGroupPrimaryVisibility;
                int i18 = zl1.c.GestaltButtonGroup_gestalt_buttonGroupPrimaryColorPalette;
                int i19 = zl1.a.primary_button;
                gestaltButtonGroup.getClass();
                yl1.b c13 = GestaltButtonGroup.c($receiver, i14, i15, i16, i17, i18, i19);
                yl1.b c14 = GestaltButtonGroup.c($receiver, zl1.c.GestaltButtonGroup_gestalt_buttonGroupSecondaryText, zl1.c.GestaltButtonGroup_gestalt_buttonGroupSecondaryContentDesc, zl1.c.GestaltButtonGroup_gestalt_buttonGroupSecondaryEnabled, zl1.c.GestaltButtonGroup_gestalt_buttonGroupSecondaryVisibility, zl1.c.GestaltButtonGroup_gestalt_buttonGroupSecondaryColorPalette, zl1.a.secondary_button);
                yl1.b c15 = GestaltButtonGroup.c($receiver, zl1.c.GestaltButtonGroup_gestalt_buttonGroupTertiaryText, zl1.c.GestaltButtonGroup_gestalt_buttonGroupTertiaryContentDesc, zl1.c.GestaltButtonGroup_gestalt_buttonGroupTertiaryEnabled, zl1.c.GestaltButtonGroup_gestalt_buttonGroupTertiaryVisibility, zl1.c.GestaltButtonGroup_gestalt_buttonGroupTertiaryColorPalette, zl1.a.tertiary_button);
                int i23 = $receiver.getInt(zl1.c.GestaltButtonGroup_gestalt_buttonGroupSize, -1);
                yl1.c cVar = i23 >= 0 ? yl1.c.values()[i23] : GestaltButtonGroup.f49333k;
                int i24 = $receiver.getInt(zl1.c.GestaltButtonGroup_gestalt_buttonGroupOrientation, -1);
                break;
            case 1:
                fm1.c it = (fm1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                gestaltButtonGroup.setVisibility(it.getVisibility());
                break;
            default:
                i bind = (i) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f28030g = t.sheet_button_group;
                e orientation = e.HORIZONTAL;
                Intrinsics.checkNotNullParameter(orientation, "orientation");
                bind.f28028e = orientation;
                yl1.c size = yl1.c.LARGE;
                Intrinsics.checkNotNullParameter(size, "size");
                bind.f28027d = size;
                yl1.b bVar = gestaltButtonGroup.d().f28012a;
                yl1.g a13 = yl1.i.a();
                fm1.c cVar2 = fm1.c.VISIBLE;
                yl1.b primaryButton = yl1.b.f(bVar, null, true, cVar2, null, a13, null, null, null, 0, null, 1001);
                Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
                bind.f28024a = primaryButton;
                yl1.b secondaryButton = yl1.b.f(gestaltButtonGroup.d().f28013b, null, true, cVar2, null, yl1.i.b(), null, null, null, 0, null, 1001);
                Intrinsics.checkNotNullParameter(secondaryButton, "secondaryButton");
                bind.f28025b = secondaryButton;
                break;
        }
        return Unit.f80348a;
    }
}
