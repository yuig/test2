package oa2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.quikkly.android.utils.BitmapUtils;
import so.oa;
import so.r8;
import so.s8;
import so.sa;
import so.t8;
import so.x5;
import x02.x2;

/* loaded from: classes4.dex */
public interface p {
    static o a(p pVar, uk1.d dVar, nk1.k kVar, Function2 function2, zo0.a aVar, Function1 function1, Function2 function22, Function1 function12, Function2 function23, kl2.l lVar, Function1 function13, jd1.f fVar, boolean z13, String str, int i13) {
        nk1.k kVar2 = (i13 & 2) != 0 ? r.f93952a : kVar;
        Function2 function24 = (i13 & 4) != 0 ? r.f93953b : function2;
        Function2 function25 = (i13 & 8) != 0 ? r.f93955d : aVar;
        Function1 function14 = (i13 & 16) != 0 ? r.f93956e : function1;
        Function2 function26 = (i13 & 32) != 0 ? r.f93957f : function22;
        Function1 function15 = (i13 & 64) != 0 ? r.f93958g : function12;
        e eVar = r.f93959h;
        Function2 function27 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? f.f93881m : function23;
        kl2.l lVar2 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? r.f93960i : lVar;
        Function1 function16 = (i13 & 4096) != 0 ? e.D : function13;
        Function1 function17 = (i13 & 8192) != 0 ? e.E : fVar;
        boolean z14 = (i13 & 16384) != 0 ? false : z13;
        String str2 = (i13 & 32768) != 0 ? null : str;
        x5 x5Var = (x5) pVar;
        int i14 = x5Var.f114703a;
        bf2.d dVar2 = x5Var.f114704b;
        switch (i14) {
            case 0:
                r8 r8Var = (r8) dVar2;
                uj2.q qVar = (uj2.q) r8Var.f114090a.f113947u9.get();
                s8 s8Var = r8Var.f114091b;
                yk1.v vVar = (yk1.v) s8Var.C.get();
                oa oaVar = r8Var.f114090a;
                x2 x2Var = (x2) oaVar.f113800m3.get();
                b60.b bVar = (b60.b) oaVar.f113850p0.get();
                r41.k kVar3 = r41.k.f106176a;
                return new o(dVar, kVar2, function24, function25, function14, function26, function15, eVar, lVar2, null, null, function16, function17, z14, str2, function27, qVar, vVar, x2Var, bVar, s8.X4(s8Var));
            default:
                t8 t8Var = (t8) dVar2;
                uj2.q qVar2 = (uj2.q) t8Var.f114636b.f113947u9.get();
                sa saVar = (sa) t8Var.f114638d;
                yk1.v vVar2 = saVar.f114599b;
                oa oaVar2 = t8Var.f114636b;
                x2 x2Var2 = (x2) oaVar2.f113800m3.get();
                b60.b bVar2 = (b60.b) oaVar2.f113850p0.get();
                r41.k kVar4 = r41.k.f106176a;
                return new o(dVar, kVar2, function24, function25, function14, function26, function15, eVar, lVar2, null, null, function16, function17, z14, str2, function27, qVar2, vVar2, x2Var2, bVar2, new nk1.l((i92.k) saVar.f114603f.f113921t1.get(), 0));
        }
    }
}
