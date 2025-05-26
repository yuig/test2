package eu0;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import ck2.i;
import com.pinterest.api.model.fo;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.so;
import com.pinterest.api.model.sp;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import dl1.l;
import dl1.t;
import h32.u0;
import hv0.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import rw0.f;
import tb0.h;
import uj2.q;
import uk1.d;
import yk1.p;
import yk1.r;
import yk1.v;

/* loaded from: classes5.dex */
public abstract class c extends p {

    /* renamed from: a, reason: collision with root package name */
    public final f f60165a;

    /* renamed from: b, reason: collision with root package name */
    public final h f60166b;

    /* renamed from: c, reason: collision with root package name */
    public final v f60167c;

    /* renamed from: d, reason: collision with root package name */
    public final ag1.b f60168d;

    /* renamed from: e, reason: collision with root package name */
    public final t f60169e;

    /* renamed from: f, reason: collision with root package name */
    public ln0 f60170f;

    /* renamed from: g, reason: collision with root package name */
    public tp f60171g;

    /* renamed from: h, reason: collision with root package name */
    public tp f60172h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f60173i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f mediaUtils, h crashReporting, v viewResources, d presenterPinalytics, q networkStateStream, ag1.b dataManager, t storyPinLocalDataRepository, s1 experiments) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(mediaUtils, "mediaUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f60165a = mediaUtils;
        this.f60166b = crashReporting;
        this.f60167c = viewResources;
        this.f60168d = dataManager;
        this.f60169e = storyPinLocalDataRepository;
        this.f60173i = new LinkedHashMap();
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        du0.a view = (du0.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        Iterator it = this.f60173i.entrySet().iterator();
        while (it.hasNext()) {
            ((MediaMetadataRetriever) ((Map.Entry) it.next()).getValue()).release();
            it.remove();
        }
        super.onUnbind();
    }

    public g p3(qq overlayBlock) {
        Intrinsics.checkNotNullParameter(overlayBlock, "overlayBlock");
        return new g(overlayBlock, null);
    }

    public hv0.c q3(tp pageData, so canvasAspectRatio) {
        Intrinsics.checkNotNullParameter(pageData, "pageData");
        Intrinsics.checkNotNullParameter(canvasAspectRatio, "canvasAspectRatio");
        vn0 mediaList = pageData.getMediaList();
        fo audioMix = pageData.getAudioMix();
        boolean a13 = pageData.a();
        sp audioList = pageData.getAudioList();
        List drawingPathList = pageData.getDrawingPathList();
        List overlayBlocks = pageData.getOverlayBlocks();
        ArrayList arrayList = new ArrayList(g0.q(overlayBlocks, 10));
        Iterator it = overlayBlocks.iterator();
        while (it.hasNext()) {
            arrayList.add(p3((qq) it.next()));
        }
        return new hv0.c(mediaList, a13, audioMix, audioList, canvasAspectRatio, drawingPathList, arrayList, pageData.getPageBackgroundColor());
    }

    @Override // yk1.p
    public void r3(du0.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((fu0.d) view).f62983u0 = this;
        xj2.c F = ((l) this.f60169e).S(this.f60168d.d()).F(new au0.h(17, new a(this, 0)), new au0.h(18, new a(this, 1)), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public void s3() {
        getPinalytics().X(u0.CANCEL_BUTTON);
        tp tpVar = this.f60171g;
        if (tpVar == null) {
            return;
        }
        ln0 ln0Var = this.f60170f;
        if (ln0Var != null) {
            ((l) this.f60169e).W(ln0.a(ln0Var, null, tpVar, null, null, null, null, false, null, null, null, null, 16379));
        }
        ((du0.a) getView()).dismiss();
    }

    public void t3() {
        getPinalytics().X(u0.DONE_BUTTON);
        ((du0.a) getView()).dismiss();
    }

    public void u3() {
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
    }

    public void v3(int i13, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
    }

    public final void w3() {
        tp tpVar;
        ln0 ln0Var = this.f60170f;
        if (ln0Var == null || (tpVar = this.f60172h) == null) {
            return;
        }
        ((l) this.f60169e).W(ln0.a(ln0Var, null, tpVar.q(false, true), null, null, null, null, false, null, null, null, null, 16379));
    }
}
