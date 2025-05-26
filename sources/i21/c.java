package i21;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import g21.e;
import h21.f;
import h32.u0;
import java.util.HashMap;
import ku1.l;
import m60.f0;
import m60.w;
import net.quikkly.android.utils.BitmapUtils;
import nx.b0;
import nx.d1;
import so.oa;
import so.pa;
import so.sa;
import so.t8;
import so.w8;
import uj2.q;
import uk1.d;

/* loaded from: classes5.dex */
public interface c {
    static b a(c cVar, e eVar, f fVar, np0.e eVar2, String str, g21.b bVar, d dVar, u0 u0Var, HashMap hashMap, int i13, int i14, int i15) {
        e eVar3 = (i15 & 1) != 0 ? new e(null, null, null) : eVar;
        g21.b bVar2 = (i15 & 16) != 0 ? new g21.b(null, 3) : bVar;
        u0 u0Var2 = (i15 & 64) != 0 ? null : u0Var;
        HashMap hashMap2 = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : hashMap;
        boolean z13 = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0;
        int i16 = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? 0 : i13;
        int i17 = (i15 & 1024) != 0 ? 0 : i14;
        pa paVar = (pa) cVar;
        int i18 = paVar.f114059a;
        bf2.d dVar2 = paVar.f114060b;
        switch (i18) {
            case 0:
                t8 t8Var = (t8) dVar2;
                w wVar = (w) t8Var.f114636b.f113885r0.get();
                oa oaVar = t8Var.f114636b;
                return new b(eVar3, fVar, eVar2, str, bVar2, dVar, u0Var2, hashMap2, z13, i16, i17, null, wVar, (q) oaVar.f113947u9.get(), (l) ((sa) t8Var.f114638d).f114617t.get(), (d1) oaVar.f113730i2.get(), new f0(), oaVar.S2(), (b0) oaVar.R8.get(), (ur.a) oaVar.Kb.get());
            default:
                w8 w8Var = (w8) dVar2;
                w wVar2 = (w) w8Var.f114689b.f113885r0.get();
                oa oaVar2 = w8Var.f114689b;
                return new b(eVar3, fVar, eVar2, str, bVar2, dVar, u0Var2, hashMap2, z13, i16, i17, null, wVar2, (q) oaVar2.f113947u9.get(), (l) w8Var.f114690c.f114476s.get(), (d1) oaVar2.f113730i2.get(), new f0(), oaVar2.S2(), (b0) oaVar2.R8.get(), (ur.a) oaVar2.Kb.get());
        }
    }
}
