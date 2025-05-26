package rr;

import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final qr.h f109723a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f109724b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f109725c;

    /* renamed from: d, reason: collision with root package name */
    public String f109726d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f109727e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f109728f;

    public d0(qr.h webhookDeeplinkUtil) {
        HashSet hashSet = tb0.h.f117076w;
        tb0.h crashReporting = tb0.g.f117075a;
        Intrinsics.checkNotNullExpressionValue(crashReporting, "getInstance(...)");
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f109723a = webhookDeeplinkUtil;
        this.f109724b = crashReporting;
        this.f109725c = webhookDeeplinkUtil.f104943d.e();
        this.f109728f = true;
    }

    public abstract String a();

    public boolean b() {
        return this.f109728f;
    }

    public abstract void c(Uri uri);

    public final void d(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f109724b.h(t3.s1.c("DeeplinkHandler: ", uri.getHost(), " + ", uri.getPath()));
        c(uri);
        ((androidx.appcompat.widget.x) this.f109723a.f104946g.f116960b).v(a());
    }

    public abstract boolean e(Uri uri);

    public final boolean f(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (b()) {
            if (!df.j1.X0(uri) && !df.j1.f1(uri)) {
                return false;
            }
            if (df.j1.f1(uri) && !df.j1.G0(uri)) {
                return false;
            }
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        return e(uri);
    }
}
