package io.embrace.android.embracesdk.internal.comms.delivery;

import com.squareup.moshi.JsonDataException;
import io.embrace.android.embracesdk.internal.comms.api.ApiRequest;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import mc2.k;
import oe2.h0;
import oe2.r;
import oe2.v;
import oe2.y;
import org.jetbrains.annotations.NotNull;
import pe2.b;
import pk2.f;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/delivery/PendingApiCallJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/comms/delivery/PendingApiCall;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class PendingApiCallJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f72956a;

    /* renamed from: b, reason: collision with root package name */
    public final r f72957b;

    /* renamed from: c, reason: collision with root package name */
    public final r f72958c;

    /* renamed from: d, reason: collision with root package name */
    public final r f72959d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Constructor f72960e;

    public PendingApiCallJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("apiRequest", "cachedPayload", "queueTime");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"apiRequest\", \"cached…load\",\n      \"queueTime\")");
        this.f72956a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(ApiRequest.class, s0Var, "apiRequest");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(ApiRequest…emptySet(), \"apiRequest\")");
        this.f72957b = c13;
        r c14 = moshi.c(String.class, s0Var, "cachedPayloadFilename");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(String::cl… \"cachedPayloadFilename\")");
        this.f72958c = c14;
        r c15 = moshi.c(Long.class, s0Var, "queueTime");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(Long::clas… emptySet(), \"queueTime\")");
        this.f72959d = c15;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        int i13 = -1;
        ApiRequest apiRequest = null;
        String str = null;
        Long l13 = null;
        while (reader.hasNext()) {
            int k13 = reader.k(this.f72956a);
            if (k13 == -1) {
                reader.m();
                reader.E();
            } else if (k13 == 0) {
                apiRequest = (ApiRequest) this.f72957b.a(reader);
                if (apiRequest == null) {
                    JsonDataException l14 = b.l("apiRequest", "apiRequest", reader);
                    Intrinsics.checkNotNullExpressionValue(l14, "unexpectedNull(\"apiRequest\", \"apiRequest\", reader)");
                    throw l14;
                }
            } else if (k13 == 1) {
                str = (String) this.f72958c.a(reader);
                if (str == null) {
                    JsonDataException l15 = b.l("cachedPayloadFilename", "cachedPayload", reader);
                    Intrinsics.checkNotNullExpressionValue(l15, "unexpectedNull(\"cachedPa… \"cachedPayload\", reader)");
                    throw l15;
                }
            } else if (k13 == 2) {
                l13 = (Long) this.f72959d.a(reader);
                i13 = -5;
            }
        }
        reader.e();
        if (i13 == -5) {
            if (apiRequest == null) {
                JsonDataException f13 = b.f("apiRequest", "apiRequest", reader);
                Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"apiRequ…t\", \"apiRequest\", reader)");
                throw f13;
            }
            if (str != null) {
                return new PendingApiCall(apiRequest, str, l13);
            }
            JsonDataException f14 = b.f("cachedPayloadFilename", "cachedPayload", reader);
            Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"cachedP… \"cachedPayload\", reader)");
            throw f14;
        }
        Constructor constructor = this.f72960e;
        if (constructor == null) {
            constructor = PendingApiCall.class.getDeclaredConstructor(ApiRequest.class, String.class, Long.class, Integer.TYPE, b.f100000c);
            this.f72960e = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "PendingApiCall::class.ja…his.constructorRef = it }");
        }
        Object[] objArr = new Object[5];
        if (apiRequest == null) {
            JsonDataException f15 = b.f("apiRequest", "apiRequest", reader);
            Intrinsics.checkNotNullExpressionValue(f15, "missingProperty(\"apiRequ…t\", \"apiRequest\", reader)");
            throw f15;
        }
        objArr[0] = apiRequest;
        if (str == null) {
            JsonDataException f16 = b.f("cachedPayloadFilename", "cachedPayload", reader);
            Intrinsics.checkNotNullExpressionValue(f16, "missingProperty(\"cachedP… \"cachedPayload\", reader)");
            throw f16;
        }
        objArr[1] = str;
        objArr[2] = l13;
        objArr[3] = Integer.valueOf(i13);
        objArr[4] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (PendingApiCall) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        PendingApiCall pendingApiCall = (PendingApiCall) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (pendingApiCall == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("apiRequest");
        this.f72957b.d(writer, pendingApiCall.f72953a);
        writer.f("cachedPayload");
        this.f72958c.d(writer, pendingApiCall.f72954b);
        writer.f("queueTime");
        this.f72959d.d(writer, pendingApiCall.f72955c);
        writer.d();
    }

    public final String toString() {
        return f.f(36, "GeneratedJsonAdapter(PendingApiCall)", "toString(...)");
    }
}
