package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import ao2.m0;
import ep.b;
import org.xmlpull.v1.XmlPullParser;
import ua.k0;

/* loaded from: classes3.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: d, reason: collision with root package name */
    public static final float f19822d = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: a, reason: collision with root package name */
    public final float f19823a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19824b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19825c;

    public ArcMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19823a = 0.0f;
        this.f19824b = 0.0f;
        this.f19825c = f19822d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.f121286i);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f19824b = b(!m0.N(xmlPullParser, "minimumVerticalAngle") ? 0.0f : obtainStyledAttributes.getFloat(1, 0.0f));
        this.f19823a = b(m0.N(xmlPullParser, "minimumHorizontalAngle") ? obtainStyledAttributes.getFloat(0, 0.0f) : 0.0f);
        this.f19825c = b(m0.N(xmlPullParser, "maximumAngle") ? obtainStyledAttributes.getFloat(2, 70.0f) : 70.0f);
        obtainStyledAttributes.recycle();
    }

    public static float b(float f13) {
        if (f13 < 0.0f || f13 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f13 / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    public final Path a(float f13, float f14, float f15, float f16) {
        float f17;
        float f18;
        float f19;
        Path path = new Path();
        path.moveTo(f13, f14);
        float f23 = f15 - f13;
        float f24 = f16 - f14;
        float f25 = (f24 * f24) + (f23 * f23);
        float f26 = (f13 + f15) / 2.0f;
        float f27 = (f14 + f16) / 2.0f;
        float f28 = 0.25f * f25;
        boolean z13 = f14 > f16;
        if (Math.abs(f23) < Math.abs(f24)) {
            float abs = Math.abs(f25 / (f24 * 2.0f));
            if (z13) {
                f18 = abs + f16;
                f17 = f15;
            } else {
                f18 = abs + f14;
                f17 = f13;
            }
            f19 = this.f19824b;
        } else {
            float f29 = f25 / (f23 * 2.0f);
            if (z13) {
                f18 = f14;
                f17 = f29 + f13;
            } else {
                f17 = f15 - f29;
                f18 = f16;
            }
            f19 = this.f19823a;
        }
        float f33 = f28 * f19 * f19;
        float f34 = f26 - f17;
        float f35 = f27 - f18;
        float f36 = (f35 * f35) + (f34 * f34);
        float f37 = this.f19825c;
        float f38 = f28 * f37 * f37;
        if (f36 >= f33) {
            f33 = f36 > f38 ? f38 : 0.0f;
        }
        if (f33 != 0.0f) {
            float sqrt = (float) Math.sqrt(f33 / f36);
            f17 = b.a(f17, f26, sqrt, f26);
            f18 = b.a(f18, f27, sqrt, f27);
        }
        path.cubicTo((f13 + f17) / 2.0f, (f14 + f18) / 2.0f, (f17 + f15) / 2.0f, (f18 + f16) / 2.0f, f15, f16);
        return path;
    }
}
