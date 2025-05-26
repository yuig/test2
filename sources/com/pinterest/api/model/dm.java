package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class dm implements nm.j0 {
    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        if (em.class.isAssignableFrom(typeToken.f33846a)) {
            return new cm(oVar);
        }
        return null;
    }
}
