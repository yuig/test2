package ca1;

import kotlin.jvm.internal.Intrinsics;
import zy.a0;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f27187a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27188b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27189c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27190d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27191e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27192f;

    public a(a0 pinalyticsDisplayState, boolean z13, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f27187a = pinalyticsDisplayState;
        this.f27188b = z13;
        this.f27189c = str;
        this.f27190d = str2;
        this.f27191e = str3;
        this.f27192f = str4;
    }

    public static a e(a aVar, a0 a0Var, String str, String str2, String str3, String str4, int i13) {
        if ((i13 & 1) != 0) {
            a0Var = aVar.f27187a;
        }
        a0 pinalyticsDisplayState = a0Var;
        boolean z13 = (i13 & 2) != 0 ? aVar.f27188b : false;
        if ((i13 & 4) != 0) {
            str = aVar.f27189c;
        }
        String str5 = str;
        if ((i13 & 8) != 0) {
            str2 = aVar.f27190d;
        }
        String str6 = str2;
        if ((i13 & 16) != 0) {
            str3 = aVar.f27191e;
        }
        String str7 = str3;
        if ((i13 & 32) != 0) {
            str4 = aVar.f27192f;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new a(pinalyticsDisplayState, z13, str5, str6, str7, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f27187a, aVar.f27187a) && this.f27188b == aVar.f27188b && Intrinsics.d(this.f27189c, aVar.f27189c) && Intrinsics.d(this.f27190d, aVar.f27190d) && Intrinsics.d(this.f27191e, aVar.f27191e) && Intrinsics.d(this.f27192f, aVar.f27192f);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f27188b, this.f27187a.hashCode() * 31, 31);
        String str = this.f27189c;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27190d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f27191e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f27192f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClaimMigrationDisplayState(pinalyticsDisplayState=");
        sb3.append(this.f27187a);
        sb3.append(", isLoading=");
        sb3.append(this.f27188b);
        sb3.append(", username=");
        sb3.append(this.f27189c);
        sb3.append(", boardName=");
        sb3.append(this.f27190d);
        sb3.append(", boardImageUrl=");
        sb3.append(this.f27191e);
        sb3.append(", boardLayout=");
        return a.a.p(sb3, this.f27192f, ")");
    }
}
