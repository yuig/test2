package mv0;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import kh2.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.o8;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lmv0/k;", "Lyk1/k;", "Ljv0/e;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends c implements jv0.e {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f88371r0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public jv0.c f88372j0;

    /* renamed from: k0, reason: collision with root package name */
    public GestaltSearchField f88373k0;

    /* renamed from: l0, reason: collision with root package name */
    public FrameLayout f88374l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f88375m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltSpinner f88376n0;

    /* renamed from: o0, reason: collision with root package name */
    public uk1.e f88377o0;

    /* renamed from: p0, reason: collision with root package name */
    public o8 f88378p0;

    /* renamed from: q0, reason: collision with root package name */
    public final d4 f88379q0;

    public k() {
        this.E = aq1.f.fragment_affiliate_link_tagging;
        this.f88379q0 = d4.CLOSEUP_SCENE_SHOP;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        o8 o8Var = this.f88378p0;
        if (o8Var == null) {
            Intrinsics.r("storyPinProductAffiliatePresenterFactory");
            throw null;
        }
        uk1.e eVar = this.f88377o0;
        if (eVar != null) {
            return o8Var.a(((uk1.a) eVar).g(), p7());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    public final void b8(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        GestaltSpinner gestaltSpinner = this.f88376n0;
        if (gestaltSpinner == null) {
            Intrinsics.r("gestaltSpinner");
            throw null;
        }
        s0.w(gestaltSpinner, g.f88350m);
        GestaltSearchField gestaltSearchField = this.f88373k0;
        if (gestaltSearchField != null) {
            c0.d.j(gestaltSearchField, new zu0.c(error, 4));
        } else {
            Intrinsics.r("productLinkView");
            throw null;
        }
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG1() {
        return this.f88379q0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        GestaltSearchField gestaltSearchField = this.f88373k0;
        if (gestaltSearchField == null) {
            Intrinsics.r("productLinkView");
            throw null;
        }
        hf0.b.k(gestaltSearchField);
        super.onPause();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(aq1.d.title_details);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = v13.findViewById(aq1.d.title_details_background);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f88374l0 = (FrameLayout) findViewById2;
        View findViewById3 = v13.findViewById(aq1.d.subheader_edittext);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f88375m0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(aq1.d.loading_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f88376n0 = (GestaltSpinner) findViewById4;
        View findViewById5 = v13.findViewById(aq1.d.url_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltSearchField gestaltSearchField = (GestaltSearchField) findViewById5;
        this.f88373k0 = gestaltSearchField;
        if (gestaltSearchField != null) {
            gestaltSearchField.g0(new np0.h(this, 14));
        } else {
            Intrinsics.r("productLinkView");
            throw null;
        }
    }
}
