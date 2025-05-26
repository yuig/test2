package hc1;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.settings.notifications.y0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lhc1/i;", "Lyk1/k;", "Lgc1/a;", "<init>", "()V", "g4/u", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i extends b implements gc1.a {

    /* renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f68719q0 = 0;

    /* renamed from: j0, reason: collision with root package name */
    public uk1.e f68720j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f68721k0;

    /* renamed from: l0, reason: collision with root package name */
    public jc1.a f68722l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltTextField f68723m0;

    /* renamed from: n0, reason: collision with root package name */
    public GestaltButton f68724n0;

    /* renamed from: o0, reason: collision with root package name */
    public final d4 f68725o0 = d4.EDIT_ABOUT_PAGE;

    /* renamed from: p0, reason: collision with root package name */
    public final a4 f68726p0 = a4.USER_SELF;

    @Override // yk1.k, nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.f68721k0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Window window = E4.getWindow();
            if (window != null) {
                window.setSoftInputMode(this.f68721k0);
            }
            hf0.b.l(E4);
        }
        super.L7();
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        GestaltButton e13 = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null).d(h.f68716j).e(new g(this, 0));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.c(e13);
        this.f68724n0 = e13;
        gestaltToolbarImpl.b0(getResources().getString(c52.e.about));
        gestaltToolbarImpl.m();
    }

    @Override // yk1.k
    public final yk1.m V7() {
        q p73 = p7();
        uk1.e eVar = this.f68720j0;
        if (eVar != null) {
            return new jc1.a(((uk1.a) eVar).g(), p73);
        }
        Intrinsics.r("presenterPinalyticsFactory");
        throw null;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF123141o0() {
        return this.f68726p0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF123140n0() {
        return this.f68725o0;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = j52.b.fragment_profile_edit_about;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(j52.a.profile_about_editable_text);
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById;
        gestaltTextField.X(new y0(this, 26));
        gestaltTextField.Z(new g(this, 1));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f68723m0 = gestaltTextField;
    }
}
