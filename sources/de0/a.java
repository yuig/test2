package de0;

import ja.f0;
import ja.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import xa0.j;
import xd0.f;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54548i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f54549j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar, int i13) {
        super(1);
        this.f54548i = i13;
        this.f54549j = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f54548i;
        d dVar = this.f54549j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter((Boolean) obj, "it");
                f fVar = dVar.f54556a;
                fVar.getClass();
                return j0.b(new xd0.c(fVar, f0.d(0, "SELECT count(*) FROM idea_pin_drafts"), 2));
            default:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                dVar.getClass();
                List list = it;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(j.i((yd0.b) it2.next()));
                }
                return arrayList;
        }
    }
}
