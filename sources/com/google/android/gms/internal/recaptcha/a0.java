package com.google.android.gms.internal.recaptcha;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f31733a = {1, 2, 3, 4, 5, 6, 7};

    public static String a(u uVar) {
        StringBuilder sb3 = new StringBuilder(uVar.e());
        for (int i13 = 0; i13 < uVar.e(); i13++) {
            byte d2 = uVar.d(i13);
            if (d2 == 34) {
                sb3.append("\\\"");
            } else if (d2 == 39) {
                sb3.append("\\'");
            } else if (d2 != 92) {
                switch (d2) {
                    case 7:
                        sb3.append("\\a");
                        break;
                    case 8:
                        sb3.append("\\b");
                        break;
                    case 9:
                        sb3.append("\\t");
                        break;
                    case 10:
                        sb3.append("\\n");
                        break;
                    case 11:
                        sb3.append("\\v");
                        break;
                    case 12:
                        sb3.append("\\f");
                        break;
                    case 13:
                        sb3.append("\\r");
                        break;
                    default:
                        if (d2 < 32 || d2 > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((d2 >>> 6) & 3) + 48));
                            sb3.append((char) (((d2 >>> 3) & 7) + 48));
                            sb3.append((char) ((d2 & 7) + 48));
                            break;
                        } else {
                            sb3.append((char) d2);
                            break;
                        }
                        break;
                }
            } else {
                sb3.append("\\\\");
            }
        }
        return sb3.toString();
    }

    public static String b(r0 r0Var, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(str);
        d(r0Var, sb3, 0);
        return sb3.toString();
    }

    public static final String c(String str) {
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (Character.isUpperCase(charAt)) {
                sb3.append("_");
            }
            sb3.append(Character.toLowerCase(charAt));
        }
        return sb3.toString();
    }

    public static void d(r0 r0Var, StringBuilder sb3, int i13) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : r0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    e(sb3, i13, c(concat), b0.c(r0Var, method2, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    e(sb3, i13, c(concat2), b0.c(r0Var, method3, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object c13 = b0.c(r0Var, method4, new Object[0]);
                    if (method5 == null) {
                        if (c13 instanceof Boolean) {
                            if (((Boolean) c13).booleanValue()) {
                                e(sb3, i13, c(concat3), c13);
                            }
                        } else if (c13 instanceof Integer) {
                            if (((Integer) c13).intValue() != 0) {
                                e(sb3, i13, c(concat3), c13);
                            }
                        } else if (c13 instanceof Float) {
                            if (((Float) c13).floatValue() != 0.0f) {
                                e(sb3, i13, c(concat3), c13);
                            }
                        } else if (!(c13 instanceof Double)) {
                            if (c13 instanceof String) {
                                equals = c13.equals("");
                            } else if (c13 instanceof u) {
                                equals = c13.equals(u.f31799b);
                            } else if (!(c13 instanceof r0)) {
                                if ((c13 instanceof Enum) && ((Enum) c13).ordinal() == 0) {
                                }
                                e(sb3, i13, c(concat3), c13);
                            } else if (c13 != ((b0) ((b0) ((r0) c13)).b(6))) {
                                e(sb3, i13, c(concat3), c13);
                            }
                            if (!equals) {
                                e(sb3, i13, c(concat3), c13);
                            }
                        } else if (((Double) c13).doubleValue() != 0.0d) {
                            e(sb3, i13, c(concat3), c13);
                        }
                    } else if (((Boolean) b0.c(r0Var, method5, new Object[0])).booleanValue()) {
                        e(sb3, i13, c(concat3), c13);
                    }
                }
            }
        }
        c1 c1Var = ((b0) r0Var).zzb;
        if (c1Var != null) {
            for (int i14 = 0; i14 < c1Var.f31742a; i14++) {
                e(sb3, i13, String.valueOf(c1Var.f31743b[i14] >>> 3), c1Var.f31744c[i14]);
            }
        }
    }

    public static final void e(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                e(sb3, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(sb3, i13, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb3.append('\n');
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            sb3.append(' ');
        }
        sb3.append(str);
        if (obj instanceof String) {
            sb3.append(": \"");
            t tVar = u.f31799b;
            sb3.append(a(new t(((String) obj).getBytes(d0.f31745a))));
            sb3.append('\"');
            return;
        }
        if (obj instanceof u) {
            sb3.append(": \"");
            sb3.append(a((u) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof b0) {
            sb3.append(" {");
            d((b0) obj, sb3, i13 + 2);
            sb3.append("\n");
            while (i14 < i13) {
                sb3.append(' ');
                i14++;
            }
            sb3.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb3.append(": ");
            sb3.append(obj.toString());
            return;
        }
        sb3.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i16 = i13 + 2;
        e(sb3, i16, "key", entry.getKey());
        e(sb3, i16, "value", entry.getValue());
        sb3.append("\n");
        while (i14 < i13) {
            sb3.append(' ');
            i14++;
        }
        sb3.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x006d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.recaptcha.a0.f(byte[], int, int):boolean");
    }
}
