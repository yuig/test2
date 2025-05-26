package g90;

import android.os.Bundle;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hi0;
import com.pinterest.api.model.pi0;
import com.pinterest.api.model.vi0;
import com.pinterest.api.model.wy0;
import com.pinterest.collage.cutoutcloseup.screens.CollageCutoutCloseupLocation;
import com.pinterest.framework.screens.ScreenModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends jr.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(il1.b screenFactory) {
        super(screenFactory);
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
    }

    public final void H(String pinId, String rootPinId, boolean z13, boolean z14, List cutouts) {
        String str;
        wy0 g13;
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(cutouts, "cutouts");
        Intrinsics.checkNotNullParameter(rootPinId, "rootPinId");
        l();
        List<pi0> list = cutouts;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (pi0 pi0Var : list) {
            CollageCutoutCloseupLocation collageCutoutCloseupLocation = CollageCutoutCloseupLocation.COLLAGE_CUTOUT_CLOSEUP_ITEM;
            Bundle a13 = n60.o.a("pin.id", pinId);
            a13.putString("EXTRA_COLLAGES_SHUFFLE_ITEM_ID", pi0Var.getUid());
            f30 C = pi0Var.C();
            String str2 = null;
            a13.putString("EXTRA_COLLAGES_SHUFFLE_ITEM_PIN_ID", C != null ? C.getUid() : null);
            pi0.a z15 = pi0Var.z();
            if (z15 == null || (str = z15.name()) == null) {
                str = "NONE";
            }
            a13.putString("EXTRA_COLLAGES_SHUFFLE_ITEM_TYPE", str);
            hi0 F = pi0Var.F();
            a13.putString("EXTRA_COLLAGES_SHUFFLE_ITEM_ASSET_ID", F != null ? F.getUid() : null);
            vi0 G = pi0Var.G();
            if (G != null && (g13 = G.g()) != null) {
                str2 = g13.getUid();
            }
            a13.putString("EXTRA_COLLAGES_SHUFFLE_ITEM_USER_ID", str2);
            a13.putBoolean("EXTRA_COLLAGES_SHUFFLE_ITEM_IS_COLLAGE_AD", z13);
            a13.putString("EXTRA_COLLAGES_ROOT_PIN_ID", rootPinId);
            a13.putBoolean("EXTRA_COLLAGE_PIN_SINGLE_DEST", z14);
            Unit unit = Unit.f80348a;
            ScreenModel o13 = jr.a.o(collageCutoutCloseupLocation, a13);
            Intrinsics.checkNotNullExpressionValue(o13, "createScreenDescription(...)");
            arrayList.add(o13);
        }
        k(arrayList);
    }
}
