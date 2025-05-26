package rh1;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f108104b;

    public /* synthetic */ a(k kVar, int i13) {
        this.f108103a = i13;
        this.f108104b = kVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f108103a;
        k this$0 = this.f108104b;
        switch (i13) {
            case 0:
                int i14 = k.f108194h1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof rn1.f) {
                    m60.w f73 = this$0.f7();
                    ArrayList arrayList = new ArrayList();
                    int i15 = 0;
                    for (Object obj : this$0.f108198d1) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            kotlin.collections.f0.p();
                            throw null;
                        }
                        int intValue = ((Number) obj).intValue();
                        arrayList.add(new ha2.c0(intValue, i15, null, this$0.f108197c1 == intValue, false, null, null, Integer.valueOf(((Number) this$0.f108199e1.get(i15)).intValue()), null, null, 3956));
                        i15 = i16;
                    }
                    List b13 = kotlin.collections.e0.b(new ha2.b0(null, arrayList, new c(this$0, 0)));
                    int i17 = eo1.c.lego_spacing_horizontal_medium;
                    f73.d(new jc0.v(new lp.k(new ha2.a(b13, false, Integer.valueOf(ob2.f.sort_comments_by), new ha2.d0(i17, eo1.c.lego_spacing_vertical_small, i17, eo1.c.lego_spacing_vertical_xlarge))), false, 0L, 30));
                    return;
                }
                return;
            case 1:
                int i18 = k.f108194h1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    ConstraintLayout constraintLayout = this$0.P0;
                    if (constraintLayout == null) {
                        Intrinsics.r("commentPhotoDetailLayout");
                        throw null;
                    }
                    bs1.c.X0(constraintLayout);
                    bs1.c.U1(this$0.X8());
                    return;
                }
                return;
            default:
                int i19 = k.f108194h1;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    this$0.V8();
                    this$0.d9();
                    this$0.P7();
                    return;
                }
                return;
        }
    }
}
