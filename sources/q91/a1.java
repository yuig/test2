package q91;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import lh0.q3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq91/a1;", "Lnl1/d;", "<init>", "()V", "personalInformation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a1 extends e0 {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f103055j0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public GestaltText f103056c0;

    /* renamed from: d0, reason: collision with root package name */
    public ConstraintLayout f103057d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltText f103058e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltText f103059f0;

    /* renamed from: g0, reason: collision with root package name */
    public q3 f103060g0;

    /* renamed from: h0, reason: collision with root package name */
    public final d4 f103061h0 = d4.SETTINGS;

    /* renamed from: i0, reason: collision with root package name */
    public final z0 f103062i0 = new z0(this);

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        Drawable e03 = bs1.c.e0(this, qVar.drawableRes(requireContext, dl2.b.f1(requireContext2)), Integer.valueOf(eo1.b.color_themed_text_default), Integer.valueOf(eo1.c.space_600));
        String string = getString(m60.x0.back);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.T(e03, string);
        gestaltToolbarImpl.b0(getString(c52.e.settings_personal_information_language));
        gestaltToolbarImpl.E();
        gestaltToolbarImpl.m();
        gestaltToolbarImpl.U(new x0(this, 0));
    }

    public final void Y7(String str) {
        List<String> split$default;
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        j0Var.f80434a = "";
        if (!Intrinsics.d(str, "")) {
            split$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
            for (String str2 : split$default) {
                j0Var.f80434a = j0Var.f80434a + bd1.e.b().get(str2) + "\n";
            }
        }
        if (((CharSequence) j0Var.f80434a).length() > 0) {
            GestaltText gestaltText = this.f103059f0;
            if (gestaltText != null) {
                gestaltText.i(new androidx.compose.foundation.lazy.layout.z0(13, j0Var));
                return;
            } else {
                Intrinsics.r("additionalLanguageSelected");
                throw null;
            }
        }
        GestaltText gestaltText2 = this.f103059f0;
        if (gestaltText2 == null) {
            Intrinsics.r("additionalLanguageSelected");
            throw null;
        }
        gestaltText2.i(b.f103075v);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF81080e1() {
        return this.f103061h0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = h52.b.fragment_language_settings;
        f7().h(this.f103062i0);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(h52.a.language_selected);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f103058e0 = (GestaltText) findViewById;
        View findViewById2 = v13.findViewById(h52.a.additional_language_selected);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f103059f0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(h52.a.btn_select_language);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById3;
        if (constraintLayout == null) {
            Intrinsics.r("btnSelectDefaultLangugage");
            throw null;
        }
        constraintLayout.setOnClickListener(new x0(this, 1));
        View findViewById4 = v13.findViewById(h52.a.title_additional_language);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f103056c0 = (GestaltText) findViewById4;
        View findViewById5 = v13.findViewById(h52.a.btn_additional_language);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f103057d0 = (ConstraintLayout) findViewById5;
        q3 q3Var = this.f103060g0;
        if (q3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        if (q3Var.a()) {
            GestaltText gestaltText = this.f103056c0;
            if (gestaltText == null) {
                Intrinsics.r("titleAdditionalLanguage");
                throw null;
            }
            pk.a0.w1(gestaltText);
            ConstraintLayout constraintLayout2 = this.f103057d0;
            if (constraintLayout2 == null) {
                Intrinsics.r("btnAdditionalLanguage");
                throw null;
            }
            constraintLayout2.setVisibility(0);
        }
        ConstraintLayout constraintLayout3 = this.f103057d0;
        if (constraintLayout3 == null) {
            Intrinsics.r("btnAdditionalLanguage");
            throw null;
        }
        constraintLayout3.setOnClickListener(new x0(this, 2));
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        if (f13 != null) {
            String str = (String) bd1.e.b().get(f13.R3());
            GestaltText gestaltText2 = this.f103058e0;
            if (gestaltText2 == null) {
                Intrinsics.r("languageSelected");
                throw null;
            }
            if (str == null) {
                str = "";
            }
            pk.a0.p(gestaltText2, str);
            String h23 = f13.h2();
            if (h23 != null) {
                Y7(h23);
            }
        }
    }
}
