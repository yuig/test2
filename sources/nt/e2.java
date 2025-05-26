package nt;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.pinterest.activity.pin.view.PinCloseUpWebImageView;
import com.pinterest.ads.feature.owc.leadgen.bottomSheet.SbaAdsLeadGenExpandView;
import com.pinterest.ads.feature.owc.view.collection.AdsProductView;
import java.text.SimpleDateFormat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f92028b;

    public /* synthetic */ e2(Object obj, int i13) {
        this.f92027a = i13;
        this.f92028b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        PinCloseUpWebImageView pinCloseUpWebImageView;
        int i13 = this.f92027a;
        int i14 = 0;
        Object obj = this.f92028b;
        switch (i13) {
            case 0:
                SbaAdsLeadGenExpandView this$0 = (SbaAdsLeadGenExpandView) obj;
                int i15 = SbaAdsLeadGenExpandView.f35271w;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int scrollY = this$0.f35272a.getScrollY();
                View view = this$0.f35273b;
                if (scrollY == 0) {
                    bs1.c.X0(view);
                } else {
                    bs1.c.U1(view);
                }
                ScrollView scrollView = this$0.f35272a;
                int bottom = scrollView.getChildAt(0).getBottom();
                int scrollY2 = scrollView.getScrollY() + scrollView.getHeight();
                View view2 = this$0.f35274c;
                if (bottom <= scrollY2) {
                    bs1.c.X0(view2);
                    return;
                } else {
                    bs1.c.U1(view2);
                    return;
                }
            case 1:
                AdsProductView this$02 = (AdsProductView) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                boolean z13 = this$02.f35348k;
                xk2.v vVar = this$02.f35350m;
                Rect rect = this$02.f35347j;
                if (!z13) {
                    this$02.getLocalVisibleRect(rect);
                    if (rect.top < ((Number) vVar.getValue()).intValue()) {
                        this$02.f35348k = true;
                        m60.w wVar = this$02.f35341d;
                        if (wVar == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        wVar.d(new eu.w(this$02.f35352o, this$02.i()));
                    }
                }
                if (this$02.f35348k) {
                    this$02.getLocalVisibleRect(rect);
                    if (rect.height() + rect.top >= 0) {
                        this$02.getLocalVisibleRect(rect);
                        if (rect.top <= ((Number) vVar.getValue()).intValue()) {
                            return;
                        }
                    }
                    this$02.f35349l = true;
                    m60.w wVar2 = this$02.f35341d;
                    if (wVar2 == null) {
                        Intrinsics.r("eventManager");
                        throw null;
                    }
                    wVar2.d(new eu.v(this$02.i()));
                    this$02.getViewTreeObserver().removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener) this$02.f35351n.getValue());
                    return;
                }
                return;
            case 2:
                z51.e this$03 = (z51.e) obj;
                SimpleDateFormat simpleDateFormat = z51.e.f140868a1;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.i9();
                return;
            case 3:
                com.pinterest.feature.search.visual.cropper.m this$04 = (com.pinterest.feature.search.visual.cropper.m) obj;
                int i16 = com.pinterest.feature.search.visual.cropper.m.H;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                ScrollView scrollView2 = this$04.B;
                float scrollY3 = scrollView2 != null ? scrollView2.getScrollY() : 0;
                float f13 = -scrollY3;
                f91.b bVar = this$04.f48040y;
                oq.j jVar = bVar.f96995t;
                if (jVar != null && (pinCloseUpWebImageView = jVar.f97066l) != null) {
                    i14 = pinCloseUpWebImageView.getHeight();
                }
                bVar.E(new RectF(0.0f, f13, this$04.f48011v, i14 - scrollY3), true);
                return;
            default:
                ha.a this$05 = (ha.a) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Function0 function0 = (Function0) this$05.f68324i;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
        }
    }
}
