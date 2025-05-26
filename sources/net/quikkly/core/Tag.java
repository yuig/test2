package net.quikkly.core;

import java.math.BigInteger;

/* loaded from: classes4.dex */
public class Tag {
    public double area;
    public Point[] corners;
    public long dataLong;
    public String templateIdentifier;

    public Tag() {
        this(0L, null, null, 0.0d);
    }

    public BigInteger getData() {
        return IntUtils.unsignedLongAsBigInteger(this.dataLong);
    }

    public Point[] getScaledCorners(int i13, int i14, int i15, Point[] pointArr) {
        if (pointArr != null && pointArr.length != 4) {
            throw new IllegalArgumentException("If provided, outCorners must have size 4");
        }
        int i16 = 0;
        if (this.corners == null) {
            if (pointArr == null) {
                return null;
            }
            while (i16 < 4) {
                Point point = pointArr[i16];
                point.f90479x = 0.0f;
                point.f90480y = 0.0f;
                i16++;
            }
            return null;
        }
        if (pointArr == null) {
            pointArr = new Point[4];
        }
        int i17 = (i15 + 360) % 360;
        while (i16 < 4) {
            Point point2 = this.corners[i16];
            float f13 = point2.f90479x;
            float f14 = point2.f90480y;
            if (i17 == 90) {
                float f15 = 1.0f - f14;
                f14 = f13;
                f13 = f15;
            } else if (i17 == 180) {
                f13 = 1.0f - f13;
                f14 = 1.0f - f14;
            } else if (i17 == 270) {
                float f16 = 1.0f - f13;
                f13 = f14;
                f14 = f16;
            }
            Point point3 = pointArr[i16];
            point3.f90479x = f13 * i13;
            point3.f90480y = f14 * i14;
            i16++;
        }
        return pointArr;
    }

    public Tag(long j13, String str, Point[] pointArr, double d2) {
        if (pointArr != null && pointArr.length != 4) {
            throw new IllegalArgumentException("Tag must have exactly four or no corners.");
        }
        this.dataLong = j13;
        this.templateIdentifier = str;
        this.corners = pointArr;
        this.area = d2;
    }
}
