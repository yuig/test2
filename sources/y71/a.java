package y71;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import x71.d;
import x71.e;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f138010i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d draftWithPageAndItems = (d) obj;
        Intrinsics.checkNotNullParameter(draftWithPageAndItems, "entity");
        Intrinsics.checkNotNullParameter(draftWithPageAndItems, "draftWithPageAndItems");
        String str = draftWithPageAndItems.f134120a.f134111a;
        e eVar = draftWithPageAndItems.f134121b;
        x71.c cVar = eVar.f134122a;
        String str2 = cVar.f134117a;
        List list = eVar.f134123b;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((x71.b) it.next()).f134115b);
        }
        return new z71.c(str, new z71.e(str2, cVar.f134119c, arrayList));
    }
}
