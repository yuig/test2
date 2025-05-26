package kc1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.library.navigation.activity.NavActivity;
import com.pinterest.navigation.Navigation;
import ea1.t0;
import ea1.u0;
import h32.d4;
import java.util.List;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import m60.x0;
import o82.b3;
import w41.g0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkc1/d0;", "Lo82/i3;", "<init>", "()V", "g4/u", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d0 extends c {
    public static final /* synthetic */ int L0 = 0;
    public final d4 F0 = d4.SETTINGS;
    public final m1 G0;
    public GestaltButton H0;
    public LinearLayout I0;
    public GestaltText J0;
    public GestaltText K0;

    public d0() {
        int i13 = 10;
        xk2.k r13 = d7.g.r(14, new t0(this, i13), xk2.n.NONE);
        int i14 = 11;
        this.G0 = a1.s(this, k0.f80436a.b(j.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        rm1.q qVar = rm1.q.ARROW_BACK;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int drawableRes = qVar.drawableRes(requireContext, dl2.b.f1(requireContext2));
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(getResources().getString(c52.e.pronouns));
        gestaltToolbarImpl.Q(drawableRes, eo1.b.color_themed_icon_default, x0.back);
        gestaltToolbarImpl.m();
        GestaltButton gestaltButton = this.H0;
        if (gestaltButton != null) {
            gestaltToolbarImpl.c(gestaltButton);
        } else {
            Intrinsics.r("doneButton");
            throw null;
        }
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new g0(b9().a(), 7);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new tx0.j(b9().c(), 28);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.F(12, new h81.b(this, 17), new b((ic1.y) null, 3), new com.pinterest.boardAutoCollages.l(this, 7), new mj.m(26), "PronounItem", b9());
    }

    public final j b9() {
        return (j) this.G0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF68107l0() {
        return this.F0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(c52.d.fragment_profile_select_pronouns, c52.c.p_recycler_view);
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.H0 = (GestaltButton) e0.t.h(new GestaltButton.SmallPrimaryButton(6, requireContext, (AttributeSet) null).d(d.f79147n), (l82.c) b9().c());
        return onCreateView;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        if (E4() instanceof NavActivity) {
            kg.p.r(v13);
        }
        j b93 = b9();
        Intent intent = requireActivity().getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("pronounsField") : null;
        List list = i03 instanceof List ? (List) i03 : null;
        if (list == null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("pronounsField");
            list = stringArrayExtra != null ? kotlin.collections.c0.b0(stringArrayExtra) : null;
        }
        b93.h(list);
        View findViewById = v13.findViewById(c52.c.selected_pronouns_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.I0 = (LinearLayout) findViewById;
        View findViewById2 = v13.findViewById(c52.c.profile_select_pronouns_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.J0 = (GestaltText) findViewById2;
        View findViewById3 = v13.findViewById(c52.c.selected_pronoun_container_empty_state_message);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.K0 = (GestaltText) findViewById3;
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new z(this, null), 3);
        androidx.lifecycle.z viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner2), null, null, new c0(this, null), 3);
    }
}
