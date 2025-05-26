package p81;

import a32.i;
import android.graphics.Bitmap;
import ek2.f;
import hb0.d;
import i01.r0;
import kotlin.jvm.internal.Intrinsics;
import m81.j;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import qz.f0;
import r81.m;
import s81.l;
import s81.o;
import s81.p;
import tk2.e;
import uy.q;

/* loaded from: classes5.dex */
public final class a extends d {

    /* renamed from: d, reason: collision with root package name */
    public Bitmap f99117d;

    /* renamed from: e, reason: collision with root package name */
    public j f99118e;

    /* renamed from: f, reason: collision with root package name */
    public final int f99119f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f99120g;

    public a(Bitmap bitmap, o oVar) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f99117d = bitmap;
        this.f99118e = oVar;
        this.f99119f = 90;
    }

    @Override // hb0.c
    public final void c() {
        if (this.f99117d.getWidth() == 0 || this.f99117d.getHeight() == 0) {
            return;
        }
        this.f99120g = qb0.b.a(this.f99119f, this.f99117d);
    }

    @Override // hb0.d
    public final void e() {
        j jVar;
        byte[] byteArray = this.f99120g;
        if (byteArray == null || (jVar = this.f99118e) == null) {
            return;
        }
        o oVar = (o) jVar;
        int i13 = oVar.f111917a;
        p pVar = oVar.f111918b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(byteArray, "byteArray");
                new q(25, 0).i();
                a32.c cVar = pVar.L;
                a32.c cVar2 = a32.c.CAMERA_GALLERY;
                if (cVar != cVar2) {
                    cVar2 = a32.c.CAMERA_SNAP;
                }
                if (pVar.f111940r != m81.p.ROOM_REPAINT) {
                    m mVar = pVar.f111947y;
                    if (cVar2 == null) {
                        f0 f0Var = mVar.f49121k;
                        if (f0Var != null) {
                            f0Var.h("source_type");
                        }
                    } else {
                        f0 f0Var2 = mVar.f49121k;
                        if (f0Var2 != null) {
                            f0Var2.c(cVar2.getValue(), "source_type");
                        }
                    }
                    i iVar = pVar.M;
                    if (iVar == null) {
                        f0 f0Var3 = mVar.f49121k;
                        if (f0Var3 != null) {
                            f0Var3.h("camera_type");
                        }
                    } else {
                        f0 f0Var4 = mVar.f49121k;
                        if (f0Var4 != null) {
                            f0Var4.c(iVar.getValue(), "camera_type");
                        }
                    }
                    mVar.h0(byteArray);
                    pVar.e4(pVar.z3());
                    break;
                } else {
                    pVar.f111945w = byteArray;
                    break;
                }
            default:
                Intrinsics.checkNotNullParameter(byteArray, "byteArray");
                pVar.getClass();
                RequestBody.Companion companion = RequestBody.f95711a;
                MediaType.f95651d.getClass();
                RequestBody$Companion$toRequestBody$2 d2 = RequestBody.Companion.d(companion, MediaType.Companion.b("image/jpeg"), byteArray);
                MultipartBody.Part.f95670c.getClass();
                f i14 = pVar.f111928f.b(MultipartBody.Part.Companion.b("image", "myphoto.jpg", d2)).l(e.f118017c).h(wj2.c.a()).i(new r0(7), new a81.a(26, l.f111910l));
                Intrinsics.checkNotNullExpressionValue(i14, "subscribe(...)");
                pVar.addDisposable(i14);
                break;
        }
    }
}
