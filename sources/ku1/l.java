package ku1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.w1;
import java.util.HashMap;
import kh2.b0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final w f80919a;

    /* renamed from: b, reason: collision with root package name */
    public final wk2.a f80920b;

    /* renamed from: c, reason: collision with root package name */
    public final lu1.b f80921c;

    public l(w eventManager, bf2.d inAppNavigatorProvider, lu1.b baseActivityHelper) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(inAppNavigatorProvider, "inAppNavigatorProvider");
        Intrinsics.checkNotNullParameter(baseActivityHelper, "baseActivityHelper");
        this.f80919a = eventManager;
        this.f80920b = inAppNavigatorProvider;
        this.f80921c = baseActivityHelper;
    }

    public static /* synthetic */ void b(l lVar, Context context, String str, boolean z13, boolean z14, String str2, HashMap hashMap, int i13) {
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        boolean z15 = z13;
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        lVar.a(context, str, z15, z14, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : hashMap, false);
    }

    public final void a(Context context, String str, boolean z13, boolean z14, String str2, HashMap hashMap, boolean z15) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (str == null || str.length() == 0) {
            return;
        }
        if (z13) {
            Object obj = this.f80920b.get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            nu1.a.c((nu1.a) obj, str, str2, hashMap, z15, 8);
            return;
        }
        b F = b0.F(str);
        w wVar = this.f80919a;
        if (F != null) {
            wVar.d(Navigation.w1(F.a()));
        } else {
            if (z14) {
                wVar.d(Navigation.z0(w1.a(), str));
                return;
            }
            Intent j13 = ((lu1.c) this.f80921c).j(context);
            j13.setData(Uri.parse(str));
            context.startActivity(j13);
        }
    }
}
