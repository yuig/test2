package bk;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class w extends x {

    /* renamed from: b, reason: collision with root package name */
    public float f23135b;

    /* renamed from: c, reason: collision with root package name */
    public float f23136c;

    @Override // bk.x
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f23137a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f23135b, this.f23136c);
        path.transform(matrix);
    }
}
