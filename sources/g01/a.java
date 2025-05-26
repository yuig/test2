package g01;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.xrenderer.RustBridge$Contour;
import e0.t;
import gi2.b;
import h62.k;
import hd2.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import kh2.j2;
import kh2.w;
import kl2.l;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kv0.p;
import l62.f0;
import l62.h0;
import l62.i0;
import ll.j;
import pk.a0;
import r72.a2;
import r72.k0;
import r72.l1;
import r72.z1;
import rl2.g0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f63224a;

    /* renamed from: b, reason: collision with root package name */
    public Object f63225b;

    public a(Bitmap image, c options) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f63224a = image;
        this.f63225b = options;
    }

    public static boolean e(char c13) {
        return c13 == '\n' || c13 == '\r' || c13 == '\t' || c13 == ' ';
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        int length = str.length();
        while (length > 0 && e(str.charAt(length - 1))) {
            length--;
        }
        int i13 = 0;
        while (i13 < length) {
            while (i13 < length && e(str.charAt(i13))) {
                i13++;
            }
            int i14 = i13 + 1;
            byte b13 = ((byte[]) this.f63225b)[str.charAt(i13)];
            while (i14 < length && e(str.charAt(i14))) {
                i14++;
            }
            int i15 = i14 + 1;
            byte b14 = ((byte[]) this.f63225b)[str.charAt(i14)];
            if ((b13 | b14) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            byteArrayOutputStream.write((b13 << 4) | b14);
            i13 = i15;
        }
    }

    public final void b(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Object obj = this.f63224a;
        IndexedValue b13 = ((k) obj).b(id3);
        if (b13 == null) {
            return;
        }
        ((l) this.f63225b).invoke(Integer.valueOf(b13.f80349a), Integer.valueOf(((k) obj).c()), h0.DELETE);
        ((k) obj).h(id3, true);
    }

    public final void c(z1 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        k kVar = (k) this.f63224a;
        IndexedValue b13 = kVar.b(item.b());
        if (b13 != null) {
            l lVar = (l) this.f63225b;
            int i13 = b13.f80349a;
            lVar.invoke(Integer.valueOf(i13), Integer.valueOf(kVar.c()), h0.DUPLICATE);
            int i14 = a2.f106437b;
            String value = b.c0();
            l1 l1Var = l1.f106534c;
            k0 a13 = item.a();
            Intrinsics.checkNotNullParameter(value, "value");
            z1 item2 = w.v(item, value, l1Var, 0.0d, 0.0d, k0.a(a13, false, false, false, false, 0.0f, null, null, null, null, 0.0d, 0.0d, value, 8183), 12);
            kVar.getClass();
            Intrinsics.checkNotNullParameter(item2, "item");
            kVar.a(new h62.a(i13 + 1, item2), true);
        }
    }

    public final void d(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Object obj = this.f63224a;
        IndexedValue b13 = ((k) obj).b(id3);
        if (b13 == null) {
            return;
        }
        ((l) this.f63225b).invoke(Integer.valueOf(b13.f80349a), Integer.valueOf(((k) obj).c()), h0.LOCK);
        ((k) obj).k(id3, true, f0.f81634l);
    }

    public final void f() {
        Integer num = (Integer) this.f63225b;
        Object obj = this.f63224a;
        if (num != null) {
            ((FragmentActivity) obj).getWindow().getDecorView().setSystemUiVisibility(num.intValue());
        }
        a0.d1((FragmentActivity) obj);
    }

    public final void g() {
        Object obj = this.f63224a;
        Window window = ((FragmentActivity) obj).getWindow();
        this.f63225b = Integer.valueOf(window.getDecorView().getSystemUiVisibility());
        window.getDecorView().setSystemUiVisibility(1280);
        int i13 = eo1.b.color_themed_transparent;
        Object obj2 = d5.a.f53679a;
        window.setStatusBarColor(((FragmentActivity) obj).getColor(i13));
        a0.f1(window);
    }

    public final void h() {
        t.n(new nd2.a(this, 3), "eglDestroySurface");
    }

    public final xd2.c i() {
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f63224a, (EGLSurface) this.f63225b)) {
            return xd2.c.OK;
        }
        int eglGetError = EGL14.eglGetError();
        return eglGetError != 12301 ? eglGetError != 12302 ? xd2.c.OTHER_ERROR : xd2.c.CONTEXT_LOST : xd2.c.BAD_SURFACE;
    }

    public final ArrayList j() {
        RustBridge$Contour rustBridge$Contour = RustBridge$Contour.f52858a;
        Bitmap bitmap = (Bitmap) this.f63224a;
        c cVar = (c) this.f63225b;
        int[] traceAll = rustBridge$Contour.traceAll(bitmap, cVar.f68916a, cVar.f68918c, cVar.f68919d);
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < traceAll.length) {
            boolean z13 = traceAll[i13] > 0;
            int i14 = traceAll[i13 + 1];
            int i15 = i13 + 2;
            ArrayList arrayList2 = new ArrayList(i14);
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = (i16 * 2) + i15;
                arrayList2.add(new Point(traceAll[i17], traceAll[i17 + 1]));
            }
            i13 = i15 + (i14 * 2);
            arrayList.add(new hd2.b(g0.i0(arrayList2, ((c) this.f63225b).f68917b), z13));
        }
        return arrayList;
    }

    public a(EGLDisplay display, EGLSurface surface) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.f63224a = display;
        this.f63225b = surface;
    }

    public a(FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f63224a = activity;
    }

    public a(k project) {
        Intrinsics.checkNotNullParameter(project, "project");
        this.f63224a = project;
        this.f63225b = i0.f81643i;
    }

    public /* synthetic */ a(Object obj, Object obj2) {
        this.f63224a = obj;
        this.f63225b = obj2;
    }

    public a(j2 bootstrapper, p sdkCallChecker) {
        Intrinsics.checkNotNullParameter(bootstrapper, "bootstrapper");
        Intrinsics.checkNotNullParameter(sdkCallChecker, "sdkCallChecker");
        this.f63224a = bootstrapper;
        this.f63225b = sdkCallChecker;
    }

    public a(j getHelpClickRouter, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(getHelpClickRouter, "getHelpClickRouter");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f63224a = getHelpClickRouter;
        this.f63225b = eventManager;
    }

    public a(od2.a effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        Intrinsics.checkNotNullParameter("selectedItemID", "idSettingName");
        this.f63224a = effect;
        this.f63225b = "selectedItemID";
    }

    public a() {
        this.f63224a = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.f63225b = new byte[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f63225b;
            if (i14 >= bArr.length) {
                break;
            }
            bArr[i14] = -1;
            i14++;
        }
        while (true) {
            byte[] bArr2 = (byte[]) this.f63224a;
            if (i13 < bArr2.length) {
                ((byte[]) this.f63225b)[bArr2[i13]] = (byte) i13;
                i13++;
            } else {
                byte[] bArr3 = (byte[]) this.f63225b;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }
}
