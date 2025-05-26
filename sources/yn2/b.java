package yn2;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.k1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends kotlin.collections.d {

    /* renamed from: c, reason: collision with root package name */
    public final Iterator f139534c;

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f139535d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f139536e;

    public b(Iterator source, Function1 keySelector) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(keySelector, "keySelector");
        this.f139534c = source;
        this.f139535d = keySelector;
        this.f139536e = new HashSet();
    }

    @Override // kotlin.collections.d
    public final void b() {
        Object next;
        do {
            Iterator it = this.f139534c;
            if (!it.hasNext()) {
                this.f80357a = k1.Done;
                return;
            } else {
                next = it.next();
            }
        } while (!this.f139536e.add(this.f139535d.invoke(next)));
        this.f80358b = next;
        this.f80357a = k1.Ready;
    }
}
