package com.pinterest.api.model;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class ob0 {

    /* renamed from: a */
    public final t20 f40665a;

    /* renamed from: b */
    public final v7 f40666b;

    /* renamed from: c */
    public final f30 f40667c;

    public /* synthetic */ ob0(int i13) {
        this();
    }

    public final Object a(ug ugVar) {
        t20 t20Var = this.f40665a;
        if (t20Var != null) {
            return ugVar.b(t20Var);
        }
        v7 v7Var = this.f40666b;
        if (v7Var != null) {
            return ugVar.a(v7Var);
        }
        f30 f30Var = this.f40667c;
        if (f30Var != null) {
            return ugVar.c(f30Var);
        }
        return null;
    }

    private ob0() {
    }

    public ob0(@NonNull t20 t20Var) {
        this.f40665a = t20Var;
    }

    public ob0(@NonNull v7 v7Var) {
        this.f40666b = v7Var;
    }

    public ob0(@NonNull f30 f30Var) {
        this.f40667c = f30Var;
    }
}
