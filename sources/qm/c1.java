package qm;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class c1 implements nm.j0 {

    /* renamed from: a */
    public final /* synthetic */ int f104135a;

    /* renamed from: b */
    public final /* synthetic */ Object f104136b;

    /* renamed from: c */
    public final /* synthetic */ nm.i0 f104137c;

    public /* synthetic */ c1(Object obj, nm.i0 i0Var, int i13) {
        this.f104135a = i13;
        this.f104136b = obj;
        this.f104137c = i0Var;
    }

    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        int i13 = this.f104135a;
        nm.i0 i0Var = this.f104137c;
        Object obj = this.f104136b;
        switch (i13) {
            case 0:
                if (typeToken.f33846a == ((Class) obj)) {
                    return i0Var;
                }
                return null;
            case 1:
                Class<?> cls = typeToken.f33846a;
                if (((Class) obj).isAssignableFrom(cls)) {
                    return new c(this, cls);
                }
                return null;
            default:
                if (typeToken.equals((TypeToken) obj)) {
                    return i0Var;
                }
                return null;
        }
    }

    public final String toString() {
        int i13 = this.f104135a;
        nm.i0 i0Var = this.f104137c;
        Object obj = this.f104136b;
        switch (i13) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + i0Var + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + i0Var + "]";
            default:
                return super.toString();
        }
    }
}
