package qp1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f104761a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f104762b;

    /* renamed from: c, reason: collision with root package name */
    public final String f104763c;

    public e(String initialUrl, String title, LinkedHashMap headers) {
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f104761a = initialUrl;
        this.f104762b = headers;
        this.f104763c = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f104761a, eVar.f104761a) && Intrinsics.d(this.f104762b, eVar.f104762b) && Intrinsics.d(this.f104763c, eVar.f104763c);
    }

    public final int hashCode() {
        return this.f104763c.hashCode() + a.c.e(this.f104762b, this.f104761a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InitializeWebView(initialUrl=");
        sb3.append(this.f104761a);
        sb3.append(", headers=");
        sb3.append(this.f104762b);
        sb3.append(", title=");
        return a.a.p(sb3, this.f104763c, ")");
    }
}
