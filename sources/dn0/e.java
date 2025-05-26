package dn0;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import kh2.k3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f55614a;

    /* renamed from: b, reason: collision with root package name */
    public final gi2.b f55615b;

    public e() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        float[] copyOf = Arrays.copyOf(fArr, 16);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.f55614a = copyOf;
        this.f55615b = new gi2.b();
    }

    public final void b() {
        g gVar = a().f65803b;
        GLES20.glActiveTexture(gVar.f55616a);
        GLES20.glBindTexture(gVar.f55617b, gVar.f55618c);
        gn0.b a13 = a();
        float[] matrixRef = this.f55614a;
        Intrinsics.checkNotNullParameter(matrixRef, "matrixRef");
        a13.f65804c.getTransformMatrix(matrixRef);
        h c13 = c();
        this.f55615b.getClass();
        k3.m0();
        GLES20.glClearColor(0.89f, 0.89f, 0.89f, 1.0f);
        GLES20.glClear(16640);
        for (int glGetError = GLES20.glGetError(); glGetError != 0; glGetError = GLES20.glGetError()) {
        }
        c13.b(matrixRef);
        c13.apply();
        k3.m0();
        GLES20.glDrawArrays(5, 0, 4);
        for (int glGetError2 = GLES20.glGetError(); glGetError2 != 0; glGetError2 = GLES20.glGetError()) {
        }
    }

    public abstract h c();
}
