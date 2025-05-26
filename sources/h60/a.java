package h60;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes5.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f67776a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f67777b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67778c;

    /* renamed from: d, reason: collision with root package name */
    public final List f67779d;

    /* renamed from: e, reason: collision with root package name */
    public final List f67780e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f67781f;

    public a(int i13, Integer num, int i14, List textAlignment, List recyclerItems, boolean z13) {
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        Intrinsics.checkNotNullParameter(recyclerItems, "recyclerItems");
        this.f67776a = i13;
        this.f67777b = num;
        this.f67778c = i14;
        this.f67779d = textAlignment;
        this.f67780e = recyclerItems;
        this.f67781f = z13;
    }

    public static a e(a aVar, int i13, int i14) {
        int i15 = aVar.f67776a;
        Integer num = aVar.f67777b;
        if ((i14 & 4) != 0) {
            i13 = aVar.f67778c;
        }
        int i16 = i13;
        List textAlignment = aVar.f67779d;
        List recyclerItems = aVar.f67780e;
        boolean z13 = (i14 & 32) != 0 ? aVar.f67781f : false;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(textAlignment, "textAlignment");
        Intrinsics.checkNotNullParameter(recyclerItems, "recyclerItems");
        return new a(i15, num, i16, textAlignment, recyclerItems, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f67776a == aVar.f67776a && Intrinsics.d(this.f67777b, aVar.f67777b) && this.f67778c == aVar.f67778c && Intrinsics.d(this.f67779d, aVar.f67779d) && Intrinsics.d(this.f67780e, aVar.f67780e) && this.f67781f == aVar.f67781f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f67776a) * 31;
        Integer num = this.f67777b;
        return Boolean.hashCode(this.f67781f) + ep.b.c(this.f67780e, ep.b.c(this.f67779d, ep.b.b(this.f67778c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "PinClusterCarouselDisplayState(boardSuggestionsTitle=" + this.f67776a + ", boardSuggestionsSubtitle=" + this.f67777b + ", topPadding=" + this.f67778c + ", textAlignment=" + this.f67779d + ", recyclerItems=" + this.f67780e + ", shouldLogOnBind=" + this.f67781f + ")";
    }
}
