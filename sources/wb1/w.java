package wb1;

import com.pinterest.api.model.qv;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class w {
    public static int a(qv.a groupName) {
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        int i13 = v.f129060a[groupName.ordinal()];
        if (i13 == 1) {
            return c52.e.friend_title;
        }
        if (i13 == 2) {
            return c52.e.follower_title;
        }
        if (i13 == 3) {
            return c52.e.followees_title;
        }
        if (i13 == 4) {
            return c52.e.contact_title;
        }
        if (i13 == 5) {
            return c52.e.other_title_2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
