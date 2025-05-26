package com.google.android.gms.internal.recaptcha;

/* loaded from: classes3.dex */
public abstract class m implements Cloneable {
    public final /* synthetic */ z a(r0 r0Var) {
        z zVar = (z) this;
        if (!zVar.f31811a.getClass().isInstance(r0Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        zVar.b((b0) ((l) r0Var));
        return zVar;
    }
}
