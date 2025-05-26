package oa2;

import com.pinterest.ui.components.users.LegoUserRep;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rl1.m0;

/* loaded from: classes4.dex */
public interface t extends yk1.d {
    static void C1(t tVar, String imageUrl, String name, boolean z13) {
        LegoUserRep legoUserRep = (LegoUserRep) tVar;
        legoUserRep.getClass();
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        rl1.g gVar = legoUserRep.f52350j;
        int i13 = eo1.b.color_themed_base_red_300;
        List list = rl1.n.f108641a;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        legoUserRep.H0(rl1.g.a(gVar, 0, imageUrl, null, m0.a(gVar.f108579f, z13, 0, 0, 0, i13, 1022), rl1.n.g(gVar, name), null, 3997));
    }

    static /* synthetic */ void i4(t tVar, String str, int i13, Integer num, int i14) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        if ((i14 & 4) != 0) {
            num = null;
        }
        ((LegoUserRep) tVar).H1(str, i13, num, null);
    }

    default void j4(xr0.b provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
