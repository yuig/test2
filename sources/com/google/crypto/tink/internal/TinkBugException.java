package com.google.crypto.tink.internal;

import el.b1;

/* loaded from: classes.dex */
public final class TinkBugException extends RuntimeException {
    public static Object a(b1 b1Var) {
        try {
            return b1Var.get();
        } catch (Exception e13) {
            throw new TinkBugException(e13);
        }
    }
}
