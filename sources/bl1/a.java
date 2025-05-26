package bl1;

import kotlin.jvm.internal.Intrinsics;
import vd0.c;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23478a;

    /* renamed from: b, reason: collision with root package name */
    public final c f23479b;

    public a(String str, c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f23478a = str;
        this.f23479b = json;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f23478a, aVar.f23478a) && Intrinsics.d(this.f23479b, aVar.f23479b);
    }

    public final int hashCode() {
        String str = this.f23478a;
        return this.f23479b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "RemoteResponse(url=" + this.f23478a + ", json=" + this.f23479b + ")";
    }
}
