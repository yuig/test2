package cu;

import ac2.o1;
import android.view.KeyEvent;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.ads.feature.owc.view.collection.AdsCollectionScrollingModule;
import com.pinterest.ads.onetap.view.SwipeAwareScrollView;
import com.pinterest.ui.grid.PinterestAdapterView;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.scrollview.ObservableScrollView;
import kh2.k3;
import qa2.c0;

/* loaded from: classes3.dex */
public final class q extends aa2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ObservableScrollView f53248b;

    public q(ObservableScrollView observableScrollView, int i13) {
        this.f53247a = i13;
        this.f53248b = observableScrollView;
    }

    @Override // aa2.c
    public final void a(int i13, int i14) {
        int i15 = this.f53247a;
        ObservableScrollView observableScrollView = this.f53248b;
        switch (i15) {
            case 0:
                ((BaseAdsScrollingModule) observableScrollView).M1(i13);
                break;
            case 1:
                AdsCollectionScrollingModule adsCollectionScrollingModule = (AdsCollectionScrollingModule) observableScrollView;
                adsCollectionScrollingModule.N0 = i13;
                adsCollectionScrollingModule.w2(i13);
                break;
            case 2:
                ((o1) ((SwipeAwareScrollView) observableScrollView).R).w();
                break;
            default:
                PinterestGridView pinterestGridView = (PinterestGridView) observableScrollView;
                pinterestGridView.Q.h();
                if (k3.v1(pinterestGridView.R)) {
                    float f13 = hf0.b.f69003c;
                    float y13 = pinterestGridView.R.getY() + pinterestGridView.R.f52376d;
                    boolean z13 = ((float) i14) + f13 > y13;
                    boolean z14 = ((float) i13) + f13 > y13;
                    if (!z13 && z14) {
                        new hy.g().i();
                        break;
                    }
                }
                break;
        }
    }

    @Override // aa2.c
    public final void b() {
        int i13 = this.f53247a;
        ObservableScrollView observableScrollView = this.f53248b;
        switch (i13) {
            case 0:
                BaseAdsScrollingModule baseAdsScrollingModule = (BaseAdsScrollingModule) observableScrollView;
                baseAdsScrollingModule.f35329p0 = true;
                if (baseAdsScrollingModule.f35316c0) {
                    baseAdsScrollingModule.O1();
                    break;
                }
                break;
            case 1:
                int i14 = AdsCollectionScrollingModule.U0;
                ((AdsCollectionScrollingModule) observableScrollView).O1();
                break;
        }
    }

    @Override // aa2.c
    public final void c() {
        switch (this.f53247a) {
            case 3:
                PinterestAdapterView pinterestAdapterView = ((PinterestGridView) this.f53248b).Q;
                int childCount = pinterestAdapterView.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    KeyEvent.Callback childAt = pinterestAdapterView.getChildAt(i13);
                    if (childAt instanceof c0) {
                        ((c0) childAt).onScrollStarted();
                    }
                }
                break;
        }
    }
}
