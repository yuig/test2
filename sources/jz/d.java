package jz;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f77739a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77740b;

    /* renamed from: c, reason: collision with root package name */
    public final String f77741c;

    /* renamed from: d, reason: collision with root package name */
    public final List f77742d;

    /* renamed from: e, reason: collision with root package name */
    public final String f77743e;

    public d(String str, List list, String str2, String str3, String str4) {
        this.f77739a = str;
        this.f77740b = str2;
        this.f77741c = str3;
        this.f77742d = list;
        this.f77743e = str4;
    }

    public final List a() {
        return this.f77742d;
    }

    public final String b() {
        return this.f77740b;
    }

    public final String c() {
        return this.f77741c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f77739a, dVar.f77739a) && Intrinsics.d(this.f77740b, dVar.f77740b) && Intrinsics.d(this.f77741c, dVar.f77741c) && Intrinsics.d(this.f77742d, dVar.f77742d) && Intrinsics.d(this.f77743e, dVar.f77743e);
    }

    public final int hashCode() {
        String str = this.f77739a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f77740b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77741c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f77742d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.f77743e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Question(uid=");
        sb3.append(this.f77739a);
        sb3.append(", layout=");
        sb3.append(this.f77740b);
        sb3.append(", title=");
        sb3.append(this.f77741c);
        sb3.append(", answers=");
        sb3.append(this.f77742d);
        sb3.append(", backgroundColor=");
        return a.a.p(sb3, this.f77743e, ")");
    }
}
