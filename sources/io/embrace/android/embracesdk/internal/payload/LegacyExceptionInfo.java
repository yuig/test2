package io.embrace.android.embracesdk.internal.payload;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/LegacyExceptionInfo;", "", "", "name", "message", "", "lines", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "org/chromium/net/y", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class LegacyExceptionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f73168a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73169b;

    /* renamed from: c, reason: collision with root package name */
    public final List f73170c;

    public LegacyExceptionInfo(@p(name = "n") @NotNull String name, @p(name = "m") String str, @NotNull List<String> lines) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lines, "lines");
        this.f73168a = name;
        this.f73169b = str;
        this.f73170c = CollectionsKt.y0(lines, 200);
        lines.size();
    }

    @p(name = "tt")
    public static /* synthetic */ void getLines$annotations() {
    }

    @p(name = "length")
    public static /* synthetic */ void getOriginalLength$annotations() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(LegacyExceptionInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type io.embrace.android.embracesdk.internal.payload.LegacyExceptionInfo");
        LegacyExceptionInfo legacyExceptionInfo = (LegacyExceptionInfo) obj;
        return Intrinsics.d(this.f73168a, legacyExceptionInfo.f73168a) && Intrinsics.d(this.f73169b, legacyExceptionInfo.f73169b) && Intrinsics.d(this.f73170c, legacyExceptionInfo.f73170c);
    }

    public final int hashCode() {
        int hashCode = this.f73168a.hashCode() * 31;
        String str = this.f73169b;
        return this.f73170c.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
