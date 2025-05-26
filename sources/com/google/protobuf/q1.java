package com.google.protobuf;

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
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f33959a;

    static {
        char[] cArr = new char[80];
        f33959a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i13, StringBuilder sb3) {
        while (i13 > 0) {
            int i14 = 80;
            if (i13 <= 80) {
                i14 = i13;
            }
            sb3.append(f33959a, 0, i14);
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
            sb3.append(g2.M(l.e((String) obj)));
            sb3.append('\"');
            return;
        }
        if (obj instanceof l) {
            sb3.append(": \"");
            sb3.append(g2.M((l) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof n0) {
            sb3.append(" {");
            c((n0) obj, sb3, i13 + 2);
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

    public static void c(o1 o1Var, StringBuilder sb3, int i13) {
        int i14;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = o1Var.getClass().getDeclaredMethods();
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
                b(sb3, i13, substring.substring(0, substring.length() - 4), n0.invokeOrDie(method2, o1Var, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb3, i13, substring.substring(0, substring.length() - 3), n0.invokeOrDie(method, o1Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object invokeOrDie = n0.invokeOrDie(method4, o1Var, new Object[0]);
                    if (method5 == null) {
                        if (invokeOrDie instanceof Boolean) {
                            equals = !((Boolean) invokeOrDie).booleanValue();
                        } else if (invokeOrDie instanceof Integer) {
                            if (((Integer) invokeOrDie).intValue() == 0) {
                            }
                            b(sb3, i13, substring, invokeOrDie);
                        } else if (invokeOrDie instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) invokeOrDie).floatValue()) == 0) {
                            }
                            b(sb3, i13, substring, invokeOrDie);
                        } else if (invokeOrDie instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) invokeOrDie).doubleValue()) == 0) {
                            }
                            b(sb3, i13, substring, invokeOrDie);
                        } else if (invokeOrDie instanceof String) {
                            equals = invokeOrDie.equals("");
                        } else if (invokeOrDie instanceof l) {
                            equals = invokeOrDie.equals(l.f33922b);
                        } else if (invokeOrDie instanceof o1) {
                            if (invokeOrDie == ((o1) invokeOrDie).getDefaultInstanceForType()) {
                            }
                            b(sb3, i13, substring, invokeOrDie);
                        } else {
                            if ((invokeOrDie instanceof Enum) && ((Enum) invokeOrDie).ordinal() == 0) {
                            }
                            b(sb3, i13, substring, invokeOrDie);
                        }
                        if (equals) {
                        }
                        b(sb3, i13, substring, invokeOrDie);
                    } else {
                        if (!((Boolean) n0.invokeOrDie(method5, o1Var, new Object[0])).booleanValue()) {
                        }
                        b(sb3, i13, substring, invokeOrDie);
                    }
                }
            }
            i14 = 3;
        }
        j2 j2Var = ((n0) o1Var).unknownFields;
        if (j2Var != null) {
            for (int i16 = 0; i16 < j2Var.f33912a; i16++) {
                b(sb3, i13, String.valueOf(j2Var.f33913b[i16] >>> 3), j2Var.f33914c[i16]);
            }
        }
    }

    public static String d(o1 o1Var, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(str);
        c(o1Var, sb3, 0);
        return sb3.toString();
    }
}
