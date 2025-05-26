package m91;

import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends l {
    public m(String userGender, String userCustomGender) {
        Intrinsics.checkNotNullParameter(userGender, "userGender");
        Intrinsics.checkNotNullParameter(userCustomGender, "userCustomGender");
        h hVar = new h(f0.l(new f(Intrinsics.d(userGender, "male"), 5), new f(Intrinsics.d(userGender, "female"), 4), new f(Intrinsics.d(userGender, "unspecified"), 3)));
        i iVar = new i(userCustomGender, 1);
        iVar.f86740c = Intrinsics.d(userGender, "unspecified");
        Unit unit = Unit.f80348a;
        k(f0.j(hVar, iVar));
    }
}
