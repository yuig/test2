package q8;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f102895a;

    /* renamed from: b, reason: collision with root package name */
    public int f102896b;

    /* renamed from: c, reason: collision with root package name */
    public int f102897c;

    public d(int i13, int i14) {
        this.f102895a = i13;
        this.f102896b = i14;
        this.f102897c = i14 * i13 * 6;
    }

    public FloatBuffer a() {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(this.f102897c * 8).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i13 = this.f102895a;
        for (int i14 = i13 - 1; -1 < i14; i14--) {
            float f13 = 1.0f;
            float f14 = (i14 * 1.0f) / i13;
            float f15 = ((i14 + 1) * 1.0f) / i13;
            int i15 = 0;
            while (true) {
                int i16 = this.f102896b;
                if (i15 < i16) {
                    float f16 = (i15 * f13) / i16;
                    i15++;
                    float f17 = (i15 * f13) / i16;
                    float[] fArr = {f17, f15};
                    float[] fArr2 = {f17, f14};
                    float[] fArr3 = {f16, f14};
                    asFloatBuffer.put(new float[]{f16, f15}).put(fArr).put(fArr3);
                    asFloatBuffer.put(fArr3).put(fArr2).put(fArr);
                    f13 = 1.0f;
                }
            }
        }
        asFloatBuffer.rewind();
        Intrinsics.checkNotNullExpressionValue(asFloatBuffer, "also(...)");
        return asFloatBuffer;
    }

    public FloatBuffer b() {
        int i13 = 2;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(this.f102897c * 12).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i14 = 0;
        while (true) {
            int i15 = this.f102895a;
            if (i14 >= i15) {
                asFloatBuffer.rewind();
                Intrinsics.checkNotNullExpressionValue(asFloatBuffer, "also(...)");
                return asFloatBuffer;
            }
            float f13 = 2.0f;
            float f14 = i14 * 2.0f;
            float f15 = i15;
            float f16 = 1.0f;
            float f17 = (f14 / f15) - 1.0f;
            float f18 = i13;
            float f19 = ((f14 + f18) / f15) - 1.0f;
            int i16 = 0;
            while (true) {
                int i17 = this.f102896b;
                if (i16 < i17) {
                    float f23 = i16 * f13;
                    float f24 = i17;
                    float f25 = (f23 / f24) - f16;
                    float f26 = ((f23 + f18) / f24) - f16;
                    float[] fArr = new float[3];
                    fArr[0] = f25;
                    fArr[1] = f17;
                    fArr[i13] = 0.0f;
                    float[] fArr2 = new float[3];
                    fArr2[0] = f26;
                    fArr2[1] = f17;
                    fArr2[i13] = 0.0f;
                    float[] fArr3 = {f25, f19, 0.0f};
                    asFloatBuffer.put(fArr).put(fArr2).put(fArr3);
                    asFloatBuffer.put(fArr3).put(new float[]{f26, f19, 0.0f}).put(fArr2);
                    i16++;
                    i13 = 2;
                    f13 = 2.0f;
                    f16 = 1.0f;
                }
            }
            i14++;
        }
    }

    public d(int i13, int i14, int i15) {
        this.f102895a = i13;
        this.f102896b = i14;
        this.f102897c = i15;
    }
}
