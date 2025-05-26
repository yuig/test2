package s5;

import android.view.animation.Interpolator;
import ep.b;
import java.util.ArrayList;
import pl1.c;

/* loaded from: classes3.dex */
public final class a implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111145a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f111146b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Object f111147c;

    public a(float f13, float f14) {
        this.f111147c = new c(0.0f, 1.0f, f13, f14);
    }

    public final ArrayList a() {
        if (((ArrayList) this.f111146b).size() < 1) {
            ((ArrayList) this.f111146b).add(Float.valueOf(((c) this.f111147c).f100565a));
            while (((c) this.f111147c).c()) {
                ((ArrayList) this.f111146b).add(Float.valueOf(((c) this.f111147c).a()));
            }
            ((ArrayList) this.f111146b).add(Float.valueOf(((c) this.f111147c).a()));
        }
        return (ArrayList) this.f111146b;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        int i13 = 0;
        switch (this.f111145a) {
            case 0:
                if (f13 <= 0.0f) {
                    return 0.0f;
                }
                if (f13 >= 1.0f) {
                    return 1.0f;
                }
                int length = ((float[]) this.f111146b).length - 1;
                while (length - i13 > 1) {
                    int i14 = (i13 + length) / 2;
                    if (f13 < ((float[]) this.f111146b)[i14]) {
                        length = i14;
                    } else {
                        i13 = i14;
                    }
                }
                float[] fArr = (float[]) this.f111146b;
                float f14 = fArr[length];
                float f15 = fArr[i13];
                float f16 = f14 - f15;
                if (f16 == 0.0f) {
                    return ((float[]) this.f111147c)[i13];
                }
                float[] fArr2 = (float[]) this.f111147c;
                float f17 = fArr2[i13];
                return b.a(fArr2[length], f17, (f13 - f15) / f16, f17);
            case 1:
                if (f13 <= 0.0f) {
                    return 0.0f;
                }
                if (f13 >= 1.0f) {
                    return 1.0f;
                }
                int length2 = ((float[]) this.f111146b).length - 1;
                while (length2 - i13 > 1) {
                    int i15 = (i13 + length2) / 2;
                    if (f13 < ((float[]) this.f111146b)[i15]) {
                        length2 = i15;
                    } else {
                        i13 = i15;
                    }
                }
                float[] fArr3 = (float[]) this.f111146b;
                float f18 = fArr3[length2];
                float f19 = fArr3[i13];
                float f23 = f18 - f19;
                if (f23 == 0.0f) {
                    return ((float[]) this.f111147c)[i13];
                }
                float[] fArr4 = (float[]) this.f111147c;
                float f24 = fArr4[i13];
                return b.a(fArr4[length2], f24, (f13 - f19) / f23, f24);
            default:
                float size = (a().size() - 1) * f13;
                double d2 = size;
                float floatValue = ((Float) a().get((int) Math.floor(d2))).floatValue();
                return ((size % 1.0f) * (((Float) a().get((int) Math.ceil(d2))).floatValue() - floatValue)) + floatValue;
        }
    }
}
