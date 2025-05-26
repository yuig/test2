package hi2;

import android.app.Activity;
import android.view.Window;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh2.g;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final lh2.b f69251a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f69252b;

    public f(lh2.b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f69251a = logger;
        this.f69252b = new ConcurrentHashMap();
    }

    public final void a(Activity activity, Function0 drawBeginCallback, Function0 firstFrameDeliveredCallback) {
        c cVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(drawBeginCallback, "drawBeginCallback");
        Intrinsics.checkNotNullParameter(firstFrameDeliveredCallback, "firstFrameDeliveredCallback");
        Intrinsics.checkNotNullParameter(activity, "activity");
        int hashCode = activity.hashCode();
        ConcurrentHashMap concurrentHashMap = this.f69252b;
        if (concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
            return;
        }
        Window window = activity.getWindow();
        if (window.getCallback() == null) {
            if (concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                return;
            }
            ((lh2.e) this.f69251a).b(g.UI_CALLBACK_FAIL, new IllegalStateException("Fail to attach frame rendering callback because the callback on Window was null"));
            concurrentHashMap.put(Integer.valueOf(hashCode), e.f69250i);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(window, "window");
        d dVar = new d(window, this, hashCode, drawBeginCallback, firstFrameDeliveredCallback);
        if (window.getCallback() != null) {
            if (window.peekDecorView() != null) {
                dVar.invoke();
                return;
            }
            ax1.a aVar = new ax1.a(28, dVar);
            Window.Callback currentCallback = window.getCallback();
            if (currentCallback instanceof c) {
                cVar = (c) currentCallback;
            } else {
                Intrinsics.checkNotNullExpressionValue(currentCallback, "currentCallback");
                c cVar2 = new c(currentCallback);
                window.setCallback(cVar2);
                cVar = cVar2;
            }
            cVar.f69243b.add(aVar);
        }
    }
}
