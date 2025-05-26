package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class c20 implements nm.j0 {
    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        if (d20.class.isAssignableFrom(typeToken.f33846a)) {
            return new b20(oVar);
        }
        return null;
    }
}
