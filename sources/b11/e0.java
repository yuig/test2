package b11;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class e0 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f20986b;

    public /* synthetic */ e0(j0 j0Var, int i13) {
        this.f20985a = i13;
        this.f20986b = j0Var;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        f30 f30Var;
        int i13 = this.f20985a;
        j0 this$0 = this.f20986b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.o0(null);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if (!(it instanceof mn1.a)) {
                    if (it instanceof mn1.b) {
                        this$0.d0();
                        break;
                    }
                } else {
                    this$0.o0(h32.u0.PIN_SAVED_SPLIT_BUTTON_ICON);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if ((it instanceof om1.l) && (f30Var = this$0.f21042t) != null) {
                    m60.w eventManager = this$0.getEventManager();
                    String id3 = f30Var.getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
                    eventManager.d(new l01.a(id3));
                    break;
                }
                break;
        }
    }
}
