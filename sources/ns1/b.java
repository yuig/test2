package ns1;

import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f91976a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f91977b = new LinkedList();

    public final void a(View rootView, String invokerTag) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(invokerTag, "invokerTag");
        Iterator it = this.f91977b.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).d(rootView, invokerTag)) {
                it.remove();
            }
        }
    }
}
