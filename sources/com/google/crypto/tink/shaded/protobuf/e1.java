package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f33607a;

    static {
        char[] cArr = new char[80];
        f33607a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i13, StringBuilder sb3) {
        while (i13 > 0) {
            int i14 = 80;
            if (i13 <= 80) {
                i14 = i13;
            }
            sb3.append(f33607a, 0, i14);
            i13 -= i14;
        }
    }

    public static void b(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb3, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb3, i13, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb3.append('\n');
        a(i13, sb3);
        if (!str.isEmpty()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(Character.toLowerCase(str.charAt(0)));
            for (int i14 = 1; i14 < str.length(); i14++) {
                char charAt = str.charAt(i14);
                if (Character.isUpperCase(charAt)) {
                    sb4.append("_");
                }
                sb4.append(Character.toLowerCase(charAt));
            }
            str = sb4.toString();
        }
        sb3.append(str);
        if (obj instanceof String) {
            sb3.append(": \"");
            j jVar = k.f33636b;
            sb3.append(u1.I(new j(((String) obj).getBytes(l0.f33646a))));
            sb3.append('\"');
            return;
        }
        if (obj instanceof k) {
            sb3.append(": \"");
            sb3.append(u1.I((k) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof f0) {
            sb3.append(" {");
            c((f0) obj, sb3, i13 + 2);
            sb3.append("\n");
            a(i13, sb3);
            sb3.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb3.append(": ");
            sb3.append(obj);
            return;
        }
        sb3.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i15 = i13 + 2;
        b(sb3, i15, "key", entry.getKey());
        b(sb3, i15, "value", entry.getValue());
        sb3.append("\n");
        a(i13, sb3);
        sb3.append("}");
    }

    public static void c(b bVar, StringBuilder sb3, int i13) {
        int i14;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = bVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i15 = 0;
        while (true) {
            i14 = 3;
            if (i15 >= length) {
                break;
            }
            Method method3 = declaredMethods[i15];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i15++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i14);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb3, i13, substring.substring(0, substring.length() - 4), f0.o(method2, bVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb3, i13, substring.substring(0, substring.length() - 3), f0.o(method, bVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object o13 = f0.o(method4, bVar, new Object[0]);
                    if (method5 == null) {
                        if (o13 instanceof Boolean) {
                            equals = !((Boolean) o13).booleanValue();
                        } else if (o13 instanceof Integer) {
                            if (((Integer) o13).intValue() == 0) {
                            }
                            b(sb3, i13, substring, o13);
                        } else if (o13 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) o13).floatValue()) == 0) {
                            }
                            b(sb3, i13, substring, o13);
                        } else if (o13 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) o13).doubleValue()) == 0) {
                            }
                            b(sb3, i13, substring, o13);
                        } else if (o13 instanceof String) {
                            equals = o13.equals("");
                        } else if (o13 instanceof k) {
                            equals = o13.equals(k.f33636b);
                        } else if (o13 instanceof b) {
                            if (o13 == ((b) o13).getDefaultInstanceForType()) {
                            }
                            b(sb3, i13, substring, o13);
                        } else {
                            if ((o13 instanceof Enum) && ((Enum) o13).ordinal() == 0) {
                            }
                            b(sb3, i13, substring, o13);
                        }
                        if (equals) {
                        }
                        b(sb3, i13, substring, o13);
                    } else {
                        if (!((Boolean) f0.o(method5, bVar, new Object[0])).booleanValue()) {
                        }
                        b(sb3, i13, substring, o13);
                    }
                }
            }
            i14 = 3;
        }
        w1 w1Var = ((f0) bVar).unknownFields;
        if (w1Var != null) {
            for (int i16 = 0; i16 < w1Var.f33705a; i16++) {
                b(sb3, i13, String.valueOf(w1Var.f33706b[i16] >>> 3), w1Var.f33707c[i16]);
            }
        }
    }

    public static String d(b bVar, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(str);
        c(bVar, sb3, 0);
        return sb3.toString();
    }
}
