package androidx.work;

import ja.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kb.l;
import kb.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Lkb/t;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends t {
    @Override // kb.t
    public final l a(ArrayList inputs) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        c0 c0Var = new c0(1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = inputs.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(((l) it.next()).f());
        }
        c0Var.e(linkedHashMap);
        return c0Var.b();
    }
}
