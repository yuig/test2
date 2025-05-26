package a11;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ey.f5;
import h32.c1;
import h32.i0;
import h32.n0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes.dex */
public interface e {
    static /* synthetic */ void b(e eVar, f30 f30Var, String str, boolean z13, int i13, c1 c1Var, i0 i0Var, HashMap hashMap, String str2, n0 n0Var, int i14) {
        int i15 = (i14 & 8) != 0 ? -1 : i13;
        c1 c1Var2 = (i14 & 16) != 0 ? null : c1Var;
        i0 i0Var2 = (i14 & 32) != 0 ? null : i0Var;
        HashMap hashMap2 = (i14 & 64) != 0 ? null : hashMap;
        ((n) eVar).i(i15, f30Var, i0Var2, (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? n0.NONE : n0Var, c1Var2, str, (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str2, hashMap2, z13);
    }

    static xj2.c c(e eVar, String url, f30 pin, boolean z13, int i13, int i14, c1 c1Var, boolean z14, boolean z15, i0 i0Var, HashMap hashMap, String str, boolean z16, boolean z17, c1 c1Var2, boolean z18, boolean z19, boolean z23, int i15) {
        boolean z24 = (i15 & 4) != 0 ? false : z13;
        int value = (i15 & 8) != 0 ? ml1.b.DEFAULT_TRANSITION.getValue() : i13;
        int i16 = (i15 & 16) != 0 ? -1 : i14;
        c1 c1Var3 = (i15 & 32) != 0 ? null : c1Var;
        boolean z25 = (i15 & 64) != 0 ? false : z14;
        boolean z26 = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? true : z15;
        i0 i0Var2 = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : i0Var;
        HashMap hashMap2 = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : hashMap;
        String str2 = (i15 & 1024) != 0 ? null : str;
        boolean z27 = (i15 & 2048) != 0 ? false : z16;
        boolean z28 = (i15 & 4096) != 0 ? false : z17;
        c1 c1Var4 = (i15 & 8192) != 0 ? null : c1Var2;
        boolean z29 = (i15 & 16384) != 0 ? false : z18;
        boolean z33 = (32768 & i15) != 0 ? false : z19;
        boolean z34 = (i15 & 65536) != 0 ? false : z23;
        n nVar = (n) eVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pin, "pin");
        boolean f13 = com.bumptech.glide.c.f1(pin);
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        new f5(uid, url).i();
        if (f13) {
            return nVar.l(url, pin, z24, hashMap2, Integer.valueOf(value), Integer.valueOf(i16), c1Var3, z25, z26, i0Var2, str2, false, z27, c1Var4, z29, z33, z34);
        }
        nVar.h(value, i16, pin, i0Var2, c1Var3, c1Var4, url, str2, hashMap2 == null ? new HashMap() : hashMap2, z24, z25, z26, z27, z28, z29, z33, z34);
        xj2.e eVar2 = new xj2.e(ck2.i.f27922b);
        Intrinsics.checkNotNullExpressionValue(eVar2, "empty(...)");
        return eVar2;
    }

    static xj2.c d(e eVar, f30 pin, int i13, int i14, c1 c1Var, boolean z13, int i15) {
        int value = (i15 & 4) != 0 ? ml1.b.DEFAULT_TRANSITION.getValue() : i13;
        int i16 = (i15 & 8) != 0 ? -1 : i14;
        c1 c1Var2 = (i15 & 16) != 0 ? null : c1Var;
        boolean z14 = (i15 & 32) != 0 ? false : z13;
        n nVar = (n) eVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        String D = com.bumptech.glide.c.D(pin);
        if (D == null) {
            D = "";
        }
        return c(nVar, D, pin, false, value, i16, c1Var2, z14, false, null, null, null, false, false, null, false, false, false, 130944);
    }

    static ek2.j e(e eVar, String url, HashMap auxData, int i13) {
        if ((i13 & 2) != 0) {
            auxData = new HashMap();
        }
        n nVar = (n) eVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        xj2.c F = nVar.f326g.a(url, null).F(new f(0, new rx0.f(nVar, null, auxData, 5)), new f(1, j.f289l), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        return (ek2.j) F;
    }
}
