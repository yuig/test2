package a91;

import android.graphics.Bitmap;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.s01;
import com.pinterest.api.model.uw;
import com.pinterest.ui.view.ExpandableView;
import h32.f1;
import java.util.HashMap;
import java.util.List;
import kh2.w;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uj2.q;
import x81.f0;
import x81.g;
import x81.i0;
import x81.k;
import x81.l;
import x81.o0;
import x81.s;
import x81.u;
import x81.v;
import yk1.n;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class d extends t implements l {

    /* renamed from: a, reason: collision with root package name */
    public final s f1570a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1571b;

    /* renamed from: c, reason: collision with root package name */
    public f42.c f1572c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1573d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f1574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d pinalytics, q networkStateStream, f0 imageReadyListener, u uVar, f42.c makeupCategory) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(imageReadyListener, "imageReadyListener");
        Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
        this.f1570a = imageReadyListener;
        this.f1571b = uVar;
        this.f1572c = makeupCategory;
        this.f1573d = new HashMap();
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        k view = (k) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.setTryOnViewListener(this);
        u uVar = this.f1571b;
        if (uVar != null) {
            ((o0) uVar).T3();
        }
    }

    public final void p3() {
        s01 O6;
        List d2;
        u uVar = this.f1571b;
        if (uVar != null) {
            ExpandableView expandableView = ((f0) ((v) ((o0) uVar).getView())).f134216n1;
            if (expandableView == null) {
                Intrinsics.r("expandableMenu");
                throw null;
            }
            expandableView.a();
        }
        f42.c cVar = f42.c.EYESHADOW;
        f30 f30Var = (f30) this.f1573d.get(cVar);
        if (f30Var == null || (O6 = f30Var.O6()) == null || (d2 = O6.d()) == null || this.f1572c != cVar || d2.size() <= 1) {
            return;
        }
        d0.v(getPinalytics(), f1.VIRTUAL_TRY_ON_CHANGE_SWATCH, f30Var.getUid(), false, 12);
        ((k) getView()).playHapticFeedback();
        Integer num = this.f1574e;
        if (num != null) {
            int intValue = num.intValue() + 1;
            this.f1574e = Integer.valueOf(intValue);
            if (intValue >= d2.size()) {
                this.f1574e = 0;
            }
            Integer num2 = this.f1574e;
            if (num2 != null) {
                Object obj = d2.get(num2.intValue());
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                t3((uw) obj, this.f1572c);
            }
            if (uVar != null) {
                ((o0) uVar).I3(f30Var, this.f1574e);
            }
        }
    }

    public final void q3(boolean z13) {
        u uVar = this.f1571b;
        if (uVar != null) {
            o0 o0Var = (o0) uVar;
            if (!z13) {
                o0Var.a4(i0.FACE_NOT_DETECTED);
            } else if (o0Var.f134275k) {
                o0Var.V3();
            }
        }
    }

    public final void r3(f42.c makeupCategory) {
        Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
        this.f1572c = makeupCategory;
    }

    public final void s3(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        f0 f0Var = (f0) this.f1570a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        u uVar = f0Var.T1;
        if (uVar != null) {
            ((o0) uVar).S3(bitmap);
        }
    }

    public final void t3(uw uwVar, f42.c cVar) {
        g gVar = new g(w.C0(uwVar, cVar));
        int i13 = c.f1569a[cVar.ordinal()];
        if (i13 == 1) {
            ((k) getView()).updateLipstick(gVar);
        } else {
            if (i13 != 2) {
                return;
            }
            ((k) getView()).updateEyeshadow(gVar);
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        k view = (k) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        view.setTryOnViewListener(this);
        u uVar = this.f1571b;
        if (uVar != null) {
            ((o0) uVar).T3();
        }
    }
}
