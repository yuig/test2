package dg1;

import a42.f;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import ku1.k;
import net.quikkly.android.utils.BitmapUtils;
import nx.b0;
import nx.d0;
import vq0.h;
import yk1.v;

/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f54932a;

    /* renamed from: b, reason: collision with root package name */
    public final v f54933b;

    /* renamed from: c, reason: collision with root package name */
    public final k f54934c;

    /* renamed from: d, reason: collision with root package name */
    public final b60.b f54935d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f54936e;

    /* renamed from: f, reason: collision with root package name */
    public final u0 f54937f;

    /* renamed from: g, reason: collision with root package name */
    public final g0 f54938g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f54939h;

    /* renamed from: i, reason: collision with root package name */
    public final String f54940i;

    /* renamed from: j, reason: collision with root package name */
    public final f f54941j;

    /* renamed from: k, reason: collision with root package name */
    public final cg1.a f54942k;

    /* renamed from: l, reason: collision with root package name */
    public final b0 f54943l;

    public c(d0 pinalytics, v viewResources, k screenNavigator, b60.b bVar, String str, f ideaPinBlockType, cg1.a aVar, b0 pinAuxHelper, int i13) {
        boolean z13 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0;
        str = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str;
        ideaPinBlockType = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? f.PRODUCT_STICKER : ideaPinBlockType;
        aVar = (i13 & 1024) != 0 ? null : aVar;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(screenNavigator, "screenNavigator");
        Intrinsics.checkNotNullParameter(ideaPinBlockType, "ideaPinBlockType");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f54932a = pinalytics;
        this.f54933b = viewResources;
        this.f54934c = screenNavigator;
        this.f54935d = bVar;
        this.f54936e = null;
        this.f54937f = null;
        this.f54938g = null;
        this.f54939h = z13;
        this.f54940i = str;
        this.f54941j = ideaPinBlockType;
        this.f54942k = aVar;
        this.f54943l = pinAuxHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r1 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        r1 = java.lang.Integer.valueOf(m60.s0.ic_try_on_grid_nonpds);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0080, code lost:
    
        if (r1 != false) goto L23;
     */
    @Override // vq0.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(yk1.n r24, java.lang.Object r25, int r26) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dg1.c.c(yk1.n, java.lang.Object, int):void");
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        f30 model = (f30) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
