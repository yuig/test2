package kz0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.p;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.cb0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gb0;
import com.pinterest.feature.pear.ui.animatedpins.AnimatedPinVerticalCarouselView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import df.j1;
import e82.h0;
import fd1.o0;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc0.v;
import kh2.b0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import m60.w;
import nx.d0;
import pk.a0;
import xo.s;

/* loaded from: classes5.dex */
public final class f extends s {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f81154g = 0;

    /* renamed from: d, reason: collision with root package name */
    public h0 f81155d;

    /* renamed from: e, reason: collision with root package name */
    public String f81156e;

    /* renamed from: f, reason: collision with root package name */
    public List f81157f;

    public static void j(GestaltText gestaltText, String str) {
        a0.p(gestaltText, str == null ? "" : str);
        if (str == null || str.length() == 0) {
            bs1.c.X0(gestaltText);
        }
    }

    public final void i(final cb0 cb0Var, final String quizId, final e01.a shareUtil, final d0 pinalytics, iz0.k onBackPressed) {
        final gb0 v13;
        String str;
        Intrinsics.checkNotNullParameter(quizId, "quizId");
        Intrinsics.checkNotNullParameter(shareUtil, "shareUtil");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        if (cb0Var == null || (v13 = cb0Var.v()) == null) {
            return;
        }
        View findViewById = findViewById(iy1.d.quiz_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        String t13 = v13.t();
        if (t13 == null) {
            t13 = "";
        }
        a0.p(gestaltText, t13);
        View findViewById2 = findViewById(iy1.d.quiz_result_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        j((GestaltText) findViewById2, v13.y());
        View findViewById3 = findViewById(iy1.d.quiz_result_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        j((GestaltText) findViewById3, v13.x());
        View findViewById4 = findViewById(iy1.d.quiz_result_description);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        j((GestaltText) findViewById4, v13.r());
        ((GestaltIconButton) findViewById(iy1.d.quiz_back_button)).u(new hz0.b(pinalytics, onBackPressed, 1));
        int intValue = v13.s().intValue();
        List list = this.f81157f;
        String str2 = null;
        int i13 = 0;
        if (intValue == 1) {
            ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(iy1.d.quiz_result_header_container);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                constraintLayout.removeView((AnimatedPinVerticalCarouselView) it.next());
            }
            removeView(findViewById(iy1.d.cover_pin_carousels_flow));
            p pVar = new p();
            pVar.j(constraintLayout);
            pVar.l(iy1.d.quiz_result_subtitle, 3, iy1.d.quiz_result_cover, 4);
            pVar.b(constraintLayout);
            WebImageView webImageView = (WebImageView) findViewById(iy1.d.quiz_result_cover);
            webImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            List p13 = v13.p();
            Context context = webImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!a0.q0(context)) {
                p13 = null;
            }
            if (p13 == null || (str = (String) CollectionsKt.firstOrNull(p13)) == null) {
                List o13 = v13.o();
                if (o13 != null) {
                    str2 = (String) CollectionsKt.firstOrNull(o13);
                }
            } else {
                str2 = str;
            }
            webImageView.loadUrl(str2);
            webImageView.Y(new d(this, webImageView, shareUtil, 0));
        } else if (intValue == 2) {
            bs1.c.X0(findViewById(iy1.d.quiz_result_cover));
            List q13 = v13.q();
            List list2 = q13;
            if (list2 != null && !list2.isEmpty()) {
                int size = list.size();
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList.add(new ArrayList());
                }
                int i15 = 0;
                for (Object obj : q13) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        f0.p();
                        throw null;
                    }
                    ((List) arrayList.get(i15 % size)).add((f30) obj);
                    i15 = i16;
                }
                for (Object obj2 : list) {
                    int i17 = i13 + 1;
                    if (i13 < 0) {
                        f0.p();
                        throw null;
                    }
                    AnimatedPinVerticalCarouselView animatedPinVerticalCarouselView = (AnimatedPinVerticalCarouselView) obj2;
                    bs1.c.U1(animatedPinVerticalCarouselView);
                    animatedPinVerticalCarouselView.a((List) arrayList.get(i13));
                    animatedPinVerticalCarouselView.c();
                    i13 = i17;
                }
                bs1.c.U1(findViewById(iy1.d.cover_pin_overlay_bottom));
                bs1.c.U1(findViewById(iy1.d.cover_pin_overlay_top));
                ((GestaltText) findViewById(iy1.d.quiz_title)).i(e.f81151j);
                ((GestaltIconButton) findViewById(iy1.d.quiz_back_button)).t(e.f81152k);
            }
        }
        GestaltButton e13 = ((GestaltButton) findViewById(iy1.d.quiz_result_share_button)).e(new gm1.a() { // from class: kz0.c
            @Override // gm1.a
            public final void h3(gm1.c it2) {
                d0 pinalytics2 = d0.this;
                Intrinsics.checkNotNullParameter(pinalytics2, "$pinalytics");
                gb0 header = v13;
                Intrinsics.checkNotNullParameter(header, "$header");
                f this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String quizId2 = quizId;
                Intrinsics.checkNotNullParameter(quizId2, "$quizId");
                e01.a shareUtil2 = shareUtil;
                Intrinsics.checkNotNullParameter(shareUtil2, "$shareUtil");
                Intrinsics.checkNotNullParameter(it2, "it");
                c0.d.u2(pinalytics2, null, null, u0.PEAR_SHARE_BUTTON, null, 11);
                if (header.w().intValue() == 1) {
                    cb0 cb0Var2 = cb0Var;
                    if (j1.U0(cb0Var2.w())) {
                        this$0.k(new SendableObject(a.a.D(quizId2, "|", cb0Var2.w()), 13));
                        return;
                    }
                }
                if (header.w().intValue() == 2) {
                    this$0.k(new SendableObject(quizId2, 12));
                    return;
                }
                if (this$0.f81156e == null) {
                    String str3 = null;
                    Bitmap Q1 = b0.Q1(this$0, null, 0, 3);
                    if (Q1 != null) {
                        Context context2 = this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        shareUtil2.getClass();
                        str3 = e01.a.a(context2, Q1);
                    }
                    this$0.f81156e = str3;
                }
                String str4 = this$0.f81156e;
                if (str4 != null) {
                    Context context3 = this$0.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    shareUtil2.d(context3, str4);
                }
            }
        });
        if (j1.U0(v13.v())) {
            e13.d(new dx0.d(v13, 18));
        }
        if (j1.U0(v13.u())) {
            View findViewById5 = findViewById(iy1.d.quiz_result_share_subtitle);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            GestaltText gestaltText2 = (GestaltText) findViewById5;
            String u13 = v13.u();
            a0.p(gestaltText2, u13 != null ? u13 : "");
        }
        c0.d.u2(pinalytics, f1.VIEW, g0.PEAR_QUIZ_RESULTS_HERO_SECTION, null, null, 12);
    }

    public final void k(SendableObject sendableObject) {
        w wVar = u.f85943a;
        int value = y32.f.PEAR_QUIZ_RESULTS_PAGE.getValue();
        p32.c cVar = p32.c.MESSAGE;
        h0 h0Var = this.f81155d;
        if (h0Var != null) {
            wVar.d(new v(new o0(sendableObject, value, cVar, false, false, null, false, null, false, null, false, null, h0Var, 7928), false, 0L, 30));
        } else {
            Intrinsics.r("socialUtils");
            throw null;
        }
    }
}
