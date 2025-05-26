package rc0;

import com.pinterest.gestalt.searchField.GestaltSearchField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class t0 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestaltSearchField f107417b;

    public /* synthetic */ t0(GestaltSearchField gestaltSearchField, int i13) {
        this.f107416a = i13;
        this.f107417b = gestaltSearchField;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        gm1.a aVar;
        gm1.a aVar2;
        int i13 = this.f107416a;
        GestaltSearchField gestaltSearchField = this.f107417b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(gestaltSearchField, "$gestaltSearchField");
                Intrinsics.checkNotNullParameter(event, "event");
                if (!(event instanceof cn1.p)) {
                    if (event instanceof cn1.t) {
                        c0.d.j(gestaltSearchField, s0.C);
                        break;
                    }
                } else {
                    c0.d.j(gestaltSearchField, s0.B);
                    break;
                }
                break;
            case 1:
                rm1.i iVar = GestaltSearchField.f49499t;
                Intrinsics.checkNotNullParameter(gestaltSearchField, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if ((event instanceof om1.l) && (aVar = (gm1.a) gestaltSearchField.f49506a.f33804b) != null) {
                    aVar.h3(new cn1.u(gestaltSearchField.getId()));
                    break;
                }
                break;
            default:
                rm1.i iVar2 = GestaltSearchField.f49499t;
                Intrinsics.checkNotNullParameter(gestaltSearchField, "this$0");
                Intrinsics.checkNotNullParameter(event, "event");
                if ((event instanceof om1.l) && (aVar2 = (gm1.a) gestaltSearchField.f49506a.f33804b) != null) {
                    aVar2.h3(new cn1.p(gestaltSearchField.getId()));
                    break;
                }
                break;
        }
    }
}
