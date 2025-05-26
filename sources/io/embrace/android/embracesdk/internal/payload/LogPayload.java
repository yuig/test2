package io.embrace.android.embracesdk.internal.payload;

import d7.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u0005\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/LogPayload;", "", "", "Lio/embrace/android/embracesdk/internal/payload/Log;", "logs", "copy", "(Ljava/util/List;)Lio/embrace/android/embracesdk/internal/payload/LogPayload;", "<init>", "(Ljava/util/List;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class LogPayload {

    /* renamed from: a, reason: collision with root package name */
    public final List f73188a;

    public LogPayload(@p(name = "logs") List<Log> list) {
        this.f73188a = list;
    }

    @NotNull
    public final LogPayload copy(@p(name = "logs") List<Log> logs) {
        return new LogPayload(logs);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogPayload) && Intrinsics.d(this.f73188a, ((LogPayload) obj).f73188a);
    }

    public final int hashCode() {
        List list = this.f73188a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return g.k(new StringBuilder("LogPayload(logs="), this.f73188a, ')');
    }

    public /* synthetic */ LogPayload(List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : list);
    }
}
