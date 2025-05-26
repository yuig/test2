package y01;

import com.pinterest.analytics.TrackingParamKeyBuilder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f136458a;

    /* renamed from: b, reason: collision with root package name */
    public final TrackingParamKeyBuilder f136459b;

    /* renamed from: c, reason: collision with root package name */
    public final int f136460c;

    /* renamed from: d, reason: collision with root package name */
    public final String f136461d;

    /* renamed from: e, reason: collision with root package name */
    public final String f136462e;

    /* renamed from: f, reason: collision with root package name */
    public final int f136463f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f136464g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f136465h;

    /* renamed from: i, reason: collision with root package name */
    public final String f136466i;

    public o(String str, TrackingParamKeyBuilder trackingParamKeyBuilder, int i13, String str2, String str3, int i14, ArrayList arrayList, boolean z13, String str4) {
        this.f136458a = str;
        this.f136459b = trackingParamKeyBuilder;
        this.f136460c = i13;
        this.f136461d = str2;
        this.f136462e = str3;
        this.f136463f = i14;
        this.f136464g = arrayList;
        this.f136465h = z13;
        this.f136466i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f136458a, oVar.f136458a) && Intrinsics.d(this.f136459b, oVar.f136459b) && this.f136460c == oVar.f136460c && Intrinsics.d(this.f136461d, oVar.f136461d) && Intrinsics.d(this.f136462e, oVar.f136462e) && this.f136463f == oVar.f136463f && Intrinsics.d(this.f136464g, oVar.f136464g) && this.f136465h == oVar.f136465h && Intrinsics.d(this.f136466i, oVar.f136466i);
    }

    public final int hashCode() {
        String str = this.f136458a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TrackingParamKeyBuilder trackingParamKeyBuilder = this.f136459b;
        int b13 = ep.b.b(this.f136460c, (hashCode + (trackingParamKeyBuilder == null ? 0 : trackingParamKeyBuilder.hashCode())) * 31, 31);
        String str2 = this.f136461d;
        int hashCode2 = (b13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f136462e;
        int b14 = ep.b.b(this.f136463f, (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        ArrayList arrayList = this.f136464g;
        int e13 = ep.b.e(this.f136465h, (b14 + (arrayList == null ? 0 : arrayList.hashCode())) * 31, 31);
        String str4 = this.f136466i;
        return e13 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavigationData(searchQuery=");
        sb3.append(this.f136458a);
        sb3.append(", trackingParamBuilder=");
        sb3.append(this.f136459b);
        sb3.append(", navigationFrom=");
        sb3.append(this.f136460c);
        sb3.append(", navigationTopLevelSource=");
        sb3.append(this.f136461d);
        sb3.append(", navigationCloseupModuleSource=");
        sb3.append(this.f136462e);
        sb3.append(", navigationTopLevelSourceDepth=");
        sb3.append(this.f136463f);
        sb3.append(", contextPinIds=");
        sb3.append(this.f136464g);
        sb3.append(", isHideSupported=");
        sb3.append(this.f136465h);
        sb3.append(", trafficSource=");
        return a.a.p(sb3, this.f136466i, ")");
    }
}
