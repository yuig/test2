package com.google.android.recaptcha.internal;

import a.a;
import ep.b;
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
final class zzok {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzoi zzoiVar, String str) {
        StringBuilder D = b.D("# ", str);
        zzd(zzoiVar, D, 0);
        return D.toString();
    }

    public static void zzb(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb3, i13, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb3, i13, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb3.append('\n');
        zzc(i13, sb3);
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
            sb3.append(zzpg.zza(new zzlc(((String) obj).getBytes(zznl.zza))));
            sb3.append('\"');
            return;
        }
        if (obj instanceof zzle) {
            sb3.append(": \"");
            sb3.append(zzpg.zza((zzle) obj));
            sb3.append('\"');
            return;
        }
        if (obj instanceof zznd) {
            sb3.append(" {");
            zzd((zznd) obj, sb3, i13 + 2);
            sb3.append("\n");
            zzc(i13, sb3);
            sb3.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb3.append(": ");
            sb3.append(obj);
            return;
        }
        int i15 = i13 + 2;
        sb3.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb3, i15, "key", entry.getKey());
        zzb(sb3, i15, "value", entry.getValue());
        sb3.append("\n");
        zzc(i13, sb3);
        sb3.append("}");
    }

    private static void zzc(int i13, StringBuilder sb3) {
        while (i13 > 0) {
            int i14 = 80;
            if (i13 <= 80) {
                i14 = i13;
            }
            sb3.append(zza, 0, i14);
            i13 -= i14;
        }
    }

    private static void zzd(zzoi zzoiVar, StringBuilder sb3, int i13) {
        int i14;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzoiVar.getClass().getDeclaredMethods();
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
                zzb(sb3, i13, substring.substring(0, substring.length() - 4), zznd.zzE(method2, zzoiVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb3, i13, substring.substring(0, substring.length() - 3), zznd.zzE(method, zzoiVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzE = zznd.zzE(method4, zzoiVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zznd.zzE(method5, zzoiVar, new Object[0])).booleanValue()) {
                        }
                        zzb(sb3, i13, substring, zzE);
                    } else if (zzE instanceof Boolean) {
                        if (!((Boolean) zzE).booleanValue()) {
                        }
                        zzb(sb3, i13, substring, zzE);
                    } else if (zzE instanceof Integer) {
                        if (((Integer) zzE).intValue() == 0) {
                        }
                        zzb(sb3, i13, substring, zzE);
                    } else if (zzE instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zzE).floatValue()) == 0) {
                        }
                        zzb(sb3, i13, substring, zzE);
                    } else if (zzE instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zzE).doubleValue()) == 0) {
                        }
                        zzb(sb3, i13, substring, zzE);
                    } else {
                        if (zzE instanceof String) {
                            equals = zzE.equals("");
                        } else if (zzE instanceof zzle) {
                            equals = zzE.equals(zzle.zzb);
                        } else if (zzE instanceof zzoi) {
                            if (zzE == ((zzoi) zzE).zzm()) {
                            }
                            zzb(sb3, i13, substring, zzE);
                        } else {
                            if ((zzE instanceof Enum) && ((Enum) zzE).ordinal() == 0) {
                            }
                            zzb(sb3, i13, substring, zzE);
                        }
                        if (equals) {
                        }
                        zzb(sb3, i13, substring, zzE);
                    }
                }
            }
            i14 = 3;
        }
        if (zzoiVar instanceof zzna) {
            Iterator zzf = ((zzna) zzoiVar).zzb.zzf();
            while (zzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzf.next();
                zzb(sb3, i13, a.e("[", ((zznb) entry2.getKey()).zza, "]"), entry2.getValue());
            }
        }
        zzpm zzpmVar = ((zznd) zzoiVar).zzc;
        if (zzpmVar != null) {
            zzpmVar.zzi(sb3, i13);
        }
    }
}
