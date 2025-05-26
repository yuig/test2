package com.google.common.util.concurrent;

import java.util.Set;
import kh2.c3;

/* loaded from: classes3.dex */
public final class k extends c3 {
    @Override // kh2.c3
    public final void r(i iVar, Set set) {
        Set set2;
        synchronized (iVar) {
            set2 = ((l) iVar).seenExceptions;
            if (set2 == null) {
                ((l) iVar).seenExceptions = set;
            }
        }
    }

    @Override // kh2.c3
    public final int u(l lVar) {
        int B;
        synchronized (lVar) {
            B = l.B(lVar);
        }
        return B;
    }
}
