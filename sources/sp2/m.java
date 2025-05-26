package sp2;

import java.lang.reflect.Method;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Method f114937a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadMode f114938b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f114939c;

    /* renamed from: d, reason: collision with root package name */
    public final int f114940d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f114941e;

    /* renamed from: f, reason: collision with root package name */
    public String f114942f;

    public m(Method method, Class cls, ThreadMode threadMode, int i13, boolean z13) {
        this.f114937a = method;
        this.f114938b = threadMode;
        this.f114939c = cls;
        this.f114940d = i13;
        this.f114941e = z13;
    }

    public final synchronized void a() {
        if (this.f114942f == null) {
            StringBuilder sb3 = new StringBuilder(64);
            sb3.append(this.f114937a.getDeclaringClass().getName());
            sb3.append('#');
            sb3.append(this.f114937a.getName());
            sb3.append('(');
            sb3.append(this.f114939c.getName());
            this.f114942f = sb3.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        a();
        m mVar = (m) obj;
        mVar.a();
        return this.f114942f.equals(mVar.f114942f);
    }

    public final int hashCode() {
        return this.f114937a.hashCode();
    }
}
