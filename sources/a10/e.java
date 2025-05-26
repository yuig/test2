package a10;

import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import b10.d0;
import b10.e0;
import b10.z;
import c50.a5;
import c50.c2;
import c50.c3;
import c50.e4;
import c50.e5;
import c50.e8;
import c50.g7;
import c50.h3;
import c50.h5;
import c50.i7;
import c50.j3;
import c50.j5;
import c50.k4;
import c50.k7;
import c50.l3;
import c50.n3;
import c50.o4;
import c50.o7;
import c50.oa;
import c50.p3;
import c50.q7;
import c50.r1;
import c50.v1;
import c50.v4;
import c50.y4;
import com.pinterest.api.model.aa;
import com.pinterest.api.model.b30;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.dn;
import com.pinterest.api.model.e80;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gn;
import com.pinterest.api.model.go0;
import com.pinterest.api.model.h60;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.k60;
import com.pinterest.api.model.lv;
import com.pinterest.api.model.mv;
import com.pinterest.api.model.pr;
import com.pinterest.api.model.qz0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.te0;
import com.pinterest.api.model.tz0;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.ue;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.y20;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import l8.p;
import l8.q;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import pc.m0;
import pc.v;
import pc.v0;
import pc.w;
import vb0.j;
import x40.bg;
import x40.bj;
import x40.c1;
import x40.dg;
import x40.e3;
import x40.h1;
import x40.hf;
import x40.kf;
import x40.mi;
import x40.nf;
import x40.ni;
import x40.pi;
import x40.qf;
import x40.sf;
import x40.si;
import x40.tf;
import x40.v2;
import x40.vf;
import x40.x2;
import x40.xf;
import x40.y2;
import x40.zf;
import zp.j0;

/* loaded from: classes.dex */
public class e implements uf0.b, uf0.a, pc.a, Callback {

    /* renamed from: a, reason: collision with root package name */
    public int f254a;

    public /* synthetic */ e(int i13) {
        this.f254a = i13;
    }

    public static void C(Object obj, d0 d0Var) {
        if (obj != null) {
            d0Var.invoke();
        }
    }

    public static ni a(k60 plankModel) {
        Intrinsics.checkNotNullParameter(plankModel, "plankModel");
        String o13 = plankModel.o();
        if (o13 == null) {
            o13 = "";
        }
        String id3 = plankModel.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return new ni("ProfilePlace", o13, id3, plankModel.H(), plankModel.L(), plankModel.G(), plankModel.N(), plankModel.I(), plankModel.K(), plankModel.J(), plankModel.M());
    }

    public static v7 b(c1 apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        u7 x03 = v7.x0();
        String str = apolloModel.f132071b;
        j0 j0Var = new j0(21, x03, apolloModel);
        if (str != null) {
            j0Var.invoke();
        }
        String str2 = apolloModel.f132072c;
        if (str2 != null) {
            x03.C(str2);
        }
        v7 a13 = x03.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static ba c(h1 apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        aa aaVar = new aa(0);
        String str = apolloModel.f132463b;
        j0 j0Var = new j0(22, aaVar, apolloModel);
        if (str != null) {
            j0Var.invoke();
        }
        String str2 = apolloModel.f132464c;
        if (str2 != null) {
            aaVar.d(str2);
        }
        ba a13 = aaVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static b30 e(mi apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        y20 y20Var = new y20(0);
        String str = apolloModel.f132854b;
        b10.c cVar = new b10.c(y20Var, apolloModel, 0);
        if (str != null) {
            cVar.invoke();
        }
        b10.c cVar2 = new b10.c(y20Var, apolloModel, 1);
        if (apolloModel.f132855c != null) {
            cVar2.invoke();
        }
        b30 b30Var = new b30(y20Var.f43904a, y20Var.f43905b, y20Var.f43906c, y20Var.f43907d, y20Var.f43908e, 0);
        Intrinsics.checkNotNullExpressionValue(b30Var, "build(...)");
        return b30Var;
    }

    public static k60 g(ni apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        h60 h60Var = new h60(0);
        C(apolloModel.f132902b, new d0(h60Var, apolloModel, 1));
        C(apolloModel.f132903c, new d0(h60Var, apolloModel, 2));
        C(apolloModel.f132904d, new d0(h60Var, apolloModel, 3));
        C(apolloModel.f132905e, new d0(h60Var, apolloModel, 4));
        C(apolloModel.f132906f, new d0(h60Var, apolloModel, 5));
        C(apolloModel.f132907g, new d0(h60Var, apolloModel, 6));
        C(apolloModel.f132908h, new d0(h60Var, apolloModel, 7));
        C(apolloModel.f132909i, new d0(h60Var, apolloModel, 8));
        C(apolloModel.f132910j, new d0(h60Var, apolloModel, 9));
        C(apolloModel.f132911k, new d0(h60Var, apolloModel, 0));
        k60 a13 = h60Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static h80 h(vf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        e80 e80Var = new e80(0);
        String str = apolloModel.f133556a;
        if (str != null) {
            e80Var.f37205a = str;
            boolean[] zArr = e80Var.f37217m;
            if (zArr.length > 0) {
                zArr[0] = true;
            }
        }
        h80 a13 = e80Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static we0 j(xf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        te0 te0Var = new te0(0);
        String str = apolloModel.f133690a;
        z zVar = new z(2, te0Var, apolloModel);
        if (str != null) {
            zVar.invoke();
        }
        we0 a13 = te0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static jo0 l(zf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        go0 go0Var = new go0(0);
        String str = apolloModel.f133827a;
        if (str != null) {
            go0Var.f38100c = str;
            boolean[] zArr = go0Var.f38108k;
            if (zArr.length > 2) {
                zArr[2] = true;
            }
        }
        jo0 a13 = go0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 m(y2 apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f133721b;
        j0 j0Var = new j0(29, c13, apolloModel);
        if (bool != null) {
            j0Var.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 n(kf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f132680b;
        z zVar = new z(0, c13, apolloModel);
        if (bool != null) {
            zVar.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 o(nf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f132898b;
        j0 j0Var = new j0(24, c13, apolloModel);
        if (bool != null) {
            j0Var.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 p(qf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f133123b;
        j0 j0Var = new j0(25, c13, apolloModel);
        if (bool != null) {
            j0Var.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 q(tf apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f133384b;
        z zVar = new z(5, c13, apolloModel);
        if (bool != null) {
            zVar.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 r(bg apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f132056b;
        z zVar = new z(4, c13, apolloModel);
        if (bool != null) {
            zVar.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static tz0 s(bj apolloModel) {
        Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
        qz0 c13 = tz0.c();
        Boolean bool = apolloModel.f132062b;
        b10.j0 j0Var = new b10.j0(c13, apolloModel, 0);
        if (bool != null) {
            j0Var.invoke();
        }
        b10.j0 j0Var2 = new b10.j0(c13, apolloModel, 1);
        if (apolloModel.f132063c != null) {
            j0Var2.invoke();
        }
        tz0 a13 = c13.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static long x(k0.a aVar) {
        Throwable th3 = (IOException) aVar.f77780d;
        if (!(th3 instanceof ParserException) && !(th3 instanceof FileNotFoundException) && !(th3 instanceof HttpDataSource$CleartextNotPermittedException) && !(th3 instanceof Loader$UnexpectedLoaderException)) {
            int i13 = DataSourceException.f18777b;
            while (th3 != null) {
                if (!(th3 instanceof DataSourceException) || ((DataSourceException) th3).f18778a != 2008) {
                    th3 = th3.getCause();
                }
            }
            return Math.min((aVar.f77777a - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public v0 A() {
        switch (this.f254a) {
            case 14:
                return a5.f25879b;
            case 22:
                return q7.f26252b;
            default:
                return e8.f25979b;
        }
    }

    @Override // uf0.a
    public Object B(Object obj) {
        int i13 = 4;
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
        switch (this.f254a) {
            case 0:
                return b((c1) obj);
            case 1:
                return c((h1) obj);
            case 2:
                return e((mi) obj);
            case 3:
                pi apolloModel = (pi) obj;
                Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
                pr f13 = sr.f();
                String str = apolloModel.f133052a;
                b10.d dVar = new b10.d(f13, apolloModel, i17);
                if (str != null) {
                    dVar.invoke();
                }
                b10.d dVar2 = new b10.d(f13, apolloModel, i16);
                if (apolloModel.f133053b != null) {
                    dVar2.invoke();
                }
                b10.d dVar3 = new b10.d(f13, apolloModel, i15);
                if (apolloModel.f133054c != null) {
                    dVar3.invoke();
                }
                b10.d dVar4 = new b10.d(f13, apolloModel, i14);
                if (apolloModel.f133055d != null) {
                    dVar4.invoke();
                }
                b10.d dVar5 = new b10.d(f13, apolloModel, i13);
                if (apolloModel.f133056e != null) {
                    dVar5.invoke();
                }
                sr a13 = f13.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            case 4:
            case 10:
            default:
                return q((tf) obj);
            case 5:
                return o((nf) obj);
            case 6:
                return l((zf) obj);
            case 7:
                return p((qf) obj);
            case 8:
                return m((y2) obj);
            case 9:
                return n((kf) obj);
            case 11:
                return h((vf) obj);
            case 12:
                return j((xf) obj);
            case 13:
                return g((ni) obj);
            case 14:
                si apolloModel2 = (si) obj;
                Intrinsics.checkNotNullParameter(apolloModel2, "apolloModel");
                pr f14 = sr.f();
                String str2 = apolloModel2.f133278a;
                e0 e0Var = new e0(f14, apolloModel2, i17);
                if (str2 != null) {
                    e0Var.invoke();
                }
                e0 e0Var2 = new e0(f14, apolloModel2, i16);
                if (apolloModel2.f133279b != null) {
                    e0Var2.invoke();
                }
                e0 e0Var3 = new e0(f14, apolloModel2, i15);
                if (apolloModel2.f133280c != null) {
                    e0Var3.invoke();
                }
                e0 e0Var4 = new e0(f14, apolloModel2, i14);
                if (apolloModel2.f133281d != null) {
                    e0Var4.invoke();
                }
                e0 e0Var5 = new e0(f14, apolloModel2, i13);
                if (apolloModel2.f133282e != null) {
                    e0Var5.invoke();
                }
                sr a14 = f14.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                return a14;
            case 15:
                return r((bg) obj);
            case 16:
                return s((bj) obj);
        }
    }

    public /* bridge */ /* synthetic */ void D(k0.a aVar) {
    }

    public void E(tc.g writer, v customScalarAdapters, String value) {
        switch (this.f254a) {
            case 6:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.n1(value);
                break;
            default:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                if (value == null) {
                    writer.a2();
                    break;
                } else {
                    writer.n1(value);
                    break;
                }
        }
    }

    @Override // uf0.b
    public Object O(Object obj) {
        switch (this.f254a) {
            case 0:
                e3 input = (e3) obj;
                Intrinsics.checkNotNullParameter(input, "input");
                List list = input.f132303d;
                return list == null ? q0.f80391a : list;
            case 1:
                e3 input2 = (e3) obj;
                Intrinsics.checkNotNullParameter(input2, "input");
                v2 v2Var = input2.f132309j;
                if (v2Var == null) {
                    return null;
                }
                lv C = mv.C();
                C.i(v2Var.f133528d);
                C.h(v2Var.f133529e);
                C.c(v2Var.f133530f);
                return C.a();
            case 2:
                e3 input3 = (e3) obj;
                Intrinsics.checkNotNullParameter(input3, "input");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<x2> list2 = input3.f132308i;
                if (list2 != null) {
                    for (x2 x2Var : list2) {
                        String str = x2Var.f133653b;
                        String str2 = x2Var.f133654c;
                        Double d2 = str2 != null ? y.d(str2) : null;
                        if (str != null && d2 != null) {
                            linkedHashMap.put(str, Double.valueOf(d2.doubleValue()));
                        }
                    }
                }
                return z0.n(linkedHashMap);
            case 3:
                dg input4 = (dg) obj;
                Intrinsics.checkNotNullParameter(input4, "input");
                hf apolloModel = input4.f132258i;
                if (apolloModel == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(apolloModel, "apolloModel");
                dn dnVar = new dn(0);
                b10.g gVar = new b10.g(dnVar, apolloModel, 0);
                if (apolloModel.f132506b != null) {
                    gVar.invoke();
                }
                b10.g gVar2 = new b10.g(dnVar, apolloModel, 1);
                if (apolloModel.f132507c != null) {
                    gVar2.invoke();
                }
                gn a13 = dnVar.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            default:
                dg input5 = (dg) obj;
                Intrinsics.checkNotNullParameter(input5, "input");
                sf apolloModel2 = input5.f132254e;
                if (apolloModel2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(apolloModel2, "apolloModel");
                v7 a14 = v7.x0().a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                return a14;
        }
    }

    @Override // pc.a
    public void d(tc.g writer, v customScalarAdapters, Object value) {
        switch (this.f254a) {
            case 0:
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                bs1.c.z2(writer, value);
                break;
            case 1:
                boolean booleanValue = ((Boolean) value).booleanValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                writer.h0(booleanValue);
                break;
            case 2:
                double doubleValue = ((Number) value).doubleValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                writer.H(doubleValue);
                break;
            case 3:
            case 5:
            default:
                E(writer, customScalarAdapters, (String) value);
                break;
            case 4:
                int intValue = ((Number) value).intValue();
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                writer.D(intValue);
                break;
            case 6:
                E(writer, customScalarAdapters, (String) value);
                break;
        }
    }

    @Override // pc.a
    public Object f(tc.f reader, v customScalarAdapters) {
        switch (this.f254a) {
            case 0:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                Intrinsics.checkNotNullParameter(reader, "reader");
                Object Z = bf.b.Z(reader);
                Intrinsics.f(Z);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                break;
        }
        return u(reader, customScalarAdapters);
    }

    @Override // uf0.a
    public Object i(Object obj) {
        switch (this.f254a) {
            case 0:
                v7 plankModel = (v7) obj;
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                String o13 = plankModel.o();
                return new c1("Board", o13 != null ? o13 : "", plankModel.j1());
            case 1:
                ba plankModel2 = (ba) obj;
                Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                String o14 = plankModel2.o();
                return new h1("BoardSection", o14 != null ? o14 : "", plankModel2.A());
            case 2:
                b30 plankModel3 = (b30) obj;
                Intrinsics.checkNotNullParameter(plankModel3, "plankModel");
                return new mi("ContactPhoneCountry", plankModel3.e(), plankModel3.f());
            case 3:
                sr plankModel4 = (sr) obj;
                Intrinsics.checkNotNullParameter(plankModel4, "plankModel");
                return new pi(plankModel4.j(), plankModel4.g(), plankModel4.i(), Integer.valueOf((int) plankModel4.k().doubleValue()), Integer.valueOf((int) plankModel4.h().doubleValue()));
            case 4:
            case 10:
            default:
                tz0 plankModel5 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel5, "plankModel");
                return new tf("VerifiedIdentity", plankModel5.e());
            case 5:
                tz0 plankModel6 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel6, "plankModel");
                return new nf("VerifiedIdentity", plankModel6.e());
            case 6:
                jo0 plankModel7 = (jo0) obj;
                Intrinsics.checkNotNullParameter(plankModel7, "plankModel");
                return new zf(plankModel7.m());
            case 7:
                tz0 plankModel8 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel8, "plankModel");
                return new qf("VerifiedIdentity", plankModel8.e());
            case 8:
                tz0 plankModel9 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel9, "plankModel");
                return new y2("VerifiedIdentity", plankModel9.e());
            case 9:
                tz0 plankModel10 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel10, "plankModel");
                return new kf("VerifiedIdentity", plankModel10.e());
            case 11:
                h80 plankModel11 = (h80) obj;
                Intrinsics.checkNotNullParameter(plankModel11, "plankModel");
                return new vf(plankModel11.s());
            case 12:
                we0 plankModel12 = (we0) obj;
                Intrinsics.checkNotNullParameter(plankModel12, "plankModel");
                return new xf(plankModel12.q());
            case 13:
                return a((k60) obj);
            case 14:
                sr plankModel13 = (sr) obj;
                Intrinsics.checkNotNullParameter(plankModel13, "plankModel");
                return new si(plankModel13.g(), plankModel13.i(), plankModel13.j(), Integer.valueOf((int) plankModel13.h().doubleValue()), Integer.valueOf((int) plankModel13.k().doubleValue()));
            case 15:
                tz0 plankModel14 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel14, "plankModel");
                return new bg("VerifiedIdentity", plankModel14.e());
            case 16:
                tz0 plankModel15 = (tz0) obj;
                Intrinsics.checkNotNullParameter(plankModel15, "plankModel");
                return new bj("VerifiedIdentity", plankModel15.d(), plankModel15.e());
        }
    }

    @Override // uf0.b
    public Object k(Object obj) {
        switch (this.f254a) {
            case 0:
                return t((ue) obj);
            case 1:
                ue input = (ue) obj;
                Intrinsics.checkNotNullParameter(input, "input");
                mv C = input.C();
                if (C == null) {
                    return null;
                }
                String id3 = C.getId();
                String uuid = UUID.randomUUID().toString();
                String M = C.M();
                Date E = C.E();
                Intrinsics.f(uuid);
                Intrinsics.f(id3);
                return new v2("Message", null, uuid, id3, M, E, null, null, null, null, null);
            case 2:
                return t((ue) obj);
            case 3:
                f30 input2 = (f30) obj;
                Intrinsics.checkNotNullParameter(input2, "input");
                gn plankModel = input2.m4();
                if (plankModel == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(plankModel, "plankModel");
                return new hf("Embed", plankModel.g(), plankModel.f());
            default:
                f30 input3 = (f30) obj;
                Intrinsics.checkNotNullParameter(input3, "input");
                v7 plankModel2 = input3.G5();
                if (plankModel2 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(plankModel2, "plankModel");
                return new sf("Board");
        }
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e13) {
        switch (this.f254a) {
            case 0:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e13, "e");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e13, "e");
                break;
            default:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e13, "e");
                break;
        }
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        switch (this.f254a) {
            case 0:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                response.close();
                j.f125470e = SystemClock.elapsedRealtime();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                response.close();
                j.f125476k = SystemClock.elapsedRealtime();
                break;
            default:
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                response.close();
                break;
        }
    }

    public List t(ue input) {
        switch (this.f254a) {
            case 0:
                Intrinsics.checkNotNullParameter(input, "input");
                List A = input.A();
                return A == null ? q0.f80391a : A;
            default:
                Intrinsics.checkNotNullParameter(input, "input");
                q0 q0Var = q0.f80391a;
                Map E = input.E();
                if (E != null) {
                    ArrayList arrayList = new ArrayList(E.size());
                    for (Map.Entry entry : E.entrySet()) {
                        arrayList.add(CollectionsKt.m0(new x2("ReadTimesMs", (String) entry.getKey(), String.valueOf((Double) entry.getValue())), q0Var));
                    }
                }
                return q0Var;
        }
    }

    public String u(tc.f reader, v customScalarAdapters) {
        switch (this.f254a) {
            case 6:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                String Y0 = reader.Y0();
                Intrinsics.f(Y0);
                return Y0;
            default:
                Intrinsics.checkNotNullParameter(reader, "reader");
                Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
                if (reader.peek() != tc.e.NULL) {
                    return reader.Y0();
                }
                reader.B1();
                return null;
        }
    }

    public q v(p pVar, k0.a aVar) {
        int i13;
        IOException iOException = (IOException) aVar.f77780d;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || ((i13 = ((HttpDataSource$InvalidResponseCodeException) iOException).f18780d) != 403 && i13 != 404 && i13 != 410 && i13 != 416 && i13 != 500 && i13 != 503)) {
            return null;
        }
        if (pVar.a(1)) {
            return new q(1, 300000L);
        }
        if (pVar.a(2)) {
            return new q(2, 60000L);
        }
        return null;
    }

    public int w(int i13) {
        int i14 = this.f254a;
        return i14 == -1 ? i13 == 7 ? 6 : 3 : i14;
    }

    public w y() {
        switch (this.f254a) {
            case 0:
                return r1.f26262b;
            default:
                return o4.f26200b;
        }
    }

    public m0 z() {
        switch (this.f254a) {
            case 1:
                return v1.f26395b;
            case 2:
                return c2.f25920b;
            case 3:
                return c3.f25922b;
            case 4:
                return h3.f26039b;
            case 5:
                return j3.f26086b;
            case 6:
                return l3.f26128b;
            case 7:
                return n3.f26175b;
            case 8:
                return p3.f26222b;
            case 9:
                return e4.f25971b;
            case 10:
                return k4.f26109b;
            case 11:
            case 14:
            default:
                return oa.f26212b;
            case 12:
                return v4.f26401b;
            case 13:
                return y4.f26466b;
            case 15:
                return e5.f25973b;
            case 16:
                return h5.f26043b;
            case 17:
                return j5.f26090b;
            case 18:
                return g7.f26024b;
            case 19:
                return i7.f26070b;
            case 20:
                return k7.f26114b;
            case 21:
                return o7.f26206b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13, int i14) {
        this(0);
        this.f254a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
            default:
                break;
        }
    }

    public e() {
        this.f254a = -1;
    }
}
