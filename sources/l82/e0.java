package l82;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f82221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f82222b;

    public /* synthetic */ e0(ArrayList arrayList, h0 h0Var) {
        this.f82221a = arrayList;
        this.f82222b = h0Var;
    }

    @Override // l82.g0
    public final void i(e resultBuilder) {
        List events = this.f82221a;
        Intrinsics.checkNotNullParameter(events, "$events");
        h0 this$0 = this.f82222b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        Iterator it = events.iterator();
        while (it.hasNext()) {
            this$0.a((u50.s) it.next(), resultBuilder);
        }
    }
}
