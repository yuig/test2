package ie2;

import android.graphics.Bitmap;
import android.util.Size;
import com.pinterest.xrenderer.RustBridge$Renderer;
import com.pinterest.xrenderer.RustBridge$Scene;
import com.pinterest.xrenderer.RustBridge$Surface;
import ke2.f;
import kotlin.jvm.internal.Intrinsics;
import oi.n;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f72212a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f72213b;

    /* renamed from: c, reason: collision with root package name */
    public final n f72214c;

    public b(Size targetSize, ke2.c scene, me2.c backend) {
        Intrinsics.checkNotNullParameter(targetSize, "targetSize");
        Intrinsics.checkNotNullParameter(scene, "scene");
        Intrinsics.checkNotNullParameter(backend, "backend");
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f72212a = config;
        Bitmap createBitmap = Bitmap.createBitmap(targetSize.getWidth(), targetSize.getHeight(), config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        this.f72213b = createBitmap;
        this.f72214c = new n(new d(createBitmap), scene, backend);
    }

    @Override // ie2.a
    public final void a() {
        n nVar = this.f72214c;
        ((f) nVar.f94962g).c();
        long j13 = nVar.f94958c;
        if (j13 != 0) {
            RustBridge$Surface.f52864a.release(j13);
            nVar.f94958c = 0L;
        }
        long j14 = nVar.f94957b;
        if (j14 != 0) {
            nVar.f94957b = 0L;
            me2.b bVar = me2.c.Companion;
            me2.c cVar = (me2.c) nVar.f94961f;
            bVar.getClass();
            if (!me2.b.a(cVar)) {
                RustBridge$Renderer.f52861a.release(j14);
            }
        }
        this.f72213b.recycle();
    }

    @Override // ie2.a
    public final Bitmap b(float f13) {
        n nVar = this.f72214c;
        if (nVar.f94957b != 0) {
            gh0.b bVar = (gh0.b) nVar.f94959d;
            if (bVar instanceof e) {
                f fVar = (f) nVar.f94962g;
                long j13 = nVar.f94958c;
                if (fVar.a() && j13 != 0) {
                    RustBridge$Scene.f52862a.renderOnSurface(j13, fVar.f79327d, false, f13);
                }
            } else if (bVar instanceof d) {
                f fVar2 = (f) nVar.f94962g;
                Bitmap bitmap = ((d) bVar).f72216b;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                if (fVar2.a()) {
                    RustBridge$Scene.f52862a.renderToImage(fVar2.f79327d, bitmap, f13);
                }
            } else {
                boolean z13 = bVar instanceof c;
            }
        }
        Bitmap bitmap2 = this.f72213b;
        Bitmap.Config config = this.f72212a;
        Intrinsics.checkNotNullParameter(bitmap2, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        Bitmap copy = bitmap2.copy(config, false);
        Intrinsics.checkNotNullExpressionValue(copy, "copy(...)");
        return copy;
    }
}
