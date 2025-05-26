package u50;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w extends rl2.g0 {

    /* renamed from: a */
    public final i0 f120587a;

    public w(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        f0 url2 = new f0(url);
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f120587a = url2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f120587a, ((w) obj).f120587a);
    }

    public final int hashCode() {
        return this.f120587a.hashCode();
    }

    @Override // u50.a0
    /* renamed from: s0 */
    public final String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f120587a.a(context).toString();
    }

    public final String toString() {
        return "ImageUrl(url=" + this.f120587a + ")";
    }
}
