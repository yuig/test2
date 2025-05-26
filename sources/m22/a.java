package m22;

import a.cb;
import ck2.i;
import jk2.h0;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import uk2.f;
import x02.a2;
import x02.w;
import x02.x;
import x02.y;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f85712a = cb.r("create(...)");

    public static void a(y yVar, String userUid) {
        a2 onNextConsumer = i.f27924d;
        Intrinsics.checkNotNullExpressionValue(onNextConsumer, "emptyConsumer(...)");
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(userUid, "userUid");
        Intrinsics.checkNotNullParameter(onNextConsumer, "onNextConsumer");
        if (userUid.length() == 0) {
            return;
        }
        yVar.e(new w(2, userUid)).E(onNextConsumer, onNextConsumer);
    }

    public static void b(y yVar, String pinId) {
        a2 onNextConsumer = i.f27924d;
        Intrinsics.checkNotNullExpressionValue(onNextConsumer, "emptyConsumer(...)");
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(onNextConsumer, "onNextConsumer");
        if (pinId.length() == 0) {
            return;
        }
        w wVar = new w(3, pinId);
        wVar.f55252b = 100000L;
        yVar.e(wVar).E(onNextConsumer, onNextConsumer);
    }

    public static void c(y yVar, String pinId) {
        a2 onNextConsumer = i.f27924d;
        Intrinsics.checkNotNullExpressionValue(onNextConsumer, "emptyConsumer(...)");
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(onNextConsumer, "onNextConsumer");
        if (pinId.length() == 0) {
            return;
        }
        w wVar = new w(4, pinId, null, x.ALL_BOARDS_FILTER, false, null, false);
        wVar.f55252b = 100000L;
        yVar.e(wVar).E(onNextConsumer, onNextConsumer);
    }

    public static final q d(y yVar, String userId, boolean z13) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        w wVar = new w(userId, x.ALL_BOARDS_FILTER, z13);
        wVar.f55252b = 100000L;
        return yVar.e(wVar);
    }

    public static final q e(y yVar, String uid, boolean z13) {
        Intrinsics.checkNotNullParameter(yVar, "<this>");
        Intrinsics.checkNotNullParameter(uid, "uid");
        if (uid.length() == 0) {
            h0 h0Var = h0.f76488a;
            Intrinsics.checkNotNullExpressionValue(h0Var, "empty(...)");
            return h0Var;
        }
        w wVar = new w(uid, 7, "last_pinned_to", false);
        wVar.f55251a = !z13;
        return yVar.e(wVar);
    }
}
