package bb;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class c implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f22445c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f22446a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22447b;

    public c(String str, String str2) {
        this.f22446a = str;
        this.f22447b = str2;
        f22445c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f22443a;
        String str = this.f22447b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if ("eng".equals(str2) || "userdebug".equals(str2)) {
                if (hashSet.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }
}
