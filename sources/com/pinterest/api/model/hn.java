package com.pinterest.api.model;

import android.opengl.Matrix;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hn {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f38494a;

    /* renamed from: b, reason: collision with root package name */
    public final float f38495b;

    /* renamed from: c, reason: collision with root package name */
    public final float f38496c;

    /* renamed from: d, reason: collision with root package name */
    public final float f38497d;

    public hn(@NotNull float[] mvpMatrix, float f13, float f14, float f15) {
        Intrinsics.checkNotNullParameter(mvpMatrix, "mvpMatrix");
        this.f38494a = mvpMatrix;
        this.f38495b = f13;
        this.f38496c = f14;
        this.f38497d = f15;
    }

    public static /* synthetic */ float[] b(hn hnVar, float f13, float f14, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 1.0f;
        }
        if ((i13 & 2) != 0) {
            f14 = 1.0f;
        }
        return hnVar.a(f13, f14);
    }

    public static void c(hn hnVar, float f13, float f14, Function1 drawCallback, int i13) {
        if ((i13 & 1) != 0) {
            f13 = 0.0f;
        }
        if ((i13 & 2) != 0) {
            f14 = 0.0f;
        }
        hnVar.getClass();
        Intrinsics.checkNotNullParameter(drawCallback, "drawCallback");
        float f15 = f13 * hnVar.f38495b;
        float f16 = f14 * hnVar.f38496c;
        float f17 = -hnVar.f38497d;
        Matrix.rotateM(hnVar.f38494a, 0, f17, 0.0f, 0.0f, 1.0f);
        float[] fArr = hnVar.f38494a;
        Matrix.translateM(fArr, 0, f15, f16, 0.0f);
        Matrix.rotateM(hnVar.f38494a, 0, hnVar.f38497d, 0.0f, 0.0f, 1.0f);
        drawCallback.invoke(fArr);
        Matrix.rotateM(hnVar.f38494a, 0, f17, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -f15, -f16, 0.0f);
        Matrix.rotateM(hnVar.f38494a, 0, hnVar.f38497d, 0.0f, 0.0f, 1.0f);
    }

    public final float[] a(float f13, float f14) {
        float[] fArr = new float[16];
        Matrix.scaleM(fArr, 0, this.f38494a, 0, f13, f14, 1.0f);
        return fArr;
    }
}
