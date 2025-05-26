package qm;

import com.google.gson.reflect.TypeToken;

/* loaded from: classes.dex */
public final class d1 implements nm.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104145a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f104146b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Class f104147c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nm.i0 f104148d;

    public /* synthetic */ d1(Class cls, Class cls2, nm.i0 i0Var, int i13) {
        this.f104145a = i13;
        this.f104146b = cls;
        this.f104147c = cls2;
        this.f104148d = i0Var;
    }

    @Override // nm.j0
    public final nm.i0 a(nm.o oVar, TypeToken typeToken) {
        int i13 = this.f104145a;
        nm.i0 i0Var = this.f104148d;
        Class cls = this.f104147c;
        Class cls2 = this.f104146b;
        switch (i13) {
            case 0:
                Class cls3 = typeToken.f33846a;
                if (cls3 != cls2 && cls3 != cls) {
                    break;
                }
                break;
            default:
                Class cls4 = typeToken.f33846a;
                if (cls4 != cls2 && cls4 != cls) {
                    break;
                }
                break;
        }
        return null;
    }

    public final String toString() {
        int i13 = this.f104145a;
        nm.i0 i0Var = this.f104148d;
        Class cls = this.f104147c;
        Class cls2 = this.f104146b;
        switch (i13) {
            case 0:
                return "Factory[type=" + cls.getName() + "+" + cls2.getName() + ",adapter=" + i0Var + "]";
            default:
                return "Factory[type=" + cls2.getName() + "+" + cls.getName() + ",adapter=" + i0Var + "]";
        }
    }
}
