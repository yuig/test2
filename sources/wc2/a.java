package wc2;

import android.util.Log;
import android.webkit.JavascriptInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class a {
    @JavascriptInterface
    public final void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("WebviewPin", "JS logging: " + message);
    }
}
