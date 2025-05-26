package df;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r extends t1 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f54838p = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f54839o;

    static {
        Intrinsics.checkNotNullExpressionValue(r.class.getName(), "FacebookWebFallbackDialog::class.java.name");
    }

    public static void g(r this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.cancel();
    }

    @Override // df.t1
    public final Bundle c(String str) {
        Bundle q13 = j1.q1(Uri.parse(str).getQuery());
        String string = q13.getString("bridge_args");
        q13.remove("bridge_args");
        if (!j1.V0(string)) {
            try {
                q13.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", g.a(new JSONObject(string)));
            } catch (JSONException unused) {
                le.v vVar = le.v.f83104a;
            }
        }
        String string2 = q13.getString("method_results");
        q13.remove("method_results");
        if (!j1.V0(string2)) {
            try {
                q13.putBundle("com.facebook.platform.protocol.RESULT_ARGS", g.a(new JSONObject(string2)));
            } catch (JSONException unused2) {
                le.v vVar2 = le.v.f83104a;
            }
        }
        q13.remove("version");
        y0 y0Var = y0.f54883a;
        int i13 = 0;
        if (!p001if.a.b(y0.class)) {
            try {
                i13 = y0.f54887e[0].intValue();
            } catch (Throwable th3) {
                p001if.a.a(y0.class, th3);
            }
        }
        q13.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", i13);
        return q13;
    }

    @Override // df.t1, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        s1 s1Var = this.f54850d;
        if (!this.f54857k || this.f54855i || s1Var == null || !s1Var.isShown()) {
            super.cancel();
        } else {
            if (this.f54839o) {
                return;
            }
            this.f54839o = true;
            s1Var.loadUrl(Intrinsics.n("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();", "javascript:"));
            new Handler(Looper.getMainLooper()).postDelayed(new com.airbnb.lottie.k(this, 11), BaseRecyclerCellView.AUTOSCROLL_DELAY);
        }
    }
}
