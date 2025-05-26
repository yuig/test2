package df;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.search.SearchView;
import com.pinterest.education.ActionPromptView;
import com.pinterest.feature.gridactions.pingridhide.view.PinGridHideView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54798a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v13, MotionEvent event) {
        switch (this.f54798a) {
            case 0:
                if (!v13.hasFocus()) {
                    v13.requestFocus();
                }
                return false;
            case 1:
                int i13 = SearchView.B;
                return true;
            case 2:
                HashMap hashMap = ActionPromptView.f44950m;
                return true;
            case 3:
                int i14 = PinGridHideView.f45721x;
                return true;
            case 4:
            default:
                return true;
            case 5:
                Intrinsics.checkNotNullParameter(v13, "v");
                Intrinsics.checkNotNullParameter(event, "event");
                v13.getParent().requestDisallowInterceptTouchEvent(true);
                if ((event.getAction() & 255) == 1) {
                    v13.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
        }
    }
}
