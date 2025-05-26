package q91;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.base.LockableBottomSheetBehavior;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.z3;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import java.util.ArrayList;
import kh2.c3;
import kh2.u2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.m3;
import x02.x2;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lq91/u;", "Lyq0/b0;", "", "Ll91/i;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class u extends y<Object> implements l91.i {
    public static final /* synthetic */ int K0 = 0;
    public uk1.e A0;
    public lb2.n B0;
    public k22.m C0;
    public m3 D0;
    public GestaltButton E0;
    public l91.h F0;
    public View G0;
    public Function1 H0 = b.f103067n;
    public final q01.o I0 = new q01.o(this, 0);
    public final d4 J0 = d4.SETTINGS;

    /* renamed from: z0, reason: collision with root package name */
    public i92.k f103174z0;

    @Override // yq0.t, yk1.k, nl1.d
    public final void K7() {
        super.K7();
        View view = this.G0;
        if (view != null) {
            bs1.c.M1(view);
        } else {
            Intrinsics.r("settingsMenuContainer");
            throw null;
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "passcode_screen_code")) {
            boolean z13 = result.getBoolean("is_passcode_verified");
            String string = result.getString("passcode_verified");
            if (!z13 || string == null) {
                return;
            }
            this.H0.invoke(string);
        }
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(9, new s(requireContext, this, 0));
        adapter.G(22, new s(requireContext, this, 1));
    }

    @Override // nl1.d
    public final void S6(yf0.h insetMode, View fragmentRootView) {
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        Intrinsics.checkNotNullParameter(fragmentRootView, "fragmentRootView");
        RelativeLayout relativeLayout = (RelativeLayout) fragmentRootView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            c3.n(relativeLayout, false);
        }
        RecyclerView g83 = g8();
        if (g83 != null) {
            u2.z(g83);
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        int i13;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        int i14 = r.f103168a[getL0().ordinal()];
        if (i14 == 1) {
            i13 = m60.x0.email;
        } else if (i14 == 2) {
            i13 = b52.c.your_gender;
        } else if (i14 == 3) {
            i13 = b52.c.business_type;
        } else {
            if (i14 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = b52.c.contact_name;
        }
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(getResources().getString(i13));
        gestaltToolbarImpl.m();
        GestaltButton gestaltButton = this.E0;
        if (gestaltButton != null) {
            gestaltToolbarImpl.c(gestaltButton);
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    /* renamed from: U8 */
    public abstract m91.o getL0();

    @Override // yk1.k
    public final yk1.m V7() {
        uk1.e eVar = this.A0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        m91.o l03 = getL0();
        Navigation navigation = this.I;
        Intrinsics.f(navigation);
        x2 A7 = A7();
        m60.w f73 = f7();
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        b60.b activeUserManager = getActiveUserManager();
        k22.m mVar = this.C0;
        if (mVar != null) {
            return new p91.w(g13, p73, l03, navigation, A7, f73, aVar, activeUserManager, mVar);
        }
        Intrinsics.r("userService");
        throw null;
    }

    public final void V8(boolean z13) {
        GestaltButton gestaltButton = this.E0;
        if (gestaltButton != null) {
            gestaltButton.d(new u81.h(z13, 5));
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    public final void W8(int i13, boolean z13) {
        String message = getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(message, "getString(...)");
        Intrinsics.checkNotNullParameter(message, "message");
        hf0.b.l(requireActivity());
        if (z13) {
            i92.k kVar = this.f103174z0;
            if (kVar != null) {
                kVar.i(message);
                return;
            } else {
                Intrinsics.r("toastUtils");
                throw null;
            }
        }
        i92.k kVar2 = this.f103174z0;
        if (kVar2 != null) {
            kVar2.m(message);
        } else {
            Intrinsics.r("toastUtils");
            throw null;
        }
    }

    public final void X8(boolean z13) {
        GestaltButton gestaltButton = this.E0;
        if (gestaltButton != null) {
            gestaltButton.d(new u81.h(z13, 6));
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        l91.h hVar = this.F0;
        if (hVar == null) {
            return true;
        }
        ((p91.w) hVar).u3();
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF22530s0() {
        return this.J0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.lego_fragment_settings_menu, c52.c.p_recycler_view);
    }

    @Override // q91.y, nl1.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        LayoutInflater.Factory requireActivity = requireActivity();
        yf0.f fVar = requireActivity instanceof yf0.f ? (yf0.f) requireActivity : null;
        if ((fVar != null ? fVar.getEdgeToEdgeConfiguration() : null) instanceof yf0.c) {
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
            c3.t(requireActivity2, false);
        }
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u50.k0 k0Var;
        int i13;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m91.o l03 = getL0();
        m91.o oVar = m91.o.EMAIL;
        if (l03 == oVar) {
            int i14 = m60.x0.next;
            String[] formatArgs = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            k0Var = new u50.k0(i14, new ArrayList(0));
        } else {
            int i15 = m60.x0.done;
            String[] formatArgs2 = new String[0];
            Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
            k0Var = new u50.k0(i15, new ArrayList(0));
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.E0 = new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null).d(new uv.b(k0Var, 3)).e(new l11.p(this, 24));
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        if (settingsRoundHeaderView != null) {
            int i16 = r.f103168a[getL0().ordinal()];
            if (i16 == 1) {
                i13 = m60.x0.email;
            } else if (i16 == 2) {
                i13 = b52.c.your_gender;
            } else if (i16 == 3) {
                i13 = b52.c.business_type;
            } else {
                if (i16 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i13 = b52.c.contact_name;
            }
            settingsRoundHeaderView.d0(rm1.q.ARROW_BACK);
            settingsRoundHeaderView.g0(new x61.e(this, 27));
            settingsRoundHeaderView.k0(i13);
            if (getL0() == oVar || getL0() == m91.o.GENDER || getL0() == m91.o.CONTACT_NAME) {
                GestaltButton gestaltButton = this.E0;
                if (gestaltButton == null) {
                    Intrinsics.r("doneButton");
                    throw null;
                }
                settingsRoundHeaderView.T(gestaltButton);
                Navigation navigation = this.I;
                V8(Intrinsics.d(navigation != null ? navigation.i0("com.pinterst.EXTRA_SETTINGS_GENDER") : null, "unspecified"));
            }
            settingsRoundHeaderView.setElevation(0.0f);
        }
        RelativeLayout relativeLayout = (RelativeLayout) onCreateView.findViewById(c52.c.bottom_sheet_view);
        if (relativeLayout != null) {
            BottomSheetBehavior J2 = BottomSheetBehavior.J(relativeLayout);
            Intrinsics.g(J2, "null cannot be cast to non-null type com.pinterest.base.LockableBottomSheetBehavior<@[FlexibleNullability] android.widget.RelativeLayout?>");
            LockableBottomSheetBehavior lockableBottomSheetBehavior = (LockableBottomSheetBehavior) J2;
            lockableBottomSheetBehavior.f44543h0 = false;
            lockableBottomSheetBehavior.X(3);
            relativeLayout.requestLayout();
        }
        View findViewById = onCreateView.findViewById(c52.c.settings_menu_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.G0 = findViewById;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onDetach() {
        LayoutInflater.Factory requireActivity = requireActivity();
        yf0.f fVar = requireActivity instanceof yf0.f ? (yf0.f) requireActivity : null;
        if ((fVar != null ? fVar.getEdgeToEdgeConfiguration() : null) instanceof yf0.c) {
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.f(requireActivity2);
            c3.t(requireActivity2, !pk.a0.q0(requireActivity2));
        }
        super.onDetach();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        L8();
    }

    public final void y6(Function1 onPasscodeVerified) {
        Intrinsics.checkNotNullParameter(onPasscodeVerified, "onPasscodeVerified");
        this.H0 = onPasscodeVerified;
        hf0.b.l(requireActivity());
        m3 m3Var = this.D0;
        if (m3Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        NavigationImpl w13 = Navigation.w1(m3Var.c() ? z3.b() : z3.a());
        Intrinsics.checkNotNullExpressionValue(w13, "create(...)");
        M1(w13);
    }

    public final void z3(Function0 onUserConfirmedSkip) {
        Intrinsics.checkNotNullParameter(onUserConfirmedSkip, "onUserConfirmedSkip");
        m60.w f73 = f7();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        f73.d(new yb0.e(r91.b.a(requireContext, b7(), onUserConfirmedSkip)));
    }
}
