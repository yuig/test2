package ke2;

import df.b0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public boolean f79310b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f79311c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f79312d;

    /* renamed from: g, reason: collision with root package name */
    public id2.c f79315g;

    /* renamed from: h, reason: collision with root package name */
    public d f79316h;

    /* renamed from: i, reason: collision with root package name */
    public final gd2.c f79317i;

    /* renamed from: j, reason: collision with root package name */
    public g01.a f79318j;

    /* renamed from: a, reason: collision with root package name */
    public boolean f79309a = true;

    /* renamed from: e, reason: collision with root package name */
    public b0 f79313e = new b0("", "");

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArrayList f79314f = new CopyOnWriteArrayList();

    public c() {
        id2.c.Companion.getClass();
        this.f79315g = id2.b.a(-1);
        this.f79317i = new gd2.c(null, new nd2.a(this, 12), 3);
    }

    public final d a(Function1 predicate) {
        Object obj;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator it = this.f79314f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                break;
            }
        }
        return (d) obj;
    }

    public final void b(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Iterator it = this.f79314f.iterator();
        while (it.hasNext()) {
            block.invoke(it.next());
        }
    }
}
