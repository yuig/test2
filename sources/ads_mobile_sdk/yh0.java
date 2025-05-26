package ads_mobile_sdk;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class yh0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f14245b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f14246a = new ArrayList();

    public final void a(View view, xh0 xh0Var, String str) {
        wh0 wh0Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f14245b.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.f14246a.iterator();
        while (true) {
            if (!it.hasNext()) {
                wh0Var = null;
                break;
            } else {
                wh0Var = (wh0) it.next();
                if (wh0Var.f13039a.get() == view) {
                    break;
                }
            }
        }
        if (wh0Var == null) {
            this.f14246a.add(new wh0(view, xh0Var, str));
        }
    }
}
