package io.embrace.android.embracesdk.internal.payload;

import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Constructor;
import java.util.Map;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/NetworkCapturedCallJsonAdapter;", "Loe2/r;", "Lio/embrace/android/embracesdk/internal/payload/NetworkCapturedCall;", "Loe2/h0;", "moshi", "<init>", "(Loe2/h0;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NetworkCapturedCallJsonAdapter extends r {

    /* renamed from: a, reason: collision with root package name */
    public final k f73226a;

    /* renamed from: b, reason: collision with root package name */
    public final r f73227b;

    /* renamed from: c, reason: collision with root package name */
    public final r f73228c;

    /* renamed from: d, reason: collision with root package name */
    public final r f73229d;

    /* renamed from: e, reason: collision with root package name */
    public final r f73230e;

    /* renamed from: f, reason: collision with root package name */
    public final r f73231f;

    /* renamed from: g, reason: collision with root package name */
    public volatile Constructor f73232g;

    public NetworkCapturedCallJsonAdapter(@NotNull h0 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        k b13 = k.b("dur", "et", "m", "mu", "id", "qb", "qi", "qq", "qh", "qz", "sb", "si", "sh", "sz", "sc", "sid", "st", "url", "em", "ne");
        Intrinsics.checkNotNullExpressionValue(b13, "of(\"dur\", \"et\", \"m\", \"mu… \"st\", \"url\", \"em\", \"ne\")");
        this.f73226a = b13;
        s0 s0Var = s0.f80394a;
        r c13 = moshi.c(Long.class, s0Var, "duration");
        Intrinsics.checkNotNullExpressionValue(c13, "moshi.adapter(Long::clas…  emptySet(), \"duration\")");
        this.f73227b = c13;
        r c14 = moshi.c(String.class, s0Var, "httpMethod");
        Intrinsics.checkNotNullExpressionValue(c14, "moshi.adapter(String::cl…emptySet(), \"httpMethod\")");
        this.f73228c = c14;
        r c15 = moshi.c(String.class, s0Var, "networkId");
        Intrinsics.checkNotNullExpressionValue(c15, "moshi.adapter(String::cl…Set(),\n      \"networkId\")");
        this.f73229d = c15;
        r c16 = moshi.c(Integer.class, s0Var, "requestBodySize");
        Intrinsics.checkNotNullExpressionValue(c16, "moshi.adapter(Int::class…Set(), \"requestBodySize\")");
        this.f73230e = c16;
        r c17 = moshi.c(a.Z(Map.class, String.class, String.class), s0Var, "requestQueryHeaders");
        Intrinsics.checkNotNullExpressionValue(c17, "moshi.adapter(Types.newP…), \"requestQueryHeaders\")");
        this.f73231f = c17;
    }

    @Override // oe2.r
    public final Object a(v reader) {
        int i13;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Long l13 = null;
        int i14 = -1;
        Long l14 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Integer num = null;
        String str5 = null;
        Map map = null;
        Integer num2 = null;
        String str6 = null;
        Integer num3 = null;
        Map map2 = null;
        Integer num4 = null;
        Integer num5 = null;
        String str7 = null;
        Long l15 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        while (reader.hasNext()) {
            switch (reader.k(this.f73226a)) {
                case -1:
                    reader.m();
                    reader.E();
                    continue;
                case 0:
                    l13 = (Long) this.f73227b.a(reader);
                    i14 &= -2;
                    continue;
                case 1:
                    l14 = (Long) this.f73227b.a(reader);
                    i14 &= -3;
                    continue;
                case 2:
                    str = (String) this.f73228c.a(reader);
                    i14 &= -5;
                    continue;
                case 3:
                    str2 = (String) this.f73228c.a(reader);
                    i14 &= -9;
                    continue;
                case 4:
                    str3 = (String) this.f73229d.a(reader);
                    if (str3 == null) {
                        JsonDataException l16 = b.l("networkId", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(l16, "unexpectedNull(\"networkI…d\",\n              reader)");
                        throw l16;
                    }
                    i14 &= -17;
                    continue;
                case 5:
                    str4 = (String) this.f73228c.a(reader);
                    i14 &= -33;
                    continue;
                case 6:
                    num = (Integer) this.f73230e.a(reader);
                    i14 &= -65;
                    continue;
                case 7:
                    str5 = (String) this.f73228c.a(reader);
                    i14 &= -129;
                    continue;
                case 8:
                    map = (Map) this.f73231f.a(reader);
                    i14 &= -257;
                    continue;
                case 9:
                    num2 = (Integer) this.f73230e.a(reader);
                    i14 &= -513;
                    continue;
                case 10:
                    str6 = (String) this.f73228c.a(reader);
                    i14 &= -1025;
                    continue;
                case 11:
                    num3 = (Integer) this.f73230e.a(reader);
                    i14 &= -2049;
                    continue;
                case 12:
                    map2 = (Map) this.f73231f.a(reader);
                    i14 &= -4097;
                    continue;
                case 13:
                    num4 = (Integer) this.f73230e.a(reader);
                    i14 &= -8193;
                    continue;
                case 14:
                    num5 = (Integer) this.f73230e.a(reader);
                    i14 &= -16385;
                    continue;
                case 15:
                    str7 = (String) this.f73228c.a(reader);
                    i13 = -32769;
                    break;
                case 16:
                    l15 = (Long) this.f73227b.a(reader);
                    i13 = -65537;
                    break;
                case 17:
                    str8 = (String) this.f73228c.a(reader);
                    i13 = -131073;
                    break;
                case 18:
                    str9 = (String) this.f73228c.a(reader);
                    i13 = -262145;
                    break;
                case 19:
                    str10 = (String) this.f73228c.a(reader);
                    i13 = -524289;
                    break;
            }
            i14 &= i13;
        }
        reader.e();
        if (i14 == -1048576) {
            Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
            return new NetworkCapturedCall(l13, l14, str, str2, str3, str4, num, str5, map, num2, str6, num3, map2, num4, num5, str7, l15, str8, str9, str10);
        }
        Constructor constructor = this.f73232g;
        if (constructor == null) {
            constructor = NetworkCapturedCall.class.getDeclaredConstructor(Long.class, Long.class, String.class, String.class, String.class, String.class, Integer.class, String.class, Map.class, Integer.class, String.class, Integer.class, Map.class, Integer.class, Integer.class, String.class, Long.class, String.class, String.class, String.class, Integer.TYPE, b.f100000c);
            this.f73232g = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "NetworkCapturedCall::cla…his.constructorRef = it }");
        }
        Object newInstance = constructor.newInstance(l13, l14, str, str2, str3, str4, num, str5, map, num2, str6, num3, map2, num4, num5, str7, l15, str8, str9, str10, Integer.valueOf(i14), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return (NetworkCapturedCall) newInstance;
    }

    @Override // oe2.r
    public final void d(y writer, Object obj) {
        NetworkCapturedCall networkCapturedCall = (NetworkCapturedCall) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (networkCapturedCall == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.f("dur");
        r rVar = this.f73227b;
        rVar.d(writer, networkCapturedCall.f73206a);
        writer.f("et");
        rVar.d(writer, networkCapturedCall.f73207b);
        writer.f("m");
        r rVar2 = this.f73228c;
        rVar2.d(writer, networkCapturedCall.f73208c);
        writer.f("mu");
        rVar2.d(writer, networkCapturedCall.f73209d);
        writer.f("id");
        this.f73229d.d(writer, networkCapturedCall.f73210e);
        writer.f("qb");
        rVar2.d(writer, networkCapturedCall.f73211f);
        writer.f("qi");
        r rVar3 = this.f73230e;
        rVar3.d(writer, networkCapturedCall.f73212g);
        writer.f("qq");
        rVar2.d(writer, networkCapturedCall.f73213h);
        writer.f("qh");
        r rVar4 = this.f73231f;
        rVar4.d(writer, networkCapturedCall.f73214i);
        writer.f("qz");
        rVar3.d(writer, networkCapturedCall.f73215j);
        writer.f("sb");
        rVar2.d(writer, networkCapturedCall.f73216k);
        writer.f("si");
        rVar3.d(writer, networkCapturedCall.f73217l);
        writer.f("sh");
        rVar4.d(writer, networkCapturedCall.f73218m);
        writer.f("sz");
        rVar3.d(writer, networkCapturedCall.f73219n);
        writer.f("sc");
        rVar3.d(writer, networkCapturedCall.f73220o);
        writer.f("sid");
        rVar2.d(writer, networkCapturedCall.f73221p);
        writer.f("st");
        rVar.d(writer, networkCapturedCall.f73222q);
        writer.f("url");
        rVar2.d(writer, networkCapturedCall.f73223r);
        writer.f("em");
        rVar2.d(writer, networkCapturedCall.f73224s);
        writer.f("ne");
        rVar2.d(writer, networkCapturedCall.f73225t);
        writer.d();
    }

    public final String toString() {
        return f.f(41, "GeneratedJsonAdapter(NetworkCapturedCall)", "toString(...)");
    }
}
