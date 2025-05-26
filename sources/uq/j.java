package uq;

import com.pinterest.api.model.f30;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.a1;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import u50.f0;
import z3.y;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123008i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f123009j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f123010k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, String str2, int i13) {
        super(1);
        this.f123008i = i13;
        this.f123009j = str;
        this.f123010k = str2;
    }

    public final Boolean b(Pair pair) {
        int i13 = this.f123008i;
        boolean z13 = false;
        String str = this.f123010k;
        String str2 = this.f123009j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(pair, "pair");
                if (Intrinsics.d(str2, pair.f80346a) && Intrinsics.d(str, pair.f80347b)) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            default:
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                String str3 = (String) pair.f80346a;
                String str4 = (String) pair.f80347b;
                if (Intrinsics.d(str3, str2) && Intrinsics.d(str4, str)) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
        }
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f123008i;
        String str = this.f123010k;
        String str2 = this.f123009j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, bs1.c.h2(str2), null, null, null, vn1.g.BODY_100, 0, fm1.c.VISIBLE, null, null, null, false, 0, bs1.c.h2(str), null, null, null, null, false, null, null, 2092974);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f123008i;
        String str = this.f123009j;
        String str2 = this.f123010k;
        switch (i13) {
            case 0:
                wn1.d it = (wn1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 1:
                d6.b it2 = (d6.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                d6.g key = d7.b.z0(str);
                if (str2 == null) {
                    str2 = "";
                }
                it2.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                it2.c(key, str2);
                break;
            case 2:
                rl1.q it3 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                int i14 = le0.h.content_description_user_avatar;
                String[] formatArgs = {str2};
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(new f0(formatArgs[0]));
                break;
            case 3:
                f30 f30Var = (f30) obj;
                if (f30Var != null && Intrinsics.d(str, f30Var.getUid())) {
                    NavigationImpl z03 = Navigation.z0((ScreenLocation) a1.f50505l.getValue(), str);
                    if (!z.j(str2)) {
                        z03.m0("com.pinterest.EXTRA_COMMENT_TYPE", "userdiditdata");
                        z03.m0("com.pinterest.EXTRA_COMMENT_ID", str2);
                    }
                    m60.u.f85943a.d(z03);
                }
                break;
            case 4:
                y semantics = (y) obj;
                Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                z3.w.f(semantics, str);
                z3.x xVar = z3.t.f140734c;
                rl2.u uVar = z3.w.f140760a[0];
                xVar.a(semantics, str2);
                break;
            case 5:
                Navigation navigateTo = (Navigation) obj;
                Intrinsics.checkNotNullParameter(navigateTo, "$this$navigateTo");
                navigateTo.m0("com.pinterest.EXTRA_USER_ID", str);
                navigateTo.Y1("com.pinterest.EXTRAS_KEY_SHOW_TOOLBAR", true);
                navigateTo.m0("com.pinterest.node_id", str2);
                break;
            case 7:
                int intValue = ((Number) obj).intValue();
                switch (i13) {
                    case 7:
                        HashMap o13 = ep.b.o("board_id", str);
                        if (str2 != null) {
                            o13.put("error_message", str2);
                            break;
                        }
                        break;
                }
            case 8:
                int intValue2 = ((Number) obj).intValue();
                switch (i13) {
                    case 7:
                        HashMap o14 = ep.b.o("board_id", str);
                        if (str2 != null) {
                            o14.put("error_message", str2);
                            break;
                        }
                        break;
                }
        }
        return b((Pair) obj);
    }
}
