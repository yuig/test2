package sl;

import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f113120a = null;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f113121b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f113122c;

    /* renamed from: d, reason: collision with root package name */
    public int f113123d;

    /* renamed from: e, reason: collision with root package name */
    public int f113124e;

    /* renamed from: f, reason: collision with root package name */
    public e f113125f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f113126g;

    public a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f113121b = hashSet;
        this.f113122c = new HashSet();
        this.f113123d = 0;
        this.f113124e = 0;
        this.f113126g = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            dl2.b.H(cls2, "Null interface");
            this.f113121b.add(q.a(cls2));
        }
    }

    public final void a(k kVar) {
        if (!(!this.f113121b.contains(kVar.f113150a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f113122c.add(kVar);
    }

    public final b b() {
        if (this.f113125f != null) {
            return new b(this.f113120a, new HashSet(this.f113121b), new HashSet(this.f113122c), this.f113123d, this.f113124e, this.f113125f, this.f113126g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public a(q qVar, q[] qVarArr) {
        HashSet hashSet = new HashSet();
        this.f113121b = hashSet;
        this.f113122c = new HashSet();
        this.f113123d = 0;
        this.f113124e = 0;
        this.f113126g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            dl2.b.H(qVar2, "Null interface");
        }
        Collections.addAll(this.f113121b, qVarArr);
    }
}
