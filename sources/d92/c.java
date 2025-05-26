package d92;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f54124a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f54125b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54126c;

    public c(String initialUrl, String title, LinkedHashMap headers) {
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f54124a = initialUrl;
        this.f54125b = headers;
        this.f54126c = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f54124a, cVar.f54124a) && Intrinsics.d(this.f54125b, cVar.f54125b) && Intrinsics.d(this.f54126c, cVar.f54126c);
    }

    public final int hashCode() {
        return this.f54126c.hashCode() + a.c.e(this.f54125b, this.f54124a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InitializeWebView(initialUrl=");
        sb3.append(this.f54124a);
        sb3.append(", headers=");
        sb3.append(this.f54125b);
        sb3.append(", title=");
        return a.a.p(sb3, this.f54126c, ")");
    }
}
