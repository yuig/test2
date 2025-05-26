package fs0;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.l1;
import lh0.z3;

/* loaded from: classes5.dex */
public final class b extends n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f62832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jo1.a baseFragmentType, ls0.f viewParams) {
        super(baseFragmentType, viewParams);
        this.f62832d = 5;
        Intrinsics.checkNotNullParameter(baseFragmentType, "baseFragmentType");
        Intrinsics.checkNotNullParameter(viewParams, "viewParams");
    }

    @Override // fs0.n
    public final List a(l config) {
        boolean z13 = config.f62871d;
        boolean z14 = config.f62875h;
        boolean z15 = config.f62873f;
        boolean z16 = config.f62876i;
        boolean z17 = config.f62874g;
        int i13 = this.f62832d;
        ls0.f fVar = this.f62884b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList arrayList = new ArrayList();
                arrayList.add(es0.a.DOWNLOAD);
                l1 l1Var = this.f62885c;
                l1Var.getClass();
                z3 z3Var = a4.f83298b;
                g1 g1Var = (g1) l1Var.f83416a;
                if (g1Var.o("android_curation_duplicate_collage", "enabled", z3Var) || g1Var.l("android_curation_duplicate_collage")) {
                    arrayList.add(es0.a.DUPLICATE);
                }
                return arrayList;
            case 1:
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(es0.a.HIDE);
                arrayList2.add(es0.a.CRITEO_WAISTA);
                arrayList2.add(es0.a.CRITEO_REPORT);
                ((m60.d) m60.d.a()).e();
                ((m60.d) m60.d.a()).g();
                arrayList2.add(es0.a.CRITEO_REASON);
                return arrayList2;
            case 2:
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList l13 = f0.l(es0.a.DIVIDER_WITH_BOTTOM_SPACE);
                l13.add(es0.a.SEND);
                if (n.b(fVar.f84637l, z17, z16)) {
                    l13.add(es0.a.DOWNLOAD);
                }
                if (!z15) {
                    l13.add(es0.a.UNFOLLOW);
                }
                int i14 = d.f62835a[fVar.f84626a.ordinal()];
                if ((i14 == 1 || i14 == 2) && !z13) {
                    l13.add(es0.a.HIDE);
                }
                if (!z13) {
                    l13.add(es0.a.REPORT);
                }
                l13.add(es0.a.DIVIDER_WITH_TOP_SPACE);
                l13.add(es0.a.REASON);
                return l13;
            case 3:
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList l14 = f0.l(es0.a.DIVIDER_WITH_BOTTOM_SPACE);
                if (c() && !z14) {
                    l14.add(es0.a.SAVE);
                }
                l14.add(es0.a.SEND);
                if (n.b(fVar.f84637l, z17, z16)) {
                    l14.add(es0.a.DOWNLOAD);
                }
                if (!z13) {
                    l14.add(es0.a.REPORT);
                }
                return l14;
            case 4:
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList l15 = f0.l(es0.a.DIVIDER_WITH_BOTTOM_SPACE);
                if (c() && !z14) {
                    l15.add(es0.a.SAVE);
                }
                l15.add(es0.a.SEND);
                if (n.b(fVar.f84637l, z17, z16)) {
                    l15.add(es0.a.DOWNLOAD);
                }
                if (fVar.A) {
                    l15.add(es0.a.ADD_TO_COLLAGE);
                }
                l15.add(es0.a.DIVIDER_WITH_TOP_SPACE);
                return l15;
            case 5:
                Intrinsics.checkNotNullParameter(config, "config");
                return f0.j(es0.a.SAVE_PRODUCT_TAG, es0.a.REPORT);
            case 6:
                Intrinsics.checkNotNullParameter(config, "config");
                return f0.l(es0.a.DIVIDER_WITH_BOTTOM_SPACE, es0.a.OPEN_IN_EXTERNAL_BROWSER, es0.a.COPY_LINK, es0.a.REPORT, es0.a.DIVIDER_WITH_TOP_SPACE);
            case 7:
                Intrinsics.checkNotNullParameter(config, "config");
                return f0.j(es0.a.REASON, es0.a.HIDE, es0.a.WAISTA, es0.a.REPORT);
            case 8:
                Intrinsics.checkNotNullParameter(config, "config");
                return f0.j(es0.a.SAVE, es0.a.REASON);
            case 9:
                Intrinsics.checkNotNullParameter(config, "config");
                return z15 ? f0.j(es0.a.HIDE, es0.a.WAISTA, es0.a.REPORT, es0.a.DIVIDER_WITH_TOP_SPACE, es0.a.REASON) : f0.j(es0.a.SEND, es0.a.SAVE);
            default:
                Intrinsics.checkNotNullParameter(config, "config");
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(es0.a.GMA_WAISTA);
                arrayList3.add(es0.a.GMA_REPORT);
                ((m60.d) m60.d.a()).e();
                ((m60.d) m60.d.a()).g();
                arrayList3.add(es0.a.GMA_REASON);
                return arrayList3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ls0.f viewParams, int i13) {
        super(jo1.a.COLLAGE_RETRIEVAL, viewParams);
        this.f62832d = i13;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                super(jo1.a.HOMEFEED, viewParams);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                super(jo1.a.FOLLOWING_FEED, viewParams);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                super(jo1.a.USER_PINS, viewParams);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                super(jo1.a.VISUAL_SEARCH, viewParams);
                break;
            case 5:
            default:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                super(jo1.a.PROMOTED_PIN_CLOSEUP, viewParams);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                super(jo1.a.PROMOTED_SPOTLIGHT, viewParams);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                super(jo1.a.QUIZ_PIN_RESULT_CLOSEUP, viewParams);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                super(jo1.a.SHOWCASE_PIN_CLOSEUP, viewParams);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(viewParams, "viewParams");
                super(jo1.a.HOMEFEED, viewParams);
                break;
        }
    }
}
