package t52;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import bc2.q;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.share.board.video.screens.ShareBoardVideoLocation;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import d7.g;
import g70.h;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import oc2.i;
import oc2.j;
import pk.a0;
import rg0.k0;
import xk2.k;
import xk2.m;
import xk2.n;
import xk2.v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lt52/d;", "Lmm1/l;", "Loc2/j;", "<init>", "()V", "shareBoardVideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends a implements j {

    /* renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f116443r0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    public h f116444g0;

    /* renamed from: h0, reason: collision with root package name */
    public final v f116445h0 = m.b(new b(this, 5));

    /* renamed from: i0, reason: collision with root package name */
    public final v f116446i0 = m.b(new b(this, 2));

    /* renamed from: j0, reason: collision with root package name */
    public final v f116447j0 = m.b(new b(this, 6));

    /* renamed from: k0, reason: collision with root package name */
    public final v f116448k0 = m.b(new b(this, 0));

    /* renamed from: l0, reason: collision with root package name */
    public final k f116449l0;

    /* renamed from: m0, reason: collision with root package name */
    public final k f116450m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f116451n0;

    /* renamed from: o0, reason: collision with root package name */
    public final d4 f116452o0;

    /* renamed from: p0, reason: collision with root package name */
    public final a4 f116453p0;

    /* renamed from: q0, reason: collision with root package name */
    public final g0 f116454q0;

    public d() {
        n nVar = n.NONE;
        this.f116449l0 = m.a(nVar, new b(this, 3));
        this.f116450m0 = m.a(nVar, new b(this, 1));
        this.f116452o0 = d4.ACTION_PROMPT;
        this.f116453p0 = a4.FEED_HOME;
        this.f116454q0 = g0.SHEET;
    }

    @Override // nl1.d
    public final void I7() {
        if (this.f116451n0) {
            return;
        }
        rg0.n e83 = e8();
        if (e83 != null) {
            e83.i((nx.d) this.f116450m0.getValue());
        }
        this.f116451n0 = true;
    }

    @Override // oc2.j
    public final Set S0() {
        return s0.f80394a;
    }

    @Override // mm1.l
    public final mm1.d b8() {
        return new mm1.d(o52.d.fragment_share_board_prompt_modal, false, 0, 90, false, false, new b(this, 4), 756);
    }

    public final void d8() {
        g.s(Navigation.w1(ShareBoardVideoLocation.SHARE_BOARD_MODAL_PROMPT), f7());
    }

    public final rg0.n e8() {
        return (rg0.n) this.f116449l0.getValue();
    }

    public final PinterestVideoView f8() {
        Object value = this.f116447j0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (PinterestVideoView) value;
    }

    @Override // nl1.d, nx.a
    public final i0 generateLoggingContext() {
        i0 source = super.generateLoggingContext();
        Intrinsics.checkNotNullParameter(source, "source");
        return new i0(source.f67081a, source.f67082b, source.f67083c, this.f116454q0, null, null);
    }

    @Override // uk1.c
    /* renamed from: getComponentType, reason: from getter */
    public final g0 getF73409e1() {
        return this.f116454q0;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF86878d0() {
        return this.f116453p0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF86877c0() {
        return this.f116452o0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        f8().play();
    }

    @Override // mm1.l, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        a8(c.f116442i);
        rg0.n e83 = e8();
        ag2.e eVar = e83 != null ? e83.f108068j : null;
        k0 k0Var = eVar instanceof k0 ? (k0) eVar : null;
        if (k0Var == null) {
            d8();
            return;
        }
        Object value = this.f116445h0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        GestaltText gestaltText = (GestaltText) value;
        String b13 = k0Var.b();
        if (b13 == null) {
            b13 = "";
        }
        a0.p(gestaltText, b13);
        Object value2 = this.f116446i0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        GestaltText gestaltText2 = (GestaltText) value2;
        String a13 = k0Var.a();
        a0.p(gestaltText2, a13 != null ? a13 : "");
        v vVar = this.f116448k0;
        Object value3 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
        ((GestaltButton) value3).d(new s12.a(k0Var, 8));
        Object value4 = vVar.getValue();
        Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
        ((GestaltButton) value4).e(new ez1.b(5, this, k0Var));
        WebImageView webImageView = f8().K0;
        float f13 = f8().f52795w;
        webImageView.g2(f13, f13, f13, f13);
        webImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        webImageView.loadUrl(k0Var.c());
        PinterestVideoView f83 = f8();
        q videoTracks = dl2.b.n1((float) k0Var.d(), k0Var.e(), k0Var.c(), false);
        Intrinsics.checkNotNullParameter("share_board_prompt_modal_video_uid", "uid");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        i.g(f83, new bc2.k("share_board_prompt_modal_video_uid", videoTracks.a(), null, null, videoTracks, null), null, 6);
        f83.q0().w();
        if (!f83.isLaidOut() || f83.isLayoutRequested()) {
            f83.addOnLayoutChangeListener(new n5.h(12, k0Var, f83));
        } else {
            f83.getLayoutParams().width = (int) (k0Var.d() * f83.getHeight());
            f83.play();
        }
    }
}
