package oe2;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
public abstract class n extends r {

    /* renamed from: b, reason: collision with root package name */
    public static final f f94369b = new f(2);

    /* renamed from: a, reason: collision with root package name */
    public final r f94370a;

    public n(r rVar) {
        this.f94370a = rVar;
    }

    public final AbstractCollection e(v vVar) {
        AbstractCollection arrayList;
        switch (((m) this).f94362c) {
            case 0:
                arrayList = new ArrayList();
                break;
            default:
                arrayList = new LinkedHashSet();
                break;
        }
        vVar.a();
        while (vVar.hasNext()) {
            arrayList.add(this.f94370a.a(vVar));
        }
        vVar.d();
        return arrayList;
    }

    public final String toString() {
        return this.f94370a + ".collection()";
    }
}
