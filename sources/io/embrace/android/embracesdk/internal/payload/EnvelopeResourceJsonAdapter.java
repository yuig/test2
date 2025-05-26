package io.embrace.android.embracesdk.internal.payload;

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
import th2.g;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/EnvelopeResourceJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/EnvelopeResource;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class EnvelopeResourceJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73155a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73156b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73157c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73158d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73159e;

    /* renamed from: f, reason: collision with root package name */
    public final r f73160f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Constructor f73161g;

    public EnvelopeResourceJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("app_version", "app_framework", "build_id", "app_ecosystem_id", "build_type", "build_flavor", "environment", "bundle_version", "sdk_version", "sdk_simple_version", "react_native_bundle_id", "react_native_version", "javascript_patch_number", "hosted_platform_version", "hosted_sdk_version", "unity_build_id", "device_manufacturer", "device_model", "device_architecture", "jailbroken", "disk_total_capacity", "os_type", "os_name", "os_version", "os_code", "screen_resolution", "num_cores");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"app_version\", \"app_f…tion\",\n      \"num_cores\")");
        this.f73155a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(String.class, s0Var, "appVersion");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(String::cl…emptySet(), \"appVersion\")");
        this.f73156b = c13;
        r c14 = moshi.c(g.class, s0Var, "appFramework");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(AppFramewo…ptySet(), \"appFramework\")");
        this.f73157c = c14;
        r c15 = moshi.c(Integer.class, s0Var, "sdkSimpleVersion");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(Int::class…et(), \"sdkSimpleVersion\")");
        this.f73158d = c15;
        r c16 = moshi.c(Boolean.class, s0Var, "jailbroken");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Boolean::c…emptySet(), \"jailbroken\")");
        this.f73159e = c16;
        r c17 = moshi.c(Long.class, s0Var, "diskTotalCapacity");
        Intrinsics.checkNotNullExpressionValue(c17, "moshi.adapter(Long::clas…t(), \"diskTotalCapacity\")");
        this.f73160f = c17;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        int i13;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        int i14 = -1;
        g gVar = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        Integer num = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        Boolean bool = null;
        Long l13 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        Integer num2 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f73155a)) {
                case -1:
                    reader.m();
                    reader.E();
                    continue;
                case 0:
                    str = (String) this.f73156b.a(reader);
                    i14 &= -2;
                    continue;
                case 1:
                    gVar = (g) this.f73157c.a(reader);
                    i14 &= -3;
                    continue;
                case 2:
                    str2 = (String) this.f73156b.a(reader);
                    i14 &= -5;
                    continue;
                case 3:
                    str3 = (String) this.f73156b.a(reader);
                    i14 &= -9;
                    continue;
                case 4:
                    str4 = (String) this.f73156b.a(reader);
                    i14 &= -17;
                    continue;
                case 5:
                    str5 = (String) this.f73156b.a(reader);
                    i14 &= -33;
                    continue;
                case 6:
                    str6 = (String) this.f73156b.a(reader);
                    i14 &= -65;
                    continue;
                case 7:
                    str7 = (String) this.f73156b.a(reader);
                    i14 &= -129;
                    continue;
                case 8:
                    str8 = (String) this.f73156b.a(reader);
                    i14 &= -257;
                    continue;
                case 9:
                    num = (Integer) this.f73158d.a(reader);
                    i14 &= -513;
                    continue;
                case 10:
                    str9 = (String) this.f73156b.a(reader);
                    i14 &= -1025;
                    continue;
                case 11:
                    str10 = (String) this.f73156b.a(reader);
                    i14 &= -2049;
                    continue;
                case 12:
                    str11 = (String) this.f73156b.a(reader);
                    i14 &= -4097;
                    continue;
                case 13:
                    str12 = (String) this.f73156b.a(reader);
                    i14 &= -8193;
                    continue;
                case 14:
                    str13 = (String) this.f73156b.a(reader);
                    i14 &= -16385;
                    continue;
                case 15:
                    str14 = (String) this.f73156b.a(reader);
                    i13 = -32769;
                    break;
                case 16:
                    str15 = (String) this.f73156b.a(reader);
                    i13 = -65537;
                    break;
                case 17:
                    str16 = (String) this.f73156b.a(reader);
                    i13 = -131073;
                    break;
                case 18:
                    str17 = (String) this.f73156b.a(reader);
                    i13 = -262145;
                    break;
                case 19:
                    bool = (Boolean) this.f73159e.a(reader);
                    i13 = -524289;
                    break;
                case 20:
                    l13 = (Long) this.f73160f.a(reader);
                    i13 = -1048577;
                    break;
                case 21:
                    str18 = (String) this.f73156b.a(reader);
                    i13 = -2097153;
                    break;
                case 22:
                    str19 = (String) this.f73156b.a(reader);
                    i13 = -4194305;
                    break;
                case 23:
                    str20 = (String) this.f73156b.a(reader);
                    i13 = -8388609;
                    break;
                case 24:
                    str21 = (String) this.f73156b.a(reader);
                    i13 = -16777217;
                    break;
                case 25:
                    str22 = (String) this.f73156b.a(reader);
                    i13 = -33554433;
                    break;
                case 26:
                    num2 = (Integer) this.f73158d.a(reader);
                    i13 = -67108865;
                    break;
            }
            i14 &= i13;
        }
        reader.e();
        if (i14 == -134217728) {
            return new EnvelopeResource(str, gVar, str2, str3, str4, str5, str6, str7, str8, num, str9, str10, str11, str12, str13, str14, str15, str16, str17, bool, l13, str18, str19, str20, str21, str22, num2);
        }
        Constructor constructor = this.f73161g;
        if (constructor == null) {
            constructor = EnvelopeResource.class.getDeclaredConstructor(String.class, g.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.class, Long.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.TYPE, b.f100000c);
            this.f73161g = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "EnvelopeResource::class.…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(str, gVar, str2, str3, str4, str5, str6, str7, str8, num, str9, str10, str11, str12, str13, str14, str15, str16, str17, bool, l13, str18, str19, str20, str21, str22, num2, Integer.valueOf(i14), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (EnvelopeResource) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        EnvelopeResource envelopeResource = (EnvelopeResource) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (envelopeResource == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("app_version");
        r rVar = this.f73156b;
        rVar.d(writer, envelopeResource.f73129a);
        writer.f("app_framework");
        this.f73157c.d(writer, envelopeResource.f73130b);
        writer.f("build_id");
        rVar.d(writer, envelopeResource.f73131c);
        writer.f("app_ecosystem_id");
        rVar.d(writer, envelopeResource.f73132d);
        writer.f("build_type");
        rVar.d(writer, envelopeResource.f73133e);
        writer.f("build_flavor");
        rVar.d(writer, envelopeResource.f73134f);
        writer.f("environment");
        rVar.d(writer, envelopeResource.f73135g);
        writer.f("bundle_version");
        rVar.d(writer, envelopeResource.f73136h);
        writer.f("sdk_version");
        rVar.d(writer, envelopeResource.f73137i);
        writer.f("sdk_simple_version");
        r rVar2 = this.f73158d;
        rVar2.d(writer, envelopeResource.f73138j);
        writer.f("react_native_bundle_id");
        rVar.d(writer, envelopeResource.f73139k);
        writer.f("react_native_version");
        rVar.d(writer, envelopeResource.f73140l);
        writer.f("javascript_patch_number");
        rVar.d(writer, envelopeResource.f73141m);
        writer.f("hosted_platform_version");
        rVar.d(writer, envelopeResource.f73142n);
        writer.f("hosted_sdk_version");
        rVar.d(writer, envelopeResource.f73143o);
        writer.f("unity_build_id");
        rVar.d(writer, envelopeResource.f73144p);
        writer.f("device_manufacturer");
        rVar.d(writer, envelopeResource.f73145q);
        writer.f("device_model");
        rVar.d(writer, envelopeResource.f73146r);
        writer.f("device_architecture");
        rVar.d(writer, envelopeResource.f73147s);
        writer.f("jailbroken");
        this.f73159e.d(writer, envelopeResource.f73148t);
        writer.f("disk_total_capacity");
        this.f73160f.d(writer, envelopeResource.f73149u);
        writer.f("os_type");
        rVar.d(writer, envelopeResource.f73150v);
        writer.f("os_name");
        rVar.d(writer, envelopeResource.f73151w);
        writer.f("os_version");
        rVar.d(writer, envelopeResource.f73152x);
        writer.f("os_code");
        rVar.d(writer, envelopeResource.f73153y);
        writer.f("screen_resolution");
        rVar.d(writer, envelopeResource.f73154z);
        writer.f("num_cores");
        rVar2.d(writer, envelopeResource.A);
        writer.d();
    }

    public final String toString() {
        return f.f(38, "GeneratedJsonAdapter(EnvelopeResource)", "toString(...)");
    }
}
