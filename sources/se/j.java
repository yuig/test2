package se;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.v;
import df.y;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f112368a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f112369b = new AtomicBoolean(false);

    public static final void a() {
        if (p001if.a.b(j.class)) {
            return;
        }
        try {
            if (f112369b.get()) {
                if (f112368a.b()) {
                    y yVar = y.f54881a;
                    if (y.b(v.IapLoggingLib2)) {
                        d.b(le.v.a());
                        return;
                    }
                }
                c.b();
            }
        } catch (Throwable th3) {
            p001if.a.a(j.class, th3);
        }
    }

    public final boolean b() {
        String string;
        List split$default;
        if (p001if.a.b(this)) {
            return false;
        }
        try {
            Context a13 = le.v.a();
            ApplicationInfo applicationInfo = a13.getPackageManager().getApplicationInfo(a13.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            if (applicationInfo == null || (string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version")) == null) {
                return false;
            }
            split$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 3, 2, null);
            return Integer.parseInt((String) split$default.get(0)) >= 2;
        } catch (Exception unused) {
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
        return false;
    }
}
