package l81;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f82114b;

    public /* synthetic */ a(l lVar, int i13) {
        this.f82113a = i13;
        this.f82114b = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ca2.e eVar;
        int i13 = this.f82113a;
        l this$0 = this.f82114b;
        switch (i13) {
            case 0:
                int i14 = l.Q2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i81.c cVar = this$0.f82177p1;
                if (cVar != null) {
                    ((k81.l) cVar).T3();
                    return;
                }
                return;
            case 1:
                int i15 = l.Q2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                i81.c cVar2 = this$0.f82177p1;
                if (cVar2 != null) {
                    ((k81.l) cVar2).S3();
                    return;
                }
                return;
            default:
                int i16 = l.Q2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FrameLayout frameLayout = this$0.D1;
                if (frameLayout == null) {
                    Intrinsics.r("zoomableImageRootContainer");
                    throw null;
                }
                if (frameLayout.getAlpha() >= 1.0f || (eVar = this$0.f82176o2) == null) {
                    return;
                }
                ca2.e.i(eVar, "background_tapped", 0.0f, null, 6);
                return;
        }
    }
}
