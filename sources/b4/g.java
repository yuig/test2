package b4;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final String f21571a;

    /* renamed from: b, reason: collision with root package name */
    public final List f21572b;

    /* renamed from: c, reason: collision with root package name */
    public final List f21573c;

    /* renamed from: d, reason: collision with root package name */
    public final List f21574d;

    static {
        r2.s sVar = f0.f21549a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(java.lang.String r3, java.util.ArrayList r4, int r5) {
        /*
            r2 = this;
            r5 = r5 & 2
            if (r5 == 0) goto L6
            kotlin.collections.q0 r4 = kotlin.collections.q0.f80391a
        L6:
            kotlin.collections.q0 r5 = kotlin.collections.q0.f80391a
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L12
            r4 = r1
        L12:
            java.util.List r4 = (java.util.List) r4
            r5.isEmpty()
            r2.<init>(r3, r4, r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.g.<init>(java.lang.String, java.util.ArrayList, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public final List a(int i13) {
        ?? r13;
        List list = this.f21574d;
        if (list != null) {
            r13 = new ArrayList(list.size());
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                Object obj = list.get(i14);
                e eVar = (e) obj;
                if ((eVar.f21542a instanceof n) && h.c(0, i13, eVar.f21543b, eVar.f21544c)) {
                    r13.add(obj);
                }
            }
        } else {
            r13 = kotlin.collections.q0.f80391a;
        }
        Intrinsics.g(r13, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return r13;
    }

    public final List b() {
        List list = this.f21572b;
        return list == null ? kotlin.collections.q0.f80391a : list;
    }

    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g subSequence(int i13, int i14) {
        if (i13 > i14) {
            throw new IllegalArgumentException(("start (" + i13 + ") should be less or equal to end (" + i14 + ')').toString());
        }
        String str = this.f21571a;
        if (i13 == 0 && i14 == str.length()) {
            return this;
        }
        String substring = str.substring(i13, i14);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new g(substring, h.a(i13, i14, this.f21572b), h.a(i13, i14, this.f21573c), h.a(i13, i14, this.f21574d));
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i13) {
        return this.f21571a.charAt(i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f21571a, gVar.f21571a) && Intrinsics.d(this.f21572b, gVar.f21572b) && Intrinsics.d(this.f21573c, gVar.f21573c) && Intrinsics.d(this.f21574d, gVar.f21574d);
    }

    public final int hashCode() {
        int hashCode = this.f21571a.hashCode() * 31;
        List list = this.f21572b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List list2 = this.f21573c;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List list3 = this.f21574d;
        return hashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f21571a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f21571a;
    }

    public g(String str, List list, List list2, List list3) {
        this.f21571a = str;
        this.f21572b = list;
        this.f21573c = list2;
        this.f21574d = list3;
        if (list2 != null) {
            int i13 = 0;
            List x03 = CollectionsKt.x0(list2, new f(i13));
            if (x03 != null) {
                int size = x03.size();
                int i14 = -1;
                while (i13 < size) {
                    e eVar = (e) x03.get(i13);
                    if (eVar.c() >= i14) {
                        if (eVar.a() <= this.f21571a.length()) {
                            i14 = eVar.a();
                            i13++;
                        } else {
                            throw new IllegalArgumentException(("ParagraphStyle range [" + eVar.c() + ", " + eVar.a() + ") is out of boundary").toString());
                        }
                    } else {
                        throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                    }
                }
            }
        }
    }
}
