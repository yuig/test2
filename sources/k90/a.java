package k90;

import android.view.View;
import jq1.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements ca2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yk1.k f78715b;

    public /* synthetic */ a(yk1.k kVar, int i13) {
        this.f78714a = i13;
        this.f78715b = kVar;
    }

    @Override // ca2.c
    public final void s(float f13, float f14) {
        int i13 = this.f78714a;
        yk1.k kVar = this.f78715b;
        switch (i13) {
            case 0:
                View view = ((c) kVar).f78732p1;
                if (view != null) {
                    view.setAlpha(1 - (f13 / f14));
                    return;
                } else {
                    Intrinsics.r("backgroundOverlay");
                    throw null;
                }
            case 1:
                float f15 = 1 - (f13 / f14);
                View view2 = ((ui0.e) kVar).D0;
                if (view2 != null) {
                    view2.setAlpha(f15);
                    return;
                } else {
                    Intrinsics.r("backgroundOverlay");
                    throw null;
                }
            case 2:
                View view3 = ((b31.g) kVar).J0;
                if (view3 != null) {
                    view3.setAlpha(1 - (f13 / f14));
                    return;
                } else {
                    Intrinsics.r("viewOverlay");
                    throw null;
                }
            case 3:
                float f16 = 1 - (f13 / f14);
                View view4 = ((n) kVar).f77506m1;
                if (view4 != null) {
                    view4.setAlpha(f16);
                    return;
                } else {
                    Intrinsics.r("backgroundOverlay");
                    throw null;
                }
            default:
                float f17 = 1 - (f13 / f14);
                View view5 = ((nq1.e) kVar).f91824m0;
                if (view5 != null) {
                    view5.setAlpha(f17);
                    return;
                } else {
                    Intrinsics.r("backgroundOverlay");
                    throw null;
                }
        }
    }
}
