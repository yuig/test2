package u81;

import androidx.fragment.app.FragmentActivity;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class j implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f121045b;

    public /* synthetic */ j(r rVar, int i13) {
        this.f121044a = i13;
        this.f121045b = rVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        m81.r rVar;
        int i13 = this.f121044a;
        r this$0 = this.f121045b;
        switch (i13) {
            case 0:
                int i14 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.z9(false);
                return;
            case 1:
                int i15 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.z9(true);
                return;
            case 2:
                int i16 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                m81.r rVar2 = this$0.X1;
                if (rVar2 != null) {
                    ha2.a configuration = ((s81.p) rVar2).w3();
                    Intrinsics.checkNotNullParameter(configuration, "configuration");
                    this$0.f7().d(new jc0.v(new lp.k(configuration), false, 0L, 30));
                    return;
                }
                return;
            case 3:
                int i17 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                m81.r rVar3 = this$0.X1;
                if (rVar3 != null) {
                    ((s81.p) rVar3).W3();
                    return;
                }
                return;
            case 4:
                int i18 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    b0 p93 = this$0.p9();
                    WebImageView webImageView = this$0.f121092w1;
                    if (webImageView != null) {
                        p93.c(webImageView.C);
                        return;
                    } else {
                        Intrinsics.r("imagePreview");
                        throw null;
                    }
                }
                return;
            case 5:
                int i19 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                m81.r rVar4 = this$0.X1;
                if (rVar4 != null) {
                    ((s81.p) rVar4).I3();
                    return;
                }
                return;
            case 6:
                int i23 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    this$0.P7();
                    return;
                }
                return;
            case 7:
                int i24 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.o9();
                FragmentActivity requireActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                ny1.w.b(requireActivity);
                this$0.f121088s1 = true;
                return;
            case 8:
                int i25 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.z9(false);
                return;
            default:
                int i26 = r.f121059l2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof om1.l) || (rVar = this$0.X1) == null) {
                    return;
                }
                ((s81.p) rVar).N3();
                return;
        }
    }
}
