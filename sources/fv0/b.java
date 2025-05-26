package fv0;

import ag1.h;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import av0.k;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.u0;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.f0;
import so.m8;
import xo0.i;
import yk1.m;
import yq0.z;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfv0/b;", "Lyq0/b0;", "", "Lav0/k;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends a<Object> implements k {
    public static final /* synthetic */ int D0 = 0;
    public h A0;
    public final d4 B0;
    public final a4 C0;

    /* renamed from: z0, reason: collision with root package name */
    public m8 f63017z0;

    public b() {
        this.E = aq1.f.fragment_idea_pin_metadata_advanced_settings;
        this.B0 = d4.STORY_PIN_ADVANCED_SETTINGS;
        this.C0 = a4.STORY_PIN_CREATE;
    }

    public static void V8(b bVar, u0 u0Var) {
        f1 f1Var = f1.TAP;
        d0 d0Var = bVar.U8().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        hf0.b.k(getView());
        super.L7();
    }

    @Override // yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        adapter.G(1, new i(requireContext, 16));
        adapter.G(3, new i(requireContext, 17));
        adapter.G(2, new i(requireContext, 18));
        adapter.G(4, new i(requireContext, 19));
        adapter.G(8, new i(requireContext, 20));
    }

    public final du0.b U8() {
        f0 b73 = b7();
        h hVar = this.A0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        d4 d4Var = d4.STORY_PIN_ADVANCED_SETTINGS;
        Navigation navigation = this.I;
        boolean S = navigation != null ? navigation.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false;
        Navigation navigation2 = this.I;
        return new du0.b(b73, hVar, d4Var, navigation2 != null ? navigation2.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null, S);
    }

    @Override // yk1.k
    public final m V7() {
        m8 m8Var = this.f63017z0;
        PinEditAdvanceMeta pinEditAdvanceMeta = null;
        if (m8Var == null) {
            Intrinsics.r("ideaPinMetadataAdvancedSettingsPresenterFactory");
            throw null;
        }
        du0.b U8 = U8();
        Navigation navigation = this.I;
        if (Intrinsics.d(navigation != null ? Boolean.valueOf(navigation.w("com.pinterest.EXTRA_PIN_EDIT_ADV_META")) : null, Boolean.TRUE)) {
            Navigation navigation2 = this.I;
            Parcelable b23 = navigation2 != null ? navigation2.b2("com.pinterest.EXTRA_PIN_EDIT_ADV_META") : null;
            Intrinsics.g(b23, "null cannot be cast to non-null type com.pinterest.feature.ideaPinCreation.metadata.model.PinEditAdvanceMeta");
            pinEditAdvanceMeta = (PinEditAdvanceMeta) b23;
        }
        return m8Var.a(U8, pinEditAdvanceMeta);
    }

    public final void W8(String partnerName, dv0.m onConfirmCallback, dv0.m onCancelCallback) {
        Intrinsics.checkNotNullParameter(partnerName, "partnerName");
        Intrinsics.checkNotNullParameter(onConfirmCallback, "onConfirmCallback");
        Intrinsics.checkNotNullParameter(onCancelCallback, "onCancelCallback");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        a1.y0(requireActivity, requireContext, partnerName, onConfirmCallback, onCancelCallback);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getG0() {
        return this.C0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF73811l0() {
        return this.B0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(this.E, aq1.d.p_recycler_view);
    }

    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.back_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new np0.h(this, 12));
            return onCreateView;
        }
        Intrinsics.r("backButton");
        throw null;
    }
}
