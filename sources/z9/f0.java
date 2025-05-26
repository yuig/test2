package z9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f141181c = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Context f141182a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f141183b;

    public f0(Context context, s0 navigatorProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f141182a = context;
        this.f141183b = navigatorProvider;
    }

    public static g c(TypedArray typedArray, Resources resources, int i13) {
        o0 type;
        Object obj;
        boolean z13;
        o0 o0Var;
        boolean z14 = typedArray.getBoolean(aa.a.NavArgument_nullable, false);
        ThreadLocal threadLocal = f141181c;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        String string = typedArray.getString(aa.a.NavArgument_argType);
        if (string != null) {
            String resourcePackageName = resources.getResourcePackageName(i13);
            if (string.startsWith("java")) {
                try {
                    type = g4.u.h0("j$" + string.substring(4), resourcePackageName);
                } catch (RuntimeException e13) {
                    if (!(e13.getCause() instanceof ClassNotFoundException)) {
                        throw e13;
                    }
                }
            }
            type = g4.u.h0(string, resourcePackageName);
        } else {
            type = null;
        }
        boolean value = typedArray.getValue(aa.a.NavArgument_android_defaultValue, typedValue);
        o0 o0Var2 = o0.f141245e;
        i0 i0Var = o0.f141249i;
        i0 i0Var2 = o0.f141251k;
        i0 i0Var3 = o0.f141242b;
        i0 i0Var4 = o0.f141247g;
        if (value) {
            i0 i0Var5 = o0.f141243c;
            if (type == i0Var5) {
                int i14 = typedValue.resourceId;
                if (i14 == 0) {
                    if (typedValue.type != 16 || typedValue.data != 0) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + type.b() + ". Must be a reference to a resource.");
                    }
                    i14 = 0;
                }
                obj = Integer.valueOf(i14);
            } else {
                int i15 = typedValue.resourceId;
                if (i15 != 0) {
                    if (type != null) {
                        throw new XmlPullParserException("unsupported value '" + ((Object) typedValue.string) + "' for " + type.b() + ". You must use a \"" + i0Var5.b() + "\" type to reference other resources.");
                    }
                    obj = Integer.valueOf(i15);
                    type = i0Var5;
                } else if (type == i0Var2) {
                    obj = typedArray.getString(aa.a.NavArgument_android_defaultValue);
                } else {
                    int i16 = typedValue.type;
                    if (i16 == 3) {
                        String value2 = typedValue.string.toString();
                        if (type == null) {
                            Intrinsics.checkNotNullParameter(value2, "value");
                            try {
                                try {
                                    try {
                                        try {
                                            i0Var3.c(value2);
                                            type = i0Var3;
                                        } catch (IllegalArgumentException unused) {
                                            i0Var.c(value2);
                                            type = i0Var;
                                        }
                                    } catch (IllegalArgumentException unused2) {
                                        o0Var2.c(value2);
                                        type = o0Var2;
                                    }
                                } catch (IllegalArgumentException unused3) {
                                    type = i0Var2;
                                }
                            } catch (IllegalArgumentException unused4) {
                                i0Var4.c(value2);
                                type = i0Var4;
                            }
                        }
                        obj = type.c(value2);
                    } else if (i16 == 4) {
                        type = g4.u.V(typedValue, type, i0Var4, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i16 == 5) {
                        type = g4.u.V(typedValue, type, i0Var3, string, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i16 == 18) {
                        type = g4.u.V(typedValue, type, i0Var, string, "boolean");
                        obj = Boolean.valueOf(typedValue.data != 0);
                    } else {
                        if (i16 < 16 || i16 > 31) {
                            throw new XmlPullParserException("unsupported argument type " + typedValue.type);
                        }
                        if (type == i0Var4) {
                            type = g4.u.V(typedValue, type, i0Var4, string, "float");
                            obj = Float.valueOf(typedValue.data);
                        } else {
                            type = g4.u.V(typedValue, type, i0Var3, string, "integer");
                            obj = Integer.valueOf(typedValue.data);
                        }
                    }
                }
            }
        } else {
            obj = null;
        }
        if (obj != null) {
            z13 = true;
        } else {
            obj = null;
            z13 = false;
        }
        if (type != null) {
            Intrinsics.checkNotNullParameter(type, "type");
            o0Var = type;
        } else {
            o0Var = null;
        }
        if (o0Var == null) {
            if (obj instanceof Integer) {
                o0Var2 = i0Var3;
            } else if (obj instanceof int[]) {
                o0Var2 = o0.f141244d;
            } else if (!(obj instanceof Long)) {
                if (obj instanceof long[]) {
                    o0Var2 = o0.f141246f;
                } else if (obj instanceof Float) {
                    o0Var2 = i0Var4;
                } else if (obj instanceof float[]) {
                    o0Var2 = o0.f141248h;
                } else if (obj instanceof Boolean) {
                    o0Var2 = i0Var;
                } else if (obj instanceof boolean[]) {
                    o0Var2 = o0.f141250j;
                } else if ((obj instanceof String) || obj == null) {
                    o0Var2 = i0Var2;
                } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    o0Var2 = o0.f141252l;
                } else {
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        Intrinsics.f(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            Intrinsics.g(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            o0Var2 = new k0(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        Intrinsics.f(componentType3);
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            Intrinsics.g(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            o0Var2 = new m0(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        o0Var2 = new l0(obj.getClass());
                    } else if (obj instanceof Enum) {
                        o0Var2 = new j0(obj.getClass());
                    } else {
                        if (!(obj instanceof Serializable)) {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        o0Var2 = new n0(obj.getClass());
                    }
                }
            }
            o0Var = o0Var2;
        }
        return new g(o0Var, z14, obj, z13);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x012f, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x027a, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final z9.z a(android.content.res.Resources r29, android.content.res.XmlResourceParser r30, android.util.AttributeSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.f0.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, int):z9.z");
    }

    public final b0 b(int i13) {
        int next;
        Resources res = this.f141182a.getResources();
        XmlResourceParser xml = res.getXml(i13);
        Intrinsics.checkNotNullExpressionValue(xml, "res.getXml(graphResId)");
        AttributeSet attrs = Xml.asAttributeSet(xml);
        do {
            try {
                try {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } catch (Exception e13) {
                    throw new RuntimeException("Exception inflating " + res.getResourceName(i13) + " line " + xml.getLineNumber(), e13);
                }
            } finally {
                xml.close();
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        Intrinsics.checkNotNullExpressionValue(res, "res");
        Intrinsics.checkNotNullExpressionValue(attrs, "attrs");
        z a13 = a(res, xml, attrs, i13);
        if (a13 instanceof b0) {
            return (b0) a13;
        }
        throw new IllegalArgumentException(("Root element <" + name + "> did not inflate into a NavGraph").toString());
    }
}
