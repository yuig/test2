package i91;

import android.content.Context;
import android.os.Environment;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import x02.i2;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f71834a;

    /* renamed from: b, reason: collision with root package name */
    public final o f71835b;

    /* renamed from: c, reason: collision with root package name */
    public Long f71836c;

    /* renamed from: d, reason: collision with root package name */
    public String f71837d;

    public h(String pinId, o type) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f71834a = pinId;
        this.f71835b = type;
        this.f71836c = null;
        Context context = kb0.a.f79058b;
        ((i2) ((oa) ((so1.b) ep.b.g(so1.b.class))).F3.get()).P(pinId).F(new x81.h0(2, new j41.i(this, 21)), new x81.h0(3, g.f71823j), ck2.i.f27923c, ck2.i.f27924d);
    }

    public final String a() {
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        String str = this.f71837d;
        if (str != null) {
            return a.a.D(path, "/", str);
        }
        Intrinsics.r("fileName");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f71834a, hVar.f71834a) && this.f71835b == hVar.f71835b && Intrinsics.d(this.f71836c, hVar.f71836c);
    }

    public final int hashCode() {
        int hashCode = (this.f71835b.hashCode() + (this.f71834a.hashCode() * 31)) * 31;
        Long l13 = this.f71836c;
        return hashCode + (l13 == null ? 0 : l13.hashCode());
    }

    public final String toString() {
        return "IdeaPinDownloadInProgress(pinId=" + this.f71834a + ", type=" + this.f71835b + ", id=" + this.f71836c + ")";
    }
}
