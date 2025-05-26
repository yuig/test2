package tm0;

import com.pinterest.api.model.v7;
import java.util.ArrayList;
import k92.m;
import k92.n;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import qm0.m1;
import u50.f0;
import u50.k0;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f118129a;

    static {
        int i13 = x0.generic_error;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        f118129a = new k0(i13, new ArrayList(0));
    }

    public static m1 a(v7 board, boolean z13) {
        lr.a aVar;
        Intrinsics.checkNotNullParameter(board, "board");
        String j13 = board.j1();
        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
        String b13 = board.b1();
        if (z13) {
            int i13 = y60.e.archived_toast;
            String[] formatArgs = {j13};
            Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new f0(formatArgs[0]));
            aVar = new lr.a(new k0(i13, arrayList), b13);
        } else {
            int i14 = y60.e.unarchived_toast;
            String[] formatArgs2 = {j13};
            Intrinsics.checkNotNullParameter(formatArgs2, "formatArgs");
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new f0(formatArgs2[0]));
            aVar = new lr.a(new k0(i14, arrayList2), b13);
        }
        return new m1(new m(aVar, null));
    }

    public static m1 b() {
        k0 message = f118129a;
        Intrinsics.checkNotNullParameter(message, "message");
        return new m1(new n(new k92.c(message, null, do1.n.ERROR, false, 94), null));
    }
}
