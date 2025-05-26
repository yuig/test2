package sl;

import com.google.firebase.messaging.a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f113127a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f113128b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f113129c;

    /* renamed from: d, reason: collision with root package name */
    public final int f113130d;

    /* renamed from: e, reason: collision with root package name */
    public final int f113131e;

    /* renamed from: f, reason: collision with root package name */
    public final e f113132f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f113133g;

    public b(String str, Set set, Set set2, int i13, int i14, e eVar, Set set3) {
        this.f113127a = str;
        this.f113128b = Collections.unmodifiableSet(set);
        this.f113129c = Collections.unmodifiableSet(set2);
        this.f113130d = i13;
        this.f113131e = i14;
        this.f113132f = eVar;
        this.f113133g = Collections.unmodifiableSet(set3);
    }

    public static a a(Class cls) {
        return new a(cls, new Class[0]);
    }

    public static a b(q qVar) {
        return new a(qVar, new q[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            dl2.b.H(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a0(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f113128b.toArray()) + ">{" + this.f113130d + ", type=" + this.f113131e + ", deps=" + Arrays.toString(this.f113129c.toArray()) + "}";
    }
}
