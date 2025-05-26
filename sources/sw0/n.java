package sw0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsw0/n;", "Lyq0/b0;", "Lyq0/a0;", "Lpw0/t;", "<init>", "()V", "mediaGallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class n extends f<yq0.a0> implements pw0.t {
    public static final /* synthetic */ int E0 = 0;
    public wk2.a A0;
    public pw0.w B0;
    public final d4 C0 = d4.CAMERA;
    public final a4 D0 = a4.CAMERA_ALBUM_PICKER;

    /* renamed from: z0, reason: collision with root package name */
    public uk1.e f115526z0;

    @Override // yq0.b0
    public final void Q8(yq0.z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Context context = getContext();
        if (context != null) {
            adapter.G(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, new xo0.i(context, 25));
        }
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.Y(dt1.d.gallery_directory_selection);
        gestaltToolbarImpl.U(new com.pinterest.feature.home.view.c(this, 11));
        if (getContext() != null) {
            gestaltToolbarImpl.d0(vn1.c.DEFAULT);
        }
    }

    @Override // yk1.k
    public final yk1.m V7() {
        boolean o03;
        uk1.e eVar = this.f115526z0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        uj2.q p73 = p7();
        Navigation navigation = this.I;
        if (navigation != null) {
            o03 = false;
            if (navigation.S("com.pinterest.EXTRA_IS_STORY_PIN", false)) {
                wk2.a aVar = this.A0;
                if (aVar == null) {
                    Intrinsics.r("ideaPinComposeDataManagerProvider");
                    throw null;
                }
                pw0.w wVar = ((ag1.b) aVar.get()).f15137j;
                if (wVar != null) {
                    o03 = ((qw0.j) wVar).G3();
                }
                return new qw0.b(g13, p73, o03, (ye2.m) getContext(), new yk1.a(getResources(), requireContext().getTheme()));
            }
        }
        pw0.w wVar2 = this.B0;
        o03 = com.bumptech.glide.d.o0(wVar2 != null ? Boolean.valueOf(((qw0.j) wVar2).G3()) : null);
        return new qw0.b(g13, p73, o03, (ye2.m) getContext(), new yk1.a(getResources(), requireContext().getTheme()));
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF68726p0() {
        return this.D0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.C0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        return new a7.e(ct1.c.fragment_media_directory, ct1.b.media_directory_recycler);
    }

    @Override // yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        a8(new com.pinterest.feature.home.view.f(resources));
    }
}
