package kv1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f81029a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81030b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81031c;

    /* renamed from: d, reason: collision with root package name */
    public final String f81032d;

    public c(String gender, int i13, String country, String locale) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f81029a = i13;
        this.f81030b = gender;
        this.f81031c = country;
        this.f81032d = locale;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f81029a == cVar.f81029a && Intrinsics.d(this.f81030b, cVar.f81030b) && Intrinsics.d(this.f81031c, cVar.f81031c) && Intrinsics.d(this.f81032d, cVar.f81032d);
    }

    public final int hashCode() {
        return this.f81032d.hashCode() + cb.d(this.f81031c, cb.d(this.f81030b, Integer.hashCode(this.f81029a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UserParamsForNuxService(age=");
        sb3.append(this.f81029a);
        sb3.append(", gender=");
        sb3.append(this.f81030b);
        sb3.append(", country=");
        sb3.append(this.f81031c);
        sb3.append(", locale=");
        return a.a.p(sb3, this.f81032d, ")");
    }
}
