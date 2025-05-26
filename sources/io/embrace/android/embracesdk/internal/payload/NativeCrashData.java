package io.embrace.android.embracesdk.internal.payload;

import a.a;
import a.cb;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJR\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0016\b\u0003\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/NativeCrashData;", "", "", "nativeCrashId", "sessionId", "", "timestamp", "crash", "", "symbols", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Map;)Lio/embrace/android/embracesdk/internal/payload/NativeCrashData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Map;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class NativeCrashData {

    /* renamed from: a, reason: collision with root package name */
    public final String f73192a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73193b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73194c;

    /* renamed from: d, reason: collision with root package name */
    public final String f73195d;

    /* renamed from: e, reason: collision with root package name */
    public Map f73196e;

    public NativeCrashData(@p(name = "report_id") @NotNull String nativeCrashId, @p(name = "sid") @NotNull String sessionId, @p(name = "ts") long j13, @p(name = "crash") String str, @p(name = "symbols") Map<String, String> map) {
        Intrinsics.checkNotNullParameter(nativeCrashId, "nativeCrashId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f73192a = nativeCrashId;
        this.f73193b = sessionId;
        this.f73194c = j13;
        this.f73195d = str;
        this.f73196e = map;
    }

    @NotNull
    public final NativeCrashData copy(@p(name = "report_id") @NotNull String nativeCrashId, @p(name = "sid") @NotNull String sessionId, @p(name = "ts") long timestamp, @p(name = "crash") String crash, @p(name = "symbols") Map<String, String> symbols) {
        Intrinsics.checkNotNullParameter(nativeCrashId, "nativeCrashId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new NativeCrashData(nativeCrashId, sessionId, timestamp, crash, symbols);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeCrashData)) {
            return false;
        }
        NativeCrashData nativeCrashData = (NativeCrashData) obj;
        return Intrinsics.d(this.f73192a, nativeCrashData.f73192a) && Intrinsics.d(this.f73193b, nativeCrashData.f73193b) && this.f73194c == nativeCrashData.f73194c && Intrinsics.d(this.f73195d, nativeCrashData.f73195d) && Intrinsics.d(this.f73196e, nativeCrashData.f73196e);
    }

    public final int hashCode() {
        int c13 = a.c(this.f73194c, cb.d(this.f73193b, this.f73192a.hashCode() * 31, 31), 31);
        String str = this.f73195d;
        int hashCode = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f73196e;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "NativeCrashData(nativeCrashId=" + this.f73192a + ", sessionId=" + this.f73193b + ", timestamp=" + this.f73194c + ", crash=" + this.f73195d + ", symbols=" + this.f73196e + ')';
    }
}
