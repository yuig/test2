package mp0;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.imageview.ShapeableImageView;
import com.pinterest.api.model.bu0;
import com.pinterest.api.model.mj;
import com.pinterest.reportFlow.feature.rvc.view.RVCSectionItemView;
import hs1.o;
import kh2.k3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb2.n;
import q91.d1;
import r02.h0;
import yb0.h;

/* loaded from: classes5.dex */
public final class b implements o, h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87894a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f87895b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f87896c;

    public /* synthetic */ b(int i13, Object obj, Object obj2) {
        this.f87894a = i13;
        this.f87895b = obj;
        this.f87896c = obj2;
    }

    @Override // yb0.h
    public void G6() {
        switch (this.f87894a) {
            case 0:
                ((Function0) this.f87896c).invoke();
                break;
        }
    }

    @Override // yb0.h
    public void H0(boolean z13) {
    }

    @Override // hs1.o
    public void d() {
        int i13 = this.f87894a;
        Object obj = this.f87895b;
        Object obj2 = this.f87896c;
        switch (i13) {
            case 0:
                ((d) obj).T((bu0) obj2);
                break;
            case 1:
                ((kj1.f) obj).E(((kj1.d) ((kj1.a) obj2).f79847a).f79851d.f79849c);
                break;
            case 2:
                RVCSectionItemView rVCSectionItemView = (RVCSectionItemView) obj;
                boolean z13 = q02.b.d((mj) obj2) == q02.c.Rectangle;
                int i14 = RVCSectionItemView.f50428l;
                rVCSectionItemView.b(z13);
                break;
            case 3:
                ((o) obj2).d();
                break;
            case 4:
                ((ua2.f) obj).G((bu0) obj2);
                break;
            default:
                ((va2.d) obj).f125334s = false;
                ((o) obj2).d();
                break;
        }
    }

    @Override // hs1.o
    public void k(Bitmap bitmap) {
        int dimensionPixelOffset;
        int i13;
        int i14 = this.f87894a;
        Object obj = this.f87896c;
        Object obj2 = this.f87895b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                ((d) obj2).f87913r.setImageBitmap(bitmap);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                kj1.f fVar = (kj1.f) obj2;
                fVar.f121492a.requestLayout();
                fVar.f121492a.invalidate();
                break;
            case 2:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                RVCSectionItemView rVCSectionItemView = (RVCSectionItemView) obj2;
                ShapeableImageView shapeableImageView = rVCSectionItemView.f50429a;
                int i15 = h0.f105752a[q02.b.d((mj) obj).ordinal()];
                ShapeableImageView shapeableImageView2 = rVCSectionItemView.f50430b;
                if (i15 == 1) {
                    ShapeableImageView shapeableImageView3 = rVCSectionItemView.f50429a;
                    shapeableImageView3.setVisibility(8);
                    shapeableImageView3.setClickable(false);
                    dimensionPixelOffset = rVCSectionItemView.getResources().getDimensionPixelOffset(h02.a.rvc_icon_square_width);
                    i13 = dimensionPixelOffset;
                    shapeableImageView = shapeableImageView2;
                } else if (i15 != 2) {
                    shapeableImageView2.setVisibility(8);
                    shapeableImageView2.setClickable(false);
                    dimensionPixelOffset = rVCSectionItemView.getResources().getDimensionPixelOffset(h02.a.rvc_icon_width);
                    i13 = rVCSectionItemView.getResources().getDimensionPixelOffset(h02.a.rvc_icon_height);
                } else {
                    shapeableImageView2.setVisibility(8);
                    shapeableImageView2.setClickable(false);
                    dimensionPixelOffset = rVCSectionItemView.getResources().getDimensionPixelOffset(h02.a.rvc_icon_height);
                    i13 = rVCSectionItemView.getResources().getDimensionPixelOffset(h02.a.rvc_icon_width);
                }
                shapeableImageView.setVisibility(0);
                shapeableImageView.setPaddingRelative(0, 0, 0, 0);
                shapeableImageView.setBackground(null);
                shapeableImageView.getLayoutParams().width = dimensionPixelOffset;
                shapeableImageView.getLayoutParams().height = i13;
                Context context = shapeableImageView.getContext();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, dimensionPixelOffset, i13, false);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                shapeableImageView.setImageBitmap(k3.C(context, createScaledBitmap, 1.0f, 0.0f, 8));
                shapeableImageView.setClickable(true);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                ((sa2.b) obj2).f112221z = bitmap;
                ((o) obj).k(bitmap);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                ua2.f fVar2 = (ua2.f) obj2;
                fVar2.f121502f.requestLayout();
                fVar2.f121502f.invalidate();
                break;
            default:
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                ((va2.d) obj2).f125333r = bitmap;
                ((o) obj).k(bitmap);
                break;
        }
    }

    @Override // yb0.h
    public void t2() {
        int i13 = this.f87894a;
        Object obj = this.f87895b;
        switch (i13) {
            case 0:
                ((Function0) obj).invoke();
                return;
            default:
                mr1.a aVar = ((d1) obj).f103091k0;
                if (aVar == null) {
                    Intrinsics.r("accountSwitcher");
                    throw null;
                }
                FragmentActivity activity = (FragmentActivity) this.f87896c;
                Intrinsics.checkNotNullExpressionValue(activity, "$activity");
                ((n) aVar).d(activity, "user_account_deactivated", "");
                return;
        }
    }
}
