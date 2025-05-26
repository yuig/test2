package m;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class j implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f85203c = {MenuItem.class};

    /* renamed from: a, reason: collision with root package name */
    public Object f85204a;

    /* renamed from: b, reason: collision with root package name */
    public Method f85205b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f85205b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f85204a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e13) {
            throw new RuntimeException(e13);
        }
    }
}
