package jf1;

import ck2.i;
import il1.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;

/* loaded from: classes5.dex */
public final class a extends jr.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b screenFactory) {
        super(screenFactory);
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
    }

    public final q H() {
        ArrayList t13 = t();
        Intrinsics.checkNotNullExpressionValue(t13, "<get-fragments>(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = t13.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof ff1.a) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((if1.b) ((ff1.a) it2.next())).f72231l1);
        }
        q t14 = q.w(CollectionsKt.F0(arrayList2)).t(i.f27921a);
        Intrinsics.checkNotNullExpressionValue(t14, "merge(...)");
        return t14;
    }

    @Override // jr.a
    public final boolean q() {
        return true;
    }
}
