package androidx.constraintlayout.widget;

import a.cb;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17718a = false;

    /* renamed from: b, reason: collision with root package name */
    public String f17719b;

    /* renamed from: c, reason: collision with root package name */
    public b f17720c;

    /* renamed from: d, reason: collision with root package name */
    public int f17721d;

    /* renamed from: e, reason: collision with root package name */
    public float f17722e;

    /* renamed from: f, reason: collision with root package name */
    public String f17723f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17724g;

    /* renamed from: h, reason: collision with root package name */
    public int f17725h;

    public c(c cVar, Object obj) {
        this.f17719b = cVar.f17719b;
        this.f17720c = cVar.f17720c;
        g(obj);
    }

    public static HashMap a(View view, HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            c cVar = (c) hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new c(cVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    hashMap2.put(str, new c(cVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e13) {
                e13.printStackTrace();
            } catch (NoSuchMethodException e14) {
                e14.printStackTrace();
            } catch (InvocationTargetException e15) {
                e15.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void e(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        b bVar;
        Object valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        boolean z13 = false;
        for (int i13 = 0; i13 < indexCount; i13++) {
            int index = obtainStyledAttributes.getIndex(i13);
            if (index == s.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == s.CustomAttribute_methodName) {
                str = obtainStyledAttributes.getString(index);
                z13 = true;
            } else if (index == s.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == s.CustomAttribute_customColorValue) {
                    bVar = b.COLOR_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == s.CustomAttribute_customColorDrawableValue) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == s.CustomAttribute_customPixelDimension) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == s.CustomAttribute_customDimension) {
                    bVar = b.DIMENSION_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == s.CustomAttribute_customFloatValue) {
                    bVar = b.FLOAT_TYPE;
                    valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == s.CustomAttribute_customIntegerValue) {
                    bVar = b.INT_TYPE;
                    valueOf = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == s.CustomAttribute_customStringValue) {
                    bVar = b.STRING_TYPE;
                    valueOf = obtainStyledAttributes.getString(index);
                } else if (index == s.CustomAttribute_customReference) {
                    bVar = b.REFERENCE_TYPE;
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    valueOf = Integer.valueOf(resourceId);
                }
                Object obj2 = valueOf;
                bVar2 = bVar;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            c cVar = new c();
            cVar.f17719b = str;
            cVar.f17720c = bVar2;
            cVar.f17718a = z13;
            cVar.g(obj);
            hashMap.put(str, cVar);
        }
        obtainStyledAttributes.recycle();
    }

    public static void f(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            c cVar = (c) hashMap.get(str);
            String j13 = !cVar.f17718a ? a.a.j("set", str) : str;
            try {
                switch (a.f17717a[cVar.f17720c.ordinal()]) {
                    case 1:
                        cls.getMethod(j13, Integer.TYPE).invoke(view, Integer.valueOf(cVar.f17721d));
                        break;
                    case 2:
                        cls.getMethod(j13, Boolean.TYPE).invoke(view, Boolean.valueOf(cVar.f17724g));
                        break;
                    case 3:
                        cls.getMethod(j13, CharSequence.class).invoke(view, cVar.f17723f);
                        break;
                    case 4:
                        cls.getMethod(j13, Integer.TYPE).invoke(view, Integer.valueOf(cVar.f17725h));
                        break;
                    case 5:
                        Method method = cls.getMethod(j13, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(cVar.f17725h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(j13, Integer.TYPE).invoke(view, Integer.valueOf(cVar.f17721d));
                        break;
                    case 7:
                        cls.getMethod(j13, Float.TYPE).invoke(view, Float.valueOf(cVar.f17722e));
                        break;
                    case 8:
                        cls.getMethod(j13, Float.TYPE).invoke(view, Float.valueOf(cVar.f17722e));
                        break;
                }
            } catch (IllegalAccessException e13) {
                StringBuilder o13 = cb.o(" Custom Attribute \"", str, "\" not found on ");
                o13.append(cls.getName());
                Log.e("TransitionLayout", o13.toString());
                e13.printStackTrace();
            } catch (NoSuchMethodException e14) {
                Log.e("TransitionLayout", e14.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                Log.e("TransitionLayout", cls.getName() + " must have a method " + j13);
            } catch (InvocationTargetException e15) {
                StringBuilder o14 = cb.o(" Custom Attribute \"", str, "\" not found on ");
                o14.append(cls.getName());
                Log.e("TransitionLayout", o14.toString());
                e15.printStackTrace();
            }
        }
    }

    public final float b() {
        switch (a.f17717a[this.f17720c.ordinal()]) {
            case 2:
                return this.f17724g ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f17721d;
            case 7:
                return this.f17722e;
            case 8:
                return this.f17722e;
            default:
                return Float.NaN;
        }
    }

    public final void c(float[] fArr) {
        switch (a.f17717a[this.f17720c.ordinal()]) {
            case 2:
                fArr[0] = this.f17724g ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i13 = (this.f17725h >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i13 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f17721d;
                return;
            case 7:
                fArr[0] = this.f17722e;
                return;
            case 8:
                fArr[0] = this.f17722e;
                return;
            default:
                return;
        }
    }

    public final int d() {
        int i13 = a.f17717a[this.f17720c.ordinal()];
        return (i13 == 4 || i13 == 5) ? 4 : 1;
    }

    public final void g(Object obj) {
        switch (a.f17717a[this.f17720c.ordinal()]) {
            case 1:
            case 6:
                this.f17721d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f17724g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f17723f = (String) obj;
                break;
            case 4:
            case 5:
                this.f17725h = ((Integer) obj).intValue();
                break;
            case 7:
                this.f17722e = ((Float) obj).floatValue();
                break;
            case 8:
                this.f17722e = ((Float) obj).floatValue();
                break;
        }
    }
}
