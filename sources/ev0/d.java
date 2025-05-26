package ev0;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.j8;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lev0/d;", "Lyk1/k;", "Lav0/b;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends a implements av0.b {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f60243r0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public j8 f60244j0;

    /* renamed from: k0, reason: collision with root package name */
    public uk1.e f60245k0;

    /* renamed from: l0, reason: collision with root package name */
    public av0.a f60246l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f60247m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltAvatar f60248n0;

    /* renamed from: o0, reason: collision with root package name */
    public GestaltText f60249o0;

    /* renamed from: p0, reason: collision with root package name */
    public GestaltText f60250p0;

    /* renamed from: q0, reason: collision with root package name */
    public GestaltIconButton f60251q0;

    public d() {
        this.E = aq1.f.idea_pin_brand_management_fragment;
    }

    @Override // yk1.k
    public final yk1.m V7() {
        j8 j8Var = this.f60244j0;
        if (j8Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.CLOSEUP_PIN_ID") : null;
        Navigation navigation2 = this.I;
        String v04 = navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_USER_ID") : null;
        uk1.e eVar = this.f60245k0;
        if (eVar != null) {
            return j8Var.a(v03, v04, ((uk1.a) eVar).g());
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getF111517j0() {
        return d4.IDEA_PIN_PAID_PARTNERSHIP_EDIT;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(aq1.d.brand_management_name);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f60247m0 = (GestaltText) findViewById;
        View findViewById2 = view.findViewById(aq1.d.brand_management_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f60248n0 = (GestaltAvatar) findViewById2;
        View findViewById3 = view.findViewById(aq1.d.brand_management_status);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f60249o0 = (GestaltText) findViewById3;
        View findViewById4 = view.findViewById(aq1.d.brand_management_soft_denail_message);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f60250p0 = (GestaltText) findViewById4;
        View findViewById5 = view.findViewById(aq1.d.action_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById5;
        gestaltIconButton.u(new np0.h(this, 10));
        Intrinsics.checkNotNullExpressionValue(findViewById5, "apply(...)");
        this.f60251q0 = gestaltIconButton;
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        KeyEvent.Callback findViewById = mainView.findViewById(aq1.d.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) ((fo1.a) findViewById);
        gestaltToolbarImpl.Y(aq1.h.idea_pin_paid_partnership_title);
        gestaltToolbarImpl.m();
        return gestaltToolbarImpl;
    }
}
