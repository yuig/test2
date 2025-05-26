package lt0;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f84770a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f84771b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f84772c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f84773d;

    /* renamed from: e, reason: collision with root package name */
    public final int f84774e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84775f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84776g;

    public b(int i13, i0 text, i0 contentDescription, boolean z13, int i14, String str, String str2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f84770a = i13;
        this.f84771b = text;
        this.f84772c = contentDescription;
        this.f84773d = z13;
        this.f84774e = i14;
        this.f84775f = str;
        this.f84776g = str2;
    }

    public final String e() {
        return this.f84776g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f84770a == bVar.f84770a && Intrinsics.d(this.f84771b, bVar.f84771b) && Intrinsics.d(this.f84772c, bVar.f84772c) && this.f84773d == bVar.f84773d && this.f84774e == bVar.f84774e && Intrinsics.d(this.f84775f, bVar.f84775f) && Intrinsics.d(this.f84776g, bVar.f84776g);
    }

    public final String f() {
        return this.f84775f;
    }

    public final int g() {
        return this.f84770a;
    }

    public final int getId() {
        return this.f84774e;
    }

    public final boolean h() {
        return this.f84773d;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f84774e, ep.b.e(this.f84773d, ep.b.d(this.f84772c, ep.b.d(this.f84771b, Integer.hashCode(this.f84770a) * 31, 31), 31), 31), 31);
        String str = this.f84775f;
        int hashCode = (b13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f84776g;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(index=");
        sb3.append(this.f84770a);
        sb3.append(", text=");
        sb3.append(this.f84771b);
        sb3.append(", contentDescription=");
        sb3.append(this.f84772c);
        sb3.append(", showIcon=");
        sb3.append(this.f84773d);
        sb3.append(", id=");
        sb3.append(this.f84774e);
        sb3.append(", imageUrl=");
        sb3.append(this.f84775f);
        sb3.append(", backgroundColor=");
        return a.a.p(sb3, this.f84776g, ")");
    }
}
