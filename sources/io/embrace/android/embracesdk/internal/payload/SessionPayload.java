package io.embrace.android.embracesdk.internal.payload;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJL\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0016\b\u0003\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/SessionPayload;", "", "", "Lio/embrace/android/embracesdk/internal/payload/Span;", "spans", "spanSnapshots", "", "", "sharedLibSymbolMapping", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)Lio/embrace/android/embracesdk/internal/payload/SessionPayload;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class SessionPayload {

    /* renamed from: a, reason: collision with root package name */
    public final List f73233a;

    /* renamed from: b, reason: collision with root package name */
    public final List f73234b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f73235c;

    public SessionPayload(@p(name = "spans") List<Span> list, @p(name = "span_snapshots") List<Span> list2, @p(name = "shared_lib_symbol_mapping") Map<String, String> map) {
        this.f73233a = list;
        this.f73234b = list2;
        this.f73235c = map;
    }

    public static /* synthetic */ SessionPayload a(SessionPayload sessionPayload, List list, q0 q0Var, int i13) {
        List<Span> list2 = q0Var;
        if ((i13 & 2) != 0) {
            list2 = sessionPayload.f73234b;
        }
        return sessionPayload.copy(list, list2, sessionPayload.f73235c);
    }

    @NotNull
    public final SessionPayload copy(@p(name = "spans") List<Span> spans, @p(name = "span_snapshots") List<Span> spanSnapshots, @p(name = "shared_lib_symbol_mapping") Map<String, String> sharedLibSymbolMapping) {
        return new SessionPayload(spans, spanSnapshots, sharedLibSymbolMapping);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionPayload)) {
            return false;
        }
        SessionPayload sessionPayload = (SessionPayload) obj;
        return Intrinsics.d(this.f73233a, sessionPayload.f73233a) && Intrinsics.d(this.f73234b, sessionPayload.f73234b) && Intrinsics.d(this.f73235c, sessionPayload.f73235c);
    }

    public final int hashCode() {
        List list = this.f73233a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f73234b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Map map = this.f73235c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionPayload(spans=" + this.f73233a + ", spanSnapshots=" + this.f73234b + ", sharedLibSymbolMapping=" + this.f73235c + ')';
    }

    public /* synthetic */ SessionPayload(List list, List list2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : list2, (i13 & 4) != 0 ? null : map);
    }
}
