package x02;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v2 implements dl1.r0 {
    @Override // dl1.r0
    public final boolean a(dl1.s sVar) {
        String Z2;
        wy0 model = (wy0) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullExpressionValue(model.getId(), "getUid(...)");
        if ((!kotlin.text.z.j(r0)) && (Z2 = model.Z2()) != null && !kotlin.text.z.j(Z2)) {
            boolean[] zArr = model.V1;
            if (zArr.length > 77 && zArr[77] && zArr.length > 132 && zArr[132] && model.H3()) {
                boolean[] zArr2 = model.V1;
                if (zArr2.length > 106 && zArr2[106] && zArr.length > 45 && zArr[45] && zArr.length > 95 && zArr[95] && zArr.length > 142 && zArr[142] && (((zArr.length > 63 && zArr[63]) || ((zArr2.length > 62 && zArr2[62]) || (zArr2.length > 65 && zArr2[65]))) && zArr.length > 114 && zArr[114] && zArr.length > 2 && zArr[2] && zArr.length > 99 && zArr[99] && zArr.length > 149 && zArr[149] && zArr.length > 67 && zArr[67] && zArr.length > 144 && zArr[144] && model.W2() && model.Y2() && zArr.length > 70 && zArr[70])) {
                    boolean[] zArr3 = model.V1;
                    if (zArr3.length > 40 && zArr3[40] && zArr3.length > 41 && zArr3[41] && zArr.length > 42 && zArr[42] && zArr.length > 66 && zArr[66] && zArr3.length > 14 && zArr3[14] && zArr.length > 15 && zArr[15] && zArr.length > 109 && zArr[109] && zArr.length > 110 && zArr[110]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // dl1.r0
    public final boolean b(dl1.s sVar) {
        String Z2;
        wy0 model = (wy0) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        String id3 = model.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return (!(kotlin.text.z.j(id3) ^ true) || (Z2 = model.Z2()) == null || kotlin.text.z.j(Z2)) ? false : true;
    }
}
