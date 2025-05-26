package fh0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements hh0.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f62148a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62149b;

    /* renamed from: c, reason: collision with root package name */
    public final gh0.a f62150c;

    /* renamed from: d, reason: collision with root package name */
    public final gh0.a f62151d;

    public a(String str, String message, gh0.a completeButton, gh0.a aVar) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(completeButton, "completeButton");
        this.f62148a = str;
        this.f62149b = message;
        this.f62150c = completeButton;
        this.f62151d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f62148a, aVar.f62148a) && Intrinsics.d(this.f62149b, aVar.f62149b) && Intrinsics.d(this.f62150c, aVar.f62150c) && Intrinsics.d(this.f62151d, aVar.f62151d);
    }

    public final int hashCode() {
        String str = this.f62148a;
        int hashCode = (this.f62150c.hashCode() + cb.d(this.f62149b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        gh0.a aVar = this.f62151d;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CalloutDisplayData(title=" + this.f62148a + ", message=" + this.f62149b + ", completeButton=" + this.f62150c + ", dismissButton=" + this.f62151d + ")";
    }
}
