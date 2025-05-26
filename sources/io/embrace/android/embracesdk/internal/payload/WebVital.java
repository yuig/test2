package io.embrace.android.embracesdk.internal.payload;

import a.a;
import a.cb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.s;
import org.jetbrains.annotations.NotNull;
import th2.p;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J^\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/WebVital;", "", "Lth2/p;", "type", "", "name", "", "startTime", "duration", "", "properties", "", "score", "copy", "(Lth2/p;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Ljava/lang/Double;)Lio/embrace/android/embracesdk/internal/payload/WebVital;", "<init>", "(Lth2/p;Ljava/lang/String;JLjava/lang/Long;Ljava/util/Map;Ljava/lang/Double;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class WebVital {

    /* renamed from: a, reason: collision with root package name */
    public final p f73295a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73296b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73297c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f73298d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f73299e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f73300f;

    public WebVital(@oe2.p(name = "t") @NotNull p type, @oe2.p(name = "n") @NotNull String name, @oe2.p(name = "st") long j13, @oe2.p(name = "d") Long l13, @oe2.p(name = "p") Map<String, ? extends Object> map, @oe2.p(name = "s") Double d2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f73295a = type;
        this.f73296b = name;
        this.f73297c = j13;
        this.f73298d = l13;
        this.f73299e = map;
        this.f73300f = d2;
    }

    @NotNull
    public final WebVital copy(@oe2.p(name = "t") @NotNull p type, @oe2.p(name = "n") @NotNull String name, @oe2.p(name = "st") long startTime, @oe2.p(name = "d") Long duration, @oe2.p(name = "p") Map<String, ? extends Object> properties, @oe2.p(name = "s") Double score) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        return new WebVital(type, name, startTime, duration, properties, score);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebVital)) {
            return false;
        }
        WebVital webVital = (WebVital) obj;
        return this.f73295a == webVital.f73295a && Intrinsics.d(this.f73296b, webVital.f73296b) && this.f73297c == webVital.f73297c && Intrinsics.d(this.f73298d, webVital.f73298d) && Intrinsics.d(this.f73299e, webVital.f73299e) && Intrinsics.d(this.f73300f, webVital.f73300f);
    }

    public final int hashCode() {
        int c13 = a.c(this.f73297c, cb.d(this.f73296b, this.f73295a.hashCode() * 31, 31), 31);
        Long l13 = this.f73298d;
        int hashCode = (c13 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Map map = this.f73299e;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Double d2 = this.f73300f;
        return hashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "WebVital(type=" + this.f73295a + ", name=" + this.f73296b + ", startTime=" + this.f73297c + ", duration=" + this.f73298d + ", properties=" + this.f73299e + ", score=" + this.f73300f + ')';
    }

    public /* synthetic */ WebVital(p pVar, String str, long j13, Long l13, Map map, Double d2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, str, j13, (i13 & 8) != 0 ? null : l13, (i13 & 16) != 0 ? null : map, (i13 & 32) != 0 ? null : d2);
    }
}
