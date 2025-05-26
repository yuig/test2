package b11;

import android.view.View;
import androidx.recyclerview.widget.q2;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y extends androidx.recyclerview.widget.a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFragment f21091b;

    public y(PinCloseupFragment pinCloseupFragment) {
        this.f21091b = pinCloseupFragment;
    }

    @Override // androidx.recyclerview.widget.a0
    public final View j(q2 recycler, int i13) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        PinCloseupFragment pinCloseupFragment = this.f21091b;
        if (i13 == 87) {
            return pinCloseupFragment.f46991g2;
        }
        if (i13 != 107) {
            return null;
        }
        return pinCloseupFragment.f46994h2;
    }
}
