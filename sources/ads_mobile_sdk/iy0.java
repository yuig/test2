package ads_mobile_sdk;

import android.net.Uri;
import android.webkit.JavascriptInterface;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class iy0 {

    /* renamed from: a, reason: collision with root package name */
    public final ym0 f6580a;

    /* renamed from: b, reason: collision with root package name */
    public final ss2 f6581b;

    /* renamed from: c, reason: collision with root package name */
    public final sb2 f6582c;

    /* renamed from: d, reason: collision with root package name */
    public final y4 f6583d;

    public iy0(ym0 webView, ss2 traceMetaSet, sb2 rootTraceCreator, y4 adSpamClient) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(adSpamClient, "adSpamClient");
        this.f6580a = webView;
        this.f6581b = traceMetaSet;
        this.f6582c = rootTraceCreator;
        this.f6583d = adSpamClient;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @NotNull
    public final String getClickSignals(@NotNull String clickString) {
        String str;
        Intrinsics.checkNotNullParameter(clickString, "clickString");
        if (clickString.length() == 0) {
            return "";
        }
        sb2 sb2Var = this.f6582c;
        il0 il0Var = il0.CUI_NAME_CLICK_SIGNALS;
        ss2 ss2Var = this.f6581b;
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        if (qs2.b().f9801a == null) {
            p12 a13 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
            try {
                String a14 = this.f6583d.a(this.f6580a, clickString);
                if (a14 instanceof jk0) {
                    ft2.a((jk0) a14);
                }
                dl2.b.J(a13, null);
                str = a14;
            } catch (Throwable th3) {
                try {
                    a13.b(th3);
                    if (th3 instanceof a.jf) {
                        throw th3;
                    }
                    a13.a(th3);
                    if (th3 instanceof TimeoutCancellationException) {
                        throw new xl0(th3);
                    }
                    if (th3 instanceof CancellationException) {
                        throw new yj0(th3);
                    }
                    if (th3 instanceof uk0) {
                        throw th3;
                    }
                    throw new dk0(th3);
                } finally {
                }
            }
        } else {
            cs2 a15 = qs2.a(il0Var, q0Var, true);
            try {
                String a16 = this.f6583d.a(this.f6580a, clickString);
                if (a16 instanceof jk0) {
                    ft2.a((jk0) a16);
                }
                dl2.b.J(a15, null);
                str = a16;
            } catch (Throwable th4) {
                try {
                    a15.b(th4);
                    if (th4 instanceof a.jf) {
                        throw th4;
                    }
                    a15.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new xl0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new yj0(th4);
                    }
                    if (th4 instanceof uk0) {
                        throw th4;
                    }
                    throw new dk0(th4);
                } finally {
                }
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    @NotNull
    public final String getViewSignals() {
        String str;
        sb2 sb2Var = this.f6582c;
        il0 il0Var = il0.CUI_NAME_VIEW_SIGNALS;
        ss2 ss2Var = this.f6581b;
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        if (qs2.b().f9801a == null) {
            p12 a13 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
            try {
                String a14 = this.f6583d.a(this.f6580a);
                if (a14 instanceof jk0) {
                    ft2.a((jk0) a14);
                }
                dl2.b.J(a13, null);
                str = a14;
            } catch (Throwable th3) {
                try {
                    a13.b(th3);
                    if (th3 instanceof a.jf) {
                        throw th3;
                    }
                    a13.a(th3);
                    if (th3 instanceof TimeoutCancellationException) {
                        throw new xl0(th3);
                    }
                    if (th3 instanceof CancellationException) {
                        throw new yj0(th3);
                    }
                    if (th3 instanceof uk0) {
                        throw th3;
                    }
                    throw new dk0(th3);
                } finally {
                }
            }
        } else {
            cs2 a15 = qs2.a(il0Var, q0Var, true);
            try {
                String a16 = this.f6583d.a(this.f6580a);
                if (a16 instanceof jk0) {
                    ft2.a((jk0) a16);
                }
                dl2.b.J(a15, null);
                str = a16;
            } catch (Throwable th4) {
                try {
                    a15.b(th4);
                    if (th4 instanceof a.jf) {
                        throw th4;
                    }
                    a15.a(th4);
                    if (th4 instanceof TimeoutCancellationException) {
                        throw new xl0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new yj0(th4);
                    }
                    if (th4 instanceof uk0) {
                        throw th4;
                    }
                    throw new dk0(th4);
                } finally {
                }
            }
        }
        return str;
    }

    @JavascriptInterface
    public final void notify(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (url.length() == 0) {
            return;
        }
        kn0 a13 = this.f6580a.a();
        Uri uri = Uri.parse(url);
        a13.getClass();
        Intrinsics.checkNotNullParameter(uri, "uri");
        kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new an0(a13, uri, null));
    }

    @JavascriptInterface
    public final void notifyResult(@NotNull String resultJsonString) {
        Intrinsics.checkNotNullParameter(resultJsonString, "resultJsonString");
        kn0 a13 = this.f6580a.a();
        a13.getClass();
        Intrinsics.checkNotNullParameter(resultJsonString, "resultJsonString");
        kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new bn0(a13, resultJsonString, null));
    }
}
