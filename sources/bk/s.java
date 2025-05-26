package bk;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s extends y {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f23122c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f23123d;

    public s(ArrayList arrayList, Matrix matrix) {
        this.f23122c = arrayList;
        this.f23123d = matrix;
    }

    @Override // bk.y
    public final void a(Matrix matrix, ak.a aVar, int i13, Canvas canvas) {
        Iterator it = this.f23122c.iterator();
        while (it.hasNext()) {
            ((y) it.next()).a(this.f23123d, aVar, i13, canvas);
        }
    }
}
