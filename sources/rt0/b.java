package rt0;

import android.net.Uri;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f109950b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f109951c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f109952d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f109953e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f109954f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f109955g;

    /* renamed from: k, reason: collision with root package name */
    public boolean f109959k;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f109949a = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public long f109956h = pp2.a.u();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f109957i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f109958j = new ArrayList();

    public final void A(long j13, File file) {
        k01 videoItem;
        ArrayList arrayList = this.f109957i;
        int size = arrayList.size() - 1;
        bo0 bo0Var = (bo0) arrayList.get(size);
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            videoItem = new k01(absolutePath);
        } else {
            videoItem = bo0Var.getVideoItem();
        }
        arrayList.set(size, bo0.a(bo0Var, videoItem, 0L, j13, null, null, 0.0f, RecyclerViewTypes.VIEW_TYPE_BUBBLE_TRIPLE_PREVIEW_DISPLAY_CARD_REP));
        s(1);
    }

    public final void a(d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f109949a.add(listener);
    }

    public final void b(d30 photoItem, k01 videoItem, boolean z13) {
        Intrinsics.checkNotNullParameter(photoItem, "photoItem");
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        this.f109957i.add(new bo0(photoItem, videoItem, 0L, 5000L, null, null, 0.0f, z13, RecyclerViewTypes.VIEW_TYPE_PROFILE_CREATED_TAB_SCHEDULED_PINS_PREVIEW, null));
    }

    public final void c(d30 photoItem, boolean z13) {
        Intrinsics.checkNotNullParameter(photoItem, "photoItem");
        this.f109957i.add(new bo0(photoItem, null, 0L, 0L, null, null, 0.0f, z13, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL, null));
    }

    public final void d() {
        this.f109949a.clear();
    }

    public final void e() {
        this.f109957i.clear();
        s(1);
    }

    public final boolean f() {
        return g() > 0;
    }

    public final long g() {
        return this.f109956h - i();
    }

    public final ArrayList h() {
        return this.f109957i;
    }

    public final long i() {
        Iterator it = this.f109957i.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += (int) ((bo0) it.next()).f36143i;
        }
        return i13;
    }

    public final boolean j() {
        return !this.f109957i.isEmpty();
    }

    public final boolean k() {
        return this.f109954f;
    }

    public final boolean l() {
        if (j()) {
            return ((bo0) this.f109957i.get(r())).getIsFromFrontFacingCamera();
        }
        return false;
    }

    public final boolean m() {
        return this.f109955g;
    }

    public final boolean n() {
        return this.f109951c;
    }

    public final boolean o() {
        return this.f109952d;
    }

    public final boolean p() {
        return i() > this.f109956h;
    }

    public final long q() {
        if (j()) {
            return ((bo0) this.f109957i.get(r())).f36143i;
        }
        return 0L;
    }

    public final int r() {
        if (j()) {
            return this.f109957i.size() - 1;
        }
        return 0;
    }

    public final void s(int i13) {
        Iterator it = this.f109949a.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (i13 == 0) {
                dVar.f109966a.invoke(this);
            } else if (i13 == 1) {
                ArrayList arrayList = this.f109958j;
                arrayList.clear();
                Iterator it2 = this.f109957i.iterator();
                long j13 = 0;
                while (it2.hasNext()) {
                    bo0 bo0Var = (bo0) it2.next();
                    arrayList.add(Long.valueOf(j13));
                    j13 += bo0Var.f36143i;
                }
                dVar.f109969d.invoke(this);
            } else if (i13 == 2) {
                dVar.f109967b.invoke(this);
            } else if (i13 == 3) {
                dVar.f109968c.invoke(this);
            } else if (i13 == 4) {
                dVar.f109970e.invoke(this);
            } else if (i13 == 5) {
                dVar.f109971f.invoke(this);
            }
        }
    }

    public final void t() {
        Uri uri;
        ArrayList arrayList = this.f109957i;
        k01 videoItem = ((bo0) arrayList.remove(arrayList.size() - 1)).getVideoItem();
        if (videoItem != null && (uri = videoItem.f41101b) != null) {
            c0.d.R2(uri).delete();
        }
        s(1);
    }

    public final void u(long j13) {
        this.f109956h = j13;
    }

    public final void v(boolean z13) {
        boolean z14 = this.f109954f;
        this.f109954f = z13;
        if (z14 != z13) {
            s(4);
        }
    }

    public final void w(boolean z13) {
        if (!j()) {
            z13 = false;
        }
        this.f109950b = z13;
    }

    public final void x(boolean z13) {
        boolean z14 = this.f109955g;
        this.f109955g = z13;
        if (z14 != z13) {
            s(5);
        }
    }

    public final void y(boolean z13) {
        boolean z14 = this.f109951c;
        this.f109951c = z13;
        if (z13) {
            w(false);
        }
        if (z14 != this.f109951c) {
            s(2);
        }
    }

    public final void z(boolean z13) {
        boolean z14 = this.f109952d;
        this.f109952d = z13;
        if (z13) {
            w(false);
        }
        if (z14 != this.f109952d) {
            s(0);
        }
    }
}
