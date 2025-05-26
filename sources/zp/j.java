package zp;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import so.s8;

/* loaded from: classes3.dex */
public final class j implements ou1.h {

    /* renamed from: a, reason: collision with root package name */
    public final lu1.d f142432a;

    public j(lu1.d activityIntentFactory) {
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        this.f142432a = activityIntentFactory;
    }

    public static boolean a(pw0.x type) {
        Intrinsics.checkNotNullParameter(type, "type");
        int i13 = g.f142406a[type.ordinal()];
        return i13 == 1 || i13 == 2;
    }

    public static void b(j jVar, Context context, pw0.x type, int i13, Bundle bundle, String str, nx.d0 d0Var, int i14) {
        int i15 = (i14 & 4) != 0 ? -1 : i13;
        Bundle bundle2 = (i14 & 16) != 0 ? null : bundle;
        rw0.a transitionType = rw0.a.DEFAULT;
        String str2 = (i14 & 64) != 0 ? null : str;
        nx.d0 d0Var2 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : d0Var;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(transitionType, "transitionType");
        if (bs1.c.c1(context)) {
            Activity k03 = bs1.c.k0(context);
            if (k03 instanceof cp1.p) {
                ((s8) ((cp1.p) k03).getBaseActivityComponent()).A5().c(k03, ny1.f.f92666f, (r23 & 4) != 0 ? "" : null, null, (r23 & 16) != 0 ? ny1.o.f92679j : null, ny1.q.f92690k, ny1.t.f92699j, (r23 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? ny1.t.f92700k : null, (r23 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? ny1.t.f92701l : null, (r23 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? ny1.t.f92702m : null, (r23 & 1024) != 0 ? ny1.t.f92703n : new i(k03, transitionType, jVar, type, d0Var2, context, i15, null, bundle2, str2, 0));
            }
        }
    }
}
