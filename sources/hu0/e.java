package hu0;

import a7.v0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.api.model.to;
import com.pinterest.api.model.vn0;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.pin.creation.view.ThumbnailScrubber;
import com.pinterest.feature.pin.creation.view.ThumbnailScrubberPreview;
import com.pinterest.gestalt.button.view.GestaltButton;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import so.a8;
import yk1.m;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhu0/e;", "Lfu0/d;", "Lhu0/a;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class e extends b implements a {
    public static final /* synthetic */ int H0 = 0;
    public a8 B0;
    public ThumbnailScrubber C0;
    public g D0;
    public g E0;
    public final d4 F0;
    public final a4 G0;

    public e() {
        this.E = aq1.f.idea_pin_creation_cover_image_picker;
        this.F0 = d4.STORY_PIN_METADATA;
        this.G0 = a4.STORY_PIN_CREATE;
    }

    @Override // yk1.k
    public final m V7() {
        a8 a8Var = this.B0;
        if (a8Var == null) {
            Intrinsics.r("ideaPinCoverImagePickerPresenterFactory");
            throw null;
        }
        yk1.a aVar = new yk1.a(getResources(), requireContext().getTheme());
        uk1.d dVar = (uk1.d) this.f62977o0.getValue();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        g a13 = a8Var.a(aVar, dVar, requireContext);
        Intrinsics.checkNotNullParameter(a13, "<set-?>");
        this.E0 = a13;
        return a13;
    }

    public final void d8(to positionInfo) {
        Intrinsics.checkNotNullParameter(positionInfo, "positionInfo");
        v0 T = Y7().T();
        if (T != null) {
            int c13 = positionInfo.c();
            vn0 vn0Var = this.f62978p0;
            T.y(c13 - (vn0Var != null ? vn0Var.getStartMediaIndex() : 0), positionInfo.d());
        }
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF117471s1() {
        return this.G0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF117470r1() {
        return this.F0;
    }

    @Override // fu0.d, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.cancel_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        gestaltButton.d(d.f70401j);
        final int i13 = 0;
        gestaltButton.e(new gm1.a(this) { // from class: hu0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f70400b;

            {
                this.f70400b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                e this$0 = this.f70400b;
                switch (i14) {
                    case 0:
                        int i15 = e.H0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.P7();
                        break;
                    default:
                        int i16 = e.H0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        g gVar = this$0.D0;
                        if (gVar != null) {
                            gVar.z3();
                        }
                        this$0.P7();
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        Intrinsics.checkNotNullParameter(gestaltButton, "<set-?>");
        this.f62968f0 = gestaltButton;
        View findViewById2 = onCreateView.findViewById(aq1.d.done_button);
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        gestaltButton2.d(d.f70402k);
        final int i14 = 1;
        gestaltButton2.e(new gm1.a(this) { // from class: hu0.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f70400b;

            {
                this.f70400b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                e this$0 = this.f70400b;
                switch (i142) {
                    case 0:
                        int i15 = e.H0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.P7();
                        break;
                    default:
                        int i16 = e.H0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        g gVar = this$0.D0;
                        if (gVar != null) {
                            gVar.z3();
                        }
                        this$0.P7();
                        break;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        Intrinsics.checkNotNullParameter(gestaltButton2, "<set-?>");
        this.f62969g0 = gestaltButton2;
        View findViewById3 = onCreateView.findViewById(aq1.d.editable_page_lite);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        IdeaPinEditablePageLite ideaPinEditablePageLite = (IdeaPinEditablePageLite) findViewById3;
        Intrinsics.checkNotNullParameter(ideaPinEditablePageLite, "<set-?>");
        this.f62971i0 = ideaPinEditablePageLite;
        this.f62972j0 = (ThumbnailScrubberPreview) onCreateView.findViewById(aq1.d.scrubber_preview);
        View findViewById4 = onCreateView.findViewById(aq1.d.scrubber_selector);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.C0 = (ThumbnailScrubber) findViewById4;
        IdeaPinEditablePageLite Y7 = Y7();
        d0 d0Var = ((uk1.d) this.f62977o0.getValue()).f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        Y7.setPinalytics(d0Var);
        Y7().F0();
        ThumbnailScrubberPreview thumbnailScrubberPreview = this.f62972j0;
        if (thumbnailScrubberPreview != null) {
            thumbnailScrubberPreview.e();
            thumbnailScrubberPreview.b();
        }
        ThumbnailScrubber thumbnailScrubber = this.C0;
        if (thumbnailScrubber == null) {
            Intrinsics.r("scrubberSelector");
            throw null;
        }
        thumbnailScrubber.c();
        thumbnailScrubber.f(Integer.valueOf(aq1.c.idea_pin_creation_cover_image_scrubber_selector), bs1.c.W(thumbnailScrubber, aq1.b.idea_pin_cover_image_picker_selector_border_width), bs1.c.W(thumbnailScrubber, aq1.b.idea_pin_cover_image_picker_selector_corner_radius), bs1.c.W(thumbnailScrubber, aq1.b.idea_pin_cover_image_picker_selector_height), Integer.valueOf(bs1.c.B(thumbnailScrubber, eo1.b.color_themed_background_default)), bs1.c.W(thumbnailScrubber, aq1.b.idea_pin_cover_image_picker_selector_width));
        return onCreateView;
    }

    @Override // du0.a
    public final void z2() {
        g gVar = this.E0;
        if (gVar != null) {
            gVar.B3();
        } else {
            Intrinsics.r("presenter");
            throw null;
        }
    }
}
