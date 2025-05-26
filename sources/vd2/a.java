package vd2;

import ae2.e;
import android.graphics.Bitmap;
import android.opengl.GLES30;
import g4.u;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import ve.h;

/* loaded from: classes4.dex */
public final class a extends c {

    /* renamed from: b, reason: collision with root package name */
    public e f125638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125639c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f125640d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Bitmap haldImage) {
        super("sampler3D");
        Intrinsics.checkNotNullParameter(haldImage, "haldImage");
        if (haldImage.getConfig() != Bitmap.Config.ARGB_8888) {
            throw new IllegalArgumentException(("unsupported format of Hald cLUT image: " + haldImage.getConfig() + ". Should be ARGB_8888").toString());
        }
        int b13 = ml2.c.b(Math.cbrt(ig1.b.N(h.C(haldImage))));
        this.f125639c = b13;
        int i13 = b13 * b13 * b13;
        if (i13 != ((int) ig1.b.N(h.C(haldImage)))) {
            throw new IllegalArgumentException(("Wrong Hald cLUT image dimensions: " + h.C(haldImage)).toString());
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i13 * 4);
        haldImage.copyPixelsToBuffer(allocateDirect);
        allocateDirect.rewind();
        Intrinsics.checkNotNullExpressionValue(allocateDirect, "run(...)");
        this.f125640d = allocateDirect;
    }

    @Override // vd2.c
    public final void a() {
        e eVar = this.f125638b;
        if (eVar != null) {
            if (eVar != null) {
                eVar.b();
            } else {
                Intrinsics.r("_texture");
                throw null;
            }
        }
    }

    public final e b() {
        if (this.f125638b == null) {
            u size = new u();
            ae2.b elemType = ae2.b.UInt8RGBA;
            Intrinsics.checkNotNullParameter(size, "size");
            Intrinsics.checkNotNullParameter(elemType, "elemType");
            e eVar = new e(ae2.c.Texture3D);
            eVar.a();
            int textureDataFormat = elemType.getTextureDataFormat();
            int pixelDataFormat = elemType.getPixelDataFormat();
            int pixelDataType = elemType.getPixelDataType();
            ByteBuffer byteBuffer = this.f125640d;
            int i13 = this.f125639c;
            GLES30.glTexImage3D(32879, 0, textureDataFormat, i13, i13, i13, 0, pixelDataFormat, pixelDataType, byteBuffer);
            this.f125638b = eVar;
        }
        e eVar2 = this.f125638b;
        if (eVar2 != null) {
            return eVar2;
        }
        Intrinsics.r("_texture");
        throw null;
    }
}
