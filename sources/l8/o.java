package l8;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import d7.g0;
import d7.n0;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import net.quikkly.android.ui.CameraPreview;
import pk.c1;
import pk.h1;
import pk.v2;

/* loaded from: classes.dex */
public final class o implements e, g7.a0 {

    /* renamed from: q, reason: collision with root package name */
    public static final v2 f82053q = c1.y(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: r, reason: collision with root package name */
    public static final v2 f82054r = c1.y(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: s, reason: collision with root package name */
    public static final v2 f82055s = c1.y(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: t, reason: collision with root package name */
    public static final v2 f82056t = c1.y(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: u, reason: collision with root package name */
    public static final v2 f82057u = c1.y(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: v, reason: collision with root package name */
    public static final v2 f82058v = c1.y(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: w, reason: collision with root package name */
    public static o f82059w;

    /* renamed from: b, reason: collision with root package name */
    public final Context f82060b;

    /* renamed from: c, reason: collision with root package name */
    public final h1 f82061c;

    /* renamed from: d, reason: collision with root package name */
    public final h1.b f82062d;

    /* renamed from: e, reason: collision with root package name */
    public final d7.e f82063e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f82064f;

    /* renamed from: g, reason: collision with root package name */
    public final b0 f82065g;

    /* renamed from: h, reason: collision with root package name */
    public int f82066h;

    /* renamed from: i, reason: collision with root package name */
    public long f82067i;

    /* renamed from: j, reason: collision with root package name */
    public long f82068j;

    /* renamed from: k, reason: collision with root package name */
    public long f82069k;

    /* renamed from: l, reason: collision with root package name */
    public long f82070l;

    /* renamed from: m, reason: collision with root package name */
    public long f82071m;

    /* renamed from: n, reason: collision with root package name */
    public long f82072n;

    /* renamed from: o, reason: collision with root package name */
    public int f82073o;

    /* renamed from: p, reason: collision with root package name */
    public String f82074p;

    public o(Context context, Map map, int i13, d7.e eVar, boolean z13) {
        this.f82060b = context == null ? null : context.getApplicationContext();
        this.f82061c = h1.c(map);
        this.f82062d = new h1.b(22);
        this.f82065g = new b0(i13);
        this.f82063e = eVar;
        this.f82064f = z13;
        if (context == null) {
            this.f82073o = 0;
            this.f82071m = 1000000L;
            return;
        }
        d7.b0 b13 = d7.b0.b(context);
        int d2 = b13.d();
        this.f82073o = d2;
        this.f82071m = i(d2);
        b13.h(new d7.y() { // from class: l8.n
            @Override // d7.y
            public final void a(int i14) {
                o oVar = o.this;
                synchronized (oVar) {
                    int i15 = oVar.f82073o;
                    if (i15 == 0 || oVar.f82064f) {
                        if (i15 != i14 || oVar.f82074p == null) {
                            oVar.f82073o = i14;
                            if (i14 != 1 && i14 != 0 && i14 != 8) {
                                if (oVar.f82074p == null) {
                                    oVar.f82074p = n0.y(oVar.f82060b);
                                }
                                oVar.f82071m = oVar.i(i14);
                                ((g0) oVar.f82063e).getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                int i16 = oVar.f82066h > 0 ? (int) (elapsedRealtime - oVar.f82067i) : 0;
                                long j13 = oVar.f82068j;
                                long j14 = oVar.f82071m;
                                if (i16 != 0 || j13 != 0 || j14 != oVar.f82072n) {
                                    oVar.f82072n = j14;
                                    oVar.f82062d.a(i16, j13, j14);
                                }
                                oVar.f82067i = elapsedRealtime;
                                oVar.f82068j = 0L;
                                oVar.f82070l = 0L;
                                oVar.f82069k = 0L;
                                b0 b0Var = oVar.f82065g;
                                b0Var.f81997b.clear();
                                b0Var.f81999d = -1;
                                b0Var.f82000e = 0;
                                b0Var.f82001f = 0;
                            }
                        }
                    }
                }
            }
        }, d7.b.K());
    }

    public static long j(int i13, String str) {
        int[] iArr;
        switch (bs1.c.v1(str)) {
            case "AD":
            case "AI":
            case "BB":
            case "BQ":
            case "CW":
            case "DM":
            case "KN":
            case "KY":
            case "SX":
            case "VC":
                iArr = new int[]{1, 2, 0, 0, 2, 2};
                break;
            case "AE":
                iArr = new int[]{1, 4, 2, 3, 4, 1};
                break;
            case "AF":
            case "SZ":
                iArr = new int[]{4, 4, 3, 4, 2, 2};
                break;
            case "AG":
            case "CI":
                iArr = new int[]{2, 4, 3, 4, 2, 2};
                break;
            case "AL":
                iArr = new int[]{1, 1, 1, 2, 2, 2};
                break;
            case "AM":
            case "PA":
                iArr = new int[]{2, 3, 2, 3, 2, 2};
                break;
            case "AO":
                iArr = new int[]{3, 4, 4, 3, 2, 2};
                break;
            case "AQ":
            case "ER":
            case "NU":
            case "SC":
            case "SH":
                iArr = new int[]{4, 2, 2, 2, 2, 2};
                break;
            case "AR":
                iArr = new int[]{2, 2, 2, 2, 1, 2};
                break;
            case "AS":
                iArr = new int[]{2, 2, 3, 3, 2, 2};
                break;
            case "AT":
            case "EE":
            case "HU":
            case "IS":
            case "LV":
            case "MT":
            case "SE":
                iArr = new int[]{0, 0, 0, 0, 0, 2};
                break;
            case "AU":
                iArr = new int[]{0, 3, 1, 1, 3, 0};
                break;
            case "AW":
                iArr = new int[]{2, 2, 3, 4, 2, 2};
                break;
            case "AX":
            case "CX":
            case "LI":
            case "MS":
            case "PM":
            case "SM":
            case "VA":
                iArr = new int[]{0, 2, 2, 2, 2, 2};
                break;
            case "AZ":
            case "DJ":
            case "LY":
            case "SL":
                iArr = new int[]{4, 2, 3, 3, 2, 2};
                break;
            case "BA":
            case "JO":
            case "TR":
                iArr = new int[]{1, 1, 1, 1, 2, 2};
                break;
            case "BD":
                iArr = new int[]{2, 1, 3, 2, 4, 2};
                break;
            case "BE":
                iArr = new int[]{0, 0, 1, 0, 1, 2};
                break;
            case "BF":
            case "SD":
            case "SY":
            case "TD":
                iArr = new int[]{4, 3, 4, 4, 2, 2};
                break;
            case "BG":
            case "PT":
            case "SI":
                iArr = new int[]{0, 0, 0, 0, 1, 2};
                break;
            case "BH":
                iArr = new int[]{1, 3, 1, 3, 4, 2};
                break;
            case "BI":
            case "GQ":
            case "HT":
            case "NE":
            case "VE":
            case "YE":
                iArr = new int[]{4, 4, 4, 4, 2, 2};
                break;
            case "BJ":
                iArr = new int[]{4, 4, 2, 3, 2, 2};
                break;
            case "BL":
            case "MP":
            case "PY":
                iArr = new int[]{1, 2, 2, 2, 2, 2};
                break;
            case "BM":
                iArr = new int[]{0, 2, 0, 0, 2, 2};
                break;
            case "BN":
                iArr = new int[]{3, 2, 0, 0, 2, 2};
                break;
            case "BO":
                iArr = new int[]{1, 2, 4, 4, 2, 2};
                break;
            case "BR":
                iArr = new int[]{1, 1, 1, 1, 2, 4};
                break;
            case "BS":
                iArr = new int[]{3, 2, 1, 1, 2, 2};
                break;
            case "BT":
                iArr = new int[]{3, 1, 2, 2, 3, 2};
                break;
            case "BW":
                iArr = new int[]{3, 2, 1, 0, 2, 2};
                break;
            case "BY":
                iArr = new int[]{1, 2, 3, 3, 2, 2};
                break;
            case "BZ":
            case "CK":
                iArr = new int[]{2, 2, 2, 1, 2, 2};
                break;
            case "CA":
            case "UA":
                iArr = new int[]{0, 2, 1, 2, 3, 3};
                break;
            case "CD":
            case "ML":
                iArr = new int[]{3, 3, 2, 2, 2, 2};
                break;
            case "CF":
                iArr = new int[]{4, 2, 4, 2, 2, 2};
                break;
            case "CG":
            case "EG":
            case "MG":
                iArr = new int[]{3, 4, 3, 3, 2, 2};
                break;
            case "CH":
                iArr = new int[]{0, 1, 0, 0, 0, 2};
                break;
            case "CL":
            case "TH":
                iArr = new int[]{0, 1, 2, 2, 2, 2};
                break;
            case "CM":
            case "MR":
                iArr = new int[]{4, 3, 3, 4, 2, 2};
                break;
            case "CN":
                iArr = new int[]{2, 0, 1, 1, 3, 1};
                break;
            case "CO":
                iArr = new int[]{2, 3, 3, 2, 2, 2};
                break;
            case "CR":
            case "NI":
                iArr = new int[]{2, 4, 4, 4, 2, 2};
                break;
            case "CU":
            case "KI":
            case "NR":
            case "TL":
                iArr = new int[]{4, 2, 4, 4, 2, 2};
                break;
            case "CV":
                iArr = new int[]{2, 3, 0, 1, 2, 2};
                break;
            case "CY":
                iArr = new int[]{1, 0, 1, 0, 0, 2};
                break;
            case "CZ":
                iArr = new int[]{0, 0, 2, 0, 1, 2};
                break;
            case "DE":
                iArr = new int[]{0, 1, 4, 2, 2, 1};
                break;
            case "DK":
                iArr = new int[]{0, 0, 2, 0, 0, 2};
                break;
            case "DO":
            case "LR":
                iArr = new int[]{3, 4, 4, 4, 2, 2};
                break;
            case "DZ":
            case "TJ":
                iArr = new int[]{3, 3, 4, 4, 2, 2};
                break;
            case "EC":
                iArr = new int[]{1, 3, 2, 1, 2, 2};
                break;
            case "ES":
                iArr = new int[]{0, 0, 0, 0, 1, 0};
                break;
            case "ET":
                iArr = new int[]{4, 3, 4, 4, 4, 2};
                break;
            case "FI":
                iArr = new int[]{0, 0, 0, 1, 0, 2};
                break;
            case "FJ":
                iArr = new int[]{3, 2, 2, 3, 2, 2};
                break;
            case "FK":
            case "NF":
            case "SJ":
                iArr = new int[]{3, 2, 2, 2, 2, 2};
                break;
            case "FM":
                iArr = new int[]{4, 2, 4, 0, 2, 2};
                break;
            case "FO":
                iArr = new int[]{0, 2, 2, 0, 2, 2};
                break;
            case "FR":
                iArr = new int[]{1, 1, 1, 1, 0, 2};
                break;
            case "GA":
                iArr = new int[]{3, 4, 0, 0, 2, 2};
                break;
            case "GB":
                iArr = new int[]{1, 1, 3, 2, 2, 2};
                break;
            case "GD":
                iArr = new int[]{2, 2, 0, 0, 2, 2};
                break;
            case "GE":
                iArr = new int[]{1, 1, 0, 2, 2, 2};
                break;
            case "GF":
                iArr = new int[]{3, 2, 3, 3, 2, 2};
                break;
            case "GG":
                iArr = new int[]{0, 2, 1, 1, 2, 2};
                break;
            case "GH":
                iArr = new int[]{3, 3, 3, 2, 2, 2};
                break;
            case "GI":
            case "IM":
            case "JE":
                iArr = new int[]{0, 2, 0, 1, 2, 2};
                break;
            case "GL":
            case "MC":
                iArr = new int[]{1, 2, 2, 0, 2, 2};
                break;
            case "GM":
            case "SS":
                iArr = new int[]{4, 3, 2, 4, 2, 2};
                break;
            case "GN":
                iArr = new int[]{3, 4, 4, 2, 2, 2};
                break;
            case "GP":
                iArr = new int[]{2, 1, 1, 3, 2, 2};
                break;
            case "GR":
                iArr = new int[]{1, 0, 0, 0, 1, 2};
                break;
            case "GT":
                iArr = new int[]{2, 1, 2, 1, 2, 2};
                break;
            case "GU":
                iArr = new int[]{2, 2, 4, 3, 3, 2};
                break;
            case "GW":
                iArr = new int[]{4, 4, 1, 2, 2, 2};
                break;
            case "GY":
                iArr = new int[]{3, 1, 1, 3, 2, 2};
                break;
            case "HK":
                iArr = new int[]{0, 1, 0, 1, 1, 0};
                break;
            case "HR":
            case "KW":
                iArr = new int[]{1, 0, 0, 0, 0, 2};
                break;
            case "ID":
                iArr = new int[]{3, 1, 3, 3, 2, 4};
                break;
            case "IE":
                iArr = new int[]{1, 1, 1, 1, 1, 2};
                break;
            case "IL":
                iArr = new int[]{1, 2, 2, 3, 4, 2};
                break;
            case "IN":
                iArr = new int[]{1, 1, 3, 2, 2, 3};
                break;
            case "IO":
                iArr = new int[]{3, 2, 2, 0, 2, 2};
                break;
            case "IQ":
                iArr = new int[]{3, 2, 3, 2, 2, 2};
                break;
            case "IR":
                iArr = new int[]{4, 2, 3, 3, 4, 3};
                break;
            case "IT":
                iArr = new int[]{0, 1, 1, 2, 1, 2};
                break;
            case "JM":
                iArr = new int[]{2, 4, 3, 1, 2, 2};
                break;
            case "JP":
                iArr = new int[]{0, 3, 2, 3, 4, 2};
                break;
            case "KE":
                iArr = new int[]{3, 2, 1, 1, 1, 2};
                break;
            case "KG":
                iArr = new int[]{2, 1, 1, 2, 2, 2};
                break;
            case "KH":
                iArr = new int[]{1, 0, 4, 2, 2, 2};
                break;
            case "KM":
            case "VU":
                iArr = new int[]{4, 3, 3, 2, 2, 2};
                break;
            case "KR":
                iArr = new int[]{0, 2, 2, 4, 4, 4};
                break;
            case "KZ":
                iArr = new int[]{2, 1, 2, 2, 3, 2};
                break;
            case "LA":
                iArr = new int[]{1, 2, 1, 3, 2, 2};
                break;
            case "LB":
                iArr = new int[]{3, 1, 1, 2, 2, 2};
                break;
            case "LC":
                iArr = new int[]{2, 2, 1, 1, 2, 2};
                break;
            case "LK":
            case "MM":
                iArr = new int[]{3, 2, 3, 3, 4, 2};
                break;
            case "LS":
            case "PG":
                iArr = new int[]{4, 3, 3, 3, 2, 2};
                break;
            case "LT":
                iArr = new int[]{0, 1, 0, 1, 0, 2};
                break;
            case "LU":
                iArr = new int[]{4, 0, 3, 2, 1, 3};
                break;
            case "MA":
                iArr = new int[]{3, 3, 1, 1, 2, 2};
                break;
            case "MD":
                iArr = new int[]{1, 0, 0, 0, 2, 2};
                break;
            case "ME":
                iArr = new int[]{2, 0, 0, 1, 3, 2};
                break;
            case "MF":
                iArr = new int[]{1, 2, 2, 3, 2, 2};
                break;
            case "MH":
            case "TM":
            case "TV":
            case "WF":
                iArr = new int[]{4, 2, 2, 4, 2, 2};
                break;
            case "MK":
                iArr = new int[]{1, 0, 0, 1, 3, 2};
                break;
            case "MN":
                iArr = new int[]{2, 0, 2, 2, 2, 2};
                break;
            case "MO":
                iArr = new int[]{0, 2, 4, 4, 3, 1};
                break;
            case "MQ":
                iArr = new int[]{2, 1, 2, 3, 2, 2};
                break;
            case "MU":
                iArr = new int[]{3, 1, 0, 2, 2, 2};
                break;
            case "MV":
                iArr = new int[]{3, 2, 1, 3, 4, 2};
                break;
            case "MW":
                iArr = new int[]{3, 2, 2, 1, 2, 2};
                break;
            case "MX":
                iArr = new int[]{2, 4, 4, 4, 3, 2};
                break;
            case "MY":
                iArr = new int[]{1, 0, 4, 1, 1, 0};
                break;
            case "MZ":
            case "WS":
                iArr = new int[]{3, 1, 2, 2, 2, 2};
                break;
            case "NA":
                iArr = new int[]{3, 4, 3, 2, 2, 2};
                break;
            case "NC":
            case "YT":
                iArr = new int[]{2, 3, 3, 4, 2, 2};
                break;
            case "NG":
                iArr = new int[]{3, 4, 2, 1, 2, 2};
                break;
            case "NL":
                iArr = new int[]{2, 1, 4, 3, 0, 4};
                break;
            case "NO":
                iArr = new int[]{0, 0, 3, 0, 0, 2};
                break;
            case "NP":
                iArr = new int[]{2, 2, 4, 3, 2, 2};
                break;
            case "NZ":
                iArr = new int[]{0, 0, 1, 2, 4, 2};
                break;
            case "OM":
                iArr = new int[]{2, 3, 1, 2, 4, 2};
                break;
            case "PE":
                iArr = new int[]{1, 2, 4, 4, 3, 2};
                break;
            case "PF":
                iArr = new int[]{2, 2, 3, 1, 2, 2};
                break;
            case "PH":
                iArr = new int[]{2, 1, 2, 3, 2, 1};
                break;
            case "PK":
                iArr = new int[]{3, 3, 3, 3, 2, 2};
                break;
            case "PL":
                iArr = new int[]{1, 0, 2, 2, 4, 4};
                break;
            case "PR":
                iArr = new int[]{2, 0, 2, 1, 2, 0};
                break;
            case "PS":
                iArr = new int[]{3, 4, 1, 3, 2, 2};
                break;
            case "PW":
                iArr = new int[]{2, 2, 4, 1, 2, 2};
                break;
            case "QA":
                iArr = new int[]{1, 4, 4, 4, 4, 2};
                break;
            case "RE":
                iArr = new int[]{0, 3, 2, 3, 1, 2};
                break;
            case "RO":
                iArr = new int[]{0, 0, 1, 1, 3, 2};
                break;
            case "RS":
                iArr = new int[]{1, 0, 0, 1, 2, 2};
                break;
            case "RU":
                iArr = new int[]{1, 0, 0, 1, 3, 3};
                break;
            case "RW":
                iArr = new int[]{3, 3, 2, 0, 2, 2};
                break;
            case "SA":
                iArr = new int[]{3, 1, 1, 2, 2, 0};
                break;
            case "SB":
            case "ZW":
                iArr = new int[]{4, 2, 4, 3, 2, 2};
                break;
            case "SG":
                iArr = new int[]{2, 3, 3, 3, 1, 1};
                break;
            case "SK":
                iArr = new int[]{0, 1, 1, 1, 2, 2};
                break;
            case "SN":
                iArr = new int[]{4, 4, 3, 2, 2, 2};
                break;
            case "SO":
                iArr = new int[]{2, 2, 3, 4, 4, 2};
                break;
            case "SR":
                iArr = new int[]{2, 4, 4, 1, 2, 2};
                break;
            case "ST":
                iArr = new int[]{2, 2, 1, 2, 2, 2};
                break;
            case "SV":
                iArr = new int[]{2, 3, 2, 1, 2, 2};
                break;
            case "TC":
                iArr = new int[]{3, 2, 1, 2, 2, 2};
                break;
            case "TG":
                iArr = new int[]{3, 4, 1, 0, 2, 2};
                break;
            case "TN":
                iArr = new int[]{3, 1, 1, 1, 2, 2};
                break;
            case "TO":
                iArr = new int[]{3, 2, 4, 3, 2, 2};
                break;
            case "TT":
                iArr = new int[]{2, 4, 1, 0, 2, 2};
                break;
            case "TW":
                iArr = new int[]{0, 0, 0, 0, 0, 0};
                break;
            case "TZ":
                iArr = new int[]{3, 4, 2, 1, 3, 2};
                break;
            case "UG":
                iArr = new int[]{3, 3, 2, 3, 4, 2};
                break;
            case "US":
                iArr = new int[]{2, 2, 4, 1, 3, 1};
                break;
            case "UY":
                iArr = new int[]{2, 1, 1, 2, 1, 2};
                break;
            case "UZ":
                iArr = new int[]{1, 2, 3, 4, 3, 2};
                break;
            case "VG":
                iArr = new int[]{2, 2, 1, 1, 2, 4};
                break;
            case "VI":
                iArr = new int[]{0, 2, 1, 2, 2, 2};
                break;
            case "VN":
                iArr = new int[]{0, 0, 1, 2, 2, 2};
                break;
            case "XK":
                iArr = new int[]{1, 2, 1, 1, 2, 2};
                break;
            case "ZA":
                iArr = new int[]{2, 4, 2, 1, 1, 2};
                break;
            case "ZM":
                iArr = new int[]{4, 4, 4, 3, 2, 2};
                break;
            default:
                iArr = new int[]{2, 2, 2, 2, 2, 2};
                break;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return ((Long) f82054r.get(iArr[1])).longValue();
            }
            if (i13 == 4) {
                return ((Long) f82055s.get(iArr[2])).longValue();
            }
            if (i13 == 5) {
                return ((Long) f82056t.get(iArr[3])).longValue();
            }
            if (i13 != 7) {
                if (i13 == 9) {
                    return ((Long) f82058v.get(iArr[5])).longValue();
                }
                if (i13 != 10) {
                    return 1000000L;
                }
                return ((Long) f82057u.get(iArr[4])).longValue();
            }
        }
        return ((Long) f82053q.get(iArr[0])).longValue();
    }

    @Override // g7.a0
    public final synchronized void a(g7.f fVar, g7.i iVar, boolean z13) {
        if (z13) {
            try {
                if (!iVar.c(8)) {
                    if (this.f82066h == 0) {
                        ((g0) this.f82063e).getClass();
                        this.f82067i = SystemClock.elapsedRealtime();
                    }
                    this.f82066h++;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // l8.e
    public final void b(d dVar) {
        this.f82062d.k(dVar);
    }

    @Override // l8.e
    public final g7.a0 c() {
        return this;
    }

    @Override // g7.a0
    public final synchronized void d(g7.f fVar, g7.i iVar, boolean z13) {
        long j13;
        long j14;
        if (z13) {
            try {
                if (!iVar.c(8)) {
                    bf.b.t(this.f82066h > 0);
                    ((g0) this.f82063e).getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i13 = (int) (elapsedRealtime - this.f82067i);
                    this.f82069k += i13;
                    long j15 = this.f82070l;
                    long j16 = this.f82068j;
                    this.f82070l = j15 + j16;
                    if (i13 > 0) {
                        this.f82065g.a((int) Math.sqrt(j16), (j16 * 8000.0f) / i13);
                        if (this.f82069k < CameraPreview.AUTOFOCUS_INTERVAL_MILLIS) {
                            if (this.f82070l >= 524288) {
                            }
                            j13 = this.f82068j;
                            j14 = this.f82071m;
                            if (i13 == 0 || j13 != 0 || j14 != this.f82072n) {
                                this.f82072n = j14;
                                this.f82062d.a(i13, j13, j14);
                            }
                            this.f82067i = elapsedRealtime;
                            this.f82068j = 0L;
                        }
                        this.f82071m = (long) this.f82065g.b();
                        j13 = this.f82068j;
                        j14 = this.f82071m;
                        if (i13 == 0) {
                        }
                        this.f82072n = j14;
                        this.f82062d.a(i13, j13, j14);
                        this.f82067i = elapsedRealtime;
                        this.f82068j = 0L;
                    }
                    this.f82066h--;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // l8.e
    public final synchronized long e() {
        return this.f82071m;
    }

    @Override // g7.a0
    public final void f(g7.f fVar, g7.i iVar) {
    }

    @Override // g7.a0
    public final synchronized void g(g7.f fVar, g7.i iVar, boolean z13, int i13) {
        if (z13) {
            if (!iVar.c(8)) {
                this.f82068j += i13;
            }
        }
    }

    @Override // l8.e
    public final void h(Handler handler, d dVar) {
        dVar.getClass();
        h1.b bVar = this.f82062d;
        bVar.getClass();
        bVar.k(dVar);
        ((CopyOnWriteArrayList) bVar.f66449b).add(new c(handler, dVar));
    }

    public final long i(int i13) {
        Integer valueOf = Integer.valueOf(i13);
        h1 h1Var = this.f82061c;
        Long l13 = (Long) h1Var.get(valueOf);
        if (l13 == null) {
            l13 = (Long) h1Var.get(0);
        } else if (l13.longValue() == -9223372036854775807L) {
            l13 = Long.valueOf(j(i13, this.f82074p));
        }
        if (l13 == null) {
            l13 = 1000000L;
        }
        return l13.longValue();
    }
}
