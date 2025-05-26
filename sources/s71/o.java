package s71;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.PinchToZoomTransitionContext;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.d5;
import h32.f1;
import h32.u0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import m60.w;
import nx.d0;
import r72.j1;

/* loaded from: classes5.dex */
public final class o {
    public static int a(float f13, float f14, int i13) {
        float[] fArr = new float[3];
        f5.c.f(i13, fArr);
        fArr[1] = ql2.s.f(fArr[1] * f13, 0.15f, 1.0f);
        fArr[2] = ql2.s.c(fArr[2] * f14, 1.0f);
        return f5.c.a(fArr);
    }

    public static int b(int i13, int i14, float f13, Float f14) {
        int c13 = f5.c.c(i14, f13, i13);
        return f14 != null ? f5.c.j(c13, (int) (f14.floatValue() * 255.0f)) : c13;
    }

    public static r72.a c(vd0.c cVar) {
        Float f13;
        Float f14;
        Float f15;
        Float f16;
        vd0.a k13 = cVar.k("mask_bounds");
        Intrinsics.checkNotNullExpressionValue(k13, "optJsonArray(...)");
        vd0.a i13 = k13.i(0);
        vd0.a i14 = k13.i(1);
        ArrayList arrayList = new ArrayList();
        if (i13 != null) {
            Float e13 = i13.e(0);
            Intrinsics.checkNotNullExpressionValue(e13, "optFloat(...)");
            arrayList.add(e13);
            Float e14 = i13.e(1);
            Intrinsics.checkNotNullExpressionValue(e14, "optFloat(...)");
            arrayList.add(e14);
        }
        if (i14 != null) {
            Float e15 = i14.e(0);
            Intrinsics.checkNotNullExpressionValue(e15, "optFloat(...)");
            arrayList.add(e15);
            Float e16 = i14.e(1);
            Intrinsics.checkNotNullExpressionValue(e16, "optFloat(...)");
            arrayList.add(e16);
        }
        if (arrayList.size() != 4) {
            arrayList = null;
        }
        String value = cVar.o("mask_image", "");
        Intrinsics.checkNotNullExpressionValue(value, "optString(...)");
        float f17 = 0.0f;
        float floatValue = (arrayList == null || (f16 = (Float) CollectionsKt.U(0, arrayList)) == null) ? 0.0f : f16.floatValue();
        float floatValue2 = (arrayList == null || (f15 = (Float) CollectionsKt.U(1, arrayList)) == null) ? 0.0f : f15.floatValue();
        float floatValue3 = (arrayList == null || (f14 = (Float) CollectionsKt.U(2, arrayList)) == null) ? 0.0f : f14.floatValue();
        if (arrayList != null && (f13 = (Float) CollectionsKt.U(3, arrayList)) != null) {
            f17 = f13.floatValue();
        }
        j1 j1Var = new j1(floatValue, floatValue2, floatValue3, f17);
        Intrinsics.checkNotNullParameter(value, "value");
        return new r72.a(j1Var, value);
    }

    public static HashMap d(String str, String str2, String str3, boolean z13, String str4, boolean z14, String str5, Integer num, Integer num2) {
        HashMap hashMap;
        if (str3 == null || str3.length() == 0) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap();
            nm.u uVar = new nm.u();
            uVar.u("entrypoint", str3);
            String sVar = uVar.toString();
            Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
            hashMap.put("commerce_data", sVar);
        }
        if (str != null) {
            hashMap.put("pin_id", str);
        }
        if (str2 != null) {
            hashMap.put("image_signature", str2);
        }
        hashMap.put("visual_objects", str4);
        nm.u uVar2 = new nm.u();
        uVar2.u("pin_is_stela", String.valueOf(z13));
        String sVar2 = uVar2.toString();
        Intrinsics.checkNotNullExpressionValue(sVar2, "toString(...)");
        hashMap.put("commerce_data", sVar2);
        if (z14) {
            hashMap.put("is_third_party_ad", "true");
            nm.u uVar3 = new nm.u();
            if (str5 == null) {
                str5 = "";
            }
            uVar3.u("category_name", str5);
            uVar3.s(Integer.valueOf(num != null ? num.intValue() : -1), "category_total");
            uVar3.s(Integer.valueOf(num2 != null ? num2.intValue() : -1), "category_index");
            String sVar3 = uVar3.toString();
            Intrinsics.checkNotNullExpressionValue(sVar3, "toString(...)");
            hashMap.put("3p_additional_data", sVar3);
        }
        return hashMap;
    }

    public static String[] e(String cropBoxDimensionsString) {
        List split$default;
        Intrinsics.checkNotNullParameter(cropBoxDimensionsString, "cropBoxDimensionsString");
        split$default = StringsKt__StringsKt.split$default(new Regex("[{}]").replace(cropBoxDimensionsString, ""), new String[]{","}, false, 0, 6, null);
        return (String[]) split$default.toArray(new String[0]);
    }

    public static String f(double d2, double d13, double d14, double d15) {
        return "[{\"x\":" + d2 + ",\"y\":" + d13 + ",\"w\":" + d14 + ",\"h\":" + d15 + "}]";
    }

    public static void g(d0 d0Var, String str, String str2, String str3, boolean z13, boolean z14, double d2, double d13, double d14, double d15) {
        if (d0Var != null) {
            d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.RENDER, (r18 & 2) != 0 ? null : z14 ? u0.PIN_IMAGE_TAG : u0.SPOTLIGHT_DOT, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : d(str, str2, str3, z13, f(d2, d13, d14, d15), false, null, null, null), (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    public static void h(f30 pin, int i13, List list, int i14, boolean z13, String requestParams, boolean z14) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        w wVar = m60.u.f85943a;
        new uy.i().i();
        NavigationImpl w13 = Navigation.w1((ScreenLocation) d5.f50670a.getValue());
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        w13.y0(new PinchToZoomTransitionContext(uid, pin.z4(), 1.0f, 0, i13, i13, false, null, null, true, false, false, false, false, z14, 15744), "com.pinterest.PINCH_TO_ZOOM_TRANSITION");
        if (list != null && z13) {
            w13.y0(list, "com.pinterest.EXTRA_VISUAL_OBJECT_DATA");
        }
        if (z14) {
            w13.z(i14, "com.pinterest.EXTRA_FLASHLIGHT_DOT_INDEX");
        } else {
            w13.z(0, "com.pinterest.EXTRA_FLASHLIGHT_DOT_INDEX");
        }
        if (requestParams.length() > 0) {
            w13.m0("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", requestParams);
        }
        wVar.d(w13);
    }

    public static float j(float f13) {
        return (Float.isInfinite(f13) || Float.isNaN(f13) || Float.isNaN(f13)) ? f13 : new BigDecimal(String.valueOf(f13)).setScale(2, RoundingMode.HALF_UP).floatValue();
    }

    public static void k(GestaltIconButton button, float f13, Resources resources) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (button.getVisibility() == 0) {
            button.post(new po.c(button, f13, resources));
        }
    }

    public static void l(int i13, int i14, RectF bounds, m handleBounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(handleBounds, "handleBounds");
        float f13 = bounds.left;
        float f14 = bounds.top;
        float f15 = bounds.right;
        float f16 = bounds.bottom;
        Rect rect = handleBounds.f111395a;
        float f17 = i13;
        int i15 = (int) (f13 - f17);
        rect.left = i15;
        int i16 = (int) (f14 - f17);
        rect.top = i16;
        float f18 = i14;
        int i17 = (int) (f13 + f18);
        rect.right = i17;
        int i18 = (int) (f14 + f18);
        rect.bottom = i18;
        int i19 = (int) (f15 - f18);
        Rect rect2 = handleBounds.f111396b;
        rect2.left = i19;
        rect2.top = i16;
        int i23 = (int) (f15 + f17);
        rect2.right = i23;
        rect2.bottom = i18;
        Rect rect3 = handleBounds.f111397c;
        rect3.left = i15;
        int i24 = (int) (f16 - f18);
        rect3.top = i24;
        rect3.right = i17;
        int i25 = (int) (f16 + f17);
        rect3.bottom = i25;
        Rect rect4 = handleBounds.f111398d;
        rect4.left = i19;
        rect4.top = i24;
        rect4.right = i23;
        rect4.bottom = i25;
    }
}
