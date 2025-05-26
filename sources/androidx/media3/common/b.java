package androidx.media3.common;

import a.cb;
import a.y3;
import a7.i;
import a7.j;
import a7.n0;
import a7.o0;
import a7.q;
import a7.u;
import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import com.bumptech.glide.d;
import com.google.android.gms.ads.AdError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import n60.o;
import net.quikkly.android.utils.BitmapUtils;
import pk.c1;
import rk.c;

/* loaded from: classes.dex */
public final class b {
    public static final /* synthetic */ int P = 0;
    public final byte[] A;
    public final int B;
    public final j C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J */
    public final int f18750J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public int O;

    /* renamed from: a */
    public final String f18751a;

    /* renamed from: b */
    public final String f18752b;

    /* renamed from: c */
    public final List f18753c;

    /* renamed from: d */
    public final String f18754d;

    /* renamed from: e */
    public final int f18755e;

    /* renamed from: f */
    public final int f18756f;

    /* renamed from: g */
    public final int f18757g;

    /* renamed from: h */
    public final int f18758h;

    /* renamed from: i */
    public final int f18759i;

    /* renamed from: j */
    public final int f18760j;

    /* renamed from: k */
    public final String f18761k;

    /* renamed from: l */
    public final n0 f18762l;

    /* renamed from: m */
    public final Object f18763m;

    /* renamed from: n */
    public final String f18764n;

    /* renamed from: o */
    public final String f18765o;

    /* renamed from: p */
    public final int f18766p;

    /* renamed from: q */
    public final int f18767q;

    /* renamed from: r */
    public final List f18768r;

    /* renamed from: s */
    public final DrmInitData f18769s;

    /* renamed from: t */
    public final long f18770t;

    /* renamed from: u */
    public final boolean f18771u;

    /* renamed from: v */
    public final int f18772v;

    /* renamed from: w */
    public final int f18773w;

    /* renamed from: x */
    public final float f18774x;

    /* renamed from: y */
    public final int f18775y;

    /* renamed from: z */
    public final float f18776z;

    static {
        new q().a();
        d7.n0.Q(0);
        d7.n0.Q(1);
        d7.n0.Q(2);
        d7.n0.Q(3);
        d7.n0.Q(4);
        cb.s(5, 6, 7, 8, 9);
        cb.s(10, 11, 12, 13, 14);
        cb.s(15, 16, 17, 18, 19);
        cb.s(20, 21, 22, 23, 24);
        cb.s(25, 26, 27, 28, 29);
        cb.s(30, 31, 32, 33, 34);
    }

    public b(q qVar) {
        boolean z13;
        String str;
        this.f18751a = qVar.f1168a;
        String Z = d7.n0.Z(qVar.f1171d);
        this.f18754d = Z;
        if (qVar.f1170c.isEmpty() && qVar.f1169b != null) {
            this.f18753c = c1.v(new u(Z, qVar.f1169b));
            this.f18752b = qVar.f1169b;
        } else if (qVar.f1170c.isEmpty() || qVar.f1169b != null) {
            if (!qVar.f1170c.isEmpty() || qVar.f1169b != null) {
                for (int i13 = 0; i13 < qVar.f1170c.size(); i13++) {
                    if (!((u) qVar.f1170c.get(i13)).f1207b.equals(qVar.f1169b)) {
                    }
                }
                z13 = false;
                bf.b.t(z13);
                this.f18753c = qVar.f1170c;
                this.f18752b = qVar.f1169b;
            }
            z13 = true;
            bf.b.t(z13);
            this.f18753c = qVar.f1170c;
            this.f18752b = qVar.f1169b;
        } else {
            List list = qVar.f1170c;
            this.f18753c = list;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((u) list.get(0)).f1207b;
                    break;
                }
                u uVar = (u) it.next();
                if (TextUtils.equals(uVar.f1206a, Z)) {
                    str = uVar.f1207b;
                    break;
                }
            }
            this.f18752b = str;
        }
        this.f18755e = qVar.f1172e;
        bf.b.s("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", qVar.f1174g == 0 || (qVar.f1173f & 32768) != 0);
        this.f18756f = qVar.f1173f;
        this.f18757g = qVar.f1174g;
        int i14 = qVar.f1175h;
        this.f18758h = i14;
        int i15 = qVar.f1176i;
        this.f18759i = i15;
        this.f18760j = i15 != -1 ? i15 : i14;
        this.f18761k = qVar.f1177j;
        this.f18762l = qVar.f1178k;
        this.f18763m = qVar.f1179l;
        this.f18764n = qVar.f1180m;
        this.f18765o = qVar.f1181n;
        this.f18766p = qVar.f1182o;
        this.f18767q = qVar.f1183p;
        List list2 = qVar.f1184q;
        this.f18768r = list2 == null ? Collections.emptyList() : list2;
        DrmInitData drmInitData = qVar.f1185r;
        this.f18769s = drmInitData;
        this.f18770t = qVar.f1186s;
        this.f18771u = qVar.f1187t;
        this.f18772v = qVar.f1188u;
        this.f18773w = qVar.f1189v;
        this.f18774x = qVar.f1190w;
        int i16 = qVar.f1191x;
        this.f18775y = i16 == -1 ? 0 : i16;
        float f13 = qVar.f1192y;
        this.f18776z = f13 == -1.0f ? 1.0f : f13;
        this.A = qVar.f1193z;
        this.B = qVar.A;
        this.C = qVar.B;
        this.D = qVar.C;
        this.E = qVar.D;
        this.F = qVar.E;
        this.G = qVar.F;
        int i17 = qVar.G;
        this.H = i17 == -1 ? 0 : i17;
        int i18 = qVar.H;
        this.I = i18 != -1 ? i18 : 0;
        this.f18750J = qVar.I;
        this.K = qVar.f1167J;
        this.L = qVar.K;
        this.M = qVar.L;
        int i19 = qVar.M;
        if (i19 != 0 || drmInitData == null) {
            this.N = i19;
        } else {
            this.N = 1;
        }
    }

    public static String d(b bVar) {
        String str;
        String str2;
        int i13;
        if (bVar == null) {
            return "null";
        }
        z.a m13 = z.a.m();
        StringBuilder i14 = o.i("id=");
        i14.append(bVar.f18751a);
        i14.append(", mimeType=");
        i14.append(bVar.f18765o);
        String str3 = bVar.f18764n;
        if (str3 != null) {
            i14.append(", container=");
            i14.append(str3);
        }
        int i15 = bVar.f18760j;
        if (i15 != -1) {
            i14.append(", bitrate=");
            i14.append(i15);
        }
        String str4 = bVar.f18761k;
        if (str4 != null) {
            i14.append(", codecs=");
            i14.append(str4);
        }
        DrmInitData drmInitData = bVar.f18769s;
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i16 = 0; i16 < drmInitData.f18737d; i16++) {
                UUID uuid = drmInitData.f18734a[i16].f18739b;
                if (uuid.equals(i.f1067b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(i.f1068c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(i.f1070e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(i.f1069d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(i.f1066a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
            }
            i14.append(", drm=[");
            m13.e(i14, linkedHashSet);
            i14.append(']');
        }
        int i17 = bVar.f18772v;
        if (i17 != -1 && (i13 = bVar.f18773w) != -1) {
            i14.append(", res=");
            i14.append(i17);
            i14.append("x");
            i14.append(i13);
        }
        float f13 = bVar.f18776z;
        if (!c.a(f13)) {
            i14.append(", par=");
            Object[] objArr = {Float.valueOf(f13)};
            int i18 = d7.n0.f53866a;
            i14.append(String.format(Locale.US, "%.3f", objArr));
        }
        j jVar = bVar.C;
        if (jVar != null) {
            int i19 = jVar.f1087f;
            int i23 = jVar.f1086e;
            if ((i23 != -1 && i19 != -1) || jVar.e()) {
                i14.append(", color=");
                if (jVar.e()) {
                    String c13 = j.c(jVar.f1082a);
                    String b13 = j.b(jVar.f1083b);
                    String d2 = j.d(jVar.f1084c);
                    Locale locale = Locale.US;
                    str2 = c13 + "/" + b13 + "/" + d2;
                } else {
                    str2 = "NA/NA/NA";
                }
                i14.append(str2 + "/" + ((i23 == -1 || i19 == -1) ? "NA/NA" : i23 + "/" + i19));
            }
        }
        float f14 = bVar.f18774x;
        if (f14 != -1.0f) {
            i14.append(", fps=");
            i14.append(f14);
        }
        int i24 = bVar.D;
        if (i24 != -1) {
            i14.append(", maxSubLayers=");
            i14.append(i24);
        }
        int i25 = bVar.E;
        if (i25 != -1) {
            i14.append(", channels=");
            i14.append(i25);
        }
        int i26 = bVar.F;
        if (i26 != -1) {
            i14.append(", sample_rate=");
            i14.append(i26);
        }
        String str5 = bVar.f18754d;
        if (str5 != null) {
            i14.append(", language=");
            i14.append(str5);
        }
        List list = bVar.f18753c;
        if (!list.isEmpty()) {
            i14.append(", labels=[");
            m13.e(i14, d.y0(new y3(9), list));
            i14.append("]");
        }
        int i27 = bVar.f18755e;
        if (i27 != 0) {
            i14.append(", selectionFlags=[");
            int i28 = d7.n0.f53866a;
            ArrayList arrayList = new ArrayList();
            if ((i27 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i27 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i27 & 2) != 0) {
                arrayList.add("forced");
            }
            m13.e(i14, arrayList);
            i14.append("]");
        }
        int i29 = bVar.f18756f;
        if (i29 != 0) {
            i14.append(", roleFlags=[");
            int i33 = d7.n0.f53866a;
            ArrayList arrayList2 = new ArrayList();
            if ((i29 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i29 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i29 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i29 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i29 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i29 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i29 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i29 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i29 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
                arrayList2.add("sign");
            }
            if ((i29 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i29 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i29 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i29 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i29 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i29 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i29 & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            m13.e(i14, arrayList2);
            i14.append("]");
        }
        Object obj = bVar.f18763m;
        if (obj != null) {
            i14.append(", customData=");
            i14.append(obj);
        }
        if ((i29 & 32768) != 0) {
            i14.append(", auxiliaryTrackType=");
            int i34 = d7.n0.f53866a;
            int i35 = bVar.f18757g;
            if (i35 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i35 == 1) {
                str = "original";
            } else if (i35 == 2) {
                str = "depth-linear";
            } else if (i35 == 3) {
                str = "depth-inverse";
            } else {
                if (i35 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            i14.append(str);
        }
        return i14.toString();
    }

    public final q a() {
        q qVar = new q();
        qVar.f1168a = this.f18751a;
        qVar.f1169b = this.f18752b;
        qVar.f1170c = this.f18753c;
        qVar.f1171d = this.f18754d;
        qVar.f1172e = this.f18755e;
        qVar.f1173f = this.f18756f;
        qVar.f1175h = this.f18758h;
        qVar.f1176i = this.f18759i;
        qVar.f1177j = this.f18761k;
        qVar.f1178k = this.f18762l;
        qVar.f1179l = this.f18763m;
        qVar.f1180m = this.f18764n;
        qVar.f1181n = this.f18765o;
        qVar.f1182o = this.f18766p;
        qVar.f1183p = this.f18767q;
        qVar.f1184q = this.f18768r;
        qVar.f1185r = this.f18769s;
        qVar.f1186s = this.f18770t;
        qVar.f1187t = this.f18771u;
        qVar.f1188u = this.f18772v;
        qVar.f1189v = this.f18773w;
        qVar.f1190w = this.f18774x;
        qVar.f1191x = this.f18775y;
        qVar.f1192y = this.f18776z;
        qVar.f1193z = this.A;
        qVar.A = this.B;
        qVar.B = this.C;
        qVar.C = this.D;
        qVar.D = this.E;
        qVar.E = this.F;
        qVar.F = this.G;
        qVar.G = this.H;
        qVar.H = this.I;
        qVar.I = this.f18750J;
        qVar.f1167J = this.K;
        qVar.K = this.L;
        qVar.L = this.M;
        qVar.M = this.N;
        return qVar;
    }

    public final int b() {
        int i13;
        int i14 = this.f18772v;
        if (i14 == -1 || (i13 = this.f18773w) == -1) {
            return -1;
        }
        return i14 * i13;
    }

    public final boolean c(b bVar) {
        List list = this.f18768r;
        if (list.size() != bVar.f18768r.size()) {
            return false;
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (!Arrays.equals((byte[]) list.get(i13), (byte[]) bVar.f18768r.get(i13))) {
                return false;
            }
        }
        return true;
    }

    public final b e(b bVar) {
        String str;
        float f13;
        String str2;
        DrmInitData.SchemeData[] schemeDataArr;
        if (this == bVar) {
            return this;
        }
        int j13 = o0.j(this.f18765o);
        String str3 = bVar.f18751a;
        String str4 = bVar.f18752b;
        if (str4 == null) {
            str4 = this.f18752b;
        }
        List list = bVar.f18753c;
        if (list.isEmpty()) {
            list = this.f18753c;
        }
        if ((j13 != 3 && j13 != 1) || (str = bVar.f18754d) == null) {
            str = this.f18754d;
        }
        int i13 = this.f18758h;
        if (i13 == -1) {
            i13 = bVar.f18758h;
        }
        int i14 = this.f18759i;
        if (i14 == -1) {
            i14 = bVar.f18759i;
        }
        String str5 = this.f18761k;
        if (str5 == null) {
            String x13 = d7.n0.x(j13, bVar.f18761k);
            if (d7.n0.l0(x13).length == 1) {
                str5 = x13;
            }
        }
        n0 n0Var = bVar.f18762l;
        n0 n0Var2 = this.f18762l;
        if (n0Var2 != null) {
            n0Var = n0Var2.b(n0Var);
        }
        float f14 = this.f18774x;
        if (f14 == -1.0f && j13 == 2) {
            f14 = bVar.f18774x;
        }
        int i15 = this.f18755e | bVar.f18755e;
        int i16 = this.f18756f | bVar.f18756f;
        ArrayList arrayList = new ArrayList();
        DrmInitData drmInitData = bVar.f18769s;
        if (drmInitData != null) {
            DrmInitData.SchemeData[] schemeDataArr2 = drmInitData.f18734a;
            int length = schemeDataArr2.length;
            f13 = f14;
            int i17 = 0;
            while (i17 < length) {
                int i18 = length;
                DrmInitData.SchemeData schemeData = schemeDataArr2[i17];
                if (schemeData.b()) {
                    arrayList.add(schemeData);
                }
                i17++;
                length = i18;
            }
            str2 = drmInitData.f18736c;
        } else {
            f13 = f14;
            str2 = null;
        }
        DrmInitData drmInitData2 = this.f18769s;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.f18736c;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr3 = drmInitData2.f18734a;
            int length2 = schemeDataArr3.length;
            int i19 = 0;
            while (true) {
                String str6 = str2;
                if (i19 >= length2) {
                    break;
                }
                DrmInitData.SchemeData schemeData2 = schemeDataArr3[i19];
                if (schemeData2.b()) {
                    schemeDataArr = schemeDataArr3;
                    if (!DrmInitData.a(arrayList, size, schemeData2.f18739b)) {
                        arrayList.add(schemeData2);
                    }
                } else {
                    schemeDataArr = schemeDataArr3;
                }
                i19++;
                str2 = str6;
                schemeDataArr3 = schemeDataArr;
            }
        }
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, arrayList);
        q a13 = a();
        a13.f1168a = str3;
        a13.f1169b = str4;
        a13.f1170c = c1.r(list);
        a13.f1171d = str;
        a13.f1172e = i15;
        a13.f1173f = i16;
        a13.f1175h = i13;
        a13.f1176i = i14;
        a13.f1177j = str5;
        a13.f1178k = n0Var;
        a13.f1185r = drmInitData3;
        a13.f1190w = f13;
        a13.K = bVar.L;
        a13.L = bVar.M;
        return new b(a13);
    }

    public final boolean equals(Object obj) {
        int i13;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i14 = this.O;
        if (i14 == 0 || (i13 = bVar.O) == 0 || i14 == i13) {
            return this.f18755e == bVar.f18755e && this.f18756f == bVar.f18756f && this.f18757g == bVar.f18757g && this.f18758h == bVar.f18758h && this.f18759i == bVar.f18759i && this.f18766p == bVar.f18766p && this.f18770t == bVar.f18770t && this.f18772v == bVar.f18772v && this.f18773w == bVar.f18773w && this.f18775y == bVar.f18775y && this.B == bVar.B && this.D == bVar.D && this.E == bVar.E && this.F == bVar.F && this.G == bVar.G && this.H == bVar.H && this.I == bVar.I && this.f18750J == bVar.f18750J && this.L == bVar.L && this.M == bVar.M && this.N == bVar.N && Float.compare(this.f18774x, bVar.f18774x) == 0 && Float.compare(this.f18776z, bVar.f18776z) == 0 && Objects.equals(this.f18751a, bVar.f18751a) && Objects.equals(this.f18752b, bVar.f18752b) && this.f18753c.equals(bVar.f18753c) && Objects.equals(this.f18761k, bVar.f18761k) && Objects.equals(this.f18764n, bVar.f18764n) && Objects.equals(this.f18765o, bVar.f18765o) && Objects.equals(this.f18754d, bVar.f18754d) && Arrays.equals(this.A, bVar.A) && Objects.equals(this.f18762l, bVar.f18762l) && Objects.equals(this.C, bVar.C) && Objects.equals(this.f18769s, bVar.f18769s) && c(bVar) && Objects.equals(this.f18763m, bVar.f18763m);
        }
        return false;
    }

    public final int hashCode() {
        if (this.O == 0) {
            String str = this.f18751a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f18752b;
            int hashCode2 = (this.f18753c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f18754d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f18755e) * 31) + this.f18756f) * 31) + this.f18757g) * 31) + this.f18758h) * 31) + this.f18759i) * 31;
            String str4 = this.f18761k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            n0 n0Var = this.f18762l;
            int hashCode5 = (hashCode4 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
            Object obj = this.f18763m;
            int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.f18764n;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f18765o;
            this.O = ((((((((((((((((((((((Float.floatToIntBits(this.f18776z) + ((((Float.floatToIntBits(this.f18774x) + ((((((((((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f18766p) * 31) + ((int) this.f18770t)) * 31) + this.f18772v) * 31) + this.f18773w) * 31)) * 31) + this.f18775y) * 31)) * 31) + this.B) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.f18750J) * 31) + this.L) * 31) + this.M) * 31) + this.N;
        }
        return this.O;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Format(");
        sb3.append(this.f18751a);
        sb3.append(", ");
        sb3.append(this.f18752b);
        sb3.append(", ");
        sb3.append(this.f18764n);
        sb3.append(", ");
        sb3.append(this.f18765o);
        sb3.append(", ");
        sb3.append(this.f18761k);
        sb3.append(", ");
        sb3.append(this.f18760j);
        sb3.append(", ");
        sb3.append(this.f18754d);
        sb3.append(", [");
        sb3.append(this.f18772v);
        sb3.append(", ");
        sb3.append(this.f18773w);
        sb3.append(", ");
        sb3.append(this.f18774x);
        sb3.append(", ");
        sb3.append(this.C);
        sb3.append("], [");
        sb3.append(this.E);
        sb3.append(", ");
        return a.a.n(sb3, this.F, "])");
    }
}
