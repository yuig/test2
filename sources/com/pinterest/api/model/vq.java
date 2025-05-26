package com.pinterest.api.model;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012B\u0013\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0010\u0010\u0014B\u0013\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/pinterest/api/model/vq;", "", "Landroid/graphics/PointF;", "a", "Landroid/graphics/PointF;", "g", "()Landroid/graphics/PointF;", "topLeft", "b", "h", "topRight", "c", "d", "bottomLeft", "e", "bottomRight", "<init>", "(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)V", "()V", "rect", "(Lcom/pinterest/api/model/vq;)V", "Landroid/graphics/RectF;", "(Landroid/graphics/RectF;)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class vq {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("topLeft")
    @NotNull
    private final PointF topLeft;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("topRight")
    @NotNull
    private final PointF topRight;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("bottomLeft")
    @NotNull
    private final PointF bottomLeft;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("bottomRight")
    @NotNull
    private final PointF bottomRight;

    public vq(@NotNull PointF topLeft, @NotNull PointF topRight, @NotNull PointF bottomLeft, @NotNull PointF bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public static float c(PointF pointF, PointF pointF2) {
        double d2 = 2;
        return (float) Math.sqrt(((float) Math.pow(pointF.x - pointF2.x, d2)) + ((float) Math.pow(pointF.y - pointF2.y, d2)));
    }

    public static int j(float f13, float f14, float f15, float f16) {
        float[] fArr = {f13, f14, f15, f16};
        float f17 = fArr[0];
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ql2.k it = new IntRange(1, 3, 1).iterator();
        while (it.f104109c) {
            f17 = Math.max(f17, fArr[it.b()]);
        }
        return ml2.c.c(f17);
    }

    public static int k(float f13, float f14, float f15, float f16) {
        float[] fArr = {f13, f14, f15, f16};
        float f17 = fArr[0];
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ql2.k it = new IntRange(1, 3, 1).iterator();
        while (it.f104109c) {
            f17 = Math.min(f17, fArr[it.b()]);
        }
        return ml2.c.c(f17);
    }

    public static void n(PointF pointF, float f13) {
        pointF.x *= f13;
        pointF.y *= f13;
    }

    public final PointF a() {
        PointF pointF = this.topLeft;
        float f13 = pointF.x;
        PointF pointF2 = this.bottomRight;
        float f14 = 2;
        return new PointF((f13 + pointF2.x) / f14, (pointF.y + pointF2.y) / f14);
    }

    public final boolean b(float f13, float f14) {
        Path path = new Path();
        PointF pointF = this.topLeft;
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = this.topRight;
        path.lineTo(pointF2.x, pointF2.y);
        PointF pointF3 = this.bottomRight;
        path.lineTo(pointF3.x, pointF3.y);
        PointF pointF4 = this.bottomLeft;
        path.lineTo(pointF4.x, pointF4.y);
        Region region = new Region(k(this.topLeft.x, this.topRight.x, this.bottomLeft.x, this.bottomRight.x), k(this.topLeft.y, this.topRight.y, this.bottomLeft.y, this.bottomRight.y), j(this.topLeft.x, this.topRight.x, this.bottomLeft.x, this.bottomRight.x), j(this.topLeft.y, this.topRight.y, this.bottomLeft.y, this.bottomRight.y));
        Region region2 = new Region();
        region2.setPath(path, region);
        return region2.contains((int) f13, (int) f14);
    }

    /* renamed from: d, reason: from getter */
    public final PointF getBottomLeft() {
        return this.bottomLeft;
    }

    /* renamed from: e, reason: from getter */
    public final PointF getBottomRight() {
        return this.bottomRight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(vq.class, obj.getClass())) {
            return false;
        }
        vq vqVar = (vq) obj;
        return Intrinsics.d(this.topLeft, vqVar.topLeft) && Intrinsics.d(this.topRight, vqVar.topRight) && Intrinsics.d(this.bottomLeft, vqVar.bottomLeft) && Intrinsics.d(this.bottomRight, vqVar.bottomRight);
    }

    public final float[] f() {
        PointF pointF = this.topLeft;
        float f13 = pointF.x;
        float f14 = pointF.y;
        PointF pointF2 = this.topRight;
        float f15 = pointF2.x;
        float f16 = pointF2.y;
        PointF pointF3 = this.bottomLeft;
        float f17 = pointF3.x;
        float f18 = pointF3.y;
        PointF pointF4 = this.bottomRight;
        return new float[]{f13, f14, f15, f16, f17, f18, pointF4.x, pointF4.y};
    }

    /* renamed from: g, reason: from getter */
    public final PointF getTopLeft() {
        return this.topLeft;
    }

    /* renamed from: h, reason: from getter */
    public final PointF getTopRight() {
        return this.topRight;
    }

    public final int hashCode() {
        return this.bottomRight.hashCode() + ((this.bottomLeft.hashCode() + ((this.topRight.hashCode() + (this.topLeft.hashCode() * 31)) * 31)) * 31);
    }

    public final float i() {
        return c(this.topLeft, this.bottomLeft);
    }

    public final void l(float f13, float f14) {
        this.topLeft.offset(f13, f14);
        this.topRight.offset(f13, f14);
        this.bottomLeft.offset(f13, f14);
        this.bottomRight.offset(f13, f14);
    }

    public final void m(float f13) {
        n(this.topLeft, f13);
        n(this.topRight, f13);
        n(this.bottomLeft, f13);
        n(this.bottomRight, f13);
    }

    public final float o() {
        return c(this.topLeft, this.topRight);
    }

    public final String toString() {
        return "topLeft: " + this.topLeft + ", topRight: " + this.topRight + ", bottomLeft: " + this.bottomLeft + ", bottomRight: " + this.bottomRight;
    }

    public vq() {
        this(new PointF(), new PointF(), new PointF(), new PointF());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public vq(com.pinterest.api.model.vq r7) {
        /*
            r6 = this;
            android.graphics.PointF r0 = new android.graphics.PointF
            r1 = 0
            if (r7 == 0) goto Lc
            android.graphics.PointF r2 = r7.topLeft
            if (r2 == 0) goto Lc
            float r2 = r2.x
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r7 == 0) goto L16
            android.graphics.PointF r3 = r7.topLeft
            if (r3 == 0) goto L16
            float r3 = r3.y
            goto L17
        L16:
            r3 = r1
        L17:
            r0.<init>(r2, r3)
            android.graphics.PointF r2 = new android.graphics.PointF
            if (r7 == 0) goto L25
            android.graphics.PointF r3 = r7.topRight
            if (r3 == 0) goto L25
            float r3 = r3.x
            goto L26
        L25:
            r3 = r1
        L26:
            if (r7 == 0) goto L2f
            android.graphics.PointF r4 = r7.topRight
            if (r4 == 0) goto L2f
            float r4 = r4.y
            goto L30
        L2f:
            r4 = r1
        L30:
            r2.<init>(r3, r4)
            android.graphics.PointF r3 = new android.graphics.PointF
            if (r7 == 0) goto L3e
            android.graphics.PointF r4 = r7.bottomLeft
            if (r4 == 0) goto L3e
            float r4 = r4.x
            goto L3f
        L3e:
            r4 = r1
        L3f:
            if (r7 == 0) goto L48
            android.graphics.PointF r5 = r7.bottomLeft
            if (r5 == 0) goto L48
            float r5 = r5.y
            goto L49
        L48:
            r5 = r1
        L49:
            r3.<init>(r4, r5)
            android.graphics.PointF r4 = new android.graphics.PointF
            if (r7 == 0) goto L57
            android.graphics.PointF r5 = r7.bottomRight
            if (r5 == 0) goto L57
            float r5 = r5.x
            goto L58
        L57:
            r5 = r1
        L58:
            if (r7 == 0) goto L60
            android.graphics.PointF r7 = r7.bottomRight
            if (r7 == 0) goto L60
            float r1 = r7.y
        L60:
            r4.<init>(r5, r1)
            r6.<init>(r0, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.api.model.vq.<init>(com.pinterest.api.model.vq):void");
    }

    public vq(RectF rectF) {
        this(new PointF(rectF != null ? rectF.top : 0.0f, rectF != null ? rectF.left : 0.0f), new PointF(rectF != null ? rectF.top : 0.0f, rectF != null ? rectF.right : 0.0f), new PointF(rectF != null ? rectF.bottom : 0.0f, rectF != null ? rectF.left : 0.0f), new PointF(rectF != null ? rectF.bottom : 0.0f, rectF != null ? rectF.right : 0.0f));
    }
}
