package ea1;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class e0 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f58046b;

    public /* synthetic */ e0(v0 v0Var, int i13) {
        this.f58045a = i13;
        this.f58046b = v0Var;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f58045a;
        v0 this$0 = this.f58046b;
        switch (i13) {
            case 0:
                int i14 = v0.F0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    q1 b83 = this$0.b8();
                    FragmentActivity requireActivity = this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    kh2.j.x2(b83, new n(bs1.c.m(requireActivity)));
                    break;
                }
                break;
            case 1:
                int i15 = v0.F0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    q1 b84 = this$0.b8();
                    FragmentActivity requireActivity2 = this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                    kh2.j.x2(b84, new x(bs1.c.m(requireActivity2)));
                    break;
                }
                break;
            case 2:
                int i16 = v0.F0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof xl1.a) {
                    q1 b85 = this$0.b8();
                    FragmentActivity requireActivity3 = this$0.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                    kh2.j.x2(b85, new x(bs1.c.m(requireActivity3)));
                    break;
                }
                break;
            default:
                if (it instanceof xl1.a) {
                    int i17 = v0.F0;
                    kh2.j.x2(this$0.b8(), z.f58172a);
                    break;
                }
                break;
        }
    }
}
