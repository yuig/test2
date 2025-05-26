package io.embrace.android.embracesdk.internal.payload;

import ep.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oe2.p;
import oe2.s;
import org.jetbrains.annotations.NotNull;

@s(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0005\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lio/embrace/android/embracesdk/internal/payload/Attribute;", "", "", "key", "data", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lio/embrace/android/embracesdk/internal/payload/Attribute;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class Attribute {

    /* renamed from: a, reason: collision with root package name */
    public final String f73101a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73102b;

    public Attribute(@p(name = "key") String str, @p(name = "value") String str2) {
        this.f73101a = str;
        this.f73102b = str2;
    }

    @NotNull
    public final Attribute copy(@p(name = "key") String key, @p(name = "value") String data) {
        return new Attribute(key, data);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        return Intrinsics.d(this.f73101a, attribute.f73101a) && Intrinsics.d(this.f73102b, attribute.f73102b);
    }

    public final int hashCode() {
        String str = this.f73101a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73102b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Attribute(key=");
        sb3.append(this.f73101a);
        sb3.append(", data=");
        return b.k(sb3, this.f73102b, ')');
    }

    public /* synthetic */ Attribute(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
    }
}
