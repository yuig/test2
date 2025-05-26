package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class bl implements nm.j0 {
    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        if (cl.class.isAssignableFrom(typeToken.f33846a)) {
            return new al(oVar);
        }
        return null;
    }
}
