package ma1;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f86766j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f86767k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f86768l = new a(2);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86769i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f86769i = i13;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f86769i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                int i13 = l52.c.settings_security_connected_devices_last_accessed;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new k0(i13, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = l52.c.settings_security_connected_devices_location;
                String[] formatArgs2 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
                return rn1.a.y(it, new k0(i14, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int i15 = l52.c.settings_security_connected_devices_device_type;
                String[] formatArgs3 = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs3, "formatArgs");
                return rn1.a.y(it, new k0(i15, new ArrayList(0)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f86769i) {
        }
        return b((rn1.a) obj);
    }
}
