package a10;

import b10.m;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gn;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.pz0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.tz0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kp.n;
import x40.ah;
import x40.bh;
import x40.ch;
import x40.dh;
import x40.eh;
import x40.fh;
import x40.gh;
import x40.hh;
import x40.ih;
import x40.jh;
import x40.kh;
import x40.lh;
import x40.mh;
import x40.og;
import x40.tg;
import x40.ug;
import x40.vg;
import x40.wg;
import x40.xg;
import x40.yg;
import x40.zg;
import z40.c0;
import z40.d0;

/* loaded from: classes3.dex */
public final class h implements uf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257a;

    /* renamed from: b, reason: collision with root package name */
    public final uf0.a f258b;

    public h(int i13) {
        this.f257a = i13;
        switch (i13) {
            case 1:
                this.f258b = new m(new h(2), 2);
                break;
            case 2:
                this.f258b = new m(new h(15), 1);
                break;
            case 3:
                this.f258b = new m(new h(4), 3);
                break;
            case 4:
                this.f258b = new m(new h(16), 0);
                break;
            case 5:
                this.f258b = new m(new h(17), 4);
                break;
            case 6:
                this.f258b = new n(6);
                break;
            case 7:
                this.f258b = new m(new h(18), 5);
                break;
            case 8:
                this.f258b = new n(9);
                break;
            case 9:
                this.f258b = new n(10);
                break;
            case 10:
                this.f258b = new m(new h(8), 6);
                break;
            case 11:
                this.f258b = new m(new h(9), 7);
                break;
            case 12:
                this.f258b = new m(new h(13), 8);
                break;
            case 13:
                this.f258b = new n(11);
                break;
            case 14:
                this.f258b = new m(new h(19), 9);
                break;
            case 15:
                this.f258b = new n(2);
                break;
            case 16:
                this.f258b = new n(4);
                break;
            case 17:
                this.f258b = new n(5);
                break;
            case 18:
                this.f258b = new n(8);
                break;
            case 19:
                this.f258b = new n(7);
                break;
            default:
                this.f258b = new n(3);
                break;
        }
    }

    @Override // uf0.b
    public final Object O(Object obj) {
        int i13 = this.f257a;
        ArrayList arrayList = null;
        uf0.a aVar = this.f258b;
        switch (i13) {
            case 0:
                mh input = (mh) obj;
                Intrinsics.checkNotNullParameter(input, "input");
                og ogVar = input.f132838i;
                if (ogVar != null) {
                    ((n) aVar).getClass();
                    break;
                }
                break;
            case 1:
                mh input2 = (mh) obj;
                Intrinsics.checkNotNullParameter(input2, "input");
                vg vgVar = input2.f132850u;
                if (vgVar != null) {
                    break;
                }
                break;
            case 2:
                vg input3 = (vg) obj;
                Intrinsics.checkNotNullParameter(input3, "input");
                ug ugVar = input3.f133557a;
                if (ugVar != null) {
                    break;
                }
                break;
            case 3:
                mh input4 = (mh) obj;
                Intrinsics.checkNotNullParameter(input4, "input");
                yg ygVar = input4.f132849t;
                if (ygVar != null) {
                    break;
                }
                break;
            case 4:
                yg input5 = (yg) obj;
                Intrinsics.checkNotNullParameter(input5, "input");
                xg xgVar = input5.f133752a;
                if (xgVar != null) {
                    break;
                }
                break;
            case 6:
                mh input6 = (mh) obj;
                Intrinsics.checkNotNullParameter(input6, "input");
                bh apolloModel = input6.f132834e;
                if (apolloModel != null) {
                    ((n) aVar).getClass();
                    Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
                    v7 a13 = v7.x0().a();
                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                    break;
                }
                break;
            case 8:
                fh input7 = (fh) obj;
                Intrinsics.checkNotNullParameter(input7, "input");
                List list = input7.f132418a;
                if (list != null) {
                    List<eh> list2 = list;
                    arrayList = new ArrayList(g0.q(list2, 10));
                    for (eh ehVar : list2) {
                        ((n) aVar).getClass();
                        arrayList.add(n.P(ehVar));
                    }
                    break;
                }
                break;
            case 9:
                hh input8 = (hh) obj;
                Intrinsics.checkNotNullParameter(input8, "input");
                List list3 = input8.f132510a;
                if (list3 != null) {
                    List<gh> list4 = list3;
                    arrayList = new ArrayList(g0.q(list4, 10));
                    for (gh ghVar : list4) {
                        ((n) aVar).getClass();
                        arrayList.add(n.Q(ghVar));
                    }
                    break;
                }
                break;
            case 10:
                mh input9 = (mh) obj;
                Intrinsics.checkNotNullParameter(input9, "input");
                fh fhVar = input9.f132840k;
                if (fhVar != null) {
                    break;
                }
                break;
            case 11:
                mh input10 = (mh) obj;
                Intrinsics.checkNotNullParameter(input10, "input");
                hh hhVar = input10.f132839j;
                if (hhVar != null) {
                    break;
                }
                break;
            case 12:
                mh input11 = (mh) obj;
                Intrinsics.checkNotNullParameter(input11, "input");
                jh jhVar = input11.f132835f;
                if (jhVar != null) {
                    break;
                }
                break;
            case 13:
                jh input12 = (jh) obj;
                Intrinsics.checkNotNullParameter(input12, "input");
                ih ihVar = input12.f132620b;
                if (ihVar != null) {
                    ((n) aVar).getClass();
                    break;
                }
                break;
        }
        return c((d0) obj);
    }

    public final c0 a(wy0 input) {
        int i13 = this.f257a;
        uf0.a aVar = this.f258b;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel = input.B4();
                if (plankModel == null) {
                    return null;
                }
                ((n) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                return new tg("VerifiedIdentity", plankModel.e());
            case 16:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel2 = input.B4();
                if (plankModel2 == null) {
                    return null;
                }
                ((n) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                return new wg("VerifiedIdentity", plankModel2.e());
            case 17:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel3 = input.B4();
                if (plankModel3 == null) {
                    return null;
                }
                ((n) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel3, "plankModel");
                return new zg("VerifiedIdentity", plankModel3.e());
            case 18:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel4 = input.B4();
                if (plankModel4 == null) {
                    return null;
                }
                ((n) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel4, "plankModel");
                return new ch("VerifiedIdentity", plankModel4.e());
            default:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel5 = input.B4();
                if (plankModel5 == null) {
                    return null;
                }
                ((n) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel5, "plankModel");
                return new kh("VerifiedIdentity", plankModel5.e());
        }
    }

    public final wy0 b(mh input) {
        int i13 = this.f257a;
        uf0.a aVar = this.f258b;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(input, "input");
                ah ahVar = input.f132847r;
                if (ahVar != null) {
                    return ((m) aVar).p(ahVar);
                }
                return null;
            case 6:
            default:
                Intrinsics.checkNotNullParameter(input, "input");
                lh lhVar = input.f132848s;
                if (lhVar != null) {
                    return ((m) aVar).r(lhVar);
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter(input, "input");
                dh dhVar = input.f132836g;
                if (dhVar != null) {
                    return ((m) aVar).q(dhVar);
                }
                return null;
        }
    }

    public final tz0 c(d0 input) {
        int i13 = this.f257a;
        uf0.a aVar = this.f258b;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i14 = input.i();
                if (i14 == null) {
                    return null;
                }
                ((n) aVar).getClass();
                return n.S((tg) i14);
            case 16:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i15 = input.i();
                if (i15 == null) {
                    return null;
                }
                ((n) aVar).getClass();
                return n.T((wg) i15);
            case 17:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i16 = input.i();
                if (i16 == null) {
                    return null;
                }
                ((n) aVar).getClass();
                return n.U((zg) i16);
            case 18:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i17 = input.i();
                if (i17 == null) {
                    return null;
                }
                ((n) aVar).getClass();
                return n.V((ch) i17);
            default:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i18 = input.i();
                if (i18 == null) {
                    return null;
                }
                ((n) aVar).getClass();
                return n.W((kh) i18);
        }
    }

    @Override // uf0.b
    public final Object k(Object obj) {
        int i13 = this.f257a;
        ArrayList arrayList = null;
        uf0.a aVar = this.f258b;
        switch (i13) {
            case 0:
                f30 input = (f30) obj;
                Intrinsics.checkNotNullParameter(input, "input");
                gn plankModel = input.m4();
                if (plankModel != null) {
                    ((n) aVar).getClass();
                    Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                    break;
                }
                break;
            case 1:
                f30 input2 = (f30) obj;
                Intrinsics.checkNotNullParameter(input2, "input");
                com.pinterest.api.model.hh plankModel2 = input2.t5();
                if (plankModel2 != null) {
                    m mVar = (m) aVar;
                    mVar.getClass();
                    Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                    break;
                }
                break;
            case 2:
                com.pinterest.api.model.hh input3 = (com.pinterest.api.model.hh) obj;
                Intrinsics.checkNotNullParameter(input3, "input");
                wy0 d2 = input3.d();
                if (d2 != null) {
                    break;
                }
                break;
            case 3:
                f30 input4 = (f30) obj;
                Intrinsics.checkNotNullParameter(input4, "input");
                pz0 plankModel3 = input4.u5();
                if (plankModel3 != null) {
                    m mVar2 = (m) aVar;
                    mVar2.getClass();
                    Intrinsics.checkNotNullParameter(plankModel3, "plankModel");
                    break;
                }
                break;
            case 4:
                pz0 input5 = (pz0) obj;
                Intrinsics.checkNotNullParameter(input5, "input");
                wy0 c13 = input5.c();
                if (c13 != null) {
                    break;
                }
                break;
            case 5:
                f30 input6 = (f30) obj;
                Intrinsics.checkNotNullParameter(input6, "input");
                wy0 z53 = input6.z5();
                if (z53 != null) {
                    break;
                }
                break;
            case 6:
                f30 input7 = (f30) obj;
                Intrinsics.checkNotNullParameter(input7, "input");
                v7 plankModel4 = input7.G5();
                if (plankModel4 != null) {
                    ((n) aVar).getClass();
                    Intrinsics.checkNotNullParameter(plankModel4, "plankModel");
                    break;
                }
                break;
            case 7:
                f30 input8 = (f30) obj;
                Intrinsics.checkNotNullParameter(input8, "input");
                wy0 I5 = input8.I5();
                if (I5 != null) {
                    break;
                }
                break;
            case 8:
                oe0 input9 = (oe0) obj;
                Intrinsics.checkNotNullParameter(input9, "input");
                List r13 = input9.r();
                if (r13 != null) {
                    List<h80> list = r13;
                    arrayList = new ArrayList(g0.q(list, 10));
                    for (h80 plankModel5 : list) {
                        Intrinsics.f(plankModel5);
                        ((n) aVar).getClass();
                        Intrinsics.checkNotNullParameter(plankModel5, "plankModel");
                        arrayList.add(new eh(plankModel5.s()));
                    }
                    break;
                }
                break;
            case 9:
                se0 input10 = (se0) obj;
                Intrinsics.checkNotNullParameter(input10, "input");
                List y13 = input10.y();
                if (y13 != null) {
                    List<we0> list2 = y13;
                    arrayList = new ArrayList(g0.q(list2, 10));
                    for (we0 plankModel6 : list2) {
                        Intrinsics.f(plankModel6);
                        ((n) aVar).getClass();
                        Intrinsics.checkNotNullParameter(plankModel6, "plankModel");
                        arrayList.add(new gh(plankModel6.q()));
                    }
                    break;
                }
                break;
            case 10:
                f30 input11 = (f30) obj;
                Intrinsics.checkNotNullParameter(input11, "input");
                oe0 plankModel7 = input11.f6();
                if (plankModel7 != null) {
                    m mVar3 = (m) aVar;
                    mVar3.getClass();
                    Intrinsics.checkNotNullParameter(plankModel7, "plankModel");
                    break;
                }
                break;
            case 11:
                f30 input12 = (f30) obj;
                Intrinsics.checkNotNullParameter(input12, "input");
                se0 plankModel8 = input12.g6();
                if (plankModel8 != null) {
                    m mVar4 = (m) aVar;
                    mVar4.getClass();
                    Intrinsics.checkNotNullParameter(plankModel8, "plankModel");
                    break;
                }
                break;
            case 12:
                f30 input13 = (f30) obj;
                Intrinsics.checkNotNullParameter(input13, "input");
                dl0 v63 = input13.v6();
                if (v63 != null) {
                    break;
                }
                break;
            case 13:
                dl0 input14 = (dl0) obj;
                Intrinsics.checkNotNullParameter(input14, "input");
                jo0 plankModel9 = input14.q();
                if (plankModel9 != null) {
                    ((n) aVar).getClass();
                    Intrinsics.checkNotNullParameter(plankModel9, "plankModel");
                    break;
                }
                break;
            case 14:
                f30 input15 = (f30) obj;
                Intrinsics.checkNotNullParameter(input15, "input");
                wy0 y63 = input15.y6();
                if (y63 != null) {
                    break;
                }
                break;
        }
        return a((wy0) obj);
    }
}
