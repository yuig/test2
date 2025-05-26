package sq0;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import ey.i2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends o5.g {

    /* renamed from: c, reason: collision with root package name */
    public final hs1.q f114992c;

    /* renamed from: d, reason: collision with root package name */
    public final m60.z f114993d;

    /* renamed from: e, reason: collision with root package name */
    public final int f114994e;

    /* renamed from: f, reason: collision with root package name */
    public final List f114995f;

    /* renamed from: g, reason: collision with root package name */
    public final int f114996g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f114997h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hs1.q imageCache, m60.z gridInfoProvider, m60.g0 pageSizeProvider, int i13, List additionalListOfModelImageUrlExtractors) {
        super(0);
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(gridInfoProvider, "gridInfoProvider");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(additionalListOfModelImageUrlExtractors, "additionalListOfModelImageUrlExtractors");
        this.f114992c = imageCache;
        this.f114993d = gridInfoProvider;
        this.f114994e = i13;
        this.f114995f = additionalListOfModelImageUrlExtractors;
        this.f114996g = pageSizeProvider.a();
        ArrayList l13 = kotlin.collections.f0.l(new xq0.c(), new xq0.a(0), new xq0.a(1));
        l13.addAll(additionalListOfModelImageUrlExtractors);
        this.f114997h = l13;
    }

    public static void l(f fVar, List list, int i13, y yVar) {
        ((hf0.b) fVar.f114993d).getClass();
        fVar.k(i13, hf0.b.f69004d, yVar, list);
    }

    public final void k(int i13, int i14, y scrollDirection, List dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        m(i13, i14 * this.f114994e, scrollDirection, dataSource);
    }

    public final void m(int i13, int i14, y scrollDirection, List dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(scrollDirection, "scrollDirection");
        int min = Math.min(i14 + i13, dataSource.size() - 1);
        if (scrollDirection == y.UNKNOWN || scrollDirection == y.UP || i13 > min) {
            return;
        }
        while (true) {
            if (i13 >= 0 && i13 <= dataSource.size() - 1) {
                Object obj = dataSource.get(i13);
                if (obj instanceof dl1.s) {
                    for (xq0.d dVar : this.f114997h) {
                        if (dVar.a((dl1.s) obj)) {
                            String message = "prefetch a " + obj.getClass().getSimpleName() + " model, index [" + i13 + "]";
                            Intrinsics.checkNotNullParameter(message, "message");
                            for (String str : dVar.b((dl1.s) obj)) {
                                if ((obj instanceof f30) && (dVar instanceof xq0.c)) {
                                    n(i13, str);
                                } else if (!(obj instanceof g00)) {
                                    n(Integer.MAX_VALUE, str);
                                } else if (i13 < (hf0.b.q() ? Integer.MAX_VALUE : 6)) {
                                    n(Integer.MAX_VALUE, str);
                                }
                            }
                        }
                    }
                }
            }
            if (i13 == min) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void n(int i13, String str) {
        g gVar = (g) this.f92902b;
        if (gVar.a(str)) {
            Intrinsics.checkNotNullParameter("prefetch image: already fetched", "message");
            return;
        }
        int i14 = this.f114996g;
        hs1.q qVar = this.f114992c;
        if (i13 < i14) {
            new i2(str, i13).i();
            ((hs1.m) qVar).q(str, null, new qz.d0(str, 1));
        } else {
            ((hs1.m) qVar).q(str, null, null);
        }
        String message = "prefetch image: ".concat(str);
        Intrinsics.checkNotNullParameter(message, "message");
        gVar.b(str);
    }

    public f(hs1.q qVar, m60.z zVar, m60.g0 g0Var, List list, int i13) {
        this(qVar, zVar, g0Var, 2, (i13 & 16) != 0 ? q0.f80391a : list);
    }
}
