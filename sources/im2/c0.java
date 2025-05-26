package im2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ym2.c f72699a;

    /* renamed from: b, reason: collision with root package name */
    public static final ym2.b f72700b;

    static {
        ym2.c cVar = new ym2.c("kotlin.jvm.JvmField");
        f72699a = cVar;
        Intrinsics.checkNotNullExpressionValue(ym2.b.j(cVar), "topLevel(...)");
        Intrinsics.checkNotNullExpressionValue(ym2.b.j(new ym2.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl")), "topLevel(...)");
        ym2.b e13 = ym2.b.e("kotlin/jvm/internal/RepeatableContainer", false);
        Intrinsics.checkNotNullExpressionValue(e13, "fromString(...)");
        f72700b = e13;
    }

    public static final String a(String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (c(propertyName)) {
            return propertyName;
        }
        return "get" + lb.l0.E(propertyName);
    }

    public static final String b(String propertyName) {
        String E;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        StringBuilder sb3 = new StringBuilder("set");
        if (c(propertyName)) {
            E = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(E, "substring(...)");
        } else {
            E = lb.l0.E(propertyName);
        }
        sb3.append(E);
        return sb3.toString();
    }

    public static final boolean c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!kotlin.text.z.p(name, "is", false) || name.length() == 2) {
            return false;
        }
        char charAt = name.charAt(2);
        return Intrinsics.i(97, charAt) > 0 || Intrinsics.i(charAt, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN) > 0;
    }
}
