package qe;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import df.j1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import le.v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f103629a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static WeakReference f103630b = new WeakReference(null);

    /* renamed from: c, reason: collision with root package name */
    public static Method f103631c;

    public static final ArrayList a(View view) {
        int childCount;
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i13));
                    if (i14 >= childCount) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0064, code lost:
    
        if (r7.isInstance(r3) != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[Catch: all -> 0x008a, TryCatch #2 {all -> 0x008a, blocks: (B:6:0x000a, B:9:0x0016, B:11:0x001c, B:12:0x001e, B:15:0x006c, B:17:0x0070, B:19:0x0076, B:21:0x007c, B:22:0x008c, B:24:0x0090, B:27:0x007f, B:29:0x0083, B:31:0x0093, B:33:0x0097, B:36:0x009c, B:38:0x00a0, B:40:0x00a4, B:42:0x00a8, B:44:0x00ab, B:46:0x00af, B:82:0x0069, B:55:0x0027, B:59:0x0030, B:64:0x0047, B:67:0x0050, B:71:0x0060, B:33:0x005b, B:79:0x0041), top: B:5:0x000a, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0060 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #3 {all -> 0x004e, blocks: (B:55:0x0027, B:59:0x0030, B:64:0x0047, B:67:0x0050, B:71:0x0060, B:33:0x005b, B:79:0x0041, B:75:0x003b), top: B:54:0x0027, outer: #2, inners: #4 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.h.b(android.view.View):int");
    }

    public static final JSONObject c(View view) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.d(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f103630b = new WeakReference(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList a13 = a(view);
                int size = a13.size() - 1;
                if (size >= 0) {
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        jSONArray.put(c((View) a13.get(i13)));
                        if (i14 > size) {
                            break;
                        }
                        i13 = i14;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e13) {
                Log.e("qe.h", "Failed to create JSONObject for view.", e13);
            }
            return jSONObject;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final View.OnClickListener e(View view) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            Intrinsics.checkNotNullExpressionValue(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(view);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            Intrinsics.checkNotNullExpressionValue(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnClickListener\")");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final View.OnTouchListener f(View view) {
        try {
            if (p001if.a.b(h.class)) {
                return null;
            }
            try {
                try {
                    try {
                        Field declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                        Intrinsics.checkNotNullExpressionValue(declaredField, "forName(\"android.view.View\").getDeclaredField(\"mListenerInfo\")");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(view);
                        if (obj == null) {
                            return null;
                        }
                        Field declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
                        Intrinsics.checkNotNullExpressionValue(declaredField2, "forName(\"android.view.View\\$ListenerInfo\").getDeclaredField(\"mOnTouchListener\")");
                        declaredField2.setAccessible(true);
                        Object obj2 = declaredField2.get(obj);
                        if (obj2 != null) {
                            return (View.OnTouchListener) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                    } catch (NoSuchFieldException unused) {
                        v vVar = v.f83104a;
                        return null;
                    }
                } catch (IllegalAccessException unused2) {
                    v vVar2 = v.f83104a;
                    return null;
                }
            } catch (ClassNotFoundException unused3) {
                v vVar3 = v.f83104a;
                return null;
            }
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final String g(View view) {
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            CharSequence hint = view instanceof EditText ? ((EditText) view).getHint() : view instanceof TextView ? ((TextView) view).getHint() : null;
            if (hint == null) {
                return "";
            }
            String obj = hint.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final ViewGroup h(View view) {
        if (p001if.a.b(h.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final String i(View view) {
        CharSequence valueOf;
        Object selectedItem;
        if (p001if.a.b(h.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    valueOf = ((Switch) view).isChecked() ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0";
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                int i13 = 0;
                if (view instanceof DatePicker) {
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(currentMinute.intValue())}, 2));
                    Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i14 = i13 + 1;
                            View childAt = ((RadioGroup) view).getChildAt(i13);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                valueOf = ((RadioButton) childAt).getText();
                                break;
                            }
                            if (i14 >= childCount) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            return obj == null ? "" : obj;
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
            return null;
        }
    }

    public static final void m(View view, JSONObject json) {
        if (p001if.a.b(h.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String i13 = i(view);
                String g13 = g(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put("classname", view.getClass().getCanonicalName());
                json.put("classtypebitmask", b(view));
                json.put("id", view.getId());
                if (g.a(view)) {
                    json.put("text", "");
                    json.put("is_user_input", true);
                } else {
                    json.put("text", j1.A(j1.C1(i13)));
                }
                json.put("hint", j1.A(j1.C1(g13)));
                if (tag != null) {
                    json.put("tag", j1.A(j1.C1(tag.toString())));
                }
                if (contentDescription != null) {
                    json.put("description", j1.A(j1.C1(contentDescription.toString())));
                }
                json.put("dimension", f103629a.d(view));
            } catch (JSONException unused) {
                v vVar = v.f83104a;
            }
        } catch (Throwable th3) {
            p001if.a.a(h.class, th3);
        }
    }

    public final JSONObject d(View view) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e13) {
                Log.e("qe.h", "Failed to create JSONObject for dimension.", e13);
            }
            return jSONObject;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final View j(View view, float[] fArr) {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            k();
            Method method = f103631c;
            if (method != null && view != null) {
                try {
                    try {
                        if (method == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        Object invoke = method.invoke(null, fArr, view);
                        if (invoke == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        View view2 = (View) invoke;
                        if (view2.getId() > 0) {
                            Object parent = view2.getParent();
                            if (parent != null) {
                                return (View) parent;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } catch (IllegalAccessException unused) {
                        v vVar = v.f83104a;
                    }
                } catch (InvocationTargetException unused2) {
                    v vVar2 = v.f83104a;
                }
            }
            return null;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final void k() {
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (f103631c != null) {
                return;
            }
            try {
                try {
                    Class<?> cls = Class.forName("com.facebook.react.uimanager.TouchTargetHelper");
                    Intrinsics.checkNotNullExpressionValue(cls, "forName(CLASS_TOUCHTARGETHELPER)");
                    Method declaredMethod = cls.getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                    f103631c = declaredMethod;
                    if (declaredMethod == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                    v vVar = v.f83104a;
                }
            } catch (ClassNotFoundException unused2) {
                v vVar2 = v.f83104a;
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final boolean l(View view, View view2) {
        if (p001if.a.b(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            String name = view.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
            if (!Intrinsics.d(name, "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            float[] fArr = null;
            if (!p001if.a.b(this)) {
                try {
                    view.getLocationOnScreen(new int[2]);
                    fArr = new float[]{r4[0], r4[1]};
                } catch (Throwable th3) {
                    p001if.a.a(this, th3);
                }
            }
            View j13 = j(view2, fArr);
            if (j13 != null) {
                return j13.getId() == view.getId();
            }
            return false;
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
            return false;
        }
    }
}
