package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class su implements nm.j0 {
    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        if (tu.class.isAssignableFrom(typeToken.f33846a)) {
            return new ru(oVar);
        }
        return null;
    }
}
