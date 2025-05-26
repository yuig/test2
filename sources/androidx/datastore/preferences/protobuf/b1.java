package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public abstract class b1 {
    public static final String a(String str) {
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

    public static String b(i iVar) {
        StringBuilder sb3 = new StringBuilder(iVar.size());
        for (int i13 = 0; i13 < iVar.size(); i13++) {
            byte b13 = iVar.b(i13);
            if (b13 == 34) {
                sb3.append("\\\"");
            } else if (b13 == 39) {
                sb3.append("\\'");
            } else if (b13 != 92) {
                switch (b13) {
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
                        if (b13 < 32 || b13 > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((b13 >>> 6) & 3) + 48));
                            sb3.append((char) (((b13 >>> 3) & 7) + 48));
                            sb3.append((char) ((b13 & 7) + 48));
                            break;
                        } else {
                            sb3.append((char) b13);
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

    public static final void c(StringBuilder sb3, int i13, String str, Object obj) {
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
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            sb3.append(' ');
        }
        sb3.append(str);
        if (obj instanceof String) {
            sb3.append(": \"");
            j jVar = i.f18075b;
            sb3.append(b(new j(((String) obj).getBytes(j0.f18080a))));
            sb3.append('\"');
            return;
        }
        if (obj instanceof i) {
            sb3.append(": \"");
            sb3.append(b((i) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof g0) {
            sb3.append(" {");
            d((g0) obj, sb3, i13 + 2);
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
        c(sb3, i16, "key", entry.getKey());
        c(sb3, i16, "value", entry.getValue());
        sb3.append("\n");
        while (i14 < i13) {
            sb3.append(' ');
            i14++;
        }
        sb3.append("}");
    }

    public static void d(b bVar, StringBuilder sb3, int i13) {
        boolean z13;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : bVar.getClass().getDeclaredMethods()) {
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
            String replaceFirst = str.replaceFirst("get", "");
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb3, i13, a(str2), g0.g(method2, bVar, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb3, i13, a(str3), g0.g(method3, bVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(replaceFirst))) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(replaceFirst));
                Method method5 = (Method) hashMap.get("has".concat(replaceFirst));
                if (method4 != null) {
                    Object g13 = g0.g(method4, bVar, new Object[0]);
                    if (method5 == null) {
                        if (g13 instanceof Boolean) {
                            z13 = !((Boolean) g13).booleanValue();
                        } else if (g13 instanceof Integer) {
                            if (((Integer) g13).intValue() != 0) {
                                c(sb3, i13, a(str4), g13);
                            }
                        } else if (g13 instanceof Float) {
                            if (((Float) g13).floatValue() != 0.0f) {
                                c(sb3, i13, a(str4), g13);
                            }
                        } else if (g13 instanceof Double) {
                            if (((Double) g13).doubleValue() != 0.0d) {
                                c(sb3, i13, a(str4), g13);
                            }
                        } else if (g13 instanceof String) {
                            z13 = g13.equals("");
                        } else if (g13 instanceof i) {
                            z13 = g13.equals(i.f18075b);
                        } else if (!(g13 instanceof b)) {
                            if ((g13 instanceof Enum) && ((Enum) g13).ordinal() == 0) {
                            }
                            c(sb3, i13, a(str4), g13);
                        } else if (g13 != ((g0) ((b) g13)).f()) {
                            c(sb3, i13, a(str4), g13);
                        }
                        if (!z13) {
                            c(sb3, i13, a(str4), g13);
                        }
                    } else if (((Boolean) g0.g(method5, bVar, new Object[0])).booleanValue()) {
                        c(sb3, i13, a(str4), g13);
                    }
                }
            }
        }
        x1 x1Var = ((g0) bVar).unknownFields;
        if (x1Var != null) {
            for (int i14 = 0; i14 < x1Var.f18166a; i14++) {
                c(sb3, i13, String.valueOf(x1Var.f18167b[i14] >>> 3), x1Var.f18168c[i14]);
            }
        }
    }

    public static String e(b bVar, String str) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("# ");
        sb3.append(str);
        d(bVar, sb3, 0);
        return sb3.toString();
    }
}
