package kc1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f79143j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f79144k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f79145l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f79146m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f79147n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f79148o = new d(5);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79149i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f79149i = i13;
    }

    public final n b(n it) {
        switch (this.f79149i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return n.e(it, null, 0, Boolean.TRUE, null, 11);
            default:
                Intrinsics.checkNotNullParameter(it, "priorDisplayState");
                return n.e(it, null, j52.c.remove_pronouns_to_edit_message, null, null, 13);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f79149i) {
            case 0:
                return b((n) obj);
            case 1:
                n it = (n) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(!it.f79169d.f93524a.isEmpty());
            case 2:
                return b((n) obj);
            case 3:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                ArrayList arrayList = new ArrayList(g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new b(new ic1.y((String) it2.next()), 2));
                }
                return arrayList;
            case 4:
                yl1.b buttonState = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(buttonState, "buttonState");
                return yl1.b.f(buttonState, bs1.c.j2(new String[0], x0.done), false, null, null, null, null, null, null, 0, null, 1020);
            default:
                Intrinsics.checkNotNullParameter((gm1.c) obj, "it");
                return o.f79170a;
        }
    }
}
