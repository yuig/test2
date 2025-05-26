package io.embrace.android.embracesdk.internal.comms.api;

import com.squareup.moshi.JsonDataException;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/comms/api/ApiRequestV2JsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/comms/api/ApiRequestV2;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ApiRequestV2JsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f72949a;

    /* renamed from: b, reason: collision with root package name */
    public final r f72950b;

    /* renamed from: c, reason: collision with root package name */
    public final r f72951c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Constructor f72952d;

    public ApiRequestV2JsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("contentType", "userAgent", "contentEncoding", "accept", "appId", "deviceId", "url");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"contentType\", \"userA…ppId\", \"deviceId\", \"url\")");
        this.f72949a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "contentType");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…t(),\n      \"contentType\")");
        this.f72950b = c13;
        r c14 = moshi.c(String.class, s0Var, "contentEncoding");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(String::cl…Set(), \"contentEncoding\")");
        this.f72951c = c14;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        int i13 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f72949a)) {
                case -1:
                    reader.m();
                    reader.E();
                    break;
                case 0:
                    str = (String) this.f72950b.a(reader);
                    if (str == null) {
                        JsonDataException l13 = b.l("contentType", "contentType", reader);
                        Intrinsics.checkNotNullExpressionValue(l13, "unexpectedNull(\"contentT…   \"contentType\", reader)");
                        throw l13;
                    }
                    i13 &= -2;
                    break;
                case 1:
                    str2 = (String) this.f72950b.a(reader);
                    if (str2 == null) {
                        JsonDataException l14 = b.l("userAgent", "userAgent", reader);
                        Intrinsics.checkNotNullExpressionValue(l14, "unexpectedNull(\"userAgen…     \"userAgent\", reader)");
                        throw l14;
                    }
                    break;
                case 2:
                    str3 = (String) this.f72951c.a(reader);
                    i13 &= -5;
                    break;
                case 3:
                    str4 = (String) this.f72950b.a(reader);
                    if (str4 == null) {
                        JsonDataException l15 = b.l("accept", "accept", reader);
                        Intrinsics.checkNotNullExpressionValue(l15, "unexpectedNull(\"accept\",…t\",\n              reader)");
                        throw l15;
                    }
                    i13 &= -9;
                    break;
                case 4:
                    str5 = (String) this.f72951c.a(reader);
                    i13 &= -17;
                    break;
                case 5:
                    str6 = (String) this.f72951c.a(reader);
                    i13 &= -33;
                    break;
                case 6:
                    str7 = (String) this.f72950b.a(reader);
                    if (str7 == null) {
                        JsonDataException l16 = b.l("url", "url", reader);
                        Intrinsics.checkNotNullExpressionValue(l16, "unexpectedNull(\"url\", \"url\", reader)");
                        throw l16;
                    }
                    break;
            }
        }
        reader.e();
        if (i13 == -62) {
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            if (str2 == null) {
                JsonDataException f13 = b.f("userAgent", "userAgent", reader);
                Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"userAgent\", \"userAgent\", reader)");
                throw f13;
            }
            Intrinsics.g(str4, "null cannot be cast to non-null type kotlin.String");
            if (str7 != null) {
                return new ApiRequestV2(str, str2, str3, str4, str5, str6, str7);
            }
            JsonDataException f14 = b.f("url", "url", reader);
            Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"url\", \"url\", reader)");
            throw f14;
        }
        Constructor constructor = this.f72952d;
        if (constructor == null) {
            constructor = ApiRequestV2.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, b.f100000c);
            this.f72952d = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "ApiRequestV2::class.java…his.constructorRef = it }");
        }
        Object[] objArr = new Object[9];
        objArr[0] = str;
        if (str2 == null) {
            JsonDataException f15 = b.f("userAgent", "userAgent", reader);
            Intrinsics.checkNotNullExpressionValue(f15, "missingProperty(\"userAgent\", \"userAgent\", reader)");
            throw f15;
        }
        objArr[1] = str2;
        objArr[2] = str3;
        objArr[3] = str4;
        objArr[4] = str5;
        objArr[5] = str6;
        if (str7 == null) {
            JsonDataException f16 = b.f("url", "url", reader);
            Intrinsics.checkNotNullExpressionValue(f16, "missingProperty(\"url\", \"url\", reader)");
            throw f16;
        }
        objArr[6] = str7;
        objArr[7] = Integer.valueOf(i13);
        objArr[8] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (ApiRequestV2) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        ApiRequestV2 apiRequestV2 = (ApiRequestV2) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (apiRequestV2 == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("contentType");
        r rVar = this.f72950b;
        rVar.d(writer, apiRequestV2.f72942a);
        writer.f("userAgent");
        rVar.d(writer, apiRequestV2.f72943b);
        writer.f("contentEncoding");
        r rVar2 = this.f72951c;
        rVar2.d(writer, apiRequestV2.f72944c);
        writer.f("accept");
        rVar.d(writer, apiRequestV2.f72945d);
        writer.f("appId");
        rVar2.d(writer, apiRequestV2.f72946e);
        writer.f("deviceId");
        rVar2.d(writer, apiRequestV2.f72947f);
        writer.f("url");
        rVar.d(writer, apiRequestV2.f72948g);
        writer.d();
    }

    public final String toString() {
        return f.f(34, "GeneratedJsonAdapter(ApiRequestV2)", "toString(...)");
    }
}
