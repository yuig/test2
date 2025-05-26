package nj;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import bk.c0;
import bk.d0;
import bk.o;
import com.google.android.material.chip.Chip;
import com.pinterest.feature.closeup.view.LegoFloatingBottomActionBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90937b;

    public /* synthetic */ c(Object obj, int i13) {
        this.f90936a = i13;
        this.f90937b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i13 = this.f90936a;
        Object obj = this.f90937b;
        switch (i13) {
            case 0:
                f fVar = ((Chip) obj).f32443e;
                if (fVar == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    fVar.getOutline(outline);
                    break;
                }
            case 1:
                c0 c0Var = (c0) obj;
                if (((o) c0Var.f23023c) != null && !((RectF) c0Var.f23024d).isEmpty()) {
                    RectF rectF = (RectF) c0Var.f23024d;
                    outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, c0Var.f23028g);
                    break;
                }
                break;
            case 2:
                d0 d0Var = (d0) obj;
                if (!((Path) d0Var.f23025e).isEmpty()) {
                    outline.setPath((Path) d0Var.f23025e);
                    break;
                }
                break;
            case 3:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                LegoFloatingBottomActionBar legoFloatingBottomActionBar = (LegoFloatingBottomActionBar) obj;
                outline.setRect(0, 0, legoFloatingBottomActionBar.getWidth(), legoFloatingBottomActionBar.getHeight());
                break;
            case 4:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                h81.d dVar = (h81.d) obj;
                outline.setOval(0, 0, dVar.getWidth(), dVar.getHeight());
                break;
            default:
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((v72.g) obj).getResources().getDimension(eo1.c.rounding_400));
                break;
        }
    }
}
