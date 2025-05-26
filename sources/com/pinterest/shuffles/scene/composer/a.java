package com.pinterest.shuffles.scene.composer;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f51998a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f51999b;

    /* renamed from: c, reason: collision with root package name */
    public PointF f52000c;

    /* renamed from: d, reason: collision with root package name */
    public hd2.a f52001d;

    /* renamed from: e, reason: collision with root package name */
    public ke2.a f52002e;

    /* renamed from: f, reason: collision with root package name */
    public float f52003f;

    public a(float f13, boolean z13, PointF offset, hd2.a rotation, ke2.a flip, float f14) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(flip, "flip");
        this.f51998a = f13;
        this.f51999b = z13;
        this.f52000c = offset;
        this.f52001d = rotation;
        this.f52002e = flip;
        this.f52003f = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f51998a, aVar.f51998a) == 0 && this.f51999b == aVar.f51999b && Intrinsics.d(this.f52000c, aVar.f52000c) && Intrinsics.d(this.f52001d, aVar.f52001d) && Intrinsics.d(this.f52002e, aVar.f52002e) && Float.compare(this.f52003f, aVar.f52003f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f52003f) + ((this.f52002e.hashCode() + ((this.f52001d.hashCode() + ((this.f52000c.hashCode() + ep.b.e(this.f51999b, Float.hashCode(this.f51998a) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AnimatedState(alpha=" + this.f51998a + ", isHidden=" + this.f51999b + ", offset=" + this.f52000c + ", rotation=" + this.f52001d + ", flip=" + this.f52002e + ", height=" + this.f52003f + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(r72.g1 r13, android.util.Size r14, ke2.i r15) {
        /*
            r12 = this;
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "sceneSize"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "sticker"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            int r0 = com.pinterest.shuffles.scene.composer.z.f52181a
            r72.l1 r0 = r13.f106482d
            double r1 = r0.f106535a
            double r3 = r0.f106536b
            android.graphics.PointF r8 = com.pinterest.shuffles.scene.composer.z.d(r14, r1, r3)
            double r0 = r13.f106483e
            double r0 = -r0
            hd2.a r9 = new hd2.a
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r0 = r0 / r2
            r9.<init>(r0)
            ke2.a r10 = new ke2.a
            double r0 = r13.f106485g
            double r0 = r0 / r2
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r4
            float r14 = (float) r0
            double r0 = r13.f106484f
            double r0 = r0 / r2
            double r0 = r0 * r4
            float r0 = (float) r0
            r10.<init>(r14, r0)
            boolean r14 = r15 instanceof com.pinterest.shuffles.scene.composer.h
            double r0 = r13.f106486h
            if (r14 == 0) goto L48
            com.pinterest.shuffles.scene.composer.h r15 = (com.pinterest.shuffles.scene.composer.h) r15
            float r14 = r15.f52050p
        L44:
            float r15 = (float) r0
            float r14 = r14 * r15
        L46:
            r11 = r14
            goto L56
        L48:
            boolean r14 = r15 instanceof com.pinterest.shuffles.scene.composer.c1
            if (r14 == 0) goto L51
            com.pinterest.shuffles.scene.composer.c1 r15 = (com.pinterest.shuffles.scene.composer.c1) r15
            float r14 = r15.f52020t
            goto L44
        L51:
            float r14 = r15.a()
            goto L46
        L56:
            boolean r7 = r13.f106481c
            float r6 = r13.f106480b
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.shuffles.scene.composer.a.<init>(r72.g1, android.util.Size, ke2.i):void");
    }
}
