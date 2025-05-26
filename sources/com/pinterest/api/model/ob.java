package com.pinterest.api.model;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class ob implements nm.j0 {
    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        if (pb.class.isAssignableFrom(typeToken.f33846a)) {
            return new nb(oVar);
        }
        return null;
    }
}
