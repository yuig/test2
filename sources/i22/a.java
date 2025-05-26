package i22;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.pinterest.api.model.Cdo;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.fo;
import com.pinterest.api.model.go;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.kq;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mp;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.np;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.pq;
import com.pinterest.api.model.rq;
import com.pinterest.api.model.sp;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.tq;
import com.pinterest.api.model.uq;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.y6;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import nm.o;
import nm.q;
import nm.r;
import nm.s;
import nm.u;

/* loaded from: classes4.dex */
public final class a implements r {
    @Override // nm.r
    public final Object a(s sVar, Type type, j jVar) {
        Object foVar;
        String str;
        y6 audioItem;
        u uVar;
        Iterator it;
        long j13;
        d30 d30Var;
        char c13;
        long j14;
        s v13;
        String p13;
        s v14;
        String p14;
        u i13 = sVar != null ? sVar.i() : null;
        Intrinsics.f(i13);
        u i14 = i13.y("mediaList").i();
        int e13 = i14.v("startMediaIndex").e();
        s v15 = i14.v("startTimeUs");
        long l13 = v15 != null ? v15.l() : 0L;
        s v16 = i14.v("startTimeMs");
        long l14 = v16 != null ? v16.l() : l13 / 1000;
        int e14 = i14.v("endMediaIndex").e();
        s v17 = i14.v("endTimeUs");
        long l15 = v17 != null ? v17.l() : 0L;
        s v18 = i14.v("endTimeMs");
        long l16 = v18 != null ? v18.l() : l15 / 1000;
        ArrayList arrayList = new ArrayList();
        q f13 = i14.v("items").f();
        Intrinsics.checkNotNullExpressionValue(f13, "getAsJsonArray(...)");
        Iterator it2 = f13.f91364a.iterator();
        while (it2.hasNext()) {
            u i15 = ((s) it2.next()).i();
            s v19 = i15.v("photoItem");
            if (v19 == null || (v14 = v19.i().v("path")) == null || (p14 = v14.p()) == null) {
                uVar = i13;
                it = it2;
                j13 = l16;
                d30Var = null;
            } else {
                it = it2;
                uVar = i13;
                j13 = l16;
                d30Var = new d30(p14, null, 2, null);
            }
            s v23 = i15.v("videoItem");
            k01 k01Var = (v23 == null || (v13 = v23.i().v("path")) == null || (p13 = v13.p()) == null) ? null : new k01(p13);
            s v24 = i15.v("startTimeUs");
            long l17 = v24 != null ? v24.l() : 0L;
            s v25 = i15.v("startTimeMs");
            long l18 = v25 != null ? v25.l() : l17 / 1000;
            s v26 = i15.v("endTimeUs");
            long l19 = v26 != null ? v26.l() : 0L;
            s v27 = i15.v("endTimeMs");
            if (v27 != null) {
                j14 = v27.l();
                c13 = 1000;
            } else {
                c13 = 1000;
                j14 = l19 / 1000;
            }
            s v28 = i15.v("displayMatrix");
            Matrix C = v28 != null ? kh2.r.C(v28.f()) : null;
            s v29 = i15.v("exportMatrix");
            Matrix C2 = v29 != null ? kh2.r.C(v29.f()) : null;
            s v33 = i15.v("isFromFrontFacingCamera");
            arrayList.add(new bo0(d30Var, k01Var, l18, j14, C, C2, 0.0f, v33 != null ? v33.b() : false, 64, null));
            it2 = it;
            i13 = uVar;
            l16 = j13;
        }
        u uVar2 = i13;
        vn0 vn0Var = new vn0(arrayList, e13, l14, e14, l16);
        ArrayList arrayList2 = new ArrayList();
        s y13 = uVar2.y("overlayBlocks");
        if (y13 != null) {
            Iterator it3 = y13.f().f91364a.iterator();
            while (it3.hasNext()) {
                u i16 = ((s) it3.next()).i();
                tq tqVar = (tq) (i16.f91366a.containsKey("durationConfig") ? new o().e(i16.y("durationConfig").i(), tq.class) : new tq(0L, 0L, null, null, 12, null));
                u i17 = i16.y("config").i();
                s y14 = i17.y("matrix");
                Matrix C3 = y14 != null ? kh2.r.C(y14.f()) : null;
                rq rqVar = (rq) new o().e(i17, rq.class);
                s v34 = i17.v("type");
                String p15 = v34 != null ? v34.p() : null;
                if (Intrinsics.d(p15, uq.TEXT.toString())) {
                    oq oqVar = (oq) new o().e(i16, oq.class);
                    Intrinsics.f(rqVar);
                    arrayList2.add(oqVar.a(rq.a(rqVar, null, C3, null, 23), tqVar));
                } else if (Intrinsics.d(p15, uq.MENTION.toString())) {
                    lq lqVar = (lq) new o().e(i16, lq.class);
                    Intrinsics.f(rqVar);
                    arrayList2.add(lqVar.a(rq.a(rqVar, null, C3, null, 23), tqVar));
                } else if (Intrinsics.d(p15, uq.PRODUCT_TAG.toString())) {
                    mq mqVar = (mq) new o().e(i16, mq.class);
                    Intrinsics.f(rqVar);
                    arrayList2.add(mqVar.a(rq.a(rqVar, null, C3, null, 23), tqVar));
                } else if (Intrinsics.d(p15, uq.STICKER.toString())) {
                    nq nqVar = (nq) new o().e(i16, nq.class);
                    Intrinsics.f(rqVar);
                    arrayList2.add(nqVar.a(rq.a(rqVar, null, C3, null, 23), tqVar));
                } else if (Intrinsics.d(p15, uq.VTO_PRODUCT_TAG.toString())) {
                    pq pqVar = (pq) new o().e(i16, pq.class);
                    Intrinsics.f(rqVar);
                    arrayList2.add(pqVar.a(rq.a(rqVar, null, C3, null, 23), tqVar));
                } else if (Intrinsics.d(p15, uq.BOARD_STICKER.toString())) {
                    jq jqVar = (jq) new o().e(i16, jq.class);
                    Intrinsics.f(rqVar);
                    arrayList2.add(jqVar.a(rq.a(rqVar, null, C3, null, 23), tqVar));
                } else if (Intrinsics.d(p15, uq.IMAGE_STICKER.toString())) {
                    kq kqVar = (kq) new o().e(i16, kq.class);
                    Intrinsics.f(rqVar);
                    arrayList2.add(kqVar.a(rq.a(rqVar, null, C3, null, 23), tqVar));
                }
            }
        }
        pm.o oVar = uVar2.f91366a;
        sp spVar = (sp) (oVar.containsKey("audioList") ? new o().e(uVar2.y("audioList").i(), sp.class) : new sp(null, 1, null));
        Cdo musicItem = spVar.getMusicItem();
        String e15 = (musicItem == null || (audioItem = musicItem.getAudioItem()) == null) ? null : audioItem.e();
        if (e15 == null) {
            e15 = "";
        }
        Cdo musicItem2 = spVar.getMusicItem();
        sp spVar2 = new sp(musicItem2 != null ? Cdo.a(musicItem2, new y6(e15), null, 6) : null);
        if (oVar.containsKey("audioMix")) {
            foVar = new o().e(uVar2.y("audioMix").i(), fo.class);
            str = null;
        } else {
            str = null;
            foVar = new fo(0.0f, 0.0f, 3, null);
        }
        fo foVar2 = (fo) foVar;
        ArrayList arrayList3 = new ArrayList();
        s y15 = uVar2.y("drawingPathList");
        if (y15 != null) {
            Iterator it4 = y15.f().f91364a.iterator();
            while (it4.hasNext()) {
                u i18 = ((s) it4.next()).i();
                s v35 = i18.v("brushType");
                String p16 = v35 != null ? v35.p() : str;
                if (p16 == null) {
                    p16 = np.f40453a.name();
                }
                go valueOf = go.valueOf(p16);
                s v36 = i18.v("brushColor");
                String p17 = v36 != null ? v36.p() : str;
                if (p17 == null) {
                    p17 = "#FFFFFF";
                }
                s v37 = i18.v("brushWidth");
                float d2 = v37 != null ? v37.d() : 4.0f;
                ArrayList arrayList4 = new ArrayList();
                s v38 = i18.v("pointList");
                if (v38 != null) {
                    Iterator it5 = v38.f().f91364a.iterator();
                    while (it5.hasNext()) {
                        Object e16 = new o().e((s) it5.next(), PointF.class);
                        Intrinsics.checkNotNullExpressionValue(e16, "fromJson(...)");
                        arrayList4.add(e16);
                    }
                }
                arrayList3.add(new mp(arrayList4, valueOf, p17, d2));
            }
        }
        tp tpVar = (tp) new o().e(uVar2, tp.class);
        Intrinsics.f(tpVar);
        return tp.e(tpVar, null, null, vn0Var, spVar2, foVar2, arrayList2, null, null, null, arrayList3, null, null, 3523);
    }
}
