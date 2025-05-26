package lv;

import android.content.Context;
import android.webkit.CookieManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f84977a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84977a = context;
    }

    public static boolean a() {
        try {
            CookieManager.getInstance();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
