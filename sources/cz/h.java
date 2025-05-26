package cz;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public List f53470a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f53471b = new LinkedHashMap();

    public final void a(String str) {
        LinkedHashMap linkedHashMap = this.f53471b;
        Set keySet = linkedHashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        List F0 = CollectionsKt.F0(keySet);
        Iterator it = F0.subList(F0.indexOf(str), F0.size()).iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((String) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0100, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x013b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0100 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r13, cz.b r14, java.util.HashMap r15) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cz.h.b(java.lang.String, cz.b, java.util.HashMap):void");
    }
}
