package eh;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f58904b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f58905c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f58906d;

    /* renamed from: e, reason: collision with root package name */
    public String f58907e;

    /* renamed from: f, reason: collision with root package name */
    public Account f58908f;

    /* renamed from: g, reason: collision with root package name */
    public String f58909g;

    /* renamed from: i, reason: collision with root package name */
    public String f58911i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f58903a = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public HashMap f58910h = new HashMap();

    public final GoogleSignInOptions a() {
        Scope scope = GoogleSignInOptions.f30701t;
        HashSet hashSet = this.f58903a;
        if (hashSet.contains(scope)) {
            Scope scope2 = GoogleSignInOptions.f30700s;
            if (hashSet.contains(scope2)) {
                hashSet.remove(scope2);
            }
        }
        if (this.f58906d && (this.f58908f == null || !hashSet.isEmpty())) {
            this.f58903a.add(GoogleSignInOptions.f30699r);
        }
        return new GoogleSignInOptions(3, new ArrayList(hashSet), this.f58908f, this.f58906d, this.f58904b, this.f58905c, this.f58907e, this.f58909g, this.f58910h, this.f58911i);
    }
}
