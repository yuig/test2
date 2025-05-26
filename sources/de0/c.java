package de0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import xa0.j;

/* loaded from: classes5.dex */
public final class c extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final c f54553j = new c(0);

    /* renamed from: k, reason: collision with root package name */
    public static final c f54554k = new c(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54555i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i13) {
        super(1);
        this.f54555i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f54555i) {
            case 0:
                yd0.a entity = (yd0.a) obj;
                Intrinsics.checkNotNullParameter(entity, "entity");
                return j.j(entity);
            default:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List list = it;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(j.j((yd0.a) it2.next()));
                }
                return arrayList;
        }
    }
}
