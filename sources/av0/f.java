package av0;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d2;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface f {
    static void a2(f fVar, ScreenLocation location, u0 u0Var, String str, ml1.b transition, int i13) {
        Boolean bool = Boolean.FALSE;
        if ((i13 & 8) != 0) {
            str = null;
        }
        if ((i13 & 16) != 0) {
            transition = ml1.b.DEFAULT_TRANSITION;
        }
        dv0.k kVar = (dv0.k) fVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(transition, "transition");
        ev0.l lVar = (ev0.l) ((d) kVar.getView());
        lVar.getClass();
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(transition, "transition");
        if (u0Var != null) {
            HashMap hashMap = new HashMap();
            if (str != null) {
                hashMap.put("story_pin_creation_id", str);
            }
            ev0.l.W8(lVar, u0Var, hashMap);
        }
        NavigationImpl L = Navigation.L(location, "", transition.getValue());
        if (Intrinsics.d(location, d2.a())) {
            L.Y1("com.pinterest.EXTRA_IS_STORY_PIN", true);
        }
        if (Intrinsics.d(location, d2.p())) {
            L.Y1("com.pinterest.EXTRA_IDEA_PIN_METADATA_IS_FROM_FINISHING_TOUCHES", true);
        }
        Navigation navigation = lVar.I;
        L.Y1("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", navigation != null ? navigation.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false);
        Navigation navigation2 = lVar.I;
        String v03 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null;
        if (v03 != null) {
            L.m0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE", v03);
        }
        Navigation navigation3 = lVar.I;
        Boolean valueOf = navigation3 != null ? Boolean.valueOf(navigation3.S("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", false)) : null;
        if (valueOf != null) {
            L.Y1("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", valueOf.booleanValue());
        }
        Navigation navigation4 = lVar.I;
        L.z(navigation4 != null ? navigation4.J1("com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS") : 0, "com.pinterest.EXTRA_PIN_SCHEDULED_TIME_SECONDS");
        L.Y1("com.pinterest.EXTRA_IDEA_PIN_BASICS_TEMPLATE_TYPE_SET", bool.booleanValue());
        lVar.M1(L);
    }
}
