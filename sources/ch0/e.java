package ch0;

import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.callout.GestaltCallout;
import kotlin.jvm.internal.Intrinsics;
import yk1.n;

/* loaded from: classes5.dex */
public final class e extends FrameLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final View f27738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(GestaltCallout contentView) {
        super(contentView.getContext());
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        this.f27738a = contentView;
        addView(contentView, -1, -2);
    }
}
