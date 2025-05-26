package ads_mobile_sdk;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class th1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11553a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f11554b;

    public th1(Context context, oh0 flags) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f11553a = context;
        this.f11554b = flags;
    }

    public static nm.u b(View view) {
        if (view == null) {
            return new nm.u();
        }
        nm.u uVar = new nm.u();
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof ScrollView)) {
            parent = parent.getParent();
        }
        uVar.t("contained_in_scroll_view", Boolean.valueOf(parent != null));
        return uVar;
    }

    public final nm.u a(View view) {
        Window window;
        if (view == null) {
            return new nm.u();
        }
        nm.u uVar = new nm.u();
        Intrinsics.checkNotNullParameter(view, "<this>");
        View rootView = view.getRootView();
        Context context = rootView != null ? rootView.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        WindowManager.LayoutParams attributes = (activity == null || (window = activity.getWindow()) == null) ? null : window.getAttributes();
        uVar.t("can_show_on_lock_screen", Boolean.valueOf((attributes == null || (attributes.flags & 524288) == 0) ? false : true));
        KeyguardManager keyguardManager = (KeyguardManager) this.f11553a.getSystemService(KeyguardManager.class);
        uVar.t("is_keyguard_locked", keyguardManager != null ? Boolean.valueOf(keyguardManager.isKeyguardLocked()) : null);
        return uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0132, code lost:
    
        if (r0 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final nm.u c(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.th1.c(android.view.View):nm.u");
    }

    public final nm.u a(View view, ImageView.ScaleType mediaViewScaleType, Map assetViews) {
        Intrinsics.checkNotNullParameter(assetViews, "assetViews");
        Intrinsics.checkNotNullParameter(mediaViewScaleType, "mediaViewScaleType");
        if (view == null) {
            return new nm.u();
        }
        nm.u uVar = new nm.u();
        int i13 = 2;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Iterator it = assetViews.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            if (view2 != null) {
                int[] iArr2 = new int[i13];
                view2.getLocationOnScreen(iArr2);
                nm.u uVar2 = new nm.u();
                nm.u uVar3 = new nm.u();
                uVar3.s(Integer.valueOf(kh2.j1.P(this.f11553a, view2.getMeasuredWidth())), "width");
                uVar3.s(Integer.valueOf(kh2.j1.P(this.f11553a, view2.getMeasuredHeight())), "height");
                uVar3.s(Integer.valueOf(kh2.j1.P(this.f11553a, iArr2[0] - iArr[0])), "x");
                uVar3.s(Integer.valueOf(kh2.j1.P(this.f11553a, iArr2[1] - iArr[1])), "y");
                uVar3.u("relative_to", "ad_view");
                Iterator it2 = it;
                uVar2.r("frame", uVar3);
                nm.u uVar4 = new nm.u();
                Rect rect = new Rect();
                if (view2.getLocalVisibleRect(rect)) {
                    uVar4 = a(this.f11553a, rect);
                } else {
                    uVar4.s(0, "width");
                    uVar4.s(0, "height");
                    uVar4.s(Integer.valueOf(kh2.j1.P(this.f11553a, iArr2[0] - iArr[0])), "x");
                    uVar4.s(Integer.valueOf(kh2.j1.P(this.f11553a, iArr2[1] - iArr[1])), "y");
                    uVar4.u("relative_to", "ad_view");
                }
                uVar2.r("visible_bounds", uVar4);
                if (Intrinsics.d(str, "3010")) {
                    uVar2.u("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                    if (this.f11554b.T()) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        uVar2.s(Integer.valueOf(a(layoutParams.width).ordinal()), "view_width_layout_type");
                        uVar2.s(Integer.valueOf(a(layoutParams.height).ordinal()), "view_height_layout_type");
                    }
                    if (((Boolean) this.f11554b.a("gads:nas_collect_view_path:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(view2.getId()));
                        for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                            arrayList.add(Integer.valueOf(((View) parent).getId()));
                        }
                        uVar2.u("view_path", CollectionsKt.Z(arrayList, "/", null, null, 0, null, null, 62));
                    }
                    uVar2.s(Integer.valueOf(mediaViewScaleType.ordinal()), "mediaview_scale_type");
                }
                if (view2 instanceof TextView) {
                    TextView textView = (TextView) view2;
                    uVar2.s(Integer.valueOf(textView.getCurrentTextColor()), "text_color");
                    uVar2.s(Float.valueOf(textView.getTextSize()), "font_size");
                    uVar2.u("text", textView.getText().toString());
                }
                uVar2.t("is_clickable", Boolean.valueOf(view2.isClickable()));
                uVar.r(str, uVar2);
                it = it2;
                i13 = 2;
            }
        }
        return uVar;
    }

    public final nm.u a(String str, Point startingPoint, Point currentPoint) {
        Intrinsics.checkNotNullParameter(startingPoint, "startingPoint");
        Intrinsics.checkNotNullParameter(currentPoint, "currentPoint");
        nm.u uVar = new nm.u();
        uVar.s(Integer.valueOf(kh2.j1.P(this.f11553a, currentPoint.x)), "x");
        uVar.s(Integer.valueOf(kh2.j1.P(this.f11553a, currentPoint.y)), "y");
        uVar.s(Integer.valueOf(kh2.j1.P(this.f11553a, startingPoint.x)), "start_x");
        uVar.s(Integer.valueOf(kh2.j1.P(this.f11553a, startingPoint.y)), "start_y");
        nm.u uVar2 = new nm.u();
        uVar2.r("click_point", uVar);
        uVar2.u("asset_id", str);
        return uVar2;
    }

    public static sh1 a(int i13) {
        if (i13 == -2) {
            return sh1.f11109c;
        }
        if (i13 != -1) {
            return sh1.f11107a;
        }
        return sh1.f11108b;
    }

    public final nm.u a() {
        nm.u uVar = new nm.u();
        Context context = this.f11553a;
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        int i13 = displayMetrics.widthPixels;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        uVar.s(Integer.valueOf(ml2.c.c(i13 / displayMetrics2.density)), "width");
        Context context2 = this.f11553a;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        DisplayMetrics displayMetrics3 = context2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        int i14 = displayMetrics3.heightPixels;
        Intrinsics.checkNotNullParameter(context2, "<this>");
        Intrinsics.checkNotNullParameter(context2, "<this>");
        DisplayMetrics displayMetrics4 = context2.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "getDisplayMetrics(...)");
        uVar.s(Integer.valueOf(ml2.c.c(i14 / displayMetrics4.density)), "height");
        return uVar;
    }

    public static nm.u a(Context context, Rect rect) {
        nm.u uVar = new nm.u();
        int i13 = rect.right - rect.left;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "getDisplayMetrics(...)");
        uVar.s(Integer.valueOf(ml2.c.c(i13 / displayMetrics.density)), "width");
        int i14 = rect.bottom - rect.top;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics2, "getDisplayMetrics(...)");
        uVar.s(Integer.valueOf(ml2.c.c(i14 / displayMetrics2.density)), "height");
        int i15 = rect.left;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics3, "getDisplayMetrics(...)");
        uVar.s(Integer.valueOf(ml2.c.c(i15 / displayMetrics3.density)), "x");
        int i16 = rect.top;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics4, "getDisplayMetrics(...)");
        uVar.s(Integer.valueOf(ml2.c.c(i16 / displayMetrics4.density)), "y");
        uVar.u("relative_to", "self");
        return uVar;
    }
}
