package eh0;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bc2.q;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import rq.m1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Leh0/i;", "Lmf0/f;", "Loc2/j;", "<init>", "()V", "experienceLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class i extends p implements oc2.j {

    /* renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f58930h0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    public jf2.c f58931f0;

    /* renamed from: g0, reason: collision with root package name */
    public final h f58932g0;

    public i() {
        h hVar = new h(this, 0);
        this.f58932g0 = hVar;
        T6(hVar);
    }

    @Override // oc2.j
    public final Set S0() {
        return s0.f80394a;
    }

    @Override // mf0.f, androidx.fragment.app.q, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q6(2, kh0.c.Theme_Pinterest_ExperienceModal_Dialog);
    }

    @Override // mf0.f, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(kh0.b.experience_modal_view, viewGroup, false);
        ((GestaltIconButton) inflate.findViewById(kh0.a.experience_modal_close_icon)).u(new yb0.b(this, 12));
        ((GestaltText) inflate.findViewById(kh0.a.experience_modal_title)).i(new f(inflate, this));
        ((GestaltText) inflate.findViewById(kh0.a.experience_modal_detail)).i(new f(this, inflate));
        View findViewById = inflate.findViewById(kh0.a.experience_modal_cta_button_group);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById;
        jf2.c cVar = this.f58931f0;
        if (cVar == null) {
            Intrinsics.r("rendering");
            throw null;
        }
        b a13 = b.a((b) cVar.f75877f, new g(this, 0));
        jf2.c cVar2 = this.f58931f0;
        if (cVar2 == null) {
            Intrinsics.r("rendering");
            throw null;
        }
        b bVar = (b) cVar2.f75878g;
        b a14 = bVar != null ? b.a(bVar, new g(this, 1)) : null;
        gestaltButtonGroup.a(new gd0.c(12, a13, a14));
        gestaltButtonGroup.b(new m1(gestaltButtonGroup, a13, a14, 4));
        jf2.c cVar3 = this.f58931f0;
        if (cVar3 == null) {
            Intrinsics.r("rendering");
            throw null;
        }
        kg.n nVar = (kg.n) cVar3.f75874c;
        View findViewById2 = inflate.findViewById(kh0.a.experience_modal_media_video);
        PinterestVideoView pinterestVideoView = (PinterestVideoView) findViewById2;
        pinterestVideoView.O(true);
        pinterestVideoView.A(false);
        pinterestVideoView.P(true);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = inflate.findViewById(kh0.a.experience_modal_media_image);
        WebImageView webImageView = (WebImageView) findViewById3;
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Unit unit = Unit.f80348a;
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        int V6 = V6();
        if (nVar instanceof c) {
            pinterestVideoView.setVisibility(8);
            webImageView.setVisibility(0);
            c cVar4 = (c) nVar;
            webImageView.setContentDescription(cVar4.f58918c);
            Context context = webImageView.getContext();
            int i13 = eo1.b.color_themed_light_gray;
            Object obj = d5.a.f53679a;
            webImageView.V1(cVar4.f58917b, (r18 & 2) != 0, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? 0 : 0, (r18 & 16) != 0 ? 0 : 0, (r18 & 32) != 0 ? null : new ColorDrawable(context.getColor(i13)), (r18 & 64) != 0 ? null : null, null);
        } else if (nVar instanceof e) {
            webImageView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = pinterestVideoView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            e eVar = (e) nVar;
            layoutParams.height = (int) (V6 / eVar.f58922c.f58920b);
            pinterestVideoView.setLayoutParams(layoutParams);
            pinterestVideoView.setVisibility(0);
            d dVar = eVar.f58922c;
            pinterestVideoView.K0.loadUrl(dVar.f58919a);
            q videoTracks = dl2.b.n1(dVar.f58920b, eVar.f58921b, dVar.f58919a, false);
            Intrinsics.checkNotNullParameter("experience_modal_video", "uid");
            Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
            oc2.i.g(pinterestVideoView, new bc2.k("experience_modal_video", videoTracks.a(), null, null, videoTracks, null), null, 6);
            pinterestVideoView.q0().w();
            pinterestVideoView.play();
        }
        Intrinsics.checkNotNullExpressionValue(inflate, "apply(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        PinterestVideoView pinterestVideoView;
        super.onPause();
        View view = getView();
        if (view == null || (pinterestVideoView = (PinterestVideoView) view.findViewById(kh0.a.experience_modal_media_video)) == null) {
            return;
        }
        pinterestVideoView.q0().k(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        PinterestVideoView pinterestVideoView;
        super.onResume();
        View view = getView();
        if (view == null || (pinterestVideoView = (PinterestVideoView) view.findViewById(kh0.a.experience_modal_media_video)) == null) {
            return;
        }
        pinterestVideoView.q0().k(this);
    }
}
