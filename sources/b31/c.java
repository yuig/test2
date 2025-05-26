package b31;

import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;
import com.pinterest.feature.search.results.hairpattern.view.HairPatternEducationView;
import com.pinterest.gestalt.sheet.container.GestaltSheetContainer;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import hn1.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21424b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f21423a = i13;
        this.f21424b = obj;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i13, int i14, int i15, int i16) {
        int i17 = this.f21423a;
        Object obj = this.f21424b;
        switch (i17) {
            case 0:
                g this$0 = (g) obj;
                int i18 = g.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                float dimension = this$0.getResources().getDimension(r0.about_drawer_header_elevation);
                if (i14 > 0) {
                    fo1.a i73 = this$0.i7();
                    GestaltToolbarImpl gestaltToolbarImpl = i73 != null ? (GestaltToolbarImpl) i73 : null;
                    if (gestaltToolbarImpl != null) {
                        gestaltToolbarImpl.setElevation(dimension);
                    }
                } else {
                    fo1.a i74 = this$0.i7();
                    GestaltToolbarImpl gestaltToolbarImpl2 = i74 != null ? (GestaltToolbarImpl) i74 : null;
                    if (gestaltToolbarImpl2 != null) {
                        gestaltToolbarImpl2.setElevation(0.0f);
                    }
                }
                if (this$0.e8()) {
                    return;
                }
                if (i14 > this$0.getResources().getDimensionPixelOffset(nz1.a.about_drawer_scroll_listener_height)) {
                    RelativeLayout relativeLayout = this$0.E0;
                    if (relativeLayout != null) {
                        bs1.c.U1(relativeLayout);
                        return;
                    } else {
                        Intrinsics.r("followCtaToast");
                        throw null;
                    }
                }
                RelativeLayout relativeLayout2 = this$0.E0;
                if (relativeLayout2 != null) {
                    bs1.c.X0(relativeLayout2);
                    return;
                } else {
                    Intrinsics.r("followCtaToast");
                    throw null;
                }
            case 1:
                HairPatternEducationView this$02 = (HairPatternEducationView) obj;
                List list = HairPatternEducationView.f47651h;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Rect rect = new Rect();
                this$02.g().getHitRect(rect);
                if (this$02.i().getLocalVisibleRect(rect)) {
                    return;
                }
                this$02.i().P(true);
                return;
            default:
                GestaltSheetContainer this$03 = (GestaltSheetContainer) obj;
                yl1.d dVar = GestaltSheetContainer.f49571w;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (i14 > i16) {
                    this$03.f49572p.s(new r(true));
                }
                if (i14 > 10 || i16 <= 10) {
                    return;
                }
                this$03.f49572p.s(new r(false));
                return;
        }
    }
}
