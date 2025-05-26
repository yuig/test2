package oi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.ua;
import com.google.android.gms.measurement.internal.zzbb;
import com.google.android.gms.measurement.internal.zzbg;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class c7 extends y6 {
    public static com.google.android.gms.internal.measurement.l3 A(com.google.android.gms.internal.measurement.h3 h3Var, String str) {
        for (com.google.android.gms.internal.measurement.l3 l3Var : h3Var.G()) {
            if (l3Var.G().equals(str)) {
                return l3Var;
            }
        }
        return null;
    }

    public static com.google.android.gms.internal.measurement.z5 B(com.google.android.gms.internal.measurement.z5 z5Var, byte[] bArr) {
        com.google.android.gms.internal.measurement.r5 r5Var;
        com.google.android.gms.internal.measurement.r5 r5Var2 = com.google.android.gms.internal.measurement.r5.f31619b;
        if (r5Var2 == null) {
            synchronized (com.google.android.gms.internal.measurement.r5.class) {
                try {
                    r5Var = com.google.android.gms.internal.measurement.r5.f31619b;
                    if (r5Var == null) {
                        r5Var = com.google.android.gms.internal.measurement.x5.a();
                        com.google.android.gms.internal.measurement.r5.f31619b = r5Var;
                    }
                } finally {
                }
            }
            r5Var2 = r5Var;
        }
        if (r5Var2 != null) {
            z5Var.getClass();
            z5Var.h(bArr, bArr.length, r5Var2);
            return z5Var;
        }
        z5Var.getClass();
        z5Var.h(bArr, bArr.length, com.google.android.gms.internal.measurement.r5.f31620c);
        return z5Var;
    }

    public static zzbg C(com.google.android.gms.internal.measurement.c cVar) {
        Object obj;
        Bundle y13 = y(cVar.f31313c, true);
        String obj2 = (!y13.containsKey("_o") || (obj = y13.get("_o")) == null) ? "app" : obj.toString();
        String I0 = kh2.a1.I0(cVar.f31311a, h5.f94811a, h5.f94813c);
        if (I0 == null) {
            I0 = cVar.f31311a;
        }
        return new zzbg(I0, new zzbb(y13), obj2, cVar.f31312b);
    }

    public static String F(boolean z13, boolean z14, boolean z15) {
        StringBuilder sb3 = new StringBuilder();
        if (z13) {
            sb3.append("Dynamic ");
        }
        if (z14) {
            sb3.append("Sequence ");
        }
        if (z15) {
            sb3.append("Session-Scoped ");
        }
        return sb3.toString();
    }

    public static ArrayList G(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i13 = 0; i13 < length; i13++) {
            long j13 = 0;
            for (int i14 = 0; i14 < 64; i14++) {
                int i15 = (i13 << 6) + i14;
                if (i15 < bitSet.length()) {
                    if (bitSet.get(i15)) {
                        j13 |= 1 << i14;
                    }
                }
            }
            arrayList.add(Long.valueOf(j13));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(H((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        r5.add(H((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        r5.add(H((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.HashMap H(android.os.Bundle r10, boolean r11) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r10.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r11 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = r6
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = H(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = r6
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.HashMap r8 = H(r8, r6)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.HashMap r3 = H(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.c7.H(android.os.Bundle, boolean):java.util.HashMap");
    }

    public static void J(int i13, StringBuilder sb3) {
        for (int i14 = 0; i14 < i13; i14++) {
            sb3.append("  ");
        }
    }

    public static void K(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static void L(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                K(builder, str3, string, set);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(com.google.android.gms.internal.measurement.g3 g3Var, String str, Long l13) {
        List n13 = g3Var.n();
        int i13 = 0;
        while (true) {
            if (i13 >= n13.size()) {
                i13 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.l3) n13.get(i13)).G())) {
                break;
            } else {
                i13++;
            }
        }
        com.google.android.gms.internal.measurement.k3 F = com.google.android.gms.internal.measurement.l3.F();
        F.j(str);
        if (l13 instanceof Long) {
            F.i(l13.longValue());
        } else if (l13 instanceof String) {
            F.k((String) l13);
        } else if (l13 instanceof Double) {
            double doubleValue = ((Double) l13).doubleValue();
            F.g();
            com.google.android.gms.internal.measurement.l3.s((com.google.android.gms.internal.measurement.l3) F.f31718b, doubleValue);
        }
        if (i13 < 0) {
            g3Var.i(F);
        } else {
            g3Var.g();
            com.google.android.gms.internal.measurement.h3.w((com.google.android.gms.internal.measurement.h3) g3Var.f31718b, i13, (com.google.android.gms.internal.measurement.l3) F.b());
        }
    }

    public static void Q(StringBuilder sb3, int i13, String str, com.google.android.gms.internal.measurement.a2 a2Var) {
        if (a2Var == null) {
            return;
        }
        J(i13, sb3);
        sb3.append(str);
        sb3.append(" {\n");
        if (a2Var.y()) {
            R(sb3, i13, "comparison_type", a2Var.r().name());
        }
        if (a2Var.A()) {
            R(sb3, i13, "match_as_float", Boolean.valueOf(a2Var.x()));
        }
        if (a2Var.z()) {
            R(sb3, i13, "comparison_value", a2Var.u());
        }
        if (a2Var.C()) {
            R(sb3, i13, "min_comparison_value", a2Var.w());
        }
        if (a2Var.B()) {
            R(sb3, i13, "max_comparison_value", a2Var.v());
        }
        J(i13, sb3);
        sb3.append("}\n");
    }

    public static void R(StringBuilder sb3, int i13, String str, Object obj) {
        if (obj == null) {
            return;
        }
        J(i13 + 1, sb3);
        sb3.append(str);
        sb3.append(": ");
        sb3.append(obj);
        sb3.append('\n');
    }

    public static void S(StringBuilder sb3, String str, com.google.android.gms.internal.measurement.u3 u3Var) {
        if (u3Var == null) {
            return;
        }
        J(3, sb3);
        sb3.append(str);
        sb3.append(" {\n");
        if (u3Var.u() != 0) {
            J(4, sb3);
            sb3.append("results: ");
            int i13 = 0;
            for (Long l13 : u3Var.G()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb3.append(", ");
                }
                sb3.append(l13);
                i13 = i14;
            }
            sb3.append('\n');
        }
        if (u3Var.A() != 0) {
            J(4, sb3);
            sb3.append("status: ");
            int i15 = 0;
            for (Long l14 : u3Var.I()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb3.append(", ");
                }
                sb3.append(l14);
                i15 = i16;
            }
            sb3.append('\n');
        }
        if (u3Var.r() != 0) {
            J(4, sb3);
            sb3.append("dynamic_filter_timestamps: {");
            int i17 = 0;
            for (com.google.android.gms.internal.measurement.f3 f3Var : u3Var.F()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb3.append(", ");
                }
                sb3.append(f3Var.x() ? Integer.valueOf(f3Var.r()) : null);
                sb3.append(":");
                sb3.append(f3Var.w() ? Long.valueOf(f3Var.u()) : null);
                i17 = i18;
            }
            sb3.append("}\n");
        }
        if (u3Var.x() != 0) {
            J(4, sb3);
            sb3.append("sequence_filter_timestamps: {");
            int i19 = 0;
            for (com.google.android.gms.internal.measurement.w3 w3Var : u3Var.H()) {
                int i23 = i19 + 1;
                if (i19 != 0) {
                    sb3.append(", ");
                }
                sb3.append(w3Var.y() ? Integer.valueOf(w3Var.v()) : null);
                sb3.append(": [");
                Iterator it = w3Var.x().iterator();
                int i24 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i25 = i24 + 1;
                    if (i24 != 0) {
                        sb3.append(", ");
                    }
                    sb3.append(longValue);
                    i24 = i25;
                }
                sb3.append("]");
                i19 = i23;
            }
            sb3.append("}\n");
        }
        J(3, sb3);
        sb3.append("}\n");
    }

    public static boolean T(int i13, com.google.android.gms.internal.measurement.j6 j6Var) {
        if (i13 < (j6Var.size() << 6)) {
            return ((1 << (i13 % 64)) & ((Long) j6Var.get(i13 / 64)).longValue()) != 0;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [android.os.Bundle[], java.io.Serializable] */
    public static Serializable V(com.google.android.gms.internal.measurement.h3 h3Var, String str) {
        com.google.android.gms.internal.measurement.l3 A = A(h3Var, str);
        if (A == null) {
            return null;
        }
        if (A.N()) {
            return A.H();
        }
        if (A.L()) {
            return Long.valueOf(A.D());
        }
        if (A.J()) {
            return Double.valueOf(A.r());
        }
        if (A.B() <= 0) {
            return null;
        }
        List<com.google.android.gms.internal.measurement.l3> I = A.I();
        ArrayList arrayList = new ArrayList();
        for (com.google.android.gms.internal.measurement.l3 l3Var : I) {
            if (l3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.l3 l3Var2 : l3Var.I()) {
                    if (l3Var2.N()) {
                        bundle.putString(l3Var2.G(), l3Var2.H());
                    } else if (l3Var2.L()) {
                        bundle.putLong(l3Var2.G(), l3Var2.D());
                    } else if (l3Var2.J()) {
                        bundle.putDouble(l3Var2.G(), l3Var2.r());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static boolean W(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static int w(com.google.android.gms.internal.measurement.p3 p3Var, String str) {
        for (int i13 = 0; i13 < ((com.google.android.gms.internal.measurement.q3) p3Var.f31718b).j1(); i13++) {
            if (str.equals(((com.google.android.gms.internal.measurement.q3) p3Var.f31718b).e0(i13).E())) {
                return i13;
            }
        }
        return -1;
    }

    public static Bundle y(Map map, boolean z13) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z13) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj2 = arrayList.get(i13);
                    i13++;
                    arrayList2.add(y((Map) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzmh D(java.lang.String r16, com.google.android.gms.internal.measurement.q3 r17, com.google.android.gms.internal.measurement.g3 r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.c7.D(java.lang.String, com.google.android.gms.internal.measurement.q3, com.google.android.gms.internal.measurement.g3, java.lang.String):com.google.android.gms.measurement.internal.zzmh");
    }

    public final String E(com.google.android.gms.internal.measurement.o3 o3Var) {
        com.google.android.gms.internal.measurement.b3 T1;
        StringBuilder i13 = n60.o.i("\nbatch {\n");
        for (com.google.android.gms.internal.measurement.q3 q3Var : o3Var.v()) {
            if (q3Var != null) {
                J(1, i13);
                i13.append("bundle {\n");
                if (q3Var.v0()) {
                    R(i13, 1, "protocol_version", Integer.valueOf(q3Var.T0()));
                }
                ua.a();
                if (l().x(q3Var.W1(), s.f95124s0) && q3Var.y0()) {
                    R(i13, 1, "session_stitching_token", q3Var.P());
                }
                R(i13, 1, "platform", q3Var.N());
                if (q3Var.q0()) {
                    R(i13, 1, "gmp_version", Long.valueOf(q3Var.E1()));
                }
                if (q3Var.D0()) {
                    R(i13, 1, "uploading_gmp_version", Long.valueOf(q3Var.R1()));
                }
                if (q3Var.o0()) {
                    R(i13, 1, "dynamite_version", Long.valueOf(q3Var.w1()));
                }
                if (q3Var.b0()) {
                    R(i13, 1, "config_version", Long.valueOf(q3Var.o1()));
                }
                R(i13, 1, "gmp_app_id", q3Var.K());
                R(i13, 1, "admob_app_id", q3Var.V1());
                R(i13, 1, "app_id", q3Var.W1());
                R(i13, 1, "app_version", q3Var.D());
                if (q3Var.Y()) {
                    R(i13, 1, "app_version_major", Integer.valueOf(q3Var.d0()));
                }
                R(i13, 1, "firebase_instance_id", q3Var.J());
                if (q3Var.n0()) {
                    R(i13, 1, "dev_cert_hash", Long.valueOf(q3Var.s1()));
                }
                R(i13, 1, "app_store", q3Var.Y1());
                if (q3Var.C0()) {
                    R(i13, 1, "upload_timestamp_millis", Long.valueOf(q3Var.P1()));
                }
                if (q3Var.z0()) {
                    R(i13, 1, "start_timestamp_millis", Long.valueOf(q3Var.L1()));
                }
                if (q3Var.p0()) {
                    R(i13, 1, "end_timestamp_millis", Long.valueOf(q3Var.A1()));
                }
                if (q3Var.u0()) {
                    R(i13, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(q3Var.J1()));
                }
                if (q3Var.t0()) {
                    R(i13, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(q3Var.H1()));
                }
                R(i13, 1, "app_instance_id", q3Var.X1());
                R(i13, 1, "resettable_device_id", q3Var.O());
                R(i13, 1, "ds_id", q3Var.I());
                if (q3Var.s0()) {
                    R(i13, 1, "limited_ad_tracking", Boolean.valueOf(q3Var.W()));
                }
                R(i13, 1, "os_version", q3Var.M());
                R(i13, 1, "device_model", q3Var.H());
                R(i13, 1, "user_default_language", q3Var.Q());
                if (q3Var.B0()) {
                    R(i13, 1, "time_zone_offset_minutes", Integer.valueOf(q3Var.e1()));
                }
                if (q3Var.a0()) {
                    R(i13, 1, "bundle_sequential_index", Integer.valueOf(q3Var.E0()));
                }
                if (q3Var.x0()) {
                    R(i13, 1, "service_upload", Boolean.valueOf(q3Var.X()));
                }
                R(i13, 1, "health_monitor", q3Var.L());
                if (q3Var.w0()) {
                    R(i13, 1, "retry_counter", Integer.valueOf(q3Var.Z0()));
                }
                if (q3Var.l0()) {
                    R(i13, 1, "consent_signals", q3Var.F());
                }
                if (q3Var.r0()) {
                    R(i13, 1, "is_dma_region", Boolean.valueOf(q3Var.V()));
                }
                if (q3Var.m0()) {
                    R(i13, 1, "core_platform_services", q3Var.G());
                }
                if (q3Var.c0()) {
                    R(i13, 1, "consent_diagnostics", q3Var.E());
                }
                if (q3Var.A0()) {
                    R(i13, 1, "target_os_version", Long.valueOf(q3Var.N1()));
                }
                ia.a();
                if (l().x(q3Var.W1(), s.C0)) {
                    R(i13, 1, "ad_services_version", Integer.valueOf(q3Var.r()));
                    if (q3Var.Z() && (T1 = q3Var.T1()) != null) {
                        J(2, i13);
                        i13.append("attribution_eligibility_status {\n");
                        R(i13, 2, "eligible", Boolean.valueOf(T1.B()));
                        R(i13, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(T1.E()));
                        R(i13, 2, "pre_r", Boolean.valueOf(T1.F()));
                        R(i13, 2, "r_extensions_too_old", Boolean.valueOf(T1.G()));
                        R(i13, 2, "adservices_extension_too_old", Boolean.valueOf(T1.z()));
                        R(i13, 2, "ad_storage_not_allowed", Boolean.valueOf(T1.x()));
                        R(i13, 2, "measurement_manager_disabled", Boolean.valueOf(T1.D()));
                        J(2, i13);
                        i13.append("}\n");
                    }
                }
                com.google.android.gms.internal.measurement.i6<com.google.android.gms.internal.measurement.y3> T = q3Var.T();
                if (T != null) {
                    for (com.google.android.gms.internal.measurement.y3 y3Var : T) {
                        if (y3Var != null) {
                            J(2, i13);
                            i13.append("user_property {\n");
                            R(i13, 2, "set_timestamp_millis", y3Var.J() ? Long.valueOf(y3Var.C()) : null);
                            R(i13, 2, "name", m().g(y3Var.E()));
                            R(i13, 2, "string_value", y3Var.F());
                            R(i13, 2, "int_value", y3Var.I() ? Long.valueOf(y3Var.A()) : null);
                            R(i13, 2, "double_value", y3Var.G() ? Double.valueOf(y3Var.r()) : null);
                            J(2, i13);
                            i13.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.i6<com.google.android.gms.internal.measurement.d3> R = q3Var.R();
                if (R != null) {
                    for (com.google.android.gms.internal.measurement.d3 d3Var : R) {
                        if (d3Var != null) {
                            J(2, i13);
                            i13.append("audience_membership {\n");
                            if (d3Var.A()) {
                                R(i13, 2, "audience_id", Integer.valueOf(d3Var.r()));
                            }
                            if (d3Var.B()) {
                                R(i13, 2, "new_audience", Boolean.valueOf(d3Var.z()));
                            }
                            S(i13, "current_data", d3Var.x());
                            if (d3Var.C()) {
                                S(i13, "previous_data", d3Var.y());
                            }
                            J(2, i13);
                            i13.append("}\n");
                        }
                    }
                }
                com.google.android.gms.internal.measurement.i6<com.google.android.gms.internal.measurement.h3> S = q3Var.S();
                if (S != null) {
                    for (com.google.android.gms.internal.measurement.h3 h3Var : S) {
                        if (h3Var != null) {
                            J(2, i13);
                            i13.append("event {\n");
                            R(i13, 2, "name", m().c(h3Var.F()));
                            if (h3Var.J()) {
                                R(i13, 2, "timestamp_millis", Long.valueOf(h3Var.D()));
                            }
                            if (h3Var.I()) {
                                R(i13, 2, "previous_timestamp_millis", Long.valueOf(h3Var.C()));
                            }
                            if (h3Var.H()) {
                                R(i13, 2, "count", Integer.valueOf(h3Var.r()));
                            }
                            if (h3Var.A() != 0) {
                                P(i13, 2, h3Var.G());
                            }
                            J(2, i13);
                            i13.append("}\n");
                        }
                    }
                }
                J(1, i13);
                i13.append("}\n");
            }
        }
        i13.append("}\n");
        return i13.toString();
    }

    public final List I(com.google.android.gms.internal.measurement.j6 j6Var, List list) {
        int i13;
        ArrayList arrayList = new ArrayList(j6Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                zzj().f95271i.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().f95271i.a(num, Integer.valueOf(arrayList.size()), "Ignoring bit index greater than bitSet size");
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i14 = size2;
            i13 = size;
            size = i14;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i13);
    }

    public final void N(com.google.android.gms.internal.measurement.k3 k3Var, Object obj) {
        k3Var.g();
        com.google.android.gms.internal.measurement.l3.x((com.google.android.gms.internal.measurement.l3) k3Var.f31718b);
        k3Var.g();
        com.google.android.gms.internal.measurement.l3.z((com.google.android.gms.internal.measurement.l3) k3Var.f31718b);
        k3Var.g();
        com.google.android.gms.internal.measurement.l3.C((com.google.android.gms.internal.measurement.l3) k3Var.f31718b);
        k3Var.g();
        com.google.android.gms.internal.measurement.l3.E((com.google.android.gms.internal.measurement.l3) k3Var.f31718b);
        if (obj instanceof String) {
            k3Var.k((String) obj);
            return;
        }
        if (obj instanceof Long) {
            k3Var.i(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            k3Var.g();
            com.google.android.gms.internal.measurement.l3.s((com.google.android.gms.internal.measurement.l3) k3Var.f31718b, doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            zzj().f95268f.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.k3 F = com.google.android.gms.internal.measurement.l3.F();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.k3 F2 = com.google.android.gms.internal.measurement.l3.F();
                    F2.j(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        F2.i(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        F2.k((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        F2.g();
                        com.google.android.gms.internal.measurement.l3.s((com.google.android.gms.internal.measurement.l3) F2.f31718b, doubleValue2);
                    }
                    F.g();
                    com.google.android.gms.internal.measurement.l3.u((com.google.android.gms.internal.measurement.l3) F.f31718b, (com.google.android.gms.internal.measurement.l3) F2.b());
                }
                if (((com.google.android.gms.internal.measurement.l3) F.f31718b).B() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.l3) F.b());
                }
            }
        }
        k3Var.g();
        com.google.android.gms.internal.measurement.l3.w((com.google.android.gms.internal.measurement.l3) k3Var.f31718b, arrayList);
    }

    public final void O(StringBuilder sb3, int i13, com.google.android.gms.internal.measurement.w1 w1Var) {
        if (w1Var == null) {
            return;
        }
        J(i13, sb3);
        sb3.append("filter {\n");
        if (w1Var.x()) {
            R(sb3, i13, "complement", Boolean.valueOf(w1Var.w()));
        }
        if (w1Var.z()) {
            R(sb3, i13, "param_name", m().f(w1Var.v()));
        }
        if (w1Var.A()) {
            int i14 = i13 + 1;
            com.google.android.gms.internal.measurement.e2 u13 = w1Var.u();
            if (u13 != null) {
                J(i14, sb3);
                sb3.append("string_filter");
                sb3.append(" {\n");
                if (u13.A()) {
                    R(sb3, i14, "match_type", u13.s().name());
                }
                if (u13.z()) {
                    R(sb3, i14, "expression", u13.v());
                }
                if (u13.y()) {
                    R(sb3, i14, "case_sensitive", Boolean.valueOf(u13.x()));
                }
                if (u13.r() > 0) {
                    J(i13 + 2, sb3);
                    sb3.append("expression_list {\n");
                    for (String str : u13.w()) {
                        J(i13 + 3, sb3);
                        sb3.append(str);
                        sb3.append("\n");
                    }
                    sb3.append("}\n");
                }
                J(i14, sb3);
                sb3.append("}\n");
            }
        }
        if (w1Var.y()) {
            Q(sb3, i13 + 1, "number_filter", w1Var.t());
        }
        J(i13, sb3);
        sb3.append("}\n");
    }

    public final void P(StringBuilder sb3, int i13, com.google.android.gms.internal.measurement.i6 i6Var) {
        if (i6Var == null) {
            return;
        }
        int i14 = i13 + 1;
        Iterator it = i6Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.l3 l3Var = (com.google.android.gms.internal.measurement.l3) it.next();
            if (l3Var != null) {
                J(i14, sb3);
                sb3.append("param {\n");
                R(sb3, i14, "name", l3Var.M() ? m().f(l3Var.G()) : null);
                R(sb3, i14, "string_value", l3Var.N() ? l3Var.H() : null);
                R(sb3, i14, "int_value", l3Var.L() ? Long.valueOf(l3Var.D()) : null);
                R(sb3, i14, "double_value", l3Var.J() ? Double.valueOf(l3Var.r()) : null);
                if (l3Var.B() > 0) {
                    P(sb3, i14, (com.google.android.gms.internal.measurement.i6) l3Var.I());
                }
                J(i14, sb3);
                sb3.append("}\n");
            }
        }
    }

    public final boolean U(long j13, long j14) {
        if (j13 == 0 || j14 <= 0) {
            return true;
        }
        ((oh.b) zzb()).getClass();
        return Math.abs(System.currentTimeMillis() - j13) > j14;
    }

    public final byte[] X(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e13) {
            zzj().f95268f.b(e13, "Failed to gzip content");
            throw e13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        if (r6.booleanValue() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(java.lang.String r12) {
        /*
            r11 = this;
            com.bumptech.glide.d.t(r12)
            oi.i r0 = r11.r()
            oi.p4 r0 = r0.d0(r12)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.Object r2 = r11.f24333a
            oi.u4 r2 = (oi.u4) r2
            oi.p r2 = r2.j()
            java.lang.String r3 = "com.google"
            r2.p()
            oh.a r4 = r2.zzb()
            oh.b r4 = (oh.b) r4
            r4.getClass()
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r2.f95005g
            long r6 = r4 - r6
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r7 = 0
            if (r6 <= 0) goto L37
            r2.f95004f = r7
        L37:
            java.lang.Boolean r6 = r2.f95004f
            r8 = 1
            if (r6 == 0) goto L44
            boolean r2 = r6.booleanValue()
            if (r2 == 0) goto Lde
            goto Lb2
        L44:
            android.content.Context r6 = r2.zza()
            java.lang.String r9 = "android.permission.GET_ACCOUNTS"
            int r6 = d5.a.a(r6, r9)
            if (r6 == 0) goto L63
            oi.y3 r12 = r2.zzj()
            java.lang.String r0 = "Permission error checking for dasher/unicorn accounts"
            oi.a4 r12 = r12.f95272j
            r12.c(r0)
            r2.f95005g = r4
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r2.f95004f = r12
            goto Lde
        L63:
            android.accounts.AccountManager r6 = r2.f95003e
            if (r6 != 0) goto L71
            android.content.Context r6 = r2.zza()
            android.accounts.AccountManager r6 = android.accounts.AccountManager.get(r6)
            r2.f95003e = r6
        L71:
            android.accounts.AccountManager r6 = r2.f95003e     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            java.lang.String r10 = "service_HOSTED"
            r9[r1] = r10     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            android.accounts.AccountManagerFuture r6 = r6.getAccountsByTypeAndFeatures(r3, r9, r7, r7)     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            java.lang.Object r6 = r6.getResult()     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            android.accounts.Account[] r6 = (android.accounts.Account[]) r6     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            if (r6 == 0) goto L95
            int r6 = r6.length     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            if (r6 <= 0) goto L95
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            r2.f95004f = r3     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            r2.f95005g = r4     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            goto Lb2
        L8f:
            r12 = move-exception
            goto Lcd
        L91:
            r12 = move-exception
            goto Lcd
        L93:
            r12 = move-exception
            goto Lcd
        L95:
            android.accounts.AccountManager r6 = r2.f95003e     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            java.lang.String r10 = "service_uca"
            r9[r1] = r10     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            android.accounts.AccountManagerFuture r3 = r6.getAccountsByTypeAndFeatures(r3, r9, r7, r7)     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            java.lang.Object r3 = r3.getResult()     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            android.accounts.Account[] r3 = (android.accounts.Account[]) r3     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            if (r3 == 0) goto Ld8
            int r3 = r3.length     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            if (r3 <= 0) goto Ld8
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            r2.f95004f = r3     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
            r2.f95005g = r4     // Catch: android.accounts.OperationCanceledException -> L8f java.io.IOException -> L91 android.accounts.AuthenticatorException -> L93
        Lb2:
            boolean r0 = r0.g()
            if (r0 == 0) goto Lde
            oi.k4 r0 = r11.s()
            r0.p()
            com.google.android.gms.internal.measurement.s2 r12 = r0.G(r12)
            if (r12 != 0) goto Lc6
            goto Lde
        Lc6:
            boolean r12 = r12.I()
            if (r12 == 0) goto Lde
            return r8
        Lcd:
            oi.y3 r0 = r2.zzj()
            java.lang.String r3 = "Exception checking account types"
            oi.a4 r0 = r0.f95269g
            r0.b(r12, r3)
        Ld8:
            r2.f95005g = r4
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r2.f95004f = r12
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.c7.Y(java.lang.String):boolean");
    }

    public final byte[] Z(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
        } catch (IOException e13) {
            zzj().f95268f.b(e13, "Failed to ungzip content");
            throw e13;
        }
    }

    public final ArrayList a0() {
        Context context = this.f95249b.f94666l.f95197a;
        List list = s.f95087a;
        com.google.android.gms.internal.measurement.n4 a13 = com.google.android.gms.internal.measurement.n4.a(context.getContentResolver(), com.google.android.gms.internal.measurement.s4.a("com.google.android.gms.measurement"), r.f95076a);
        Map emptyMap = a13 == null ? Collections.emptyMap() : a13.b();
        if (emptyMap == null || emptyMap.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) s.P.a(null)).intValue();
        for (Map.Entry entry : emptyMap.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().f95271i.b(Integer.valueOf(arrayList.size()), "Too many experiment IDs. Number of IDs");
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e13) {
                    zzj().f95271i.b(e13, "Experiment ID NumberFormatException");
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // oi.y6
    public final boolean v() {
        return false;
    }

    public final long x(byte[] bArr) {
        com.bumptech.glide.d.t(bArr);
        o().p();
        MessageDigest A0 = f7.A0();
        if (A0 != null) {
            return f7.x(A0.digest(bArr));
        }
        zzj().f95268f.c("Failed to get MD5");
        return 0L;
    }

    public final Parcelable z(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (SafeParcelReader$ParseException unused) {
            zzj().f95268f.c("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }
}
