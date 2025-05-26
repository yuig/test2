package be2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import androidx.camera.core.impl.j;
import he2.f;
import ke2.c;
import kotlin.jvm.internal.Intrinsics;
import mc2.k;

/* loaded from: classes4.dex */
public final class a implements ie2.a {

    /* renamed from: a, reason: collision with root package name */
    public final j f22736a;

    public a(Context context, Size targetSize, c scene) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        Intrinsics.checkNotNullParameter(scene, "scene");
        this.f22736a = new j(context, new ie2.c(targetSize), scene);
    }

    @Override // ie2.a
    public final void a() {
        this.f22736a.l();
    }

    @Override // ie2.a
    public final Bitmap b(float f13) {
        j jVar = this.f22736a;
        ((k) jVar.f16877d).a((g01.a) jVar.f16878e);
        ((f) jVar.f16879f).a(f13);
        return ((f) jVar.f16879f).d();
    }
}
