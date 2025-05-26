package io.embrace.android.embracesdk.internal.config.remote;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Constructor;
import java.util.Set;
import kg.a;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/remote/NetworkCaptureRuleRemoteConfigJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/config/remote/NetworkCaptureRuleRemoteConfig;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NetworkCaptureRuleRemoteConfigJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73029a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73030b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73031c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73032d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73033e;

    /* renamed from: f, reason: collision with root package name */
    public final r f73034f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Constructor f73035g;

    public NetworkCaptureRuleRemoteConfigJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("id", "duration", "method", "url", "expires_in", "max_size", "max_count", "status_codes");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"id\", \"duration\", \"me…x_count\", \"status_codes\")");
        this.f73029a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "id");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.f73030b = c13;
        r c14 = moshi.c(Long.class, s0Var, "duration");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(Long::clas…  emptySet(), \"duration\")");
        this.f73031c = c14;
        r c15 = moshi.c(Long.TYPE, s0Var, "expiresIn");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(Long::clas…Set(),\n      \"expiresIn\")");
        this.f73032d = c15;
        r c16 = moshi.c(Integer.TYPE, s0Var, "maxCount");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Int::class…, emptySet(), \"maxCount\")");
        this.f73033e = c16;
        r c17 = moshi.c(a.Z(Set.class, Integer.class), s0Var, "statusCodes");
        Intrinsics.checkNotNullExpressionValue(c17, "moshi.adapter(Types.newP…mptySet(), \"statusCodes\")");
        this.f73034f = c17;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        String str;
        Intrinsics.checkNotNullParameter(reader, "reader");
        Long l13 = 0L;
        reader.c();
        int i13 = -1;
        String str2 = null;
        Long l14 = null;
        String str3 = null;
        String str4 = null;
        Set set = null;
        Integer num = 0;
        Long l15 = l13;
        while (reader.hasNext()) {
            switch (reader.k(this.f73029a)) {
                case -1:
                    reader.m();
                    reader.E();
                    break;
                case 0:
                    str2 = (String) this.f73030b.a(reader);
                    if (str2 == null) {
                        JsonDataException l16 = b.l("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(l16, "unexpectedNull(\"id\", \"id\", reader)");
                        throw l16;
                    }
                    break;
                case 1:
                    l14 = (Long) this.f73031c.a(reader);
                    break;
                case 2:
                    str3 = (String) this.f73030b.a(reader);
                    if (str3 == null) {
                        JsonDataException l17 = b.l("method", "method", reader);
                        Intrinsics.checkNotNullExpressionValue(l17, "unexpectedNull(\"method\",…        \"method\", reader)");
                        throw l17;
                    }
                    break;
                case 3:
                    str4 = (String) this.f73030b.a(reader);
                    if (str4 == null) {
                        JsonDataException l18 = b.l("urlRegex", "url", reader);
                        Intrinsics.checkNotNullExpressionValue(l18, "unexpectedNull(\"urlRegex…           \"url\", reader)");
                        throw l18;
                    }
                    break;
                case 4:
                    l13 = (Long) this.f73032d.a(reader);
                    if (l13 == null) {
                        JsonDataException l19 = b.l("expiresIn", "expires_in", reader);
                        Intrinsics.checkNotNullExpressionValue(l19, "unexpectedNull(\"expiresI…    \"expires_in\", reader)");
                        throw l19;
                    }
                    i13 &= -17;
                    break;
                case 5:
                    l15 = (Long) this.f73032d.a(reader);
                    if (l15 == null) {
                        JsonDataException l23 = b.l("maxSize", "max_size", reader);
                        Intrinsics.checkNotNullExpressionValue(l23, "unexpectedNull(\"maxSize\"…e\",\n              reader)");
                        throw l23;
                    }
                    i13 &= -33;
                    break;
                case 6:
                    num = (Integer) this.f73033e.a(reader);
                    if (num == null) {
                        JsonDataException l24 = b.l("maxCount", "max_count", reader);
                        Intrinsics.checkNotNullExpressionValue(l24, "unexpectedNull(\"maxCount…     \"max_count\", reader)");
                        throw l24;
                    }
                    i13 &= -65;
                    break;
                case 7:
                    set = (Set) this.f73034f.a(reader);
                    if (set == null) {
                        JsonDataException l25 = b.l("statusCodes", "status_codes", reader);
                        Intrinsics.checkNotNullExpressionValue(l25, "unexpectedNull(\"statusCo…  \"status_codes\", reader)");
                        throw l25;
                    }
                    i13 &= -129;
                    break;
            }
        }
        reader.e();
        if (i13 == -241) {
            if (str2 == null) {
                JsonDataException f13 = b.f("id", "id", reader);
                Intrinsics.checkNotNullExpressionValue(f13, "missingProperty(\"id\", \"id\", reader)");
                throw f13;
            }
            if (str3 == null) {
                JsonDataException f14 = b.f("method", "method", reader);
                Intrinsics.checkNotNullExpressionValue(f14, "missingProperty(\"method\", \"method\", reader)");
                throw f14;
            }
            if (str4 == null) {
                JsonDataException f15 = b.f("urlRegex", "url", reader);
                Intrinsics.checkNotNullExpressionValue(f15, "missingProperty(\"urlRegex\", \"url\", reader)");
                throw f15;
            }
            long longValue = l13.longValue();
            long longValue2 = l15.longValue();
            int intValue = num.intValue();
            Intrinsics.g(set, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.Int>");
            return new NetworkCaptureRuleRemoteConfig(str2, l14, str3, str4, longValue, longValue2, intValue, set);
        }
        Set set2 = set;
        Constructor constructor = this.f73035g;
        if (constructor == null) {
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            str = "missingProperty(\"method\", \"method\", reader)";
            constructor = NetworkCaptureRuleRemoteConfig.class.getDeclaredConstructor(String.class, Long.class, String.class, String.class, cls, cls, cls2, Set.class, cls2, b.f100000c);
            this.f73035g = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "NetworkCaptureRuleRemote…his.constructorRef = it }");
        } else {
            str = "missingProperty(\"method\", \"method\", reader)";
        }
        Object[] objArr = new Object[10];
        if (str2 == null) {
            JsonDataException f16 = b.f("id", "id", reader);
            Intrinsics.checkNotNullExpressionValue(f16, "missingProperty(\"id\", \"id\", reader)");
            throw f16;
        }
        objArr[0] = str2;
        objArr[1] = l14;
        if (str3 == null) {
            JsonDataException f17 = b.f("method", "method", reader);
            Intrinsics.checkNotNullExpressionValue(f17, str);
            throw f17;
        }
        objArr[2] = str3;
        if (str4 == null) {
            JsonDataException f18 = b.f("urlRegex", "url", reader);
            Intrinsics.checkNotNullExpressionValue(f18, "missingProperty(\"urlRegex\", \"url\", reader)");
            throw f18;
        }
        objArr[3] = str4;
        objArr[4] = l13;
        objArr[5] = l15;
        objArr[6] = num;
        objArr[7] = set2;
        objArr[8] = Integer.valueOf(i13);
        objArr[9] = null;
        Object newInstance = constructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (NetworkCaptureRuleRemoteConfig) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        NetworkCaptureRuleRemoteConfig networkCaptureRuleRemoteConfig = (NetworkCaptureRuleRemoteConfig) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (networkCaptureRuleRemoteConfig == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("id");
        r rVar = this.f73030b;
        rVar.d(writer, networkCaptureRuleRemoteConfig.f73021a);
        writer.f("duration");
        this.f73031c.d(writer, networkCaptureRuleRemoteConfig.f73022b);
        writer.f("method");
        rVar.d(writer, networkCaptureRuleRemoteConfig.f73023c);
        writer.f("url");
        rVar.d(writer, networkCaptureRuleRemoteConfig.f73024d);
        writer.f("expires_in");
        Long valueOf = Long.valueOf(networkCaptureRuleRemoteConfig.f73025e);
        r rVar2 = this.f73032d;
        rVar2.d(writer, valueOf);
        writer.f("max_size");
        rVar2.d(writer, Long.valueOf(networkCaptureRuleRemoteConfig.f73026f));
        writer.f("max_count");
        this.f73033e.d(writer, Integer.valueOf(networkCaptureRuleRemoteConfig.f73027g));
        writer.f("status_codes");
        this.f73034f.d(writer, networkCaptureRuleRemoteConfig.f73028h);
        writer.d();
    }

    public final String toString() {
        return f.f(52, "GeneratedJsonAdapter(NetworkCaptureRuleRemoteConfig)", "toString(...)");
    }
}
