package xz1;

import com.pinterest.qrCodeLogin.m0;
import do1.l;
import do1.x;
import eo1.c;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.f;
import rm1.q;
import u50.b0;
import u50.k0;

/* loaded from: classes4.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f136243i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x bind = (x) obj;
        Intrinsics.checkNotNullParameter(bind, "$this$bind");
        bind.f55705b = new l(new f(q.CHECK_CIRCLE_FILL));
        int i13 = m0.qr_login_confirmed;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        k0 text = new k0(i13, new ArrayList(0));
        Intrinsics.checkNotNullParameter(text, "text");
        bind.f55704a = text;
        bind.f55711h = new b0(c.space_400);
        return Unit.f80348a;
    }
}
