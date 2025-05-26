package androidx.appcompat.app;

import a.cb;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class r0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f16115a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16116b;

    /* renamed from: c, reason: collision with root package name */
    public Method f16117c;

    /* renamed from: d, reason: collision with root package name */
    public Context f16118d;

    public r0(View view, String str) {
        this.f16115a = view;
        this.f16116b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        kg.n.a(view);
        if (this.f16117c == null) {
            View view2 = this.f16115a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f16116b;
                if (context == null) {
                    int id3 = view2.getId();
                    if (id3 == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id3) + "'";
                    }
                    StringBuilder o13 = cb.o("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    o13.append(view2.getClass());
                    o13.append(str);
                    throw new IllegalStateException(o13.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f16117c = method;
                        this.f16118d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f16117c.invoke(this.f16118d, view);
        } catch (IllegalAccessException e13) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e13);
        } catch (InvocationTargetException e14) {
            throw new IllegalStateException("Could not execute method for android:onClick", e14);
        }
    }
}
