package fd1;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f61922i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f61923j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(boolean z13, int i13) {
        super(1);
        this.f61922i = i13;
        this.f61923j = z13;
    }

    public final em1.d b(em1.d it) {
        int i13 = this.f61922i;
        boolean z13 = this.f61923j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, null, z13 ? em1.e.ENABLED : em1.e.DISABLED, null, null, null, null, 0, null, false, 0, 1021);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, z13 ? em1.b.CHECKED : em1.b.UNCHECKED, null, null, null, null, null, 0, null, false, 0, 1022);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, z13 ? em1.b.CHECKED : em1.b.UNCHECKED, null, null, null, null, null, 0, null, false, 0, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return em1.d.e(it, z13 ? em1.b.CHECKED : em1.b.UNCHECKED, null, null, null, null, null, 0, null, false, 0, 1022);
        }
    }

    public final om1.c e(om1.c it) {
        int i13 = this.f61922i;
        boolean z13 = this.f61923j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, z13 ? rm1.q.CAPTIONS : rm1.q.CAPTIONS_OUTLINE, null, null, null, null, false, 0, 1022);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, z13 ? rm1.q.MUTE : rm1.q.SOUND, null, null, null, null, false, 0, 1022);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, z13 ? om1.f.TRANSPARENT_DARK_GRAY : om1.f.TRANSPARENT_ALWAYS_LIGHT, null, null, false, 0, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z14 = this.f61923j;
                return om1.c.e(it, null, null, z14 ? om1.f.TRANSPARENT_DARK_GRAY : om1.f.TRANSPARENT_GRAY, null, null, z14, 0, 987);
        }
    }

    public final rn1.a f(rn1.a it) {
        int i13 = this.f61922i;
        boolean z13 = this.f61923j;
        switch (i13) {
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, null, null, new rm1.d(new rm1.f(rm1.q.ARROW_FORWARD, rm1.i.XS), z13 ? rm1.c.DEFAULT : rm1.c.SUBTLE, null, 0, null, 28), null, false, View.generateViewId(), null, null, null, null, null, false, null, null, 2094847);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, z13 ? vn1.c.DEFAULT : vn1.c.SUBTLE, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, z13 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    public final yl1.b h(yl1.b it) {
        int i13 = this.f61922i;
        boolean z13 = this.f61923j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f61923j, null, null, null, null, null, null, 0, null, 1021);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f61923j, null, null, null, null, null, null, 0, null, 1021);
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f61923j, null, null, null, null, null, null, 0, null, 1021);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, z13 ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, null, null, 0, null, 1019);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f61923j, null, null, null, null, null, null, 0, null, 1021);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, !z13, null, null, null, null, null, null, 0, null, 1021);
        }
    }

    public final void i(com.pinterest.feature.unifiedcomments.d view) {
        int i13 = this.f61922i;
        boolean z13 = this.f61923j;
        switch (i13) {
            case 18:
                Intrinsics.checkNotNullParameter(view, "view");
                ((rh1.k) view).h9(!qb0.d.f103396a.c(), z13);
                break;
            case 19:
                Intrinsics.checkNotNullParameter(view, "view");
                ((rh1.k) view).h9(false, z13);
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                if (z13) {
                    ((rh1.k) view).Y8().d();
                }
                ((rh1.k) view).Y8().Z();
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f61922i;
        boolean z13 = this.f61923j;
        switch (i13) {
            case 0:
                return h((yl1.b) obj);
            case 1:
                return h((yl1.b) obj);
            case 2:
                return b((em1.d) obj);
            case 3:
                an1.b it = (an1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return an1.b.e(it, z13, null, 13);
            case 4:
                return b((em1.d) obj);
            case 5:
                return h((yl1.b) obj);
            case 6:
                return h((yl1.b) obj);
            case 7:
                return h((yl1.b) obj);
            case 8:
                return b((em1.d) obj);
            case 9:
                return b((em1.d) obj);
            case 10:
                return f((rn1.a) obj);
            case 11:
                return f((rn1.a) obj);
            case 12:
                return e((om1.c) obj);
            case 13:
                return e((om1.c) obj);
            case 14:
                return h((yl1.b) obj);
            case 15:
                return f((rn1.a) obj);
            case 16:
                return f((rn1.a) obj);
            case 17:
                return e((om1.c) obj);
            case 18:
                i((com.pinterest.feature.unifiedcomments.d) obj);
                return Unit.f80348a;
            case 19:
                i((com.pinterest.feature.unifiedcomments.d) obj);
                return Unit.f80348a;
            case 20:
                i((com.pinterest.feature.unifiedcomments.d) obj);
                return Unit.f80348a;
            case 21:
                return f((rn1.a) obj);
            case 22:
                return h((yl1.b) obj);
            case 23:
                return f((rn1.a) obj);
            case 24:
                return e((om1.c) obj);
            case 25:
                bk1.o it2 = (bk1.o) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                bk1.i iVar = new bk1.i(z13);
                it2.getClass();
                return bk1.o.e(iVar);
            case 26:
                gk1.l it3 = (gk1.l) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return gk1.l.e(it3, null, null, new gk1.f(z13), 3);
            case 27:
                hk1.v it4 = (hk1.v) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return hk1.v.b(it4, null, this.f61923j, false, false, null, 991);
            case 28:
                hk1.g it5 = (hk1.g) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                List<u50.o> list = it5.f69351a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                for (u50.o oVar : list) {
                    if (oVar instanceof yj1.b) {
                        String favoriteUserCount = ((yj1.b) oVar).f139207a.f139209b;
                        Intrinsics.checkNotNullParameter(favoriteUserCount, "favoriteUserCount");
                        yj1.c favoriteDisplayState = new yj1.c(favoriteUserCount, z13);
                        Intrinsics.checkNotNullParameter(favoriteDisplayState, "favoriteDisplayState");
                        oVar = new yj1.b(favoriteDisplayState);
                    }
                    arrayList.add(oVar);
                }
                return hk1.g.e(arrayList);
            default:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f108894i = new rm1.d(new rm1.e(rm1.n.CHECK_CIRCLE_FILL, rm1.h.XS), z13 ? rm1.c.VERIFIED_PINNER : rm1.c.VERIFIED_MERCHANT, null, 0, null, 28);
                return Unit.f80348a;
        }
    }
}
