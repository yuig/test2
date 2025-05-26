package sf1;

import a.m2;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 extends LinearLayout implements yk1.n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f112653b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final y92.c f112654a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Context context, y92.c customGestureDetector) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customGestureDetector, "customGestureDetector");
        this.f112654a = customGestureDetector;
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        FullBleedGestaltSpinner fullBleedGestaltSpinner = new FullBleedGestaltSpinner(6, context, (AttributeSet) null);
        fullBleedGestaltSpinner.a(ln1.e.LOADING);
        fullBleedGestaltSpinner.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        fullBleedGestaltSpinner.setBackgroundColor(bs1.c.B(fullBleedGestaltSpinner, eo1.b.color_black_900));
        fullBleedGestaltSpinner.setAlpha(1.0f);
        addView(fullBleedGestaltSpinner);
        setOnTouchListener(new m2(this, 15));
    }
}
