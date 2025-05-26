package ne0;

import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.ui.components.rangesliders.RangeProgressBar;
import com.pinterest.ui.menu.SpringLinearLayout;
import com.pinterest.ui.scrollview.ObservableScrollView;
import gk2.c3;
import gk2.s;
import java.util.ArrayList;
import java.util.HashSet;
import jk2.q;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import ma2.d;
import org.chromium.net.NetworkChangeNotifierAutoDetect;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;
import q01.l;
import q01.y;
import ro0.e;
import sf1.k0;
import to0.g;
import yk1.i;

/* loaded from: classes5.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90446b;

    public /* synthetic */ b(Object obj, int i13) {
        this.f90445a = i13;
        this.f90446b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z13;
        switch (this.f90445a) {
            case 0:
                c cVar = (c) this.f90446b;
                cVar.f90456j = true;
                View view = cVar.f90447a;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 1:
                g gVar = (g) this.f90446b;
                WebView webView = gVar.f118652f0;
                if (webView != null) {
                    webView.stopLoading();
                }
                if (gVar.E4() != null) {
                    gVar.E4().setResult(-1);
                    gVar.E4().finish();
                    return;
                }
                return;
            case 2:
                e eVar = (e) this.f90446b;
                if (eVar.f108945f) {
                    return;
                }
                eVar.x3(x0.pinmarklet_link_loading_error);
                return;
            case 3:
                com.pinterest.feature.home.view.a aVar = (com.pinterest.feature.home.view.a) this.f90446b;
                StaggeredGridLayoutManager staggeredGridLayoutManager = aVar.f45840a;
                int i13 = aVar.f45843d;
                staggeredGridLayoutManager.h(null);
                if (i13 == staggeredGridLayoutManager.C) {
                    return;
                }
                if (i13 != 0 && i13 != 2) {
                    throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
                }
                staggeredGridLayoutManager.C = i13;
                staggeredGridLayoutManager.J0();
                return;
            case 4:
                ((GestaltTextField) this.f90446b).d0();
                return;
            case 5:
                ((PinCloseupFragment) ((l) this.f90446b).f101797a).J9(i.LOADED);
                return;
            case 6:
                ((PinCloseupFragment) ((y) this.f90446b).f101842b).J9(i.LOADED);
                return;
            case 7:
                k0 k0Var = (k0) this.f90446b;
                if (!k0Var.f112642f) {
                    k0Var.f112640d = k0Var.f112640d + 1;
                    k0Var.f112643g = (r1 * 50) / 5000;
                    k0Var.f112637a.run();
                }
                k0Var.f112638b.postDelayed(this, 50L);
                return;
            case 8:
                RangeProgressBar rangeProgressBar = (RangeProgressBar) this.f90446b;
                synchronized (rangeProgressBar) {
                    try {
                        int size = rangeProgressBar.f52318w.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            Object obj = rangeProgressBar.f52318w.get(i14);
                            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            d dVar = (d) obj;
                            rangeProgressBar.a(dVar.f86829a, dVar.f86830b, dVar.f86831c, dVar.f86832d, true, dVar.f86833e);
                            d.f86828f.a(dVar);
                        }
                        rangeProgressBar.f52318w.clear();
                        rangeProgressBar.f52314s = false;
                        Unit unit = Unit.f80348a;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 9:
                ((SpringLinearLayout) this.f90446b).b();
                return;
            case 10:
                if (((ObservableScrollView) this.f90446b).f52641J) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ObservableScrollView observableScrollView = (ObservableScrollView) this.f90446b;
                    if (currentTimeMillis - observableScrollView.L <= 100) {
                        observableScrollView.postDelayed(this, 100L);
                        return;
                    }
                    ArrayList arrayList = observableScrollView.F;
                    int size2 = arrayList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        ((aa2.c) arrayList.get(i15)).b();
                    }
                    ObservableScrollView observableScrollView2 = (ObservableScrollView) this.f90446b;
                    observableScrollView2.L = -1L;
                    observableScrollView2.M = -1;
                    observableScrollView2.f52641J = false;
                    observableScrollView2.K = false;
                    observableScrollView2.removeCallbacks(observableScrollView2.N);
                    return;
                }
                return;
            case 11:
                Object obj2 = this.f90446b;
                try {
                    ((s) obj2).f65609a.a();
                    return;
                } finally {
                    ((s) obj2).f65612d.dispose();
                }
            case 12:
                ((c3) this.f90446b).f65367c.cancel();
                return;
            case 13:
                Object obj3 = this.f90446b;
                try {
                    ((q) obj3).f76642a.a();
                    return;
                } finally {
                    ((q) obj3).f76645d.dispose();
                }
            case 14:
                NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = (NetworkChangeNotifierAutoDetect) this.f90446b;
                z13 = networkChangeNotifierAutoDetect.mIgnoreNextBroadcast;
                if (z13) {
                    networkChangeNotifierAutoDetect.mIgnoreNextBroadcast = false;
                    return;
                } else {
                    networkChangeNotifierAutoDetect.connectionTypeChanged();
                    return;
                }
            case 15:
                synchronized (((CronetUploadDataStream) this.f90446b).f97384i) {
                    try {
                        Object obj4 = this.f90446b;
                        if (((CronetUploadDataStream) obj4).f97385j == 0) {
                            return;
                        }
                        ((CronetUploadDataStream) obj4).a(3);
                        Object obj5 = this.f90446b;
                        ((CronetUploadDataStream) obj5).f97386k = 1;
                        try {
                            ((CronetUploadDataStream) obj5).f97378c.d();
                            Object obj6 = this.f90446b;
                            ((CronetUploadDataStream) obj6).f97377b.rewind((CronetUploadDataStream) obj6);
                            return;
                        } catch (Exception e13) {
                            ((CronetUploadDataStream) this.f90446b).d(e13);
                            return;
                        }
                    } finally {
                    }
                }
            default:
                Object obj7 = this.f90446b;
                try {
                    ((CronetUrlRequest) obj7).f97397j.onFailed((CronetUrlRequest) obj7, ((CronetUrlRequest) obj7).A, ((CronetUrlRequest) obj7).C);
                } catch (Exception e14) {
                    HashSet hashSet = CronetUrlRequestContext.f97414w;
                    Log.e("cr_CronetUrlRequestContext", "Exception in onFailed method", e14);
                }
                CronetUrlRequest.a((CronetUrlRequest) obj7);
                return;
        }
    }

    public b(e eVar) {
        this.f90445a = 2;
        this.f90446b = eVar;
    }
}
