package e92;

import android.webkit.CookieManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f57918i = new c(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CookieManager cookieManager = CookieManager.getInstance();
        Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
        return cookieManager;
    }
}
