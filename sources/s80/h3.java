package s80;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h3 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f111568a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Context context, Function1 function1) {
        super(context);
        this.f111568a = function1;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        this.f111568a.invoke(ev2);
        return super.onInterceptTouchEvent(ev2);
    }
}
