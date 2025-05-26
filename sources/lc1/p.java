package lc1;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.gestalt.buttonToggle.GestaltButtonToggle;
import kc1.w;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends LinearLayout implements yk1.n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltButtonToggle f82901a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(FragmentActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelOffset(eo1.c.space_200));
        setLayoutParams(layoutParams);
        setOrientation(1);
        GestaltButtonToggle gestaltButtonToggle = new GestaltButtonToggle(6, activity, (AttributeSet) null);
        gestaltButtonToggle.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        gestaltButtonToggle.setImportantForAccessibility(2);
        addView(gestaltButtonToggle);
        this.f82901a = gestaltButtonToggle;
    }

    public final void a(kc1.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        w wVar = new w(state, 5);
        GestaltButtonToggle gestaltButtonToggle = this.f82901a;
        u2.x(gestaltButtonToggle, wVar);
        u2.x(gestaltButtonToggle, new r1.f(state.f79133c, this, 27));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        return true;
    }
}
