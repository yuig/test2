package xa0;

import android.content.Context;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.qp;
import com.pinterest.api.model.uo;
import java.util.Date;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rq.t0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a */
    public final /* synthetic */ int f134407a;

    public /* synthetic */ j(int i13) {
        this.f134407a = i13;
    }

    public static yb0.n a(Context context, String title, CharSequence charSequence, String confirmButtonText, String cancelButtonText, Function0 confirmButtonAction, Function0 cancelButtonAction, Function0 alertDisplayedListener, Function1 alertDismissedListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(confirmButtonText, "confirmButtonText");
        Intrinsics.checkNotNullParameter(cancelButtonText, "cancelButtonText");
        Intrinsics.checkNotNullParameter(confirmButtonAction, "confirmButtonAction");
        Intrinsics.checkNotNullParameter(cancelButtonAction, "cancelButtonAction");
        Intrinsics.checkNotNullParameter(alertDisplayedListener, "alertDisplayedListener");
        Intrinsics.checkNotNullParameter(alertDismissedListener, "alertDismissedListener");
        yb0.n nVar = new yb0.n(context);
        nVar.w(title);
        nVar.u(charSequence);
        nVar.q(confirmButtonText);
        nVar.m(cancelButtonText);
        nVar.f138513j = new t0(5, confirmButtonAction);
        nVar.f138514k = new t0(6, cancelButtonAction);
        nVar.f138515l = alertDisplayedListener;
        nVar.f138516m = alertDismissedListener;
        return nVar;
    }

    public static String e(cw0.e contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return contentType.getKey();
    }

    public static int f(cw0.c fontType) {
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        return fontType.getKey();
    }

    public static cw0.c g(int i13) {
        Map map;
        cw0.c.Companion.getClass();
        try {
            map = cw0.c.map;
            return (cw0.c) z0.e(Integer.valueOf(i13), map);
        } catch (NoSuchElementException unused) {
            return cw0.c.UNKNOWN;
        }
    }

    public static String h(ex0.c networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        return networkType.getKey();
    }

    public static uo i(yd0.b data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new uo(data.f138772a, data.f138773b, data.f138774c, data.f138775d, data.f138776e, data.f138777f, data.f138778g, data.f138779h);
    }

    public static ln0 j(yd0.a draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        String str = draft.f138752a;
        Boolean bool = null;
        byte b13 = 0;
        String str2 = draft.f138768q;
        return new ln0(str, draft.f138754c, draft.f138755d, draft.f138756e, null, draft.f138757f, draft.f138758g, null, draft.f138759h, draft.f138760i, (str2 == null || str2.length() == 0) ? null : new qp(str2, bool, 2, b13 == true ? 1 : 0), draft.f138769r, draft.f138771t, draft.f138761j, 16, null);
    }

    public static ex0.c k(String key) {
        Map map;
        Intrinsics.checkNotNullParameter(key, "key");
        ex0.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            map = ex0.c.map;
            return (ex0.c) z0.e(key, map);
        } catch (NoSuchElementException unused) {
            return ex0.c.NONE;
        }
    }

    public static ex0.e l(String key) {
        Map map;
        Intrinsics.checkNotNullParameter(key, "key");
        ex0.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            map = ex0.e.map;
            return (ex0.e) z0.e(key, map);
        } catch (NoSuchElementException unused) {
            return ex0.e.UNKNOWN;
        }
    }

    public static ex0.g m(String key) {
        Map map;
        Intrinsics.checkNotNullParameter(key, "key");
        ex0.g.Companion.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            map = ex0.g.map;
            return (ex0.g) z0.e(key, map);
        } catch (NoSuchElementException unused) {
            return ex0.g.UNKNOWN;
        }
    }

    public static k n(l tab, boolean z13) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        int i13 = i.f134406a[tab.ordinal()];
        if (i13 == 1) {
            return new k(true, true, false, z13, 52);
        }
        if (i13 == 2) {
            return new k(false, false, true, z13, 49);
        }
        if (i13 == 3) {
            return new k(false, true, false, z13, 49);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String o(ex0.g uploadStatus) {
        Intrinsics.checkNotNullParameter(uploadStatus, "uploadStatus");
        return uploadStatus.getKey();
    }

    public static pb0.h p(Date before) {
        pb0.i iVar;
        Intrinsics.checkNotNullParameter(before, "date");
        Date after = new Date();
        Intrinsics.checkNotNullParameter(before, "before");
        Intrinsics.checkNotNullParameter(after, "after");
        long max = Math.max(0L, after.getTime() - before.getTime());
        pb0.i[] values = pb0.i.values();
        int length = values.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = i13 + 1;
            if (i14 == values.length || max < values[i14].getMilliseconds()) {
                iVar = values[i13];
                break;
            }
            i13 = i14;
        }
        iVar = null;
        Intrinsics.f(iVar);
        return new pb0.h(iVar, (int) (max / iVar.getMilliseconds()));
    }

    public final rl1.g c(Context context) {
        switch (this.f134407a) {
            case 6:
                Intrinsics.checkNotNullParameter(context, "context");
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                break;
        }
        return rl1.n.f(context);
    }

    public final rl1.g d(Context context) {
        switch (this.f134407a) {
            case 6:
                Intrinsics.checkNotNullParameter(context, "context");
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                break;
        }
        return rl1.n.e(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i13, int i14) {
        this(0);
        this.f134407a = i13;
        switch (i13) {
            case 1:
                this(1);
                break;
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
                this(5);
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            default:
                switch (i13) {
                    case 23:
                        this(23);
                        break;
                    case 24:
                        this(24);
                        break;
                    case 25:
                        this(25);
                        break;
                    case 26:
                        this(26);
                        break;
                    case 27:
                        this(27);
                        break;
                    case 28:
                        this(28);
                        break;
                    case 29:
                        this(29);
                        break;
                    default:
                        break;
                }
        }
    }
}
