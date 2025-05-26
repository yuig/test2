package com.google.android.material.bottomappbar;

import bk.z;

/* loaded from: classes3.dex */
public final class f extends bk.f implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public float f32283a;

    /* renamed from: b, reason: collision with root package name */
    public float f32284b;

    /* renamed from: c, reason: collision with root package name */
    public float f32285c;

    /* renamed from: d, reason: collision with root package name */
    public float f32286d;

    /* renamed from: e, reason: collision with root package name */
    public float f32287e;

    /* renamed from: f, reason: collision with root package name */
    public float f32288f;

    @Override // bk.f
    public final void Q(float f13, float f14, float f15, z zVar) {
        float f16;
        float f17;
        float f18 = this.f32285c;
        if (f18 == 0.0f) {
            zVar.d(f13, 0.0f);
            return;
        }
        float f19 = this.f32284b;
        float f23 = ((f19 * 2.0f) + f18) / 2.0f;
        float f24 = f15 * this.f32283a;
        float f25 = f14 + this.f32287e;
        float a13 = ep.b.a(1.0f, f15, f23, this.f32286d * f15);
        if (a13 / f23 >= 1.0f) {
            zVar.d(f13, 0.0f);
            return;
        }
        float f26 = this.f32288f;
        float f27 = f26 * f15;
        boolean z13 = f26 == -1.0f || Math.abs((f26 * 2.0f) - f18) < 0.1f;
        if (z13) {
            f16 = a13;
            f17 = 0.0f;
        } else {
            f17 = 1.75f;
            f16 = 0.0f;
        }
        float f28 = f23 + f24;
        float f29 = f16 + f24;
        float sqrt = (float) Math.sqrt((f28 * f28) - (f29 * f29));
        float f33 = f25 - sqrt;
        float f34 = f25 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f29));
        float f35 = (90.0f - degrees) + f17;
        zVar.d(f33, 0.0f);
        float f36 = f24 * 2.0f;
        zVar.a(f33 - f24, 0.0f, f33 + f24, f36, 270.0f, degrees);
        if (z13) {
            zVar.a(f25 - f23, (-f23) - f16, f25 + f23, f23 - f16, 180.0f - f35, (f35 * 2.0f) - 180.0f);
        } else {
            float f37 = (f27 * 2.0f) + f19;
            float f38 = f25 - f23;
            float f39 = f27 + f19;
            float f41 = -f39;
            zVar.a(f38, f41, f38 + f37, f39, 180.0f - f35, ((f35 * 2.0f) - 180.0f) / 2.0f);
            float f43 = f25 + f23;
            zVar.d(f43 - ((f19 / 2.0f) + f27), f39);
            zVar.a(f43 - f37, f41, f43, f39, 90.0f, f35 - 90.0f);
        }
        zVar.a(f34 - f24, 0.0f, f34 + f24, f36, 270.0f - degrees, degrees);
        zVar.d(f13, 0.0f);
    }
}
