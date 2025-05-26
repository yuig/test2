package jh;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Account f76144a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f76145b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f76146c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f76147d;

    /* renamed from: e, reason: collision with root package name */
    public final String f76148e;

    /* renamed from: f, reason: collision with root package name */
    public final String f76149f;

    /* renamed from: g, reason: collision with root package name */
    public final ri.a f76150g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f76151h;

    public g(Account account, g1.h hVar, String str, String str2, ri.a aVar) {
        this.f76144a = account;
        Set emptySet = hVar == null ? Collections.emptySet() : Collections.unmodifiableSet(hVar);
        this.f76145b = emptySet;
        Map emptyMap = Collections.emptyMap();
        this.f76147d = emptyMap;
        this.f76148e = str;
        this.f76149f = str2;
        this.f76150g = aVar == null ? ri.a.f108359a : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator it = emptyMap.values().iterator();
        if (it.hasNext()) {
            ep.b.A(it.next());
            throw null;
        }
        this.f76146c = Collections.unmodifiableSet(hashSet);
    }
}
