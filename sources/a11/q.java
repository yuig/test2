package a11;

import androidx.appcompat.widget.c2;
import i01.r0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final c2 f338a;

    /* renamed from: b, reason: collision with root package name */
    public final lb0.r f339b;

    /* renamed from: c, reason: collision with root package name */
    public final lz1.a f340c;

    public q(c2 sharesheetUtils, lb0.r prefsManagerUser, lz1.c sendShareUpsellPreferences) {
        Intrinsics.checkNotNullParameter(sharesheetUtils, "sharesheetUtils");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        Intrinsics.checkNotNullParameter(sendShareUpsellPreferences, "sendShareUpsellPreferences");
        this.f338a = sharesheetUtils;
        this.f339b = prefsManagerUser;
        this.f340c = sendShareUpsellPreferences;
    }

    public final void a(dl1.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        new fk2.g(new p(0, this, model), 3).l(tk2.e.f118017c).h(wj2.c.a()).i(new r0(3), new f(10, j.f290m));
    }
}
