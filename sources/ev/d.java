package ev;

import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f60203b;

    public /* synthetic */ d(h hVar, int i13) {
        this.f60202a = i13;
        this.f60203b = hVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        int i13 = this.f60202a;
        h this$0 = this.f60203b;
        switch (i13) {
            case 0:
                int i14 = h.B0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                lh0.g gVar = this$0.f60210l0;
                if (gVar == null) {
                    Intrinsics.r("adsExperiments");
                    throw null;
                }
                if (gVar.d()) {
                    GestaltText gestaltText = this$0.f60216r0;
                    if (gestaltText != null) {
                        this$0.onClick(gestaltText);
                        return;
                    } else {
                        Intrinsics.r("genAiDisclosureDescription");
                        throw null;
                    }
                }
                return;
            case 1:
                int i15 = h.B0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltText gestaltText2 = this$0.f60212n0;
                if (gestaltText2 != null) {
                    this$0.onClick(gestaltText2);
                    return;
                } else {
                    Intrinsics.r("targetingDescription");
                    throw null;
                }
            case 2:
                int i16 = h.B0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltText gestaltText3 = this$0.f60213o0;
                if (gestaltText3 != null) {
                    this$0.onClick(gestaltText3);
                    return;
                } else {
                    Intrinsics.r("blockDescription");
                    throw null;
                }
            case 3:
                int i17 = h.B0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    GestaltIconButton gestaltIconButton = this$0.f60214p0;
                    if (gestaltIconButton != null) {
                        this$0.onClick(gestaltIconButton);
                        return;
                    } else {
                        Intrinsics.r("cancelButton");
                        throw null;
                    }
                }
                return;
            case 4:
                int i18 = h.B0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltText gestaltText4 = this$0.f60218t0;
                Intrinsics.f(gestaltText4);
                this$0.onClick(gestaltText4);
                return;
            case 5:
                int i19 = h.B0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltText gestaltText5 = this$0.f60220v0;
                Intrinsics.f(gestaltText5);
                this$0.onClick(gestaltText5);
                return;
            default:
                int i23 = h.B0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                GestaltText gestaltText6 = this$0.f60221w0;
                Intrinsics.f(gestaltText6);
                this$0.onClick(gestaltText6);
                return;
        }
    }
}
