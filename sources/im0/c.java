package im0;

import h32.f1;
import h32.i0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import on1.g;
import on1.i;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72603i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f72604j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, int i13) {
        super(1);
        this.f72603i = i13;
        this.f72604j = dVar;
    }

    public final void b(i it) {
        int i13 = this.f72603i;
        d dVar = this.f72604j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                hm0.c cVar = dVar.f72614r0;
                if (cVar == null) {
                    Intrinsics.r("permissionsSettingListener");
                    throw null;
                }
                boolean z13 = it instanceof g;
                cVar.f69568g = z13;
                cVar.getPinalytics().U(new i0(((d) ((gm0.a) cVar.getView())).f72615s0, ((d) ((gm0.a) cVar.getView())).f72616t0, null, null, null, u0.BOARD_ALLOW_INVITE_OTHERS), z13 ? f1.TOGGLE_ON : f1.TOGGLE_OFF, null, null, null, false);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                hm0.c cVar2 = dVar.f72614r0;
                if (cVar2 == null) {
                    Intrinsics.r("permissionsSettingListener");
                    throw null;
                }
                boolean z14 = it instanceof g;
                cVar2.f69569h = z14;
                cVar2.getPinalytics().U(new i0(((d) ((gm0.a) cVar2.getView())).f72615s0, ((d) ((gm0.a) cVar2.getView())).f72616t0, null, null, null, u0.BOARD_COLLAB_REQUESTS_ENABLED_SWITCH), z14 ? f1.TOGGLE_ON : f1.TOGGLE_OFF, null, null, null, false);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f72603i) {
            case 0:
                b((i) obj);
                break;
            default:
                b((i) obj);
                break;
        }
        return Unit.f80348a;
    }
}
