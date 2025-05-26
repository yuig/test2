package qm;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class a1 implements nm.j0 {
    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        Class cls = typeToken.f33846a;
        if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
            return null;
        }
        if (!cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        return new f0(cls);
    }
}
