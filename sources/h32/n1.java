package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n1 {

    /* renamed from: e, reason: collision with root package name */
    public static final c50.c1 f67151e = new c50.c1(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f67152a;

    /* renamed from: b, reason: collision with root package name */
    public final Short f67153b;

    /* renamed from: c, reason: collision with root package name */
    public final Short f67154c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f67155d;

    public n1(String str, Short sh3, Short sh4, Short sh5) {
        this.f67152a = str;
        this.f67153b = sh3;
        this.f67154c = sh4;
        this.f67155d = sh5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Intrinsics.d(this.f67152a, n1Var.f67152a) && Intrinsics.d(this.f67153b, n1Var.f67153b) && Intrinsics.d(this.f67154c, n1Var.f67154c) && Intrinsics.d(this.f67155d, n1Var.f67155d) && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        String str = this.f67152a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Short sh3 = this.f67153b;
        int hashCode2 = (hashCode + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Short sh4 = this.f67154c;
        int hashCode3 = (hashCode2 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        Short sh5 = this.f67155d;
        return (hashCode3 + (sh5 != null ? sh5.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "NewsHubData(newsIdStr=" + this.f67152a + ", newsType=" + this.f67153b + ", newsIndex=" + this.f67154c + ", displayMode=" + this.f67155d + ", tapItemIdStr=null)";
    }
}
