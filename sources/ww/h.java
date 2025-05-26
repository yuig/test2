package ww;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final URL f131173a;

    /* renamed from: b, reason: collision with root package name */
    public final String f131174b;

    /* renamed from: c, reason: collision with root package name */
    public final String f131175c;

    /* renamed from: d, reason: collision with root package name */
    public final String f131176d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f131177e;

    public h(URL scriptURL, String str, String str2, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(scriptURL, "scriptURL");
        this.f131173a = scriptURL;
        this.f131174b = str;
        this.f131175c = str2;
        this.f131176d = str3;
        this.f131177e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f131173a, hVar.f131173a) && Intrinsics.d(this.f131174b, hVar.f131174b) && Intrinsics.d(this.f131175c, hVar.f131175c) && Intrinsics.d(this.f131176d, hVar.f131176d) && Intrinsics.d(this.f131177e, hVar.f131177e);
    }

    public final int hashCode() {
        int hashCode = this.f131173a.hashCode() * 31;
        String str = this.f131174b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f131175c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f131176d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f131177e;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SanitizedThirdPartyAdVerificationConfig(scriptURL=");
        sb3.append(this.f131173a);
        sb3.append(", vendor=");
        sb3.append(this.f131174b);
        sb3.append(", params=");
        sb3.append(this.f131175c);
        sb3.append(", failureTrackingURL=");
        sb3.append(this.f131176d);
        sb3.append(", framework=");
        return a.c.i(sb3, this.f131177e, ")");
    }
}
