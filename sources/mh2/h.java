package mh2;

import io.embrace.android.embracesdk.Severity;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements m {

    /* renamed from: a, reason: collision with root package name */
    public final vf2.b f87175a;

    /* renamed from: b, reason: collision with root package name */
    public final sg2.a f87176b;

    /* renamed from: c, reason: collision with root package name */
    public final ig2.b f87177c;

    /* renamed from: d, reason: collision with root package name */
    public final di2.b f87178d;

    /* renamed from: e, reason: collision with root package name */
    public final tg2.l f87179e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f87180f;

    public h(vf2.b logWriter, sg2.a configService, ig2.b sessionPropertiesService, di2.b bVar) {
        Intrinsics.checkNotNullParameter(logWriter, "logWriter");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(sessionPropertiesService, "sessionPropertiesService");
        this.f87175a = logWriter;
        this.f87176b = configService;
        this.f87177c = sessionPropertiesService;
        this.f87178d = bVar;
        tg2.l lVar = ((sg2.b) configService).f112880e;
        this.f87179e = lVar;
        this.f87180f = z0.g(new Pair(Severity.INFO, new i(new d(lVar, 1))), new Pair(Severity.WARNING, new i(new d(lVar, 2))), new Pair(Severity.ERROR, new i(new d(lVar, 3))));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r21, io.embrace.android.embracesdk.Severity r22, io.embrace.android.embracesdk.LogExceptionType r23, java.util.Map r24, java.util.LinkedHashMap r25, nh2.a r26) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.h.a(java.lang.String, io.embrace.android.embracesdk.Severity, io.embrace.android.embracesdk.LogExceptionType, java.util.Map, java.util.LinkedHashMap, nh2.a):void");
    }

    @Override // yh2.b
    public final void c() {
        Iterator it = this.f87180f.entrySet().iterator();
        while (it.hasNext()) {
            ((i) ((Map.Entry) it.next()).getValue()).f87182b.set(0);
        }
    }
}
