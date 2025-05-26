package an1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f15722a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f15723b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f15724c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15725d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15726e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15727f;

    public e(i0 label, i0 subText, i0 imageUrl, boolean z13, boolean z14, int i13) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(subText, "subText");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f15722a = label;
        this.f15723b = subText;
        this.f15724c = imageUrl;
        this.f15725d = z13;
        this.f15726e = z14;
        this.f15727f = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f15722a, eVar.f15722a) && Intrinsics.d(this.f15723b, eVar.f15723b) && Intrinsics.d(this.f15724c, eVar.f15724c) && this.f15725d == eVar.f15725d && this.f15726e == eVar.f15726e && this.f15727f == eVar.f15727f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15727f) + ep.b.e(this.f15726e, ep.b.e(this.f15725d, ep.b.d(this.f15724c, ep.b.d(this.f15723b, this.f15722a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(label=");
        sb3.append(this.f15722a);
        sb3.append(", subText=");
        sb3.append(this.f15723b);
        sb3.append(", imageUrl=");
        sb3.append(this.f15724c);
        sb3.append(", isEnabled=");
        sb3.append(this.f15725d);
        sb3.append(", isChecked=");
        sb3.append(this.f15726e);
        sb3.append(", id=");
        return a.a.n(sb3, this.f15727f, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ e(u50.i0 r10, u50.i0 r11, u50.i0 r12, boolean r13, int r14) {
        /*
            r9 = this;
            u50.h0 r0 = u50.h0.f120562a
            r1 = r14 & 2
            if (r1 == 0) goto L8
            r4 = r0
            goto L9
        L8:
            r4 = r11
        L9:
            r11 = r14 & 4
            if (r11 == 0) goto Lf
            r5 = r0
            goto L10
        Lf:
            r5 = r12
        L10:
            r11 = r14 & 8
            if (r11 == 0) goto L15
            r13 = 1
        L15:
            r6 = r13
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            r2 = r9
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: an1.e.<init>(u50.i0, u50.i0, u50.i0, boolean, int):void");
    }
}
