package d0;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.t0;
import c0.e0;
import com.google.common.util.concurrent.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f53554a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f53555b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f53556c;

    /* renamed from: d, reason: collision with root package name */
    public final int f53557d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53558e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f53559f;

    /* renamed from: g, reason: collision with root package name */
    public final y f53560g;

    /* renamed from: h, reason: collision with root package name */
    public final String f53561h;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f53563j;

    /* renamed from: k, reason: collision with root package name */
    public int f53564k = -1;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f53562i = new ArrayList();

    public s(c0.y yVar, e0 e0Var, Rect rect, int i13, int i14, Matrix matrix, u uVar, r4.l lVar, int i15) {
        this.f53554a = i15;
        this.f53555b = e0Var;
        this.f53558e = i14;
        this.f53557d = i13;
        this.f53556c = rect;
        this.f53559f = matrix;
        this.f53560g = uVar;
        this.f53561h = String.valueOf(yVar.hashCode());
        List<t0> list = yVar.f24393a;
        Objects.requireNonNull(list);
        for (t0 t0Var : list) {
            ArrayList arrayList = this.f53562i;
            t0Var.getClass();
            arrayList.add(0);
        }
        this.f53563j = lVar;
    }
}
