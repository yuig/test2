package sp2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f114943a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f114944b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f114945c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final StringBuilder f114946d = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);

    /* renamed from: e, reason: collision with root package name */
    public Class f114947e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f114948f;

    public final boolean a(Class cls, Method method) {
        StringBuilder sb3 = this.f114946d;
        sb3.setLength(0);
        sb3.append(method.getName());
        sb3.append('>');
        sb3.append(cls.getName());
        String sb4 = sb3.toString();
        Class<?> declaringClass = method.getDeclaringClass();
        HashMap hashMap = this.f114945c;
        Class cls2 = (Class) hashMap.put(sb4, declaringClass);
        if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
            return true;
        }
        hashMap.put(sb4, cls2);
        return false;
    }

    public final void b() {
        if (this.f114948f) {
            this.f114947e = null;
            return;
        }
        Class superclass = this.f114947e.getSuperclass();
        this.f114947e = superclass;
        String name = superclass.getName();
        if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
            this.f114947e = null;
        }
    }
}
