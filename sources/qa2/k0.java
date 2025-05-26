package qa2;

import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f103280a = kotlin.collections.h1.c("500px", "500px.com", "Flickr", "Dailymotion", "Behance", "Dasauge", "Getty Images", "Dreamstime", "Giphy", "Fotolia", "Geograph", "Kickstarter", "National Geographic", "Netflix", "Polyvore", "Slideshare", "Someecards", "Ted", "Vevo", "Vimeo", "Vine", "Youtube", "Artsy", "Shuttershock", "Soundcloud");

    public static void a(f30 pin, o gridCell, wa2.i config) {
        Intrinsics.checkNotNullParameter(gridCell, "gridCell");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(config, "config");
        LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) gridCell;
        legoPinGridCellImpl.A2(config.f128766d0);
        legoPinGridCellImpl.f52415h = config.f128797t;
        legoPinGridCellImpl.f52455r = config.f128799u;
        legoPinGridCellImpl.f52484y0 = config.f128793r;
        legoPinGridCellImpl.f52431l = config.f128765d;
        legoPinGridCellImpl.f52407f = config.f128783m;
        legoPinGridCellImpl.f52435m = config.f128763c;
        legoPinGridCellImpl.f52463t = config.f128804x;
        legoPinGridCellImpl.f52467u = config.f128805y;
        legoPinGridCellImpl.f52471v = config.f128806z;
        legoPinGridCellImpl.f52475w = config.Y;
        legoPinGridCellImpl.f52479x = config.Z;
        legoPinGridCellImpl.Q = config.V;
        wa2.g0 g0Var = config.f128764c0;
        legoPinGridCellImpl.V2 = g0Var;
        if (g0Var != null) {
            legoPinGridCellImpl.A2(g0Var.f128725g);
        }
        legoPinGridCellImpl.f52487z = config.A;
        legoPinGridCellImpl.D = config.F;
        legoPinGridCellImpl.B = config.C;
        if (!config.f128797t) {
            legoPinGridCellImpl.f52419i = n60.o.B(pin, "getIsPromoted(...)");
            return;
        }
        if (n60.o.B(pin, "getIsPromoted(...)")) {
            legoPinGridCellImpl.f52415h = config.f128791q;
            legoPinGridCellImpl.f52435m = false;
        } else {
            if (!b(pin)) {
                legoPinGridCellImpl.f52415h = true;
                return;
            }
            legoPinGridCellImpl.f52415h = config.f128791q;
            legoPinGridCellImpl.f52419i = false;
            legoPinGridCellImpl.f52431l = false;
            legoPinGridCellImpl.f52435m = false;
        }
    }

    public static boolean b(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        return CollectionsKt.L(f103280a, b40.Y(pin));
    }
}
