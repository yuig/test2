package xt0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.feature.ideaPinCreation.canvas.view.IdeaPinCreationAspectRatioSelector;
import com.pinterest.feature.ideaPinCreation.canvas.view.IdeaPinCreationCanvasCropperContainer;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import so.y7;
import yk1.m;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lxt0/g;", "Lfu0/d;", "Lvt0/d;", "Lvt0/a;", "Lvt0/b;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class g extends c implements vt0.d, vt0.a, vt0.b {
    public y7 B0;
    public ag1.h C0;
    public IdeaPinCreationAspectRatioSelector D0;
    public IdeaPinCreationCanvasCropperContainer E0;
    public final d4 F0;
    public final a4 G0;

    public g() {
        this.E = aq1.f.fragment_idea_pin_creation_canvas;
        this.F0 = d4.IDEA_PIN_CANVAS_ASPECT_RATIO_TOOL;
        this.G0 = a4.STORY_PIN_CREATE;
    }

    @Override // yk1.k
    public final m V7() {
        y7 y7Var = this.B0;
        if (y7Var == null) {
            Intrinsics.r("presenterFactory");
            throw null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        uk1.e eVar = this.f62967e0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.a aVar = (uk1.a) eVar;
        ag1.h hVar = this.C0;
        if (hVar == null) {
            Intrinsics.r("ideaPinSessionDataManager");
            throw null;
        }
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_STORY_PIN_CREATION_ENTRY_TYPE") : null;
        Navigation navigation2 = this.I;
        return y7Var.a(requireContext, new du0.b(aVar.f122378a, hVar, this.F0, v03, navigation2 != null ? navigation2.S("com.pinterest.EXTRA_IS_STORY_PIN_DRAFT", false) : false));
    }

    @Override // nl1.d
    public final void dismiss() {
        D5();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getI0() {
        return this.G0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getH0() {
        return this.F0;
    }

    @Override // fu0.d, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.aspect_ratio_selector);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.D0 = (IdeaPinCreationAspectRatioSelector) findViewById;
        View findViewById2 = onCreateView.findViewById(aq1.d.canvas_cropper_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.E0 = (IdeaPinCreationCanvasCropperContainer) findViewById2;
        View findViewById3 = onCreateView.findViewById(aq1.d.education_view);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        IdeaPinCreationAspectRatioSelector ideaPinCreationAspectRatioSelector = this.D0;
        if (ideaPinCreationAspectRatioSelector == null) {
            Intrinsics.r("aspectRatioSelector");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ideaPinCreationAspectRatioSelector.f45967f = this;
        d0 instance = ((uk1.d) this.f62977o0.getValue()).f122379a;
        Intrinsics.checkNotNullExpressionValue(instance, "getPinalytics(...)");
        Intrinsics.checkNotNullParameter(instance, "instance");
        ideaPinCreationAspectRatioSelector.f45966e = instance;
        IdeaPinCreationCanvasCropperContainer ideaPinCreationCanvasCropperContainer = this.E0;
        if (ideaPinCreationCanvasCropperContainer == null) {
            Intrinsics.r("canvasCropperContainer");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        f fVar = ideaPinCreationCanvasCropperContainer.f45969a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        fVar.f135917f = this;
        return onCreateView;
    }
}
