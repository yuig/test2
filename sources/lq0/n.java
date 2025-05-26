package lq0;

import android.view.MotionEvent;
import android.view.View;
import com.pinterest.feature.conversation.view.ConversationMessageItemView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class n implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y92.c f84369b;

    public /* synthetic */ n(y92.c cVar, int i13) {
        this.f84368a = i13;
        this.f84369b = cVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i13 = this.f84368a;
        y92.c gestureDetectorCompat = this.f84369b;
        switch (i13) {
            case 0:
                int i14 = ConversationMessageItemView.f45540e1;
                Intrinsics.checkNotNullParameter(gestureDetectorCompat, "$gestureDetectorCompat");
                Intrinsics.f(motionEvent);
                break;
            default:
                int i15 = sf1.u1.f112760b;
                Intrinsics.checkNotNullParameter(gestureDetectorCompat, "$customGestureDetector");
                Intrinsics.f(motionEvent);
                break;
        }
        return gestureDetectorCompat.c(motionEvent);
    }
}
