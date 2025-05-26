package a10;

import b10.k;
import com.pinterest.api.model.b30;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.k60;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.pz0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.tz0;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.v10;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import x40.a3;
import x40.ag;
import x40.b3;
import x40.bg;
import x40.bj;
import x40.c3;
import x40.cg;
import x40.cj;
import x40.d3;
import x40.dg;
import x40.e3;
import x40.kf;
import x40.lf;
import x40.mf;
import x40.mi;
import x40.nf;
import x40.ni;
import x40.of;
import x40.oi;
import x40.pf;
import x40.qf;
import x40.rf;
import x40.tf;
import x40.uf;
import x40.vf;
import x40.wf;
import x40.xf;
import x40.y2;
import x40.yf;
import x40.z2;
import x40.zf;
import z40.c0;
import z40.d0;

/* loaded from: classes.dex */
public final class b implements uf0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247a;

    /* renamed from: b, reason: collision with root package name */
    public final uf0.a f248b;

    public b(int i13) {
        this.f247a = i13;
        int i14 = 9;
        int i15 = 16;
        int i16 = 12;
        int i17 = 11;
        int i18 = 6;
        int i19 = 8;
        int i23 = 7;
        int i24 = 5;
        int i25 = 2;
        switch (i13) {
            case 1:
                this.f248b = new e(i25);
                break;
            case 2:
                this.f248b = new e(i19);
                break;
            case 3:
                this.f248b = new k(new b(2), 4);
                break;
            case 4:
                this.f248b = new k(new b(5), 1);
                break;
            case 5:
                this.f248b = new k(new b(19), 0);
                break;
            case 6:
                this.f248b = new k(new b(7), 2);
                break;
            case 7:
                this.f248b = new k(new b(20), 5);
                break;
            case 8:
                this.f248b = new k(new b(21), 3);
                break;
            case 9:
                this.f248b = new k(new b(22), 6);
                break;
            case 10:
                this.f248b = new e(i17);
                break;
            case 11:
                this.f248b = new e(i16);
                break;
            case 12:
                this.f248b = new e(13);
                break;
            case 13:
                this.f248b = new k(new b(10), 7);
                break;
            case 14:
                this.f248b = new k(new b(11), 8);
                break;
            case 15:
                this.f248b = new k(new b(16), 9);
                break;
            case 16:
                this.f248b = new e(i18);
                break;
            case 17:
                this.f248b = new k(new b(23), 10);
                break;
            case 18:
                this.f248b = new e(i15);
                break;
            case 19:
                this.f248b = new e(i14);
                break;
            case 20:
                this.f248b = new e(i24);
                break;
            case 21:
                this.f248b = new e(i23);
                break;
            case 22:
                this.f248b = new e(17);
                break;
            case 23:
                this.f248b = new e(15);
                break;
            default:
                this.f248b = new b10.b(new b(1), new b(12));
                break;
        }
    }

    @Override // uf0.b
    public final Object O(Object obj) {
        b3 b3Var;
        List<a3> list;
        z2 z2Var;
        int i13 = this.f247a;
        ArrayList arrayList = null;
        uf0.a aVar = this.f248b;
        switch (i13) {
            case 0:
                cj input = (cj) obj;
                Intrinsics.checkNotNullParameter(input, "input");
                oi oiVar = input.A;
                if (oiVar != null) {
                    break;
                }
                break;
            case 1:
                oi input2 = (oi) obj;
                Intrinsics.checkNotNullParameter(input2, "input");
                mi miVar = input2.f133007h;
                if (miVar != null) {
                    ((e) aVar).getClass();
                    break;
                }
                break;
            case 2:
                z2 input3 = (z2) obj;
                Intrinsics.checkNotNullParameter(input3, "input");
                y2 y2Var = input3.f133766d;
                if (y2Var != null) {
                    ((e) aVar).getClass();
                    break;
                } else {
                    break;
                }
            case 3:
                e3 input4 = (e3) obj;
                Intrinsics.checkNotNullParameter(input4, "input");
                d3 d3Var = input4.f132307h;
                if (d3Var != null) {
                    Intrinsics.checkNotNullParameter(d3Var, "<this>");
                    c3 c3Var = d3Var instanceof c3 ? (c3) d3Var : null;
                    if (c3Var != null && (b3Var = c3Var.f132094b) != null && (list = b3Var.f132003a) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (a3 a3Var : list) {
                            wy0 l13 = (a3Var == null || (z2Var = a3Var.f131912a) == null) ? null : ((k) aVar).l(z2Var);
                            if (l13 != null) {
                                arrayList2.add(l13);
                            }
                        }
                        break;
                    }
                }
                break;
            case 4:
                dg input5 = (dg) obj;
                Intrinsics.checkNotNullParameter(input5, "input");
                mf mfVar = input5.f132267r;
                if (mfVar != null) {
                    break;
                }
                break;
            case 5:
                mf input6 = (mf) obj;
                Intrinsics.checkNotNullParameter(input6, "input");
                lf lfVar = input6.f132827a;
                if (lfVar != null) {
                    break;
                }
                break;
            case 6:
                dg input7 = (dg) obj;
                Intrinsics.checkNotNullParameter(input7, "input");
                pf pfVar = input7.f132266q;
                if (pfVar != null) {
                    break;
                }
                break;
            case 7:
                pf input8 = (pf) obj;
                Intrinsics.checkNotNullParameter(input8, "input");
                of ofVar = input8.f133043a;
                if (ofVar != null) {
                    break;
                }
                break;
            case 10:
                wf input9 = (wf) obj;
                Intrinsics.checkNotNullParameter(input9, "input");
                List list2 = input9.f133627a;
                if (list2 != null) {
                    List<vf> list3 = list2;
                    arrayList = new ArrayList(g0.q(list3, 10));
                    for (vf vfVar : list3) {
                        ((e) aVar).getClass();
                        arrayList.add(e.h(vfVar));
                    }
                    break;
                }
                break;
            case 11:
                yf input10 = (yf) obj;
                Intrinsics.checkNotNullParameter(input10, "input");
                List list4 = input10.f133749a;
                if (list4 != null) {
                    List<xf> list5 = list4;
                    arrayList = new ArrayList(g0.q(list5, 10));
                    for (xf xfVar : list5) {
                        ((e) aVar).getClass();
                        arrayList.add(e.j(xfVar));
                    }
                    break;
                }
                break;
            case 12:
                oi input11 = (oi) obj;
                Intrinsics.checkNotNullParameter(input11, "input");
                ni niVar = input11.f133009j;
                if (niVar != null) {
                    ((e) aVar).getClass();
                    break;
                }
                break;
            case 13:
                dg input12 = (dg) obj;
                Intrinsics.checkNotNullParameter(input12, "input");
                wf wfVar = input12.f132259j;
                if (wfVar != null) {
                    break;
                }
                break;
            case 14:
                dg input13 = (dg) obj;
                Intrinsics.checkNotNullParameter(input13, "input");
                yf yfVar = input13.f132260k;
                if (yfVar != null) {
                    break;
                }
                break;
            case 15:
                dg input14 = (dg) obj;
                Intrinsics.checkNotNullParameter(input14, "input");
                ag agVar = input14.f132257h;
                if (agVar != null) {
                    break;
                }
                break;
            case 16:
                ag input15 = (ag) obj;
                Intrinsics.checkNotNullParameter(input15, "input");
                zf zfVar = input15.f131969b;
                if (zfVar != null) {
                    ((e) aVar).getClass();
                    break;
                }
                break;
            case 18:
                cj input16 = (cj) obj;
                Intrinsics.checkNotNullParameter(input16, "input");
                bj bjVar = input16.f132183i;
                if (bjVar != null) {
                    ((e) aVar).getClass();
                    break;
                } else {
                    break;
                }
        }
        return c((d0) obj);
    }

    public final c0 a(wy0 input) {
        int i13 = this.f247a;
        uf0.a aVar = this.f248b;
        switch (i13) {
            case 19:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel = input.B4();
                if (plankModel == null) {
                    return null;
                }
                ((e) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                return new kf("VerifiedIdentity", plankModel.e());
            case 20:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel2 = input.B4();
                if (plankModel2 == null) {
                    return null;
                }
                ((e) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                return new nf("VerifiedIdentity", plankModel2.e());
            case 21:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel3 = input.B4();
                if (plankModel3 == null) {
                    return null;
                }
                ((e) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel3, "plankModel");
                return new qf("VerifiedIdentity", plankModel3.e());
            case 22:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel4 = input.B4();
                if (plankModel4 == null) {
                    return null;
                }
                ((e) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel4, "plankModel");
                return new tf("VerifiedIdentity", plankModel4.e());
            default:
                Intrinsics.checkNotNullParameter(input, "input");
                tz0 plankModel5 = input.B4();
                if (plankModel5 == null) {
                    return null;
                }
                ((e) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel5, "plankModel");
                return new bg("VerifiedIdentity", plankModel5.e());
        }
    }

    public final wy0 b(dg input) {
        int i13 = this.f247a;
        uf0.a aVar = this.f248b;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(input, "input");
                rf rfVar = input.f132263n;
                if (rfVar != null) {
                    return ((k) aVar).o(rfVar);
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter(input, "input");
                uf ufVar = input.f132264o;
                if (ufVar != null) {
                    return ((k) aVar).p(ufVar);
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(input, "input");
                cg cgVar = input.f132265p;
                if (cgVar != null) {
                    return ((k) aVar).q(cgVar);
                }
                return null;
        }
    }

    public final tz0 c(d0 input) {
        int i13 = this.f247a;
        uf0.a aVar = this.f248b;
        switch (i13) {
            case 19:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i14 = input.i();
                if (i14 == null) {
                    return null;
                }
                ((e) aVar).getClass();
                return e.n((kf) i14);
            case 20:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i15 = input.i();
                if (i15 == null) {
                    return null;
                }
                ((e) aVar).getClass();
                return e.o((nf) i15);
            case 21:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i16 = input.i();
                if (i16 == null) {
                    return null;
                }
                ((e) aVar).getClass();
                return e.p((qf) i16);
            case 22:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i17 = input.i();
                if (i17 == null) {
                    return null;
                }
                ((e) aVar).getClass();
                return e.q((tf) i17);
            default:
                Intrinsics.checkNotNullParameter(input, "input");
                c0 i18 = input.i();
                if (i18 == null) {
                    return null;
                }
                ((e) aVar).getClass();
                return e.r((bg) i18);
        }
    }

    @Override // uf0.b
    public final Object k(Object obj) {
        int i13 = this.f247a;
        c3 c3Var = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        uf0.a aVar = this.f248b;
        switch (i13) {
            case 0:
                wy0 input = (wy0) obj;
                Intrinsics.checkNotNullParameter(input, "input");
                v10 Y3 = input.Y3();
                if (Y3 != null) {
                    break;
                }
                break;
            case 1:
                v10 input2 = (v10) obj;
                Intrinsics.checkNotNullParameter(input2, "input");
                b30 plankModel = input2.F();
                if (plankModel != null) {
                    ((e) aVar).getClass();
                    Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                    break;
                }
                break;
            case 2:
                wy0 input3 = (wy0) obj;
                Intrinsics.checkNotNullParameter(input3, "input");
                tz0 plankModel2 = input3.B4();
                if (plankModel2 != null) {
                    ((e) aVar).getClass();
                    Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                    break;
                } else {
                    break;
                }
            case 3:
                ue input4 = (ue) obj;
                Intrinsics.checkNotNullParameter(input4, "input");
                List z13 = input4.z();
                if (z13 != null) {
                    List list = z13;
                    ArrayList arrayList3 = new ArrayList(g0.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new a3(((k) aVar).a((wy0) it.next())));
                    }
                    c3Var = new c3("UserUsersConnectionContainer", new b3(arrayList3));
                    break;
                }
                break;
            case 4:
                f30 input5 = (f30) obj;
                Intrinsics.checkNotNullParameter(input5, "input");
                hh plankModel3 = input5.t5();
                if (plankModel3 != null) {
                    k kVar = (k) aVar;
                    kVar.getClass();
                    Intrinsics.checkNotNullParameter(plankModel3, "plankModel");
                    break;
                }
                break;
            case 5:
                hh input6 = (hh) obj;
                Intrinsics.checkNotNullParameter(input6, "input");
                wy0 d2 = input6.d();
                if (d2 != null) {
                    break;
                }
                break;
            case 6:
                f30 input7 = (f30) obj;
                Intrinsics.checkNotNullParameter(input7, "input");
                pz0 plankModel4 = input7.u5();
                if (plankModel4 != null) {
                    k kVar2 = (k) aVar;
                    kVar2.getClass();
                    Intrinsics.checkNotNullParameter(plankModel4, "plankModel");
                    break;
                }
                break;
            case 7:
                pz0 input8 = (pz0) obj;
                Intrinsics.checkNotNullParameter(input8, "input");
                wy0 c13 = input8.c();
                if (c13 != null) {
                    break;
                }
                break;
            case 8:
                f30 input9 = (f30) obj;
                Intrinsics.checkNotNullParameter(input9, "input");
                wy0 z53 = input9.z5();
                if (z53 != null) {
                    break;
                }
                break;
            case 9:
                f30 input10 = (f30) obj;
                Intrinsics.checkNotNullParameter(input10, "input");
                wy0 I5 = input10.I5();
                if (I5 != null) {
                    break;
                }
                break;
            case 10:
                oe0 input11 = (oe0) obj;
                Intrinsics.checkNotNullParameter(input11, "input");
                List r13 = input11.r();
                if (r13 != null) {
                    List<h80> list2 = r13;
                    arrayList2 = new ArrayList(g0.q(list2, 10));
                    for (h80 plankModel5 : list2) {
                        Intrinsics.f(plankModel5);
                        ((e) aVar).getClass();
                        Intrinsics.checkNotNullParameter(plankModel5, "plankModel");
                        arrayList2.add(new vf(plankModel5.s()));
                    }
                    break;
                }
                break;
            case 11:
                se0 input12 = (se0) obj;
                Intrinsics.checkNotNullParameter(input12, "input");
                List y13 = input12.y();
                if (y13 != null) {
                    List<we0> list3 = y13;
                    arrayList = new ArrayList(g0.q(list3, 10));
                    for (we0 plankModel6 : list3) {
                        Intrinsics.f(plankModel6);
                        ((e) aVar).getClass();
                        Intrinsics.checkNotNullParameter(plankModel6, "plankModel");
                        arrayList.add(new xf(plankModel6.q()));
                    }
                    break;
                }
                break;
            case 12:
                v10 input13 = (v10) obj;
                Intrinsics.checkNotNullParameter(input13, "input");
                k60 J2 = input13.J();
                if (J2 != null) {
                    ((e) aVar).getClass();
                    break;
                }
                break;
            case 13:
                f30 input14 = (f30) obj;
                Intrinsics.checkNotNullParameter(input14, "input");
                oe0 plankModel7 = input14.f6();
                if (plankModel7 != null) {
                    k kVar3 = (k) aVar;
                    kVar3.getClass();
                    Intrinsics.checkNotNullParameter(plankModel7, "plankModel");
                    break;
                }
                break;
            case 14:
                f30 input15 = (f30) obj;
                Intrinsics.checkNotNullParameter(input15, "input");
                se0 plankModel8 = input15.g6();
                if (plankModel8 != null) {
                    k kVar4 = (k) aVar;
                    kVar4.getClass();
                    Intrinsics.checkNotNullParameter(plankModel8, "plankModel");
                    break;
                }
                break;
            case 15:
                f30 input16 = (f30) obj;
                Intrinsics.checkNotNullParameter(input16, "input");
                dl0 plankModel9 = input16.v6();
                if (plankModel9 != null) {
                    k kVar5 = (k) aVar;
                    kVar5.getClass();
                    Intrinsics.checkNotNullParameter(plankModel9, "plankModel");
                    break;
                }
                break;
            case 16:
                dl0 input17 = (dl0) obj;
                Intrinsics.checkNotNullParameter(input17, "input");
                jo0 plankModel10 = input17.q();
                if (plankModel10 != null) {
                    ((e) aVar).getClass();
                    Intrinsics.checkNotNullParameter(plankModel10, "plankModel");
                    break;
                }
                break;
            case 17:
                f30 input18 = (f30) obj;
                Intrinsics.checkNotNullParameter(input18, "input");
                wy0 y63 = input18.y6();
                if (y63 != null) {
                    break;
                }
                break;
            case 18:
                wy0 plankModel11 = (wy0) obj;
                Intrinsics.checkNotNullParameter(plankModel11, "plankModel");
                tz0 plankModel12 = plankModel11.B4();
                if (plankModel12 != null) {
                    ((e) aVar).getClass();
                    Intrinsics.checkNotNullParameter(plankModel12, "plankModel");
                    break;
                }
                break;
        }
        return a((wy0) obj);
    }
}
