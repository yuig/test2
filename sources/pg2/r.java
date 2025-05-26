package pg2;

import java.net.URL;
import java.util.LinkedHashMap;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final URL f100148a;

    public r(URL url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f100148a = url;
    }

    public final s a() {
        s[] values = s.values();
        int a13 = y0.a(values.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (s sVar : values) {
            linkedHashMap.put(sVar.getPath(), sVar);
        }
        String path = this.f100148a.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "url.path");
        s sVar2 = (s) linkedHashMap.get(StringsKt.c0(path, "/"));
        return sVar2 == null ? s.UNKNOWN : sVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(r.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type io.embrace.android.embracesdk.internal.comms.api.EmbraceUrl");
        return Intrinsics.d(this.f100148a, ((r) obj).f100148a);
    }

    public final int hashCode() {
        return this.f100148a.hashCode();
    }

    public final String toString() {
        String url = this.f100148a.toString();
        Intrinsics.checkNotNullExpressionValue(url, "url.toString()");
        return url;
    }
}
