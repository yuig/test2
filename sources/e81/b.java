package e81;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57758i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f57759j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f57758i = i13;
        this.f57759j = dVar;
    }

    public final RectF b() {
        int i13 = this.f57758i;
        d dVar = this.f57759j;
        switch (i13) {
            case 0:
                ImageView imageView = dVar.f57769p0;
                if (imageView == null) {
                    Intrinsics.r("deleteButton");
                    throw null;
                }
                float left = imageView.getLeft();
                ImageView imageView2 = dVar.f57769p0;
                if (imageView2 == null) {
                    Intrinsics.r("deleteButton");
                    throw null;
                }
                float top = imageView2.getTop();
                ImageView imageView3 = dVar.f57769p0;
                if (imageView3 == null) {
                    Intrinsics.r("deleteButton");
                    throw null;
                }
                float right = imageView3.getRight();
                if (dVar.f57769p0 != null) {
                    return new RectF(left, top, right, r1.getBottom());
                }
                Intrinsics.r("deleteButton");
                throw null;
            case 3:
                int i14 = d.O0;
                RectF creationRect = dVar.d8();
                Intrinsics.checkNotNullParameter(creationRect, "creationRect");
                return new RectF(creationRect.width() * 0.04f, creationRect.height() * 0.09f, creationRect.width() - (creationRect.width() * 0.04f), creationRect.height() - (creationRect.height() * 0.09f));
            default:
                Context context = dVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
                Intrinsics.checkNotNullParameter(context, "context");
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(uc2.b.collages_bottom_toolbar_height);
                int c13 = ml2.c.c(hf0.b.f69002b);
                float c14 = ml2.c.c(hf0.b.f69003c - hf0.b.f()) - dimensionPixelSize;
                float f13 = 9.0f * c14;
                float f14 = c13;
                if (f13 > f14 * 16.0f) {
                    return new RectF(0.0f, 0.0f, f14, 1.7777778f * f14);
                }
                float f15 = f13 / 16.0f;
                float f16 = (f14 - f15) / 2;
                return new RectF(f16, 0.0f, f15 + f16, c14);
        }
    }

    public final View[] e() {
        int i13 = this.f57758i;
        d dVar = this.f57759j;
        switch (i13) {
            case 1:
                View[] viewArr = new View[3];
                View view = dVar.f57776w0;
                if (view == null) {
                    Intrinsics.r("leftMediaGridLine");
                    throw null;
                }
                viewArr[0] = view;
                View view2 = dVar.A0;
                if (view2 == null) {
                    Intrinsics.r("vCenterGridLine");
                    throw null;
                }
                viewArr[1] = view2;
                View view3 = dVar.f57778y0;
                if (view3 != null) {
                    viewArr[2] = view3;
                    return viewArr;
                }
                Intrinsics.r("rightMediaGridLine");
                throw null;
            case 2:
                View[] viewArr2 = new View[3];
                View view4 = dVar.f57772s0;
                if (view4 == null) {
                    Intrinsics.r("leftTextGridLine");
                    throw null;
                }
                viewArr2[0] = view4;
                View view5 = dVar.A0;
                if (view5 == null) {
                    Intrinsics.r("vCenterGridLine");
                    throw null;
                }
                viewArr2[1] = view5;
                View view6 = dVar.f57774u0;
                if (view6 != null) {
                    viewArr2[2] = view6;
                    return viewArr2;
                }
                Intrinsics.r("rightTextGridLine");
                throw null;
            case 3:
            case 4:
            default:
                View[] viewArr3 = new View[3];
                View view7 = dVar.f57773t0;
                if (view7 == null) {
                    Intrinsics.r("topTextGridLine");
                    throw null;
                }
                viewArr3[0] = view7;
                View view8 = dVar.B0;
                if (view8 == null) {
                    Intrinsics.r("hCenterGridLine");
                    throw null;
                }
                viewArr3[1] = view8;
                View view9 = dVar.f57775v0;
                if (view9 != null) {
                    viewArr3[2] = view9;
                    return viewArr3;
                }
                Intrinsics.r("bottomTextGridLine");
                throw null;
            case 5:
                View[] viewArr4 = new View[3];
                View view10 = dVar.f57777x0;
                if (view10 == null) {
                    Intrinsics.r("topMediaGridLine");
                    throw null;
                }
                viewArr4[0] = view10;
                View view11 = dVar.B0;
                if (view11 == null) {
                    Intrinsics.r("hCenterGridLine");
                    throw null;
                }
                viewArr4[1] = view11;
                View view12 = dVar.f57779z0;
                if (view12 != null) {
                    viewArr4[2] = view12;
                    return viewArr4;
                }
                Intrinsics.r("bottomMediaGridLine");
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f57758i) {
        }
        return e();
    }
}
