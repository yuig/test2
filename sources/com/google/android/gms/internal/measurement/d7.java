package com.google.android.gms.internal.measurement;

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
public abstract class d7 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f31360a;

    static {
        char[] cArr = new char[80];
        f31360a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i13, StringBuilder sb3) {
        while (i13 > 0) {
            int i14 = 80;
            if (i13 <= 80) {
                i14 = i13;
            }
            sb3.append(f31360a, 0, i14);
            i13 -= i14;
        }
    }

    public static void b(a7 a7Var, StringBuilder sb3, int i13) {
        int i14;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = a7Var.getClass().getDeclaredMethods();
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
                c(sb3, i13, substring.substring(0, substring.length() - 4), a6.h(a7Var, method2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                c(sb3, i13, substring.substring(0, substring.length() - 3), a6.h(a7Var, method, new Object[0]));
            } else if (hashSet.contains("set".concat(substring))) {
                if (substring.endsWith("Bytes")) {
                    if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object h10 = a6.h(a7Var, method4, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) a6.h(a7Var, method5, new Object[0])).booleanValue()) {
                        }
                        c(sb3, i13, substring, h10);
                    } else if (h10 instanceof Boolean) {
                        if (!((Boolean) h10).booleanValue()) {
                        }
                        c(sb3, i13, substring, h10);
                    } else if (h10 instanceof Integer) {
                        if (((Integer) h10).intValue() == 0) {
                        }
                        c(sb3, i13, substring, h10);
                    } else if (h10 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) h10).floatValue()) == 0) {
                        }
                        c(sb3, i13, substring, h10);
                    } else if (h10 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) h10).doubleValue()) == 0) {
                        }
                        c(sb3, i13, substring, h10);
                    } else {
                        if (h10 instanceof String) {
                            equals = h10.equals("");
                        } else if (h10 instanceof o5) {
                            equals = h10.equals(o5.f31566b);
                        } else if (h10 instanceof a7) {
                            if (h10 == ((a6) ((a6) ((a7) h10)).g(6))) {
                            }
                            c(sb3, i13, substring, h10);
                        } else {
                            if ((h10 instanceof Enum) && ((Enum) h10).ordinal() == 0) {
                            }
                            c(sb3, i13, substring, h10);
                        }
                        if (equals) {
                        }
                        c(sb3, i13, substring, h10);
                    }
                }
            }
            i14 = 3;
        }
        q7 q7Var = ((a6) a7Var).zzb;
        if (q7Var != null) {
            for (int i16 = 0; i16 < q7Var.f31605a; i16++) {
                c(sb3, i13, String.valueOf(q7Var.f31606b[i16] >>> 3), q7Var.f31607c[i16]);
            }
        }
    }

    public static void c(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb3, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb3, i13, str, (Map.Entry) it2.next());
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
            n5 n5Var = o5.f31566b;
            sb3.append(o0.s(new n5(((String) obj).getBytes(c6.f31325a))));
            sb3.append('\"');
            return;
        }
        if (obj instanceof o5) {
            sb3.append(": \"");
            sb3.append(o0.s((o5) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof a6) {
            sb3.append(" {");
            b((a6) obj, sb3, i13 + 2);
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
        c(sb3, i15, "key", entry.getKey());
        c(sb3, i15, "value", entry.getValue());
        sb3.append("\n");
        a(i13, sb3);
        sb3.append("}");
    }
}
