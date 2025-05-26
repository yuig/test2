package o61;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;
import om1.l;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f92941b;

    public /* synthetic */ a(c cVar, int i13) {
        this.f92940a = i13;
        this.f92941b = cVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        FragmentActivity E4;
        f fVar;
        f fVar2;
        int i13 = this.f92940a;
        c this$0 = this.f92941b;
        switch (i13) {
            case 0:
                int i14 = c.f92947x0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((it instanceof l) && (E4 = this$0.E4()) != null) {
                    E4.onBackPressed();
                    break;
                }
                break;
            case 1:
                int i15 = c.f92947x0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                f fVar3 = this$0.f92950l0;
                if (fVar3 != null) {
                    fVar3.s3();
                    break;
                }
                break;
            case 2:
                int i16 = c.f92947x0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((it instanceof l) && (fVar = this$0.f92950l0) != null) {
                    fVar.u3();
                    break;
                }
                break;
            case 3:
                int i17 = c.f92947x0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((it instanceof l) && (fVar2 = this$0.f92950l0) != null) {
                    fVar2.q3();
                    break;
                }
                break;
            default:
                int i18 = c.f92947x0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.z(b.f92943k);
                break;
        }
    }
}
