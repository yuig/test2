package ma1;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.k0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86770i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f86771j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(p pVar, int i13) {
        super(1);
        this.f86770i = i13;
        this.f86771j = pVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f86770i;
        p pVar = this.f86771j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = pVar.f86794a;
                return rn1.a.y(it, ep.b.x(str, "string", str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = l52.c.settings_security_connected_devices_location_value;
                String[] formatArgs = {pVar.f86795b, pVar.f86796c};
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                ArrayList arrayList = new ArrayList(2);
                for (int i15 = 0; i15 < 2; i15++) {
                    arrayList.add(new f0(formatArgs[i15]));
                }
                return rn1.a.y(it, new k0(i14, arrayList), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = pVar.f86797d;
                return rn1.a.y(it, ep.b.x(str2, "string", str2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f86770i) {
            case 0:
                return b((rn1.a) obj);
            case 1:
                return b((rn1.a) obj);
            case 2:
                return b((rn1.a) obj);
            default:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z13 = this.f86771j.f86799f;
                boolean z14 = !z13;
                int i13 = z13 ? l52.c.settings_security_connected_devices_current_session : l52.c.settings_security_connected_devices_end_activity;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return yl1.b.f(it, new k0(i13, new ArrayList(0)), z14, null, null, null, null, null, null, 0, null, 1020);
        }
    }
}
