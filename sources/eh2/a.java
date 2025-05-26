package eh2;

import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import gh2.d;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import io.embrace.android.embracesdk.internal.payload.EnvelopeMetadata;
import io.embrace.android.embracesdk.internal.payload.EnvelopeResource;
import io.embrace.android.embracesdk.internal.payload.Log;
import io.embrace.android.embracesdk.internal.payload.LogPayload;
import java.io.BufferedInputStream;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import sh2.h;
import tj2.f;
import xk2.q;
import xk2.r;
import xk2.s;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final fh2.a f58949a;

    /* renamed from: b, reason: collision with root package name */
    public final d f58950b;

    /* renamed from: c, reason: collision with root package name */
    public final b f58951c;

    /* renamed from: d, reason: collision with root package name */
    public final dh2.a f58952d;

    public a(fh2.a metadataSource, d resourceSource, c logPayloadSource, dh2.a aVar) {
        Intrinsics.checkNotNullParameter(metadataSource, "metadataSource");
        Intrinsics.checkNotNullParameter(resourceSource, "resourceSource");
        Intrinsics.checkNotNullParameter(logPayloadSource, "logPayloadSource");
        this.f58949a = metadataSource;
        this.f58950b = resourceSource;
        this.f58951c = logPayloadSource;
        this.f58952d = aVar;
    }

    public final Envelope a(LogPayload logPayload) {
        String str;
        Object m13;
        List list;
        List list2;
        Log log;
        List list3;
        dh2.a aVar = this.f58952d;
        if (aVar != null) {
            yg2.a aVar2 = yg2.b.Companion;
            List list4 = logPayload.f73188a;
            String a13 = (list4 == null || (log = (Log) CollectionsKt.firstOrNull(list4)) == null || (list3 = log.f73179e) == null) ? null : ei2.d.a("emb.type", list3);
            aVar2.getClass();
            yg2.b a14 = yg2.a.a(a13);
            yg2.b bVar = yg2.b.NATIVE_CRASH;
            if (a14 == bVar) {
                List list5 = logPayload.f73188a;
                Log log2 = list5 != null ? (Log) CollectionsKt.firstOrNull(list5) : null;
                if (log2 == null || (list2 = log2.f73179e) == null) {
                    str = null;
                } else {
                    String str2 = f.f117934a.f108404b;
                    Intrinsics.checkNotNullExpressionValue(str2, "SESSION_ID.key");
                    str = ei2.d.a(str2, list2);
                }
                String a15 = (log2 == null || (list = log2.f73179e) == null) ? null : ei2.d.a(h.f112955d.f134855a, list);
                if (str == null) {
                    str = "none";
                }
                if (a15 == null) {
                    a15 = "none";
                }
                yg2.f fVar = yg2.f.CRASH;
                yg2.d storedTelemetryMetadata = new yg2.d(str, a15, fVar, bVar);
                dh2.b bVar2 = (dh2.b) aVar;
                Intrinsics.checkNotNullParameter(storedTelemetryMetadata, "storedTelemetryMetadata");
                try {
                    q qVar = s.f135225b;
                    BufferedInputStream b13 = bVar2.f55017b.b(storedTelemetryMetadata);
                    if (b13 != null) {
                        xh2.d dVar = bVar2.f55016a;
                        Type serializedType = fVar.getSerializedType();
                        if (serializedType == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        m13 = (Envelope) dVar.a(b13, serializedType);
                    } else {
                        m13 = null;
                    }
                } catch (Throwable th3) {
                    q qVar2 = s.f135225b;
                    m13 = ue.c.m(th3);
                }
                if (m13 instanceof r) {
                    m13 = null;
                }
                Envelope envelope = (Envelope) m13;
                if (envelope != null) {
                    return Envelope.a(envelope, null, logPayload, 15);
                }
            }
        }
        Util$ParameterizedTypeImpl util$ParameterizedTypeImpl = Envelope.f73106f;
        EnvelopeResource resource = this.f58950b.a();
        EnvelopeMetadata metadata = this.f58949a.a();
        Intrinsics.checkNotNullParameter(logPayload, "<this>");
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new Envelope(resource, metadata, "0.1.0", "logs", logPayload);
    }
}
