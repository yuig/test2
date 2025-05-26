package s01;

import com.pinterest.api.model.f30;
import dl1.m;
import h32.c1;
import h32.i0;
import h32.n0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends m {

    /* renamed from: c, reason: collision with root package name */
    public final String f110304c;

    /* renamed from: d, reason: collision with root package name */
    public final f30 f110305d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f110306e;

    /* renamed from: f, reason: collision with root package name */
    public final int f110307f;

    /* renamed from: g, reason: collision with root package name */
    public final c1 f110308g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f110309h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f110310i;

    /* renamed from: j, reason: collision with root package name */
    public final String f110311j;

    /* renamed from: k, reason: collision with root package name */
    public final n0 f110312k;

    public d(int i13, f30 pin, i0 i0Var, n0 finalDestinationUrlType, c1 c1Var, String url, String str, HashMap hashMap, boolean z13) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(finalDestinationUrlType, "finalDestinationUrlType");
        this.f110304c = url;
        this.f110305d = pin;
        this.f110306e = z13;
        this.f110307f = i13;
        this.f110308g = c1Var;
        this.f110309h = i0Var;
        this.f110310i = hashMap;
        this.f110311j = str;
        this.f110312k = finalDestinationUrlType;
    }

    public final i0 a() {
        return this.f110309h;
    }

    public final HashMap b() {
        return this.f110310i;
    }

    public final c1 c() {
        return this.f110308g;
    }

    public final n0 d() {
        return this.f110312k;
    }

    public final boolean e() {
        return this.f110306e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f110304c, dVar.f110304c) && Intrinsics.d(this.f110305d, dVar.f110305d) && this.f110306e == dVar.f110306e && this.f110307f == dVar.f110307f && Intrinsics.d(this.f110308g, dVar.f110308g) && Intrinsics.d(this.f110309h, dVar.f110309h) && Intrinsics.d(this.f110310i, dVar.f110310i) && Intrinsics.d(this.f110311j, dVar.f110311j) && this.f110312k == dVar.f110312k;
    }

    public final int f() {
        return this.f110307f;
    }

    public final String g() {
        return this.f110311j;
    }

    public final f30 h() {
        return this.f110305d;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f110307f, ep.b.e(this.f110306e, (this.f110305d.hashCode() + (this.f110304c.hashCode() * 31)) * 31, 31), 31);
        c1 c1Var = this.f110308g;
        int hashCode = (b13 + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        i0 i0Var = this.f110309h;
        int hashCode2 = (hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        HashMap hashMap = this.f110310i;
        int hashCode3 = (hashCode2 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        String str = this.f110311j;
        return this.f110312k.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f110304c;
    }

    public final String toString() {
        return "ClickthroughLoggingRequestParams(url=" + this.f110304c + ", pin=" + this.f110305d + ", fromGrid=" + this.f110306e + ", gridIndex=" + this.f110307f + ", eventData=" + this.f110308g + ", analyticContext=" + this.f110309h + ", auxData=" + this.f110310i + ", insertionId=" + this.f110311j + ", finalDestinationUrlType=" + this.f110312k + ")";
    }
}
