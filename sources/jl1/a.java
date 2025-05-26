package jl1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.s;
import androidx.lifecycle.t1;
import bs1.c;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.framework.screens.h;
import com.pinterest.framework.screens.j;
import com.pinterest.framework.screens.m;
import com.pinterest.framework.screens.n;
import ea1.t0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import me.o;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljl1/a;", "Landroidx/fragment/app/Fragment;", "Lcom/pinterest/framework/screens/m;", "Lcom/pinterest/framework/screens/j;", "Lcom/pinterest/framework/screens/h;", "Lcom/pinterest/framework/screens/a;", "Landroidx/lifecycle/z;", "", "<init>", "()V", "framework-screens-fragments_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class a extends Fragment implements m, j, h, com.pinterest.framework.screens.a {

    /* renamed from: a, reason: collision with root package name */
    public ScreenDescription f76937a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f76939c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f76940d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f76941e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f76942f;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f76938b = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f76943g = true;

    public final void M6() {
        if (this.f76943g) {
            Intrinsics.checkNotNullParameter(this, "target");
            if (o.f87013j == null) {
                Method declaredMethod = Fragment.class.getDeclaredMethod("performDestroy", new Class[0]);
                o.f87013j = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            try {
                new t0(this, 16).invoke();
            } catch (Exception unused) {
            }
            Intrinsics.checkNotNullParameter(this, "target");
            if (o.f87014k == null) {
                Method declaredMethod2 = Fragment.class.getDeclaredMethod("performDetach", new Class[0]);
                o.f87014k = declaredMethod2;
                if (declaredMethod2 != null) {
                    declaredMethod2.setAccessible(true);
                }
            }
            try {
                new t0(this, 18).invoke();
            } catch (Exception unused2) {
            }
        }
    }

    public void N6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
    }

    public final Bundle O6() {
        Bundle bundle = new Bundle();
        onSaveInstanceState(bundle);
        return bundle;
    }

    public final void P6(String code, Bundle result) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f76938b.put(code, result);
    }

    public void activate() {
        ScreenDescription screenDescription = this.f76937a;
        if (screenDescription != null) {
            for (Map.Entry entry : screenDescription.getF49210f().entrySet()) {
                N6((String) entry.getKey(), (Bundle) entry.getValue());
            }
            screenDescription.getF49210f().clear();
        }
        if (this.f76943g) {
            Intrinsics.checkNotNullParameter(this, "target");
            if (o.f87008e == null) {
                Method declaredMethod = Fragment.class.getDeclaredMethod("performStart", new Class[0]);
                o.f87008e = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            try {
                new com.pinterest.framework.screens.o(this, 3).invoke();
            } catch (Exception unused) {
            }
            Intrinsics.checkNotNullParameter(this, "target");
            if (o.f87009f == null) {
                Method declaredMethod2 = Fragment.class.getDeclaredMethod("performResume", new Class[0]);
                o.f87009f = declaredMethod2;
                if (declaredMethod2 != null) {
                    declaredMethod2.setAccessible(true);
                }
            }
            try {
                new com.pinterest.framework.screens.o(this, 2).invoke();
            } catch (Exception unused2) {
            }
        }
        this.f76941e = true;
        View view = getView();
        Integer num = this.f76942f;
        if (view == null || num == null) {
            return;
        }
        view.setImportantForAccessibility(num.intValue());
    }

    public void deactivate() {
        View view = getView();
        int i13 = 4;
        if (view != null) {
            this.f76942f = Integer.valueOf(view.getImportantForAccessibility());
            view.setImportantForAccessibility(4);
        }
        if (this.f76943g) {
            Intrinsics.checkNotNullParameter(this, "target");
            int i14 = 1;
            if (o.f87010g == null) {
                Method declaredMethod = Fragment.class.getDeclaredMethod("performPause", new Class[0]);
                o.f87010g = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            try {
                new com.pinterest.framework.screens.o(this, i14).invoke();
            } catch (Exception unused) {
            }
            Intrinsics.checkNotNullParameter(this, "target");
            if (o.f87011h == null) {
                Method declaredMethod2 = Fragment.class.getDeclaredMethod("performStop", new Class[0]);
                o.f87011h = declaredMethod2;
                if (declaredMethod2 != null) {
                    declaredMethod2.setAccessible(true);
                }
            }
            try {
                new com.pinterest.framework.screens.o(this, i13).invoke();
            } catch (Exception unused2) {
            }
        }
        this.f76941e = false;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.z
    public s getLifecycle() {
        s lifecycle = super.getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
        return lifecycle;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.u1
    public final t1 getViewModelStore() {
        ScreenDescription screenDescription = this.f76937a;
        FragmentActivity E4 = E4();
        if (screenDescription != null && E4 != null) {
            return com.pinterest.framework.screens.s.f49224n.getViewModelStore(E4, screenDescription);
        }
        t1 viewModelStore = super.getViewModelStore();
        Intrinsics.f(viewModelStore);
        return viewModelStore;
    }

    public Map k2() {
        return this.f76938b;
    }

    @Override // com.pinterest.framework.screens.m
    public void unbind() {
        if (this.f76943g) {
            Intrinsics.checkNotNullParameter(this, "target");
            if (o.f87012i == null) {
                Method declaredMethod = Fragment.class.getDeclaredMethod("performDestroyView", new Class[0]);
                o.f87012i = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            try {
                new t0(this, 17).invoke();
            } catch (Exception unused) {
            }
        }
        this.f76939c = false;
    }

    @Override // com.pinterest.framework.screens.m
    public void x3(Context activity, ScreenDescription screenDescription, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(screenDescription, "screenDescription");
        this.f76937a = screenDescription;
        Activity k03 = c.k0(activity);
        int i13 = 1;
        if (this.f76943g) {
            Intrinsics.g(k03, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity activity2 = (FragmentActivity) k03;
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(activity2, "activity");
            Intrinsics.checkNotNullParameter(this, "fragment");
            Intrinsics.checkNotNullParameter(activity2, "activity");
            int i14 = 0;
            if (o.f87016m == null || o.f87017n == null) {
                Class<?>[] declaredClasses = FragmentActivity.class.getDeclaredClasses();
                Intrinsics.f(declaredClasses);
                for (Class<?> cls : declaredClasses) {
                    if (Intrinsics.d(cls.getSimpleName(), "HostCallbacks")) {
                        Constructor<?> constructor = cls.getConstructor(FragmentActivity.class);
                        o.f87017n = constructor;
                        if (constructor != null) {
                            constructor.setAccessible(true);
                        }
                        Field declaredField = Fragment.class.getDeclaredField("mHost");
                        o.f87016m = declaredField;
                        if (declaredField != null) {
                            declaredField.setAccessible(true);
                        }
                    }
                }
            }
            Field field = o.f87016m;
            if (field != null) {
                Constructor constructor2 = o.f87017n;
                field.set(this, constructor2 != null ? constructor2.newInstance(activity2) : null);
            }
            if (o.f87015l == null) {
                Field declaredField2 = Fragment.class.getDeclaredField("mFragmentManager");
                o.f87015l = declaredField2;
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
            }
            Field field2 = o.f87015l;
            if (field2 != null) {
                field2.set(this, activity2.getSupportFragmentManager());
            }
            Intrinsics.checkNotNullParameter(this, "target");
            if (o.f87004a == null) {
                Method declaredMethod = Fragment.class.getDeclaredMethod("performAttach", new Class[0]);
                o.f87004a = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                }
            }
            try {
                new com.pinterest.framework.screens.o(this, i14).invoke();
            } catch (Exception unused) {
            }
            Intrinsics.checkNotNullParameter(this, "target");
            if (o.f87005b == null) {
                Method declaredMethod2 = Fragment.class.getDeclaredMethod("performCreate", Bundle.class);
                o.f87005b = declaredMethod2;
                if (declaredMethod2 != null) {
                    declaredMethod2.setAccessible(true);
                }
            }
            try {
                new n(this, bundle, i13).invoke();
            } catch (Exception unused2) {
            }
        }
        this.f76939c = true;
        this.f76940d = true;
    }
}
