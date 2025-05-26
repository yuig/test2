package k81;

import com.pinterest.api.model.n11;
import com.pinterest.api.model.q11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nm.q;
import nm.s;
import nm.u;
import qz.f0;
import s81.p;
import uy.m;
import wk1.n;
import x81.o0;
import zd1.o;

/* loaded from: classes5.dex */
public final class k implements xt1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78604a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f78605b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k() {
        this(new LinkedHashSet());
        this.f78604a = 4;
    }

    public final void a(xt1.d observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        ((Set) this.f78605b).add(observer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x02e5, code lost:
    
        if (r6 > r5) goto L174;
     */
    @Override // xt1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void afterParseResponse(bl1.a r26) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k81.k.afterParseResponse(bl1.a):void");
    }

    @Override // xt1.d
    public final void beforeParseResponse(vd0.c cVar) {
        Boolean bool;
        int i13 = this.f78604a;
        Object obj = this.f78605b;
        switch (i13) {
            case 0:
                w81.d dVar = ((l) obj).f78629l;
                if (dVar != null) {
                    dVar.c(null);
                    break;
                }
                break;
            case 1:
                new m(24, 0).i();
                p pVar = (p) obj;
                r81.m mVar = pVar.f111947y;
                String d2 = cVar != null ? cVar.d("url") : null;
                if (cVar == null || (bool = cVar.h("url_property_added_by_adapter_factory", Boolean.FALSE)) == null) {
                    bool = Boolean.FALSE;
                }
                boolean booleanValue = bool.booleanValue();
                if (d2 != null && d2.length() != 0 && !booleanValue) {
                    mVar.i0(d2);
                    mVar.h0(null);
                }
                if (cVar != null) {
                    boolean z13 = pVar.f111931i;
                    ArrayList arrayList = pVar.W;
                    if (z13 || pVar.f111932j) {
                        s v13 = cVar.f125623a.v("visual_objects");
                        q qVar = v13 instanceof q ? (q) v13 : null;
                        Iterator it = qVar != null ? qVar.f91364a.iterator() : null;
                        while (it != null && it.hasNext()) {
                            s sVar = (s) it.next();
                            u i14 = sVar != null ? sVar.i() : null;
                            if (i14 != null) {
                                s v14 = i14.v("x");
                                Double valueOf = v14 != null ? Double.valueOf(v14.c()) : null;
                                s v15 = i14.v("y");
                                Double valueOf2 = v15 != null ? Double.valueOf(v15.c()) : null;
                                s v16 = i14.v("w");
                                Double valueOf3 = v16 != null ? Double.valueOf(v16.c()) : null;
                                s v17 = i14.v("h");
                                Double valueOf4 = v17 != null ? Double.valueOf(v17.c()) : null;
                                if (valueOf != null && valueOf2 != null && valueOf3 != null && valueOf4 != null) {
                                    n11 n11Var = new n11(0);
                                    n11Var.f40296m = valueOf;
                                    boolean[] zArr = n11Var.f40298o;
                                    if (zArr.length > 12) {
                                        zArr[12] = true;
                                    }
                                    n11Var.f40297n = valueOf2;
                                    if (zArr.length > 13) {
                                        zArr[13] = true;
                                    }
                                    n11Var.f40295l = valueOf3;
                                    if (zArr.length > 11) {
                                        zArr[11] = true;
                                    }
                                    n11Var.f40287d = valueOf4;
                                    if (zArr.length > 3) {
                                        zArr[3] = true;
                                    }
                                    q11 a13 = n11Var.a();
                                    Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                                    arrayList.add(a13);
                                }
                            }
                        }
                    }
                    if (pVar.V == null && pVar.f111931i) {
                        Boolean h10 = cVar.h("is_single_prominent_object", Boolean.FALSE);
                        pVar.V = h10;
                        if (Intrinsics.d(h10, Boolean.TRUE)) {
                            int value = g42.c.SINGLE_PROMINENT_STELA_DOT.getValue();
                            r81.m mVar2 = pVar.f111947y;
                            f0 f0Var = mVar2.f49121k;
                            if (f0Var != null) {
                                f0Var.c(value, "crop_source");
                            }
                            int value2 = a32.f.SHOPPING.getValue();
                            f0 f0Var2 = mVar2.f49121k;
                            if (f0Var2 != null) {
                                f0Var2.c(value2, "search_type");
                            }
                            pVar.f111923a0 = da2.i.TAB_SHOP;
                            if (arrayList.size() != 1) {
                                vb0.j.f125466a.G("LensPresenter: setting SINGLE_PROMINENT_STELA_DOT as the crop_source but the number of visual objects returned is not 1", new Object[0]);
                                break;
                            } else {
                                q11 G3 = pVar.G3();
                                if (G3 != null) {
                                    mVar2.k0(Float.valueOf((float) G3.t().doubleValue()));
                                    mVar2.m0(Float.valueOf((float) G3.u().doubleValue()));
                                    mVar2.j0(Float.valueOf((float) G3.s().doubleValue()));
                                    mVar2.g0(Float.valueOf((float) G3.o().doubleValue()));
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 2:
                o oVar = ((o0) obj).f134274j;
                break;
            case 3:
                o oVar2 = ((a91.f) obj).f1576j;
                break;
            default:
                Iterator it2 = ((Set) obj).iterator();
                while (it2.hasNext()) {
                    ((xt1.d) it2.next()).beforeParseResponse(cVar);
                }
                break;
        }
    }

    public /* synthetic */ k(n nVar, int i13) {
        this.f78604a = i13;
        this.f78605b = nVar;
    }

    public k(Set remoteRequestObservers) {
        this.f78604a = 4;
        Intrinsics.checkNotNullParameter(remoteRequestObservers, "remoteRequestObservers");
        this.f78605b = remoteRequestObservers;
    }
}
