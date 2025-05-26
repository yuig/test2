package gc2;

import ac2.n;
import ac2.r;
import android.os.SystemClock;
import d7.e;
import d7.g0;
import g7.a0;
import g7.f;
import g7.i;
import java.util.List;
import java.util.Objects;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class c implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public b f64783b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f64784c;

    public c(q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f64783b = new b();
        g0 DEFAULT = e.f53809a;
        Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        this.f64784c = DEFAULT;
    }

    public static String b(f fVar, String str) {
        List list = (List) fVar.e().get(str);
        if (list != null) {
            return (String) list.get(0);
        }
        return null;
    }

    @Override // g7.a0
    public final synchronized void a(f source, i dataSpec, boolean z13) {
        try {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
            Objects.toString(dataSpec.f63786a);
            if (z13 && !this.f64783b.f64782h.containsKey(dataSpec)) {
                this.f64784c.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a aVar = new a();
                aVar.f64773a = elapsedRealtime;
                aVar.f64774b = 0L;
                this.f64783b.f64782h.put(dataSpec, aVar);
            }
            b bVar = this.f64783b;
            if (bVar.f64775a == null) {
                if (source instanceof r) {
                    UrlResponseInfo urlResponseInfo = ((r) source).f71663z;
                    bVar.f64776b = urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null;
                    this.f64783b.f64775a = n.CRONET;
                } else {
                    bVar.f64776b = null;
                    bVar.f64775a = n.OK_HTTP;
                }
            }
            b bVar2 = this.f64783b;
            if (bVar2.f64777c == null) {
                bVar2.f64777c = b(source, "quic-version");
            }
            b bVar3 = this.f64783b;
            if (bVar3.f64778d == null) {
                bVar3.f64778d = b(source, "alt-svc");
            }
            b bVar4 = this.f64783b;
            if (bVar4.f64779e == null) {
                bVar4.f64779e = b(source, "x-cdn");
            }
            b bVar5 = this.f64783b;
            if (bVar5.f64780f == null) {
                bVar5.f64780f = b(source, "x-pinterest-cache");
                b bVar6 = this.f64783b;
                if (bVar6.f64780f == null) {
                    bVar6.f64780f = b(source, "x-cache");
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // g7.a0
    public final synchronized void d(f source, i dataSpec, boolean z13) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        Objects.toString(dataSpec.f63786a);
        if (z13 && this.f64783b.f64782h.containsKey(dataSpec)) {
            a aVar = (a) z0.e(dataSpec, this.f64783b.f64782h);
            this.f64784c.getClass();
            aVar.f64774b = SystemClock.elapsedRealtime();
        }
    }

    @Override // g7.a0
    public final void f(f source, i dataSpec) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        Objects.toString(dataSpec.f63786a);
    }

    @Override // g7.a0
    public final synchronized void g(f source, i dataSpec, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dataSpec, "dataSpec");
        if (z13) {
            this.f64783b.f64781g += i13;
        }
    }
}
