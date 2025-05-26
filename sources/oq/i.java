package oq;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.pinterest.api.model.i01;
import com.pinterest.api.model.k01;
import com.pinterest.component.board.view.BoardRepPreviewImages;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.board.headerimage.WashedWebImageView;
import com.pinterest.feature.ideaPinCreation.closeup.view.t1;
import com.pinterest.feature.mediagallery.view.MediaThumbnailView;
import com.pinterest.feature.minicell.view.PinMiniCellView;
import com.pinterest.feature.pin.creation.view.PinPreviewView;
import com.pinterest.feature.profile.allpins.view.ProfileAllPinsRep;
import com.pinterest.feature.shopping.shoppingstories.structuredfeed.storyviews.BoardMoreIdeasUpsellListItemView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.ui.brio.view.LegacyProportionalBaseImageView;
import com.pinterest.ui.imageview.ProportionalImageView;
import com.pinterest.ui.imageview.WebImageView;
import kh2.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rh1.u1;
import rh1.v1;

/* loaded from: classes3.dex */
public final class i extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f97050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f97051b;

    public i(Object obj, int i13) {
        this.f97050a = i13;
        this.f97051b = obj;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        int i13 = this.f97050a;
        Object obj = this.f97051b;
        switch (i13) {
            case 2:
                LegoBoardRep legoBoardRep = (LegoBoardRep) obj;
                if (legoBoardRep.f44738v) {
                    return;
                }
                int y03 = dl2.b.y0(legoBoardRep, eo1.a.color_background_dark_opacity_100);
                legoBoardRep.f44721e.F0(y03);
                legoBoardRep.f44722f.F0(y03);
                legoBoardRep.f44723g.F0(y03);
                return;
            case 3:
                WashedWebImageView washedWebImageView = (WashedWebImageView) obj;
                bs1.c.U1(washedWebImageView);
                bs1.c.U1(washedWebImageView.f45275c);
                washedWebImageView.f45276d.invoke();
                return;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 12:
            case 15:
            default:
                return;
            case 8:
                ((PinMiniCellView) obj).f46759e.setBackgroundColor(0);
                return;
            case 10:
                int i14 = ProfileAllPinsRep.f47475v;
                ((ProfileAllPinsRep) obj).T();
                return;
            case 11:
                q71.m mVar = (q71.m) obj;
                mVar.F0(dl2.b.y0(mVar, eo1.a.color_background_dark_opacity_100));
                return;
            case 13:
                BoardMoreIdeasUpsellListItemView boardMoreIdeasUpsellListItemView = (BoardMoreIdeasUpsellListItemView) obj;
                int i15 = BoardMoreIdeasUpsellListItemView.f48512f;
                boardMoreIdeasUpsellListItemView.getClass();
                boardMoreIdeasUpsellListItemView.f48513a.F0(dl2.b.y0(boardMoreIdeasUpsellListItemView, eo1.a.color_background_dark_opacity_200));
                return;
            case 14:
                ProportionalImageView proportionalImageView = (ProportionalImageView) obj;
                Bitmap bitmap = proportionalImageView.C;
                if (bitmap != null) {
                    proportionalImageView.setImageBitmap(k3.C(proportionalImageView.getContext(), bitmap, 0.0f, 6.0f, 4));
                    return;
                }
                return;
            case 16:
                rl1.e0 e0Var = (rl1.e0) obj;
                WebImageView webImageView = e0Var.f108545a;
                if (webImageView == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                if (e0Var.L) {
                    Context context = webImageView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    webImageView.F0(dl2.b.x0(context, eo1.a.comp_avatar_image_wash_overlay));
                }
                int e13 = e0Var.e();
                WebImageView webImageView2 = e0Var.f108545a;
                if (webImageView2 == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                Drawable drawable = webImageView2.f34152e;
                if (drawable != null) {
                    drawable.setBounds(0, 0, e13, e13);
                    webImageView2.invalidate();
                    return;
                }
                return;
            case 17:
                LegacyProportionalBaseImageView legacyProportionalBaseImageView = (LegacyProportionalBaseImageView) obj;
                int i16 = legacyProportionalBaseImageView.L;
                Drawable drawable2 = legacyProportionalBaseImageView.f34152e;
                if (drawable2 != null) {
                    drawable2.setBounds(0, 0, i16, i16);
                    legacyProportionalBaseImageView.invalidate();
                    return;
                }
                return;
        }
    }

    @Override // hs1.c
    public final void b() {
        int i13 = this.f97050a;
        Object obj = this.f97051b;
        switch (i13) {
            case 1:
                Function0 function0 = ((BoardRepPreviewImages) obj).f44719j;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 2:
                int i14 = LegoBoardRep.E;
                ((LegoBoardRep) obj).g0();
                break;
        }
    }

    @Override // hs1.c
    public final void d() {
        int i13 = this.f97050a;
        Object obj = this.f97051b;
        switch (i13) {
            case 4:
                Function0 function0 = ((com.pinterest.feature.ideaPinCreation.closeup.view.u0) obj).O;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 7:
                MediaThumbnailView mediaThumbnailView = (MediaThumbnailView) obj;
                k01 k01Var = mediaThumbnailView.f46752l;
                if (k01Var != null) {
                    k01Var.f39243f.add(i01.FAILED_TO_LOAD_THUMBNAIL);
                }
                mediaThumbnailView.f46752l = null;
                return;
            case 16:
                rl1.e0 e0Var = (rl1.e0) obj;
                WebImageView webImageView = e0Var.f108545a;
                if (webImageView == null) {
                    Intrinsics.r("avatarView");
                    throw null;
                }
                e0Var.M = true;
                webImageView.invalidate();
                return;
            default:
                return;
        }
    }

    @Override // hs1.c
    public final void e() {
        int i13 = this.f97050a;
        int i14 = 1;
        Object obj = this.f97051b;
        switch (i13) {
            case 0:
                e0 e0Var = ((j) obj).f97072r;
                if (e0Var != null) {
                    ((c0) e0Var).b();
                    return;
                }
                return;
            case 4:
                Function0 function0 = ((com.pinterest.feature.ideaPinCreation.closeup.view.u0) obj).N;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 5:
                com.pinterest.feature.ideaPinCreation.closeup.view.x0 x0Var = (com.pinterest.feature.ideaPinCreation.closeup.view.x0) obj;
                x0Var.f46372g = true;
                t1 t1Var = x0Var.f46367b;
                if (t1Var != null) {
                    t1Var.a();
                    return;
                }
                return;
            case 6:
                t1 t1Var2 = (t1) obj;
                if (t1Var2 != null) {
                    t1Var2.a();
                    return;
                }
                return;
            case 7:
                ((MediaThumbnailView) obj).f46752l = null;
                return;
            case 9:
                int i15 = PinPreviewView.f47103f;
                kh2.s0.w((GestaltSpinner) ((PinPreviewView) obj).f47106e.getValue(), p11.a.f98635k);
                return;
            case 12:
                FrameLayout frameLayout = ((x81.f0) obj).f134214l1;
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    return;
                } else {
                    Intrinsics.r("imagePreviewContainer");
                    throw null;
                }
            case 15:
                v1 v1Var = (v1) obj;
                GestaltIconButton gestaltIconButton = v1Var.f108321x0;
                if (gestaltIconButton != null) {
                    gestaltIconButton.t(new u1(v1Var, i14));
                    return;
                } else {
                    Intrinsics.r("photoPreviewRemoveButton");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // hs1.c
    public final void f() {
        switch (this.f97050a) {
            case 9:
                PinPreviewView pinPreviewView = (PinPreviewView) this.f97051b;
                int i13 = PinPreviewView.f47103f;
                kh2.s0.w((GestaltSpinner) pinPreviewView.f47106e.getValue(), p11.a.f98636l);
                break;
        }
    }
}
