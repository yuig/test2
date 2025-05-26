package com.pinterest.identity.account;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes2.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final f f49778i = new f(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yl1.b it = (yl1.b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        int i13 = vq1.d.unlink_ba_email_password_right_button_text;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return yl1.b.f(it, new k0(i13, new ArrayList(0)), false, null, null, null, null, null, null, 0, null, 1020);
    }
}
