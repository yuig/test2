package he0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.messaging.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tb0.h;
import vy.m;

/* loaded from: classes.dex */
public interface b {
    q R2();

    String b();

    h b6();

    b60.b getActiveUserManager();

    m getAnalyticsApi();

    Context getApplicationContext();

    Intent getIntent();

    Uri getReferrer();

    a p3();

    default boolean v5() {
        if (Intrinsics.d(b(), "PUSH_NOTIF") || Intrinsics.d(b(), "PULL_NOTIF")) {
            return false;
        }
        String valueOf = String.valueOf(getReferrer());
        String packageName = getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return StringsKt.E(valueOf, packageName, false) && !StringsKt.E(String.valueOf(getReferrer()), "app.appsflyer.com", false);
    }
}
