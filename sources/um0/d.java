package um0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final zb0.a f122693a;

    static {
        u50.k0 b13 = u50.g0.b(new String[0], m60.x0.are_you_sure_text);
        int i13 = d70.f.delete_pins_warning_message;
        List formatArgs = kotlin.collections.e0.b(String.valueOf(0));
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        f122693a = new zb0.a(b13, new u50.j0(i13, 0, formatArgs), u50.g0.b(new String[0], m60.x0.delete_confirm), u50.g0.b(new String[0], m60.x0.cancel), true);
    }
}
