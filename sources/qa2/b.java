package qa2;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEventSource;
import com.pinterest.api.model.f30;
import com.pinterest.navigation.Navigation;
import h32.e4;
import h32.z1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface b extends Drawable.Callback, KeyEvent.Callback, AccessibilityEventSource, u1, c0, f0, y92.l, y92.g, qy.a, nx.v, y92.h {
    default void addToView(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.addView(asView());
    }

    void addVisibilityEvent(e4 e4Var);

    /* renamed from: getBottomVisible */
    boolean getG0();

    int getCornerRadius();

    Rect getFavoriteButtonRect();

    Rect getOverflowIconRect();

    /* renamed from: getPercentageVisible */
    int getN0();

    /* renamed from: getPin */
    f30 getC0();

    wa2.a getPinDrawable();

    int getPinDrawableHeight();

    /* renamed from: getPinImpression */
    z1 getE0();

    String getPinUid();

    /* renamed from: getTopVisible */
    boolean getH0();

    default int getViewHeight() {
        return asView().getHeight();
    }

    /* renamed from: isHideSupported */
    boolean getG();

    @Override // nx.v
    nx.c0 markImpressionEnd();

    @Override // nx.v
    nx.c0 markImpressionStart();

    void onAttached();

    void onInitialized();

    void setBottomVisible(boolean z13);

    void setNavigation(Navigation navigation);

    void setPercentageVisible(int i13);

    void setPinActionHandler(d0 d0Var);

    void setPinVideoGridCellControlsListener(m1 m1Var);

    void setPinalytics(nx.d0 d0Var);

    void setTag(int i13, Object obj);

    void setTopVisible(boolean z13);
}
