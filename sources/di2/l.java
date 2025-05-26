package di2;

import io.embrace.android.embracesdk.Severity;
import java.util.Locale;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final vf2.c f55102a;

    /* renamed from: b, reason: collision with root package name */
    public final jg2.d f55103b;

    /* renamed from: c, reason: collision with root package name */
    public final mh2.m f55104c;

    /* renamed from: d, reason: collision with root package name */
    public final gg2.e f55105d;

    public l(ei2.a sessionSpanWriter, jg2.d startupService, mh2.m logService, gg2.e metadataService) {
        Intrinsics.checkNotNullParameter(sessionSpanWriter, "sessionSpanWriter");
        Intrinsics.checkNotNullParameter(startupService, "startupService");
        Intrinsics.checkNotNullParameter(logService, "logService");
        Intrinsics.checkNotNullParameter(metadataService, "metadataService");
        this.f55102a = sessionSpanWriter;
        this.f55103b = startupService;
        this.f55104c = logService;
        this.f55105d = metadataService;
    }

    public final void a(th2.i iVar, String str, boolean z13) {
        Long l13;
        Long l14;
        String obj;
        Locale locale;
        String l15;
        ei2.a aVar = (ei2.a) this.f55102a;
        aVar.j(new vf2.d(sh2.h.f112960i.f134855a, "true"));
        aVar.j(new vf2.d(sh2.h.f112961j.f134855a, "false"));
        if (str != null) {
            aVar.j(new vf2.d(sh2.h.f112963l.f134855a, str));
        }
        if (iVar != null && (obj = iVar.toString()) != null && (l15 = ep.b.l((locale = Locale.US), "US", obj, locale, "toLowerCase(...)")) != null) {
            aVar.j(new vf2.d(sh2.h.f112965n.f134855a, l15));
        }
        if (z13 && (l14 = ((jg2.e) this.f55103b).f76121f) != null) {
            aVar.j(new vf2.d(sh2.h.f112966o.f134855a, String.valueOf(l14.longValue())));
        }
        aVar.j(new vf2.d(sh2.h.f112967p.f134855a, String.valueOf(((mh2.i) z0.e(Severity.ERROR, ((mh2.h) this.f55104c).f87180f)).f87182b.get())));
        gg2.b bVar = ((gg2.d) this.f55105d).f64985j;
        if (bVar == null || (l13 = bVar.f64974b) == null) {
            return;
        }
        aVar.j(new vf2.d(sh2.h.f112968q.f134855a, String.valueOf(l13.longValue())));
    }

    public final void b(yh2.c session) {
        Intrinsics.checkNotNullParameter(session, "session");
        vf2.d dVar = new vf2.d(sh2.h.f112958g.f134855a, String.valueOf(session.f139058e));
        ei2.a aVar = (ei2.a) this.f55102a;
        aVar.j(dVar);
        aVar.j(new vf2.d(sh2.h.f112959h.f134855a, String.valueOf(session.f139056c)));
        String str = sh2.h.f112957f.f134855a;
        String name = session.f139057d.name();
        Locale US = Locale.US;
        aVar.j(new vf2.d(str, ep.b.l(US, "US", name, US, "toLowerCase(...)")));
        aVar.j(new vf2.d(sh2.h.f112960i.f134855a, "false"));
        aVar.j(new vf2.d(sh2.h.f112961j.f134855a, "true"));
        String obj = session.f139059f.toString();
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = obj.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        aVar.j(new vf2.d(sh2.h.f112964m.f134855a, lowerCase));
    }
}
