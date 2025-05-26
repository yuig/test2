package tn1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vn1.g;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final vn1.c f118608a;

    /* renamed from: b, reason: collision with root package name */
    public final vn1.b f118609b;

    /* renamed from: c, reason: collision with root package name */
    public final List f118610c;

    /* renamed from: d, reason: collision with root package name */
    public final g f118611d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(vn1.c r3, java.util.List r4, vn1.g r5, int r6) {
        /*
            r2 = this;
            r0 = r6 & 1
            if (r0 == 0) goto La
            ps0.y r3 = tn1.c.f118612d
            vn1.c r3 = r3.b()
        La:
            vn1.b r0 = tn1.c.f118615g
            r1 = r6 & 4
            if (r1 == 0) goto L1c
            ps0.y r4 = tn1.c.f118612d
            int r4 = r4.f101325a
            switch(r4) {
                case 10: goto L1a;
                default: goto L17;
            }
        L17:
            java.util.List r4 = tn1.c.f118616h
            goto L1c
        L1a:
            java.util.List r4 = ej1.d.f59105n
        L1c:
            r6 = r6 & 8
            if (r6 == 0) goto L22
            vn1.g r5 = tn1.c.f118613e
        L22:
            r2.<init>(r3, r0, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tn1.b.<init>(vn1.c, java.util.List, vn1.g, int):void");
    }

    public static b a(b bVar, vn1.c color, vn1.b alignment, List style, g variant, int i13) {
        if ((i13 & 1) != 0) {
            color = bVar.f118608a;
        }
        if ((i13 & 2) != 0) {
            alignment = bVar.f118609b;
        }
        if ((i13 & 4) != 0) {
            style = bVar.f118610c;
        }
        if ((i13 & 8) != 0) {
            variant = bVar.f118611d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new b(color, alignment, style, variant);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f118608a == bVar.f118608a && this.f118609b == bVar.f118609b && Intrinsics.d(this.f118610c, bVar.f118610c) && this.f118611d == bVar.f118611d;
    }

    public final int hashCode() {
        return this.f118611d.hashCode() + ep.b.c(this.f118610c, (this.f118609b.hashCode() + (this.f118608a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "DisplayState(color=" + this.f118608a + ", alignment=" + this.f118609b + ", style=" + this.f118610c + ", variant=" + this.f118611d + ")";
    }

    public b(vn1.c color, vn1.b alignment, List style, g variant) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f118608a = color;
        this.f118609b = alignment;
        this.f118610c = style;
        this.f118611d = variant;
    }
}
