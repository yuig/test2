package gs1;

import a7.i0;
import ak2.g;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.webkit.URLUtil;
import androidx.viewpager2.widget.n;
import c0.p1;
import c0.v0;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import l8.f;
import lr.y;
import q8.s;
import q8.v;
import tb0.p;
import v5.x;
import vb0.j;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements g, v0, f, nr0.c, v, n {
    @Override // c0.v0
    public void c(p1 p1Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(p1Var.f24300b.getWidth(), p1Var.f24300b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        p1Var.b(surface, l3.c.s(), new h0.d(0, surface, surfaceTexture));
    }

    @Override // q8.v
    public s[] f() {
        return new s[]{new r8.a()};
    }

    public k0.a g(i0 i0Var) {
        String uuid = UUID.randomUUID().toString();
        String str = i0Var.f1072a;
        if (str == null) {
            str = "";
        }
        return new k0.a(uuid, str, new x(26));
    }

    @Override // nr0.c
    public void m() {
        j.f125466a.F("Do not use GoToHomefeedListener in StateBased screens", p.PLATFORM, new Object[0]);
    }

    @Override // ak2.g
    public boolean test(Object obj) {
        String str = (String) obj;
        return URLUtil.isValidUrl(str) && y.e(str);
    }

    @Override // androidx.viewpager2.widget.n
    public void x(View view, float f13) {
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
    }
}
