package vd2;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.y;

/* loaded from: classes4.dex */
public final class b extends c {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f125641b;

    /* renamed from: c, reason: collision with root package name */
    public ae2.d f125642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Bitmap bitmap) {
        super("sampler2D");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f125641b = bitmap;
    }

    @Override // vd2.c
    public final void a() {
        ae2.d dVar = this.f125642c;
        if (dVar != null) {
            if (dVar != null) {
                dVar.b();
            } else {
                Intrinsics.r("_texture");
                throw null;
            }
        }
    }

    public final ae2.d b() {
        if (this.f125642c == null) {
            int i13 = ae2.d.f15059f;
            this.f125642c = y.O(this.f125641b);
        }
        ae2.d dVar = this.f125642c;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("_texture");
        throw null;
    }
}
