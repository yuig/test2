package qv0;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.PinterestGridLayoutManager;
import androidx.recyclerview.widget.v0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqv0/j;", "Lyq0/b0;", "Lyq0/a0;", "Lnv0/m;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class j extends b<yq0.a0> implements nv0.m {
    public static final /* synthetic */ int G0 = 0;
    public ag1.b A0;
    public ag1.h B0;
    public GestaltSpinner D0;

    /* renamed from: z0, reason: collision with root package name */
    public so.m f105187z0;
    public final xk2.v C0 = xk2.m.b(new i(this, 0));
    public final d4 E0 = d4.STORY_PIN_STICKER_BY_CATEGORY_PICKER;
    public final a4 F0 = a4.STORY_PIN_CREATE;

    @Override // yq0.t, yk1.k, nl1.d
    public final void L7() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.d1(requireActivity);
        super.L7();
    }

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(4, new i(this, 1));
    }

    @Override // yk1.k
    public final yk1.m V7() {
        so.m mVar = this.f105187z0;
        if (mVar == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_IDEA_PIN_STICKER_CATEGORY_ID") : null;
        if (v03 == null) {
            v03 = "-1";
        }
        return mVar.a((du0.b) this.C0.getValue(), v03);
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getG0() {
        return this.F0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.E0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(aq1.f.fragment_idea_pin_sticker_category, aq1.d.p_recycler_view);
    }

    @Override // yq0.t
    public final v0 n8() {
        cp.b bVar = new cp.b(this, 23);
        getContext();
        return new v0(new PinterestGridLayoutManager(bVar, 3));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        pk.a0.D(requireActivity);
        super.onResume();
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(aq1.d.cancel_button);
        ((GestaltIconButton) findViewById).u(new np0.h(this, 16));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = v13.findViewById(aq1.d.title);
        GestaltText gestaltText = (GestaltText) findViewById2;
        Intrinsics.f(gestaltText);
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_IDEA_PIN_STICKER_CATEGORY_NAME") : null;
        if (v03 == null) {
            v03 = "";
        }
        pk.a0.p(gestaltText, v03);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = v13.findViewById(aq1.d.overlay_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.D0 = (GestaltSpinner) findViewById3;
    }
}
