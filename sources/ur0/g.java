package ur0;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import cp.b0;
import i32.a0;
import i32.b1;
import i32.y0;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import m.h;
import m60.t0;
import net.quikkly.android.ui.CameraPreview;
import rg0.n;
import rg0.p0;
import rg0.y;
import tb0.p;
import vb0.j;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f123074a = z0.g(new Pair(b1.ANDROID_SEARCH_TAB_IN_NAV_BAR, Integer.valueOf(t70.d.menu_search)), new Pair(b1.ANDROID_PROFILE_TAB_IN_NAV_BAR, Integer.valueOf(t70.d.profile_menu_view)), new Pair(b1.ANDROID_CREATE_PIN_TAB_IN_NAV_BAR, Integer.valueOf(t70.d.menu_creation)), new Pair(b1.ANDROID_PROFILE_AVATAR, Integer.valueOf(t0.user_avatar)), new Pair(b1.ANDROID_PROFILE_SETTINGS_ICON, Integer.valueOf(t0.user_profile_actions_right_icon)), new Pair(b1.ANDROID_CREATOR_HUB_BUTTON, Integer.valueOf(t0.profile_creator_hub_button)), new Pair(b1.ANDROID_PIN_IT_BUTTON, Integer.valueOf(ud0.a.save_pinit_bt)), new Pair(b1.ANDROID_PIN_SEND_BUTTON, Integer.valueOf(b62.b.uab_share_button)), new Pair(b1.ANDROID_PIN_CLICKTHROUGH_BUTTON, Integer.valueOf(t0.clickthrough_button)), new Pair(b1.ANDROID_CLOSEUP_OVERFLOW_MENU, Integer.valueOf(t0.overflow_button)), new Pair(b1.ANDROID_STICKER_COMMENT_BUTTON, Integer.valueOf(t0.comment_composer_sticker_button)), new Pair(b1.ANDROID_PIN_REACTION_BUTTON, Integer.valueOf(cz1.c.action_module_react_icon_sab)));

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r1 == i32.l.PRODUCT_HAIRPATTERN_AP_ANDROID_ALL_US_2023_STATIC.value()) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final ur0.e a(java.lang.String r10, rg0.n r11, i32.y0 r12, nl1.d r13, android.view.View r14) {
        /*
            i32.l r0 = i32.l.EU_PERSONALIZED_ADS_PROMPT
            int r0 = r0.value()
            int r1 = r11.f108060b
            r2 = 0
            if (r1 != r0) goto Ld
            goto L79
        Ld:
            i32.a0 r0 = i32.a0.GUIDE
            int r0 = r0.value()
            int r1 = r11.f108061c
            if (r1 == r0) goto L50
            i32.a0 r0 = i32.a0.TOOLTIP
            int r0 = r0.value()
            if (r1 == r0) goto L50
            i32.a0 r0 = i32.a0.ACTION_PROMPT
            int r0 = r0.value()
            if (r1 == r0) goto L50
            i32.a0 r0 = i32.a0.ANNOUNCEMENT_MODAL
            int r0 = r0.value()
            if (r1 == r0) goto L50
            i32.a0 r0 = i32.a0.SURVEY
            int r0 = r0.value()
            if (r1 == r0) goto L50
            i32.a0 r0 = i32.a0.MODAL_WINDOW
            int r0 = r0.value()
            if (r1 == r0) goto L50
            i32.a0 r0 = i32.a0.UPSELL
            int r0 = r0.value()
            if (r1 == r0) goto L50
            i32.a0 r0 = i32.a0.POPOVER
            int r0 = r0.value()
            if (r1 == r0) goto L50
            goto L78
        L50:
            java.lang.String r0 = "exp"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            i32.y0 r0 = r11.f108067i
            if (r0 != 0) goto L5a
            goto L79
        L5a:
            int[] r1 = ur0.d.f123067b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 != r1) goto L79
            i32.l r0 = i32.l.ANDROID_SEARCH_PRODUCT_EDUCATION
            int r0 = r0.value()
            int r1 = r11.f108060b
            if (r1 != r0) goto L70
            goto L78
        L70:
            i32.l r0 = i32.l.PRODUCT_HAIRPATTERN_AP_ANDROID_ALL_US_2023_STATIC
            int r0 = r0.value()
            if (r1 != r0) goto L79
        L78:
            return r2
        L79:
            if (r13 == 0) goto L7e
            ms1.b r0 = r13.H
            goto L7f
        L7e:
            r0 = r2
        L7f:
            if (r0 == 0) goto L92
            r0.inflateEducationContainer()
            m.h r5 = r11.f108071m
            ur0.e r0 = new ur0.e
            r3 = r0
            r4 = r13
            r6 = r11
            r7 = r12
            r8 = r10
            r9 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r0
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ur0.g.a(java.lang.String, rg0.n, i32.y0, nl1.d, android.view.View):ur0.e");
    }

    public static final void b(e runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        new Handler(Looper.getMainLooper()).removeCallbacks(runnable);
    }

    public static final long c(h hVar, boolean z13, n nVar) {
        if (z13) {
            ag2.e eVar = nVar.f108068j;
            Intrinsics.g(eVar, "null cannot be cast to non-null type com.pinterest.experience.SurveyDisplayData");
            return ((p0) eVar).f108079c;
        }
        eg0.b A = hVar.A(0);
        if (A == null) {
            return CameraPreview.AUTOFOCUS_INTERVAL_MILLIS;
        }
        long j13 = A.f58874a;
        if (j13 < 0) {
            return -1L;
        }
        return j13;
    }

    public static final void d(y0 placement, nl1.d fragment, View view) {
        e a13;
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        n c13 = ((dh0.d) y.a()).c(placement);
        if (c13 == null || (a13 = a(null, c13, placement, fragment, view)) == null) {
            return;
        }
        boolean z13 = c13.f108061c == a0.SURVEY.value();
        h hVar = c13.f108071m;
        Intrinsics.f(hVar);
        long c14 = c(hVar, z13, c13);
        if (c14 == -1) {
            Throwable throwable = new Throwable("Experience with id " + c13 + ".experienceId is using `MANUALLY_TRIGGERED_EXPERIENCE_DELAY` but its placement/fragment is calling loadEducation() instead of loadEducationWithRunnable()");
            p productFlow = p.UNSPECIFIED;
            j.f125466a.getClass();
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter(productFlow, "productFlow");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            Intrinsics.checkNotNullParameter("DevUtils:ReportAssertionFailed", "detailedExceptionMessage");
            Intrinsics.checkNotNullParameter(productFlow, "productFlow");
            new AssertionError(throwable.getMessage(), throwable);
        }
        ek2.f i13 = uj2.b.n(c14, TimeUnit.MILLISECONDS, tk2.e.f118016b).l(tk2.e.f118017c).h(wj2.c.a()).i(new b0(a13, 16), new uq0.c(4, f.f123073i));
        Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
        fragment.R6(i13);
    }

    public static final void f(String str, y0 placement, PinCloseupFragment pinCloseupFragment) {
        e r13;
        Intrinsics.checkNotNullParameter(placement, "placement");
        n c13 = ((dh0.d) y.a()).c(placement);
        if (c13 == null || (r13 = a(str, c13, placement, pinCloseupFragment, null)) == null) {
            return;
        }
        boolean z13 = c13.f108061c == a0.SURVEY.value();
        h educationNew = c13.f108071m;
        Intrinsics.checkNotNullExpressionValue(educationNew, "educationNew");
        long c14 = c(educationNew, z13, c13);
        if (c14 != -1) {
            Intrinsics.checkNotNullParameter(r13, "r");
            new Handler(Looper.getMainLooper()).postDelayed(r13, c14);
        }
    }

    public static final e g(y0 placement, nl1.d dVar, View view) {
        e r13;
        Intrinsics.checkNotNullParameter(placement, "placement");
        n c13 = ((dh0.d) y.a()).c(placement);
        if (c13 == null || (r13 = a(null, c13, placement, dVar, view)) == null) {
            return null;
        }
        boolean z13 = c13.f108061c == a0.SURVEY.value();
        h educationNew = c13.f108071m;
        Intrinsics.checkNotNullExpressionValue(educationNew, "educationNew");
        long c14 = c(educationNew, z13, c13);
        if (c14 != -1) {
            Intrinsics.checkNotNullParameter(r13, "r");
            new Handler(Looper.getMainLooper()).postDelayed(r13, c14);
        }
        return r13;
    }
}
