package e82;

import android.net.Uri;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final lu1.b f57889a;

    /* renamed from: b, reason: collision with root package name */
    public final cr1.a f57890b;

    public p(lu1.b activityHelper, cr1.a accountService) {
        Intrinsics.checkNotNullParameter(activityHelper, "activityHelper");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        this.f57889a = activityHelper;
        this.f57890b = accountService;
    }

    public static LinkedHashMap a(Uri uri) {
        LinkedHashMap r13 = z0.r(new HashMap());
        String queryParameter = uri.getQueryParameter("code");
        if (queryParameter == null) {
            queryParameter = "";
        }
        r13.put("one_time_code", queryParameter);
        r13.put("redirect_uri", "https://pinterest.com/connect/instagram/");
        r13.put("is_graph_api", "true");
        r13.put("is_new_api", "true");
        return r13;
    }
}
