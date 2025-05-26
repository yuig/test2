package sh0;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f112918a;

    /* renamed from: b, reason: collision with root package name */
    public final String f112919b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f112920c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f112921d;

    public /* synthetic */ b() {
        this("", "", false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f112918a, bVar.f112918a) && Intrinsics.d(this.f112919b, bVar.f112919b) && this.f112920c == bVar.f112920c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112920c) + cb.d(this.f112919b, this.f112918a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ExpressSurveyAnswer(id=");
        sb3.append(this.f112918a);
        sb3.append(", text=");
        sb3.append(this.f112919b);
        sb3.append(", deselectRestIfSelected=");
        return a.a.r(sb3, this.f112920c, ")");
    }

    public b(String id3, String text, boolean z13) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f112918a = id3;
        this.f112919b = text;
        this.f112920c = z13;
    }
}
