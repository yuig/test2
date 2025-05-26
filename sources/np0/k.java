package np0;

import android.view.View;
import com.pinterest.feature.closeup.view.PinCloseupFloatingActionBarBehavior;

/* loaded from: classes5.dex */
public final class k implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFloatingActionBarBehavior f91756b;

    public /* synthetic */ k(PinCloseupFloatingActionBarBehavior pinCloseupFloatingActionBarBehavior, int i13) {
        this.f91755a = i13;
        this.f91756b = pinCloseupFloatingActionBarBehavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        int i24 = this.f91755a;
        PinCloseupFloatingActionBarBehavior pinCloseupFloatingActionBarBehavior = this.f91756b;
        switch (i24) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                pinCloseupFloatingActionBarBehavior.f45468i = view.getHeight();
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                pinCloseupFloatingActionBarBehavior.f45470k = view.getHeight();
                break;
        }
    }
}
