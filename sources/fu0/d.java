package fu0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.api.model.fo;
import com.pinterest.api.model.vn0;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.closeup.view.e1;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import com.pinterest.feature.ideaPinCreation.videotrimming.view.IdeaPinVideoTrimmingTimeScale;
import com.pinterest.feature.pin.creation.view.ThumbnailScrubberPreview;
import com.pinterest.gestalt.button.view.GestaltButton;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kh2.k3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import xk2.m;
import xk2.n;
import xk2.v;
import yk1.k;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lfu0/d;", "Lyk1/k;", "Ldu0/a;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes.dex */
public abstract class d extends k implements du0.a {

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f62966v0 = 0;

    /* renamed from: e0, reason: collision with root package name */
    public uk1.e f62967e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltButton f62968f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltButton f62969g0;

    /* renamed from: h0, reason: collision with root package name */
    public RoundedCornersLayout f62970h0;

    /* renamed from: i0, reason: collision with root package name */
    public IdeaPinEditablePageLite f62971i0;

    /* renamed from: j0, reason: collision with root package name */
    public ThumbnailScrubberPreview f62972j0;

    /* renamed from: k0, reason: collision with root package name */
    public View f62973k0;

    /* renamed from: l0, reason: collision with root package name */
    public IdeaPinVideoTrimmingTimeScale f62974l0;

    /* renamed from: m0, reason: collision with root package name */
    public final xk2.k f62975m0;

    /* renamed from: n0, reason: collision with root package name */
    public final xk2.k f62976n0;

    /* renamed from: o0, reason: collision with root package name */
    public final v f62977o0;

    /* renamed from: p0, reason: collision with root package name */
    public vn0 f62978p0;

    /* renamed from: q0, reason: collision with root package name */
    public ArrayList f62979q0;

    /* renamed from: r0, reason: collision with root package name */
    public fo f62980r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f62981s0;

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashSet f62982t0;

    /* renamed from: u0, reason: collision with root package name */
    public eu0.c f62983u0;

    public d() {
        n nVar = n.NONE;
        this.f62975m0 = m.a(nVar, new b(this, 2));
        this.f62976n0 = m.a(nVar, new b(this, 0));
        this.f62977o0 = m.b(new b(this, 1));
        this.f62982t0 = new LinkedHashSet();
    }

    @Override // yk1.k, nl1.d
    public final void L7() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.d1(requireActivity);
        super.L7();
    }

    public final IdeaPinEditablePageLite Y7() {
        IdeaPinEditablePageLite ideaPinEditablePageLite = this.f62971i0;
        if (ideaPinEditablePageLite != null) {
            return ideaPinEditablePageLite;
        }
        Intrinsics.r("pageView");
        throw null;
    }

    public final void Z7(long j13) {
        if (this.f62979q0 != null) {
            int floatValue = (int) (((Number) this.f62976n0.getValue()).floatValue() + (((j13 * 1.0f) / ig1.b.j0(r0)) * ((Number) this.f62975m0.getValue()).intValue()));
            View view = this.f62973k0;
            if (view != null) {
                k3.Z1(view, 1, floatValue - (view.getWidth() / 2));
            }
        }
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        View findViewById = onCreateView.findViewById(aq1.d.cancel_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        Intrinsics.checkNotNullParameter(gestaltButton, "<set-?>");
        this.f62968f0 = gestaltButton;
        View findViewById2 = onCreateView.findViewById(aq1.d.done_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltButton2, "<set-?>");
        this.f62969g0 = gestaltButton2;
        View findViewById3 = onCreateView.findViewById(aq1.d.rounded_corner_video_view_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f62970h0 = (RoundedCornersLayout) findViewById3;
        View findViewById4 = onCreateView.findViewById(aq1.d.editable_page_lite);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        IdeaPinEditablePageLite ideaPinEditablePageLite = (IdeaPinEditablePageLite) findViewById4;
        Intrinsics.checkNotNullParameter(ideaPinEditablePageLite, "<set-?>");
        this.f62971i0 = ideaPinEditablePageLite;
        this.f62972j0 = (ThumbnailScrubberPreview) onCreateView.findViewById(aq1.d.scrubber_preview);
        this.f62973k0 = onCreateView.findViewById(aq1.d.scrubber);
        this.f62974l0 = (IdeaPinVideoTrimmingTimeScale) onCreateView.findViewById(aq1.d.time_scale);
        GestaltButton gestaltButton3 = this.f62968f0;
        if (gestaltButton3 == null) {
            Intrinsics.r("cancelButton");
            throw null;
        }
        gestaltButton3.d(c.f62958j);
        final int i13 = 0;
        gestaltButton3.e(new gm1.a(this) { // from class: fu0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f62955b;

            {
                this.f62955b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                d this$0 = this.f62955b;
                switch (i14) {
                    case 0:
                        int i15 = d.f62966v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        eu0.c cVar = this$0.f62983u0;
                        if (cVar != null) {
                            cVar.s3();
                            break;
                        }
                        break;
                    default:
                        int i16 = d.f62966v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        eu0.c cVar2 = this$0.f62983u0;
                        if (cVar2 != null) {
                            cVar2.t3();
                            break;
                        }
                        break;
                }
            }
        });
        GestaltButton gestaltButton4 = this.f62969g0;
        if (gestaltButton4 == null) {
            Intrinsics.r("doneButton");
            throw null;
        }
        gestaltButton4.d(c.f62959k);
        final int i14 = 1;
        gestaltButton4.e(new gm1.a(this) { // from class: fu0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f62955b;

            {
                this.f62955b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                d this$0 = this.f62955b;
                switch (i142) {
                    case 0:
                        int i15 = d.f62966v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        eu0.c cVar = this$0.f62983u0;
                        if (cVar != null) {
                            cVar.s3();
                            break;
                        }
                        break;
                    default:
                        int i16 = d.f62966v0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        eu0.c cVar2 = this$0.f62983u0;
                        if (cVar2 != null) {
                            cVar2.t3();
                            break;
                        }
                        break;
                }
            }
        });
        Y7().t0(new e1(this, 1));
        ThumbnailScrubberPreview thumbnailScrubberPreview = this.f62972j0;
        if (thumbnailScrubberPreview != null) {
            thumbnailScrubberPreview.e();
            thumbnailScrubberPreview.b();
        }
        int floatValue = (int) ((Number) this.f62976n0.getValue()).floatValue();
        View view = this.f62973k0;
        if (view != null) {
            k3.Z1(view, 1, floatValue - (view.getWidth() / 2));
        }
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public void onResume() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        a0.D(requireActivity);
        super.onResume();
    }
}
