package le;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.facebook.FacebookException;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f83102b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f83103c;

    public /* synthetic */ u(int i13, Context context, String str) {
        this.f83101a = i13;
        this.f83102b = context;
        this.f83103c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f83101a;
        String applicationId = this.f83103c;
        Context applicationContext = this.f83102b;
        switch (i13) {
            case 0:
                v vVar = v.f83104a;
                Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                v vVar2 = v.f83104a;
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                if (p001if.a.b(vVar2)) {
                    return;
                }
                try {
                    df.c q13 = wc.b.q(applicationContext);
                    SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                    String n13 = Intrinsics.n("ping", applicationId);
                    long j13 = sharedPreferences.getLong(n13, 0L);
                    try {
                        HashMap hashMap = ue.e.f121949a;
                        JSONObject a13 = ue.e.a(ue.d.MOBILE_INSTALL_EVENT, q13, me.l.f86994b.p(applicationContext), v.g(applicationContext), applicationContext);
                        String format = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        v.f83122s.getClass();
                        String str = a0.f83002j;
                        a0 B = wc.b.B(null, format, a13, null);
                        if (j13 == 0 && B.d().f83046c == null) {
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.putLong(n13, System.currentTimeMillis());
                            edit.apply();
                            return;
                        }
                        return;
                    } catch (JSONException e13) {
                        throw new FacebookException("An error occurred while publishing install.", e13);
                    }
                } catch (Exception unused) {
                    return;
                } catch (Throwable th3) {
                    p001if.a.a(vVar2, th3);
                    return;
                }
            default:
                Intrinsics.checkNotNullParameter(applicationContext, "$context");
                View inflate = LayoutInflater.from(applicationContext).inflate(i92.d.view_brio_toast, (ViewGroup) null);
                ((GestaltText) inflate.findViewById(i92.c.title_tv)).i(new kw1.c(applicationId, 13));
                Toast toast = new Toast(applicationContext);
                toast.setView(inflate);
                toast.setGravity(81, 0, 0);
                toast.setDuration(1);
                toast.show();
                return;
        }
    }
}
