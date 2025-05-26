package in1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.sheet.container.GestaltSheetContainer;
import hn1.f;
import hn1.h;
import hn1.n;
import hn1.x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.r;
import u50.f0;
import u50.g0;
import u50.h0;
import u50.i0;
import yl1.g;
import yl1.i;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72826i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSheetContainer f72827j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(GestaltSheetContainer gestaltSheetContainer, int i13) {
        super(1);
        this.f72826i = i13;
        this.f72827j = gestaltSheetContainer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h fVar;
        int i13 = this.f72826i;
        GestaltSheetContainer gestaltSheetContainer = this.f72827j;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                yl1.d dVar = GestaltSheetContainer.f49571w;
                gestaltSheetContainer.getClass();
                boolean hasValue = $receiver.hasValue(x.GestaltSheetContainer_gestalt_sheetButtonGroupPrimaryText);
                i0 i0Var = h0.f120562a;
                if (hasValue && $receiver.hasValue(x.GestaltSheetContainer_gestalt_sheetButtonGroupSecondaryText)) {
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    int i14 = x.GestaltSheetContainer_gestalt_sheetButtonGroupPrimaryText;
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    String string = $receiver.getString(i14);
                    i0 f0Var = string != null ? new f0(string) : i0Var;
                    boolean z13 = $receiver.getBoolean(x.GestaltSheetContainer_gestalt_sheetButtonGroupPrimaryEnabled, true);
                    int i15 = x.GestaltSheetContainer_gestalt_sheetButtonGroupPrimaryContentDesc;
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    String string2 = $receiver.getString(i15);
                    yl1.b bVar = new yl1.b(f0Var, z13, null, string2 != null ? new f0(string2) : i0Var, i.a(), null, null, null, 0, null, 996);
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    int i16 = x.GestaltSheetContainer_gestalt_sheetButtonGroupSecondaryText;
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    String string3 = $receiver.getString(i16);
                    i0 f0Var2 = string3 != null ? new f0(string3) : i0Var;
                    boolean z14 = $receiver.getBoolean(x.GestaltSheetContainer_gestalt_sheetButtonGroupSecondaryEnabled, true);
                    int i17 = x.GestaltSheetContainer_gestalt_sheetButtonGroupSecondaryContentDesc;
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    String string4 = $receiver.getString(i17);
                    yl1.b bVar2 = new yl1.b(f0Var2, z14, null, string4 != null ? new f0(string4) : i0Var, i.b(), null, null, null, 0, null, 996);
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    yl1.b bVar3 = !Intrinsics.d(g0.c($receiver, x.GestaltSheetContainer_gestalt_sheetButtonGroupTertiaryText), i0Var) ? new yl1.b(g0.c($receiver, x.GestaltSheetContainer_gestalt_sheetButtonGroupTertiaryText), $receiver.getBoolean(x.GestaltSheetContainer_gestalt_sheetButtonGroupTertiaryEnabled, true), null, g0.c($receiver, x.GestaltSheetContainer_gestalt_sheetButtonGroupTertiaryContentDesc), (g) i.f139337c.getValue(), null, null, null, 0, null, 996) : null;
                    fm1.c cVar = fm1.c.VISIBLE;
                    int i18 = x.GestaltSheetContainer_gestalt_sheetButtonGroupSize;
                    yl1.c cVar2 = GestaltButtonGroup.f49333k;
                    int i19 = $receiver.getInt(i18, -1);
                    yl1.c cVar3 = i19 >= 0 ? yl1.c.values()[i19] : cVar2;
                    int i23 = x.GestaltSheetContainer_gestalt_sheetButtonGroupOrientation;
                    cm1.e eVar = GestaltButtonGroup.f49332j;
                    int i24 = $receiver.getInt(i23, -1);
                    fVar = new hn1.e(new cm1.d(bVar, bVar2, bVar3, cVar3, i24 >= 0 ? cm1.e.values()[i24] : eVar, cVar, 0, 64));
                } else if ($receiver.hasValue(x.GestaltSheetContainer_gestalt_sheetIndividualButtonText)) {
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    int i25 = x.GestaltSheetContainer_gestalt_sheetIndividualButtonText;
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    String string5 = $receiver.getString(i25);
                    i0 f0Var3 = string5 != null ? new f0(string5) : i0Var;
                    int i26 = $receiver.getInt(x.GestaltSheetContainer_gestalt_sheetIndividualButtonColorPalette, -1);
                    g colorPalette = (i26 >= 0 ? yl1.d.values()[i26] : GestaltSheetContainer.f49571w).getColorPalette();
                    boolean z15 = $receiver.getBoolean(x.GestaltSheetContainer_gestalt_sheetIndividualButtonEnabled, true);
                    int i27 = x.GestaltSheetContainer_gestalt_sheetIndividualButtonContentDesc;
                    Intrinsics.checkNotNullParameter($receiver, "<this>");
                    String string6 = $receiver.getString(i27);
                    if (string6 != null) {
                        i0Var = new f0(string6);
                    }
                    i0 i0Var2 = i0Var;
                    fm1.c Y = d7.b.Y($receiver, x.GestaltSheetContainer_gestalt_sheetIndividualButtonVisibility, GestaltButton.f49319h.c());
                    int i28 = x.GestaltSheetContainer_gestalt_sheetIndividualButtonSize;
                    yl1.c cVar4 = GestaltButton.f49321j;
                    int i29 = $receiver.getInt(i28, -1);
                    fVar = new hn1.d(new yl1.b(f0Var3, z15, Y, i0Var2, colorPalette, i29 >= 0 ? yl1.c.values()[i29] : cVar4, r.b($receiver, x.GestaltSheetContainer_gestalt_sheetIndividualButtonStartIcon), r.b($receiver, x.GestaltSheetContainer_gestalt_sheetIndividualButtonEndIcon), 0, null, 768));
                } else {
                    fVar = $receiver.hasValue(x.GestaltSheetContainer_gestalt_sheetCustomFooterLayout) ? new f($receiver.getResourceId(x.GestaltSheetContainer_gestalt_sheetCustomFooterLayout, -1)) : hn1.g.f69652a;
                }
                return new b(fVar, false, Integer.MIN_VALUE, new n());
            default:
                gm1.a it = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltButtonGroup gestaltButtonGroup = gestaltSheetContainer.f49574r;
                if (gestaltButtonGroup != null) {
                    gestaltButtonGroup.b(it);
                }
                GestaltButton gestaltButton = gestaltSheetContainer.f49573q;
                if (gestaltButton != null) {
                    gestaltButton.e(it);
                }
                return Unit.f80348a;
        }
    }
}
