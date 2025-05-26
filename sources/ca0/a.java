package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f27060a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f27061b;

    /* renamed from: c, reason: collision with root package name */
    public final String f27062c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27063d;

    public a(String id3, u50.f0 name, String str, String str2) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f27060a = id3;
        this.f27061b = name;
        this.f27062c = str;
        this.f27063d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f27060a, aVar.f27060a) && Intrinsics.d(this.f27061b, aVar.f27061b) && Intrinsics.d(this.f27062c, aVar.f27062c) && Intrinsics.d(this.f27063d, aVar.f27063d);
    }

    @Override // ca0.c
    public final u50.i0 getName() {
        return this.f27061b;
    }

    public final int hashCode() {
        int d2 = ep.b.d(this.f27061b, this.f27060a.hashCode() * 31, 31);
        String str = this.f27062c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f27063d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Board(id=");
        sb3.append(this.f27060a);
        sb3.append(", name=");
        sb3.append(this.f27061b);
        sb3.append(", imageUrl=");
        sb3.append(this.f27062c);
        sb3.append(", sectionId=");
        return a.a.p(sb3, this.f27063d, ")");
    }
}
