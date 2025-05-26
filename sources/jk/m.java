package jk;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f76350a;

    public m(Context context) {
        this.f76350a = context;
    }

    public final Set a() {
        Set<String> hashSet;
        synchronized (m.class) {
            try {
                hashSet = this.f76350a.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }
}
