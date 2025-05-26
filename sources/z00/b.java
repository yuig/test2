package z00;

import b10.b0;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import x40.c1;
import x40.cj;
import x40.d1;
import x40.dg;
import x40.dj;
import x40.e3;
import x40.eg;
import x40.f1;
import x40.f3;
import x40.ff;
import x40.h1;
import x40.h3;
import x40.i1;
import x40.ji;
import x40.k1;

/* loaded from: classes.dex */
public final class b implements uf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f140519a;

    /* renamed from: b, reason: collision with root package name */
    public final uf0.a f140520b;

    public b(int i13) {
        this.f140519a = i13;
        int i14 = 1;
        if (i13 == 1) {
            this.f140520b = new a10.e(i14);
            return;
        }
        int i15 = 2;
        int i16 = 0;
        int i17 = 3;
        if (i13 == 2) {
            this.f140520b = new b10.f(new a10.b(3), new a10.e(i16), new a10.e(i15), new a10.e(i14), 0);
            return;
        }
        int i18 = 4;
        if (i13 != 3) {
            if (i13 != 4) {
                this.f140520b = new a10.e(i16);
                return;
            } else {
                this.f140520b = new b10.f(new a10.d(0), new a10.d(1), new a10.b(18), new a10.b(0), 1);
                return;
            }
        }
        a10.b bVar = new a10.b(15);
        a10.b bVar2 = new a10.b(13);
        a10.b bVar3 = new a10.b(14);
        a10.b bVar4 = new a10.b(8);
        a10.b bVar5 = new a10.b(9);
        a10.b bVar6 = new a10.b(17);
        a10.b bVar7 = new a10.b(6);
        a10.b bVar8 = new a10.b(4);
        this.f140520b = new b0(new a10.e(i17), new a10.e(i18), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    @Override // uf0.a
    public final Object B(Object obj) {
        int i13 = this.f140519a;
        uf0.a aVar = this.f140520b;
        switch (i13) {
            case 0:
                f1 apolloModel = (f1) obj;
                Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
                d1 d1Var = apolloModel.f132369a;
                if (d1Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(d1Var, "<this>");
                c1 c1Var = d1Var instanceof c1 ? (c1) d1Var : null;
                if (c1Var == null) {
                    return null;
                }
                ((a10.e) aVar).getClass();
                return a10.e.b(c1Var);
            case 1:
                k1 apolloModel2 = (k1) obj;
                Intrinsics.checkNotNullParameter(apolloModel2, "apolloModel");
                i1 i1Var = apolloModel2.f132628a;
                if (i1Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(i1Var, "<this>");
                h1 h1Var = i1Var instanceof h1 ? (h1) i1Var : null;
                if (h1Var == null) {
                    return null;
                }
                ((a10.e) aVar).getClass();
                return a10.e.c(h1Var);
            case 2:
                h3 apolloModel3 = (h3) obj;
                Intrinsics.checkNotNullParameter(apolloModel3, "apolloModel");
                f3 f3Var = apolloModel3.f132468a;
                if (f3Var == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(f3Var, "<this>");
                e3 e3Var = f3Var instanceof e3 ? (e3) f3Var : null;
                if (e3Var != null) {
                    return ((b10.f) aVar).c(e3Var);
                }
                return null;
            case 3:
                eg apolloModel4 = (eg) obj;
                Intrinsics.checkNotNullParameter(apolloModel4, "apolloModel");
                ff ffVar = apolloModel4.f132360a;
                if (ffVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(ffVar, "<this>");
                dg dgVar = ffVar instanceof dg ? (dg) ffVar : null;
                if (dgVar != null) {
                    return ((b0) aVar).B(dgVar);
                }
                return null;
            default:
                dj apolloModel5 = (dj) obj;
                Intrinsics.checkNotNullParameter(apolloModel5, "apolloModel");
                ji jiVar = apolloModel5.f132293a;
                if (jiVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(jiVar, "<this>");
                cj cjVar = jiVar instanceof cj ? (cj) jiVar : null;
                if (cjVar != null) {
                    return ((b10.f) aVar).d(cjVar);
                }
                return null;
        }
    }

    @Override // uf0.a
    public final Object i(Object obj) {
        int i13 = this.f140519a;
        uf0.a aVar = this.f140520b;
        switch (i13) {
            case 0:
                v7 plankModel = (v7) obj;
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                ((a10.e) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                String o13 = plankModel.o();
                return new f1(new c1("Board", o13 != null ? o13 : "", plankModel.j1()));
            case 1:
                ba plankModel2 = (ba) obj;
                Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                ((a10.e) aVar).getClass();
                Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                String o14 = plankModel2.o();
                return new k1(new h1("BoardSection", o14 != null ? o14 : "", plankModel2.A()));
            case 2:
                ue plankModel3 = (ue) obj;
                Intrinsics.checkNotNullParameter(plankModel3, "plankModel");
                return new h3(((b10.f) aVar).a(plankModel3));
            case 3:
                f30 plankModel4 = (f30) obj;
                Intrinsics.checkNotNullParameter(plankModel4, "plankModel");
                return new eg(((b0) aVar).i(plankModel4));
            default:
                wy0 plankModel5 = (wy0) obj;
                Intrinsics.checkNotNullParameter(plankModel5, "plankModel");
                return new dj(((b10.f) aVar).b(plankModel5));
        }
    }
}
