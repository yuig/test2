package fu0;

import android.view.MotionEvent;
import android.view.View;
import com.pinterest.feature.ideaPinCreation.common.view.IdeaPinEditablePageLite;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class g implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f62989b;

    public /* synthetic */ g(int i13, Function1 function1) {
        this.f62988a = i13;
        this.f62989b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i13 = this.f62988a;
        Function1 onTapCallback = this.f62989b;
        switch (i13) {
            case 0:
                int i14 = IdeaPinEditablePageLite.A;
                if (motionEvent.getAction() == 0 && (view instanceof i) && ((i) view).n(motionEvent)) {
                    onTapCallback.invoke(new sp0.d(motionEvent.getX(), motionEvent.getY()));
                    break;
                }
                break;
            default:
                int i15 = hh1.d.f69155j;
                Intrinsics.checkNotNullParameter(onTapCallback, "$onTapCallback");
                if (motionEvent.getAction() == 1) {
                    Intrinsics.f(view);
                    onTapCallback.invoke(view);
                }
                view.performClick();
                break;
        }
        return true;
    }
}
