package hu0;

import ag1.h;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.to;
import com.pinterest.api.model.tp;
import com.pinterest.feature.pin.creation.view.ThumbnailScrubber;
import com.pinterest.feature.pin.creation.view.ThumbnailScrubberPreview;
import dl1.t;
import go0.r;
import java.util.ArrayList;
import kh2.k3;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.s1;
import uj2.q;

/* loaded from: classes5.dex */
public final class g extends eu0.c {

    /* renamed from: j, reason: collision with root package name */
    public final Context f70407j;

    /* renamed from: k, reason: collision with root package name */
    public final ag1.b f70408k;

    /* renamed from: l, reason: collision with root package name */
    public final bw0.f f70409l;

    /* renamed from: m, reason: collision with root package name */
    public final t f70410m;

    /* renamed from: n, reason: collision with root package name */
    public final h f70411n;

    /* renamed from: o, reason: collision with root package name */
    public to f70412o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f70413p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yk1.a viewResources, uk1.d presenterPinalytics, Context context, rw0.f mediaUtils, tb0.h crashReporting, q networkStateStream, ag1.b ideaPinComposeDataManager, bw0.f storyPinWorkerUtils, t storyPinLocalDataRepository, s1 experiments, h ideaPinSessionDataManager) {
        super(mediaUtils, crashReporting, viewResources, presenterPinalytics, networkStateStream, ideaPinComposeDataManager, storyPinLocalDataRepository, experiments);
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaUtils, "mediaUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(storyPinWorkerUtils, "storyPinWorkerUtils");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(ideaPinSessionDataManager, "ideaPinSessionDataManager");
        this.f70407j = context;
        this.f70408k = ideaPinComposeDataManager;
        this.f70409l = storyPinWorkerUtils;
        this.f70410m = storyPinLocalDataRepository;
        this.f70411n = ideaPinSessionDataManager;
        this.f70412o = new to(0, 0L, 0);
    }

    public final void B3() {
        to toVar;
        tp pageData;
        if (this.f70413p == null) {
            ln0 ln0Var = this.f60170f;
            if (ln0Var == null || (pageData = ln0Var.getPageData()) == null || (toVar = pageData.getCoverImageData()) == null) {
                toVar = this.f70412o;
            }
            this.f70412o = toVar;
            this.f70413p = Integer.valueOf(toVar.getMediaPercentage());
            ((e) ((a) getView())).d8(this.f70412o);
            a aVar = (a) getView();
            int mediaPercentage = this.f70412o.getMediaPercentage();
            ThumbnailScrubber thumbnailScrubber = ((e) aVar).C0;
            if (thumbnailScrubber == null) {
                Intrinsics.r("scrubberSelector");
                throw null;
            }
            thumbnailScrubber.b(mediaPercentage);
            D3(this.f70412o.getMediaPercentage());
        }
    }

    public final void D3(int i13) {
        ArrayList arrayList;
        Bitmap bitmap;
        int min = Math.min(ml2.c.c((i13 / 100) * 8), 7);
        e eVar = (e) ((a) getView());
        ThumbnailScrubberPreview thumbnailScrubberPreview = eVar.f62972j0;
        if (thumbnailScrubberPreview == null || (arrayList = thumbnailScrubberPreview.f47115e) == null || (bitmap = (Bitmap) arrayList.get(min)) == null) {
            return;
        }
        ThumbnailScrubber thumbnailScrubber = eVar.C0;
        if (thumbnailScrubber != null) {
            thumbnailScrubber.e(bitmap);
        } else {
            Intrinsics.r("scrubberSelector");
            throw null;
        }
    }

    @Override // eu0.c
    public final void v3(int i13, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (i13 == 0) {
            e eVar = (e) ((a) getView());
            eVar.getClass();
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            ThumbnailScrubber thumbnailScrubber = eVar.C0;
            if (thumbnailScrubber != null) {
                thumbnailScrubber.e(bitmap);
            } else {
                Intrinsics.r("scrubberSelector");
                throw null;
            }
        }
    }

    @Override // eu0.c
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public final void r3(a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        Unit unit = Unit.f80348a;
        e eVar = (e) view;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(this, "listener");
        ThumbnailScrubber thumbnailScrubber = eVar.C0;
        if (thumbnailScrubber == null) {
            Intrinsics.r("scrubberSelector");
            throw null;
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        thumbnailScrubber.f47107a = this;
        Intrinsics.checkNotNullParameter(this, "coverImagePickerListener");
        ((e) view).D0 = this;
    }

    public final void z3() {
        tp pageData;
        ln0 ln0Var = this.f60170f;
        if (ln0Var == null) {
            return;
        }
        Integer num = this.f70413p;
        int mediaPercentage = this.f70412o.getMediaPercentage();
        if ((num != null && num.intValue() == mediaPercentage) || (pageData = ln0Var.getPageData()) == null) {
            return;
        }
        Context context = this.f70407j;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.g(applicationContext, "null cannot be cast to non-null type android.app.Application");
        s0.E((Application) applicationContext, context, pageData, k3.a0(ln0Var), this.f70412o).l(tk2.e.f118017c).o(new au0.h(25, new r(pageData, this, ln0Var, 20)), new au0.h(26, d.f70403l));
    }
}
