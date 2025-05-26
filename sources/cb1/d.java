package cb1;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.i0;
import u50.k0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f27268i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.pinterest.feature.settings.notifications.b f27269j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.pinterest.feature.settings.notifications.b bVar, int i13) {
        super(1);
        this.f27268i = i13;
        this.f27269j = bVar;
    }

    public final rn1.a b(rn1.a it) {
        i0 i0Var;
        int i13 = this.f27268i;
        com.pinterest.feature.settings.notifications.b bVar = this.f27269j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = bVar.f48166d;
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                if (bVar.f48169g) {
                    int i14 = e52.c.notif_settings_global_permissions_description;
                    String[] formatArgs = new String[0];
                    Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                    i0Var = new k0(i14, new ArrayList(0));
                } else {
                    i0Var = bVar.f48165c;
                }
                return rn1.a.y(it, i0Var, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = bVar.f48164b;
                return rn1.a.y(it, ep.b.x(str2, "string", str2), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.j2(new String[0], bVar.f48167e), null, null, null, null, 0, bVar.f48169g ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f27268i) {
        }
        return b((rn1.a) obj);
    }
}
