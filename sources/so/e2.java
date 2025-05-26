package so;

import android.os.Bundle;
import com.pinterest.framework.screens.ScreenLocation;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8 f113397a;

    public e2(r8 r8Var) {
        this.f113397a = r8Var;
    }

    public final d41.a a(String userId, boolean z13) {
        il1.b screenFactory = this.f113397a.f114091b.t6();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        d41.a aVar = new d41.a((com.pinterest.framework.screens.l) screenFactory);
        Bundle a13 = n60.o.a("com.pinterest.EXTRA_USER_ID", userId);
        ArrayList l13 = kotlin.collections.f0.l(jr.a.o((ScreenLocation) com.pinterest.screens.i3.f50982p.getValue(), a13));
        if (z13) {
            l13.add(jr.a.o((ScreenLocation) com.pinterest.screens.i3.f50981o.getValue(), a13));
        }
        aVar.k(l13);
        return aVar;
    }
}
