package zm2;

import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final c f142251a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f142252b;

    /* renamed from: c, reason: collision with root package name */
    public final c f142253c;

    /* renamed from: d, reason: collision with root package name */
    public final r f142254d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f142255e;

    public s(q qVar, Object obj, t tVar, r rVar, Class cls) {
        if (qVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (rVar.f142248c == q0.MESSAGE && tVar == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f142251a = qVar;
        this.f142252b = obj;
        this.f142253c = tVar;
        this.f142254d = rVar;
        if (!u.class.isAssignableFrom(cls)) {
            this.f142255e = null;
            return;
        }
        try {
            this.f142255e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e13) {
            String name = cls.getName();
            StringBuilder sb3 = new StringBuilder(name.length() + 52);
            sb3.append("Generated message class \"");
            sb3.append(name);
            sb3.append("\" missing method \"valueOf\".");
            throw new RuntimeException(sb3.toString(), e13);
        }
    }

    public final Object a(Object obj) {
        if (this.f142254d.f142248c.getJavaType() != r0.ENUM) {
            return obj;
        }
        return t.e(this.f142255e, (Integer) obj);
    }

    public final Object b(Object obj) {
        return this.f142254d.f142248c.getJavaType() == r0.ENUM ? Integer.valueOf(((u) obj).getNumber()) : obj;
    }
}
