package gx1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f66292a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66293b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f66294c;

    /* renamed from: d, reason: collision with root package name */
    public final List f66295d;

    /* renamed from: e, reason: collision with root package name */
    public final List f66296e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f66297f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f66298g;

    /* renamed from: h, reason: collision with root package name */
    public final List f66299h;

    /* renamed from: i, reason: collision with root package name */
    public final mx1.a f66300i;

    /* renamed from: j, reason: collision with root package name */
    public final ox1.b f66301j;

    public f(String title, String str, Float f13, ArrayList ageList, List genderList, boolean z13, Date date, ArrayList deviceList, mx1.a topCategories, ox1.b topLocations) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ageList, "ageList");
        Intrinsics.checkNotNullParameter(genderList, "genderList");
        Intrinsics.checkNotNullParameter(deviceList, "deviceList");
        Intrinsics.checkNotNullParameter(topCategories, "topCategories");
        Intrinsics.checkNotNullParameter(topLocations, "topLocations");
        this.f66292a = title;
        this.f66293b = str;
        this.f66294c = f13;
        this.f66295d = ageList;
        this.f66296e = genderList;
        this.f66297f = z13;
        this.f66298g = date;
        this.f66299h = deviceList;
        this.f66300i = topCategories;
        this.f66301j = topLocations;
    }

    public final List a() {
        return this.f66295d;
    }

    public final Float b() {
        return this.f66294c;
    }

    public final List c() {
        return this.f66299h;
    }

    public final List d() {
        return this.f66296e;
    }

    public final Date e() {
        return this.f66298g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f66292a, fVar.f66292a) && Intrinsics.d(this.f66293b, fVar.f66293b) && Intrinsics.d(this.f66294c, fVar.f66294c) && Intrinsics.d(this.f66295d, fVar.f66295d) && Intrinsics.d(this.f66296e, fVar.f66296e) && this.f66297f == fVar.f66297f && Intrinsics.d(this.f66298g, fVar.f66298g) && Intrinsics.d(this.f66299h, fVar.f66299h) && Intrinsics.d(this.f66300i, fVar.f66300i) && Intrinsics.d(this.f66301j, fVar.f66301j);
    }

    public final String f() {
        return this.f66293b;
    }

    public final String g() {
        return this.f66292a;
    }

    public final mx1.a h() {
        return this.f66300i;
    }

    public final int hashCode() {
        int hashCode = this.f66292a.hashCode() * 31;
        String str = this.f66293b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Float f13 = this.f66294c;
        int e13 = ep.b.e(this.f66297f, ep.b.c(this.f66296e, ep.b.c(this.f66295d, (hashCode2 + (f13 == null ? 0 : f13.hashCode())) * 31, 31), 31), 31);
        Date date = this.f66298g;
        return this.f66301j.hashCode() + ((this.f66300i.hashCode() + ep.b.c(this.f66299h, (e13 + (date != null ? date.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final ox1.b i() {
        return this.f66301j;
    }

    public final String toString() {
        return "AudienceViewDataSelection(title=" + this.f66292a + ", subtitle=" + this.f66293b + ", audienceSize=" + this.f66294c + ", ageList=" + this.f66295d + ", genderList=" + this.f66296e + ", isUpperBound=" + this.f66297f + ", lastUpdated=" + this.f66298g + ", deviceList=" + this.f66299h + ", topCategories=" + this.f66300i + ", topLocations=" + this.f66301j + ")";
    }
}
