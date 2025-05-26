package f6;

import android.view.View;
import android.view.WindowInsets;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes3.dex */
public final class a implements View.OnApplyWindowInsetsListener {
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z13 = false;
        boolean z14 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f18199w = windowInsets;
        drawerLayout.f18200x = z14;
        if (!z14 && drawerLayout.getBackground() == null) {
            z13 = true;
        }
        drawerLayout.setWillNotDraw(z13);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
