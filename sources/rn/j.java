package rn;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f108816b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final j f108817c = new j("profile");

    /* renamed from: d, reason: collision with root package name */
    public static final j f108818d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f108819e;

    /* renamed from: a, reason: collision with root package name */
    public final String f108820a;

    static {
        new j("friends");
        new j("groups");
        new j("message.write");
        f108818d = new j("openid");
        f108819e = new j("email");
        new j("phone");
        new j("gender");
        new j("birthdate");
        new j("address");
        new j("real_name");
        new j("onetime.share");
        new j("openchat.term.agreement.status");
        new j("openchat.create.join");
        new j("openchat.info");
        new j("openchatplug.managament");
        new j("openchatplug.info");
        new j("openchatplug.profile");
        new j("openchatplug.send.message");
        new j("openchatplug.receive.message.and.event");
    }

    public j(String str) {
        this.f108820a = str;
        f108816b.put(str, this);
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((j) it.next()).f108820a);
        }
        return arrayList;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            j jVar = (j) f108816b.get(str);
            if (jVar != null) {
                arrayList.add(jVar);
            } else {
                arrayList.add(new j(str));
            }
        }
        return arrayList;
    }

    public static List c(String str) {
        return TextUtils.isEmpty(str) ? Collections.emptyList() : b(Arrays.asList(str.split(" ")));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f108820a.equals(((j) obj).f108820a);
    }

    public final int hashCode() {
        return this.f108820a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Scope{code='"), this.f108820a, "'}");
    }
}
