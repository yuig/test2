package io.embrace.android.embracesdk.internal.comms.api;

import com.squareup.moshi.JsonDataException;
import io.embrace.android.embracesdk.network.http.HttpMethod;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/api/ApiRequestJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/comms/api/ApiRequest;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ApiRequestJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f72933a;

    /* renamed from: b, reason: collision with root package name */
    public final r f72934b;

    /* renamed from: c, reason: collision with root package name */
    public final r f72935c;

    /* renamed from: d, reason: collision with root package name */
    public final r f72936d;

    /* renamed from: e, reason: collision with root package name */
    public final r f72937e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Constructor f72938f;

    public ApiRequestJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("contentType", "userAgent", "contentEncoding", "accept", "acceptEncoding", "appId", "deviceId", "url", "httpMethod", "eTag");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"contentType\", \"userA…ttpMethod\",\n      \"eTag\")");
        this.f72933a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "contentType");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…t(),\n      \"contentType\")");
        this.f72934b = c13;
        r c14 = moshi.c(String.class, s0Var, "contentEncoding");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(String::cl…Set(), \"contentEncoding\")");
        this.f72935c = c14;
        r c15 = moshi.c(ApiRequestUrl.class, s0Var, "url");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(ApiRequest….java, emptySet(), \"url\")");
        this.f72936d = c15;
        r c16 = moshi.c(HttpMethod.class, s0Var, "httpMethod");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(HttpMethod…emptySet(), \"httpMethod\")");
        this.f72937e = c16;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        int i13 = -1;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        ApiRequestUrl apiRequestUrl = null;
        HttpMethod httpMethod = null;
        String str9 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f72933a)) {
                case -1:
                    reader.m();
                    reader.E();
                    break;
                case 0:
                    str2 = (String) this.f72934b.a(reader);
                    if (str2 == null) {
                        JsonDataException l13 = b.l("contentType", "contentType", reader);
                        Intrinsics.checkNotNullExpressionValue(l13, "unexpectedNull(\"contentT…   \"contentType\", reader)");
                        throw l13;
                    }
                    i13 &= -2;
                    break;
                case 1:
                    str3 = (String) this.f72934b.a(reader);
                    if (str3 == null) {
                        JsonDataException l14 = b.l("userAgent", "userAgent", reader);
                        Intrinsics.checkNotNullExpressionValue(l14, "unexpectedNull(\"userAgen…     \"userAgent\", reader)");
                        throw l14;
                    }
                    break;
                case 2:
                    str4 = (String) this.f72935c.a(reader);
                    i13 &= -5;
                    break;
                case 3:
                    str5 = (String) this.f72934b.a(reader);
                    if (str5 == null) {
                        JsonDataException l15 = b.l("accept", "accept", reader);
                        Intrinsics.checkNotNullExpressionValue(l15, "unexpectedNull(\"accept\",…t\",\n              reader)");
                        throw l15;
                    }
                    i13 &= -9;
                    break;
                case 4:
                    str6 = (String) this.f72935c.a(reader);
                    i13 &= -17;
                    break;
                case 5:
                    str7 = (String) this.f72935c.a(reader);
                    i13 &= -33;
                    break;
                case 6:
                    str8 = (String) this.f72935c.a(reader);
                    i13 &= -65;
                    break;
                case 7:
                    apiRequestUrl = (ApiRequestUrl) this.f72936d.a(reader);
                    if (apiRequestUrl == null) {
                        JsonDataException l16 = b.l("url", "url", reader);
                        Intrinsics.checkNotNullExpressionValue(l16, "unexpectedNull(\"url\", \"url\",\n            reader)");
                        throw l16;
                    }
                    break;
                case 8:
                    httpMethod = (HttpMethod) this.f72937e.a(reader);
                    if (httpMethod == null) {
                        JsonDataException l17 = b.l("httpMethod", "httpMethod", reader);
                        Intrinsics.checkNotNullExpressionValue(l17, "unexpectedNull(\"httpMeth…    \"httpMethod\", reader)");
                        throw l17;
                    }
                    i13 &= -257;
                    break;
                case 9:
                    str9 = (String) this.f72935c.a(reader);
                    i13 &= -513;
                    break;
            }
        }
        reader.e();
        if (i13 == -894) {
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            if (str3 == null) {
                JsonDataException f13 = b.f("userAgent", "userAgent", reader);
                Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"userAgent\", \"userAgent\", reader)");
                throw f13;
            }
            Intrinsics.g(str5, "null cannot be cast to non-null type kotlin.String");
            if (apiRequestUrl != null) {
                Intrinsics.g(httpMethod, "null cannot be cast to non-null type io.embrace.android.embracesdk.network.http.HttpMethod");
                return new ApiRequest(str2, str3, str4, str5, str6, str7, str8, apiRequestUrl, httpMethod, str9);
            }
            JsonDataException f14 = b.f("url", "url", reader);
            Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"url\", \"url\", reader)");
            throw f14;
        }
        Constructor constructor = this.f72938f;
        if (constructor == null) {
            str = "missingProperty(\"url\", \"url\", reader)";
            constructor = ApiRequest.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, ApiRequestUrl.class, HttpMethod.class, String.class, Integer.TYPE, b.f100000c);
            this.f72938f = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "ApiRequest::class.java.g…his.constructorRef = it }");
        } else {
            str = "missingProperty(\"url\", \"url\", reader)";
        }
        Object[] objArr = new Object[12];
        objArr[0] = str2;
        if (str3 == null) {
            JsonDataException f15 = b.f("userAgent", "userAgent", reader);
            Intrinsics.checkNotNullExpressionValue(f15, "missingProperty(\"userAgent\", \"userAgent\", reader)");
            throw f15;
        }
        objArr[1] = str3;
        objArr[2] = str4;
        objArr[3] = str5;
        objArr[4] = str6;
        objArr[5] = str7;
        objArr[6] = str8;
        if (apiRequestUrl == null) {
            JsonDataException f16 = b.f("url", "url", reader);
            Intrinsics.checkNotNullExpressionValue(f16, str);
            throw f16;
        }
        objArr[7] = apiRequestUrl;
        objArr[8] = httpMethod;
        objArr[9] = str9;
        objArr[10] = Integer.valueOf(i13);
        objArr[11] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ApiRequest) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        ApiRequest apiRequest = (ApiRequest) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (apiRequest == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("contentType");
        r rVar = this.f72934b;
        rVar.d(writer, apiRequest.f72923a);
        writer.f("userAgent");
        rVar.d(writer, apiRequest.f72924b);
        writer.f("contentEncoding");
        r rVar2 = this.f72935c;
        rVar2.d(writer, apiRequest.f72925c);
        writer.f("accept");
        rVar.d(writer, apiRequest.f72926d);
        writer.f("acceptEncoding");
        rVar2.d(writer, apiRequest.f72927e);
        writer.f("appId");
        rVar2.d(writer, apiRequest.f72928f);
        writer.f("deviceId");
        rVar2.d(writer, apiRequest.f72929g);
        writer.f("url");
        this.f72936d.d(writer, apiRequest.f72930h);
        writer.f("httpMethod");
        this.f72937e.d(writer, apiRequest.f72931i);
        writer.f("eTag");
        rVar2.d(writer, apiRequest.f72932j);
        writer.d();
    }

    public final String toString() {
        return f.f(32, "GeneratedJsonAdapter(ApiRequest)", "toString(...)");
    }
}
