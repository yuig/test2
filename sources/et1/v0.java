package et1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v0 implements c {

    /* renamed from: a, reason: collision with root package name */
    public final d f60109a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f60110b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f60111c;

    public v0(d pipeline) {
        Intrinsics.checkNotNullParameter(pipeline, "pipeline");
        this.f60109a = pipeline;
        this.f60110b = new LinkedHashMap();
        this.f60111c = new LinkedHashSet();
    }

    public final void a(Object node, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(node, "node");
        this.f60110b.put(node, name);
        if (node instanceof e) {
            this.f60111c.add(node);
        }
    }

    public final id1.a b() {
        return new id1.a(this, 1);
    }

    @Override // et1.e
    public final String d(Object obj) {
        Object obj2 = null;
        if (obj == null) {
            return null;
        }
        Object obj3 = this.f60110b.get(obj);
        if (obj3 == null) {
            Iterator it = this.f60111c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String d2 = ((e) it.next()).d(obj);
                if (d2 != null) {
                    obj2 = d2;
                    break;
                }
            }
        } else {
            obj2 = obj3;
        }
        return (String) obj2;
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        for (Map.Entry entry : this.f60110b.entrySet()) {
            callback.invoke((String) entry.getValue(), entry.getKey());
        }
    }
}
