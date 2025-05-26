package rr;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e1 extends d0 {

    /* renamed from: g, reason: collision with root package name */
    public final pd.s f109735g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f109736h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f109737i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(qr.h webhookDeeplinkUtil, pd.s pinHelper) {
        super(webhookDeeplinkUtil);
        Intrinsics.checkNotNullParameter(webhookDeeplinkUtil, "webhookDeeplinkUtil");
        Intrinsics.checkNotNullParameter(pinHelper, "pinHelper");
        this.f109735g = pinHelper;
    }

    @Override // rr.d0
    public final String a() {
        return this.f109737i ? "amp_pin" : "pin";
    }

    @Override // rr.d0
    public final void c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        qr.h hVar = this.f109723a;
        if (size < 2 && !this.f109736h) {
            hVar.t(null);
            return;
        }
        this.f109735g.i(uri, pathSegments, hVar.f104943d.e(), this.f109726d);
    }

    @Override // rr.d0
    public final boolean e(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri.getPathSegments().contains("pin")) {
            if (n60.o.x(uri, 0, "amp")) {
                this.f109737i = true;
            }
            return true;
        }
        if (!Intrinsics.d(uri.getHost(), "pin") || uri.getPathSegments().size() <= 0) {
            return false;
        }
        this.f109736h = true;
        return true;
    }
}
