package n10;

import com.pinterest.api.model.hk0;
import com.pinterest.api.model.xk;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import u50.e;
import u50.h;
import u50.i;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final e f88918a = new e(eo1.a.sema_color_background_secondary_default);

    public static final String a(xk xkVar) {
        Intrinsics.checkNotNullParameter(xkVar, "<this>");
        Intrinsics.checkNotNullExpressionValue(xkVar.e(), "getLargeCoverImageList(...)");
        if (!r0.isEmpty()) {
            Object obj = xkVar.e().get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return (String) obj;
        }
        Intrinsics.checkNotNullExpressionValue(xkVar.h(), "getSmallCoverImageList(...)");
        if (!(!r0.isEmpty())) {
            return "";
        }
        Object obj2 = xkVar.h().get(0);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (String) obj2;
    }

    public static final String b(xk xkVar) {
        Intrinsics.checkNotNullParameter(xkVar, "<this>");
        Intrinsics.checkNotNullExpressionValue(xkVar.h(), "getSmallCoverImageList(...)");
        if (!r0.isEmpty()) {
            Object obj = xkVar.h().get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            return (String) obj;
        }
        Intrinsics.checkNotNullExpressionValue(xkVar.e(), "getLargeCoverImageList(...)");
        if (!(!r0.isEmpty())) {
            return "";
        }
        Object obj2 = xkVar.e().get(0);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return (String) obj2;
    }

    public static final String c(xk xkVar) {
        Intrinsics.checkNotNullParameter(xkVar, "<this>");
        Integer j13 = xkVar.j();
        int value = hk0.BUBBLE_DAILY_ROUNDUP.getValue();
        int value2 = hk0.BUBBLE_RANDOM.getValue();
        int intValue = j13.intValue();
        if (value > intValue || intValue > value2) {
            if (j13.intValue() != hk0.TRENDING_TOPIC_CATEGORY.getValue()) {
                if (j13.intValue() != hk0.TRENDING.getValue()) {
                    if (j13.intValue() != hk0.TRENDING_TOPIC_EVERYTHING.getValue()) {
                        if (j13.intValue() == hk0.SEASONAL_UPSELL.getValue()) {
                            return xkVar.l();
                        }
                        return null;
                    }
                }
            }
        }
        return xkVar.n();
    }

    public static final i d(xk xkVar, i iVar) {
        String colorString;
        Intrinsics.checkNotNullParameter(xkVar, "<this>");
        Intrinsics.checkNotNullParameter(iVar, "default");
        Intrinsics.checkNotNullExpressionValue(xkVar.c(), "getDominantColorList(...)");
        if (!(!r0.isEmpty()) || (colorString = (String) xkVar.c().get(0)) == null || z.j(colorString)) {
            return iVar;
        }
        Intrinsics.f(colorString);
        Intrinsics.checkNotNullParameter(colorString, "colorString");
        return new h(colorString);
    }
}
