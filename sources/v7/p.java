package v7;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import d7.n0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh2.a1;
import l8.y;
import pk.a0;
import pk.c1;
import pk.u0;

/* loaded from: classes3.dex */
public final class p implements y {

    /* renamed from: a, reason: collision with root package name */
    public final n f124388a;

    /* renamed from: b, reason: collision with root package name */
    public final k f124389b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f124347c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f124349d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f124351e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f124353f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f124355g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f124357h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f124359i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f124361j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f124363k = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f124365l = Pattern.compile("SUPPLEMENTAL-CODECS=\"(.+?)\"");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f124367m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f124369n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f124371o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f124373p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f124375q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f124377r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f124379s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f124381t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f124382u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f124383v = a("CAN-SKIP-DATERANGES");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f124384w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f124385x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f124386y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f124387z = a("CAN-BLOCK-RELOAD");
    public static final Pattern A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern D = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern E = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f124344J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern L = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern M = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern N = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern O = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern Q = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern R = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern T = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern U = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern W = a("AUTOSELECT");
    public static final Pattern X = a("DEFAULT");
    public static final Pattern Y = a("FORCED");
    public static final Pattern Z = a("INDEPENDENT");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f124345a0 = a("GAP");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f124346b0 = a("PRECISE");

    /* renamed from: c0, reason: collision with root package name */
    public static final Pattern f124348c0 = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: d0, reason: collision with root package name */
    public static final Pattern f124350d0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f124352e0 = Pattern.compile("[:,]ID=\"(.+?)\"");

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f124354f0 = Pattern.compile("CLASS=\"(.+?)\"");

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f124356g0 = Pattern.compile("START-DATE=\"(.+?)\"");

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f124358h0 = Pattern.compile("CUE=\"(.+?)\"");

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f124360i0 = Pattern.compile("END-DATE=\"(.+?)\"");

    /* renamed from: j0, reason: collision with root package name */
    public static final Pattern f124362j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* renamed from: k0, reason: collision with root package name */
    public static final Pattern f124364k0 = a("END-ON-NEXT");

    /* renamed from: l0, reason: collision with root package name */
    public static final Pattern f124366l0 = Pattern.compile("X-ASSET-URI=\"(.+?)\"");

    /* renamed from: m0, reason: collision with root package name */
    public static final Pattern f124368m0 = Pattern.compile("X-ASSET-LIST=\"(.+?)\"");

    /* renamed from: n0, reason: collision with root package name */
    public static final Pattern f124370n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: o0, reason: collision with root package name */
    public static final Pattern f124372o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* renamed from: p0, reason: collision with root package name */
    public static final Pattern f124374p0 = Pattern.compile("X-SNAP=\"(.+?)\"");

    /* renamed from: q0, reason: collision with root package name */
    public static final Pattern f124376q0 = Pattern.compile("X-RESTRICT=\"(.+?)\"");

    /* renamed from: r0, reason: collision with root package name */
    public static final Pattern f124378r0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: s0, reason: collision with root package name */
    public static final Pattern f124380s0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public p() {
        this(n.f124330n, null);
    }

    public static Pattern a(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static DrmInitData b(String str, DrmInitData.SchemeData[] schemeDataArr) {
        DrmInitData.SchemeData[] schemeDataArr2 = new DrmInitData.SchemeData[schemeDataArr.length];
        for (int i13 = 0; i13 < schemeDataArr.length; i13++) {
            DrmInitData.SchemeData schemeData = schemeDataArr[i13];
            schemeDataArr2[i13] = new DrmInitData.SchemeData(schemeData.f18739b, schemeData.f18740c, schemeData.f18741d, null);
        }
        return new DrmInitData(str, true, schemeDataArr2);
    }

    public static DrmInitData.SchemeData c(String str, String str2, HashMap hashMap) {
        String i13 = i(str, M, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, hashMap);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = N;
        if (equals) {
            String j13 = j(str, pattern, hashMap);
            return new DrmInitData.SchemeData(a7.i.f1069d, null, "video/mp4", Base64.decode(j13.substring(j13.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = a7.i.f1069d;
            int i14 = n0.f53866a;
            return new DrmInitData.SchemeData(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(i13)) {
            return null;
        }
        String j14 = j(str, pattern, hashMap);
        byte[] decode = Base64.decode(j14.substring(j14.indexOf(44)), 0);
        UUID uuid2 = a7.i.f1070e;
        return new DrmInitData.SchemeData(uuid2, null, "video/mp4", a1.q(uuid2, null, decode));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static k d(n nVar, k kVar, androidx.appcompat.app.d dVar, String str) {
        ArrayList arrayList;
        int i13;
        HashMap hashMap;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        String str3;
        int i14;
        ArrayList arrayList4;
        c1 c1Var;
        int i15;
        long j13;
        ArrayList arrayList5;
        ArrayList arrayList6;
        long j14;
        ArrayList arrayList7;
        HashMap hashMap2;
        DrmInitData drmInitData;
        Matcher matcher;
        int i16;
        String str4;
        ArrayList arrayList8;
        d dVar2;
        char c13;
        n nVar2 = nVar;
        k kVar2 = kVar;
        boolean z13 = nVar2.f124343c;
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        j jVar = new j(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, false);
        TreeMap treeMap = new TreeMap();
        String str5 = "";
        boolean z14 = z13;
        j jVar2 = jVar;
        String str6 = "";
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j23 = 0;
        long j24 = 0;
        long j25 = 0;
        long j26 = -1;
        int i17 = 0;
        long j27 = -9223372036854775807L;
        boolean z15 = false;
        boolean z16 = false;
        int i18 = 0;
        int i19 = 1;
        long j28 = -9223372036854775807L;
        long j29 = -9223372036854775807L;
        boolean z17 = false;
        DrmInitData drmInitData2 = null;
        DrmInitData drmInitData3 = null;
        boolean z18 = false;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i23 = 0;
        boolean z19 = false;
        h hVar = null;
        ArrayList arrayList14 = arrayList10;
        f fVar = null;
        while (dVar.D()) {
            String H2 = dVar.H();
            if (H2.startsWith("#EXT")) {
                arrayList12.add(H2);
            }
            if (H2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String j33 = j(H2, f124381t, hashMap3);
                if ("VOD".equals(j33)) {
                    i17 = 1;
                } else if ("EVENT".equals(j33)) {
                    i17 = 2;
                }
            } else if (H2.equals("#EXT-X-I-FRAMES-ONLY")) {
                z19 = true;
            } else {
                if (H2.startsWith("#EXT-X-START")) {
                    arrayList = arrayList13;
                    long parseDouble = (long) (Double.parseDouble(j(H2, F, Collections.emptyMap())) * 1000000.0d);
                    z15 = f(H2, f124346b0);
                    j27 = parseDouble;
                } else {
                    arrayList = arrayList13;
                    if (H2.startsWith("#EXT-X-SERVER-CONTROL")) {
                        double g13 = g(H2, f124382u, -9.223372036854776E18d);
                        long j34 = g13 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g13 * 1000000.0d);
                        boolean f13 = f(H2, f124383v);
                        double g14 = g(H2, f124385x, -9.223372036854776E18d);
                        long j35 = g14 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g14 * 1000000.0d);
                        double g15 = g(H2, f124386y, -9.223372036854776E18d);
                        jVar2 = new j(j34, j35, g15 == -9.223372036854776E18d ? -9223372036854775807L : (long) (g15 * 1000000.0d), f13, f(H2, f124387z));
                    } else if (H2.startsWith("#EXT-X-PART-INF")) {
                        j29 = (long) (Double.parseDouble(j(H2, f124377r, Collections.emptyMap())) * 1000000.0d);
                    } else {
                        boolean startsWith = H2.startsWith("#EXT-X-MAP");
                        Pattern pattern = H;
                        ArrayList arrayList15 = arrayList12;
                        Pattern pattern2 = N;
                        if (startsWith) {
                            String j36 = j(H2, pattern2, hashMap3);
                            String i24 = i(H2, pattern, null, hashMap3);
                            if (i24 != null) {
                                int i25 = n0.f53866a;
                                String[] split = i24.split("@", -1);
                                j26 = Long.parseLong(split[0]);
                                if (split.length > 1) {
                                    j17 = Long.parseLong(split[1]);
                                }
                            }
                            if (j26 == -1) {
                                j17 = 0;
                            }
                            if (str7 != null && str8 == null) {
                                throw ParserException.b("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                            }
                            hVar = new h(j17, j26, j36, str7, str8);
                            if (j26 != -1) {
                                j17 += j26;
                            }
                            j26 = -1;
                            arrayList13 = arrayList;
                            arrayList12 = arrayList15;
                        } else {
                            HashMap hashMap5 = hashMap4;
                            f fVar2 = fVar;
                            if (H2.startsWith("#EXT-X-TARGETDURATION")) {
                                j28 = Integer.parseInt(j(H2, f124371o, Collections.emptyMap())) * 1000000;
                            } else if (H2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                j18 = Long.parseLong(j(H2, A, Collections.emptyMap()));
                                j16 = j18;
                            } else if (H2.startsWith("#EXT-X-VERSION")) {
                                i19 = Integer.parseInt(j(H2, f124379s, Collections.emptyMap()));
                            } else {
                                if (H2.startsWith("#EXT-X-DEFINE")) {
                                    String i26 = i(H2, f124350d0, null, hashMap3);
                                    if (i26 != null) {
                                        String str10 = (String) nVar2.f124339l.get(i26);
                                        if (str10 != null) {
                                            hashMap3.put(i26, str10);
                                        }
                                    } else {
                                        hashMap3.put(j(H2, S, hashMap3), j(H2, f124348c0, hashMap3));
                                    }
                                    i13 = i17;
                                    hashMap = hashMap3;
                                    arrayList2 = arrayList14;
                                    str2 = str5;
                                    arrayList3 = arrayList9;
                                    str3 = str9;
                                } else if (H2.startsWith("#EXTINF")) {
                                    j24 = new BigDecimal(j(H2, B, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
                                    str6 = i(H2, C, str5, hashMap3);
                                } else {
                                    if (H2.startsWith("#EXT-X-SKIP")) {
                                        int parseInt = Integer.parseInt(j(H2, f124384w, Collections.emptyMap()));
                                        bf.b.t(kVar2 != null && arrayList9.isEmpty());
                                        int i27 = n0.f53866a;
                                        int i28 = (int) (j16 - kVar2.f124308k);
                                        int i29 = parseInt + i28;
                                        if (i28 >= 0) {
                                            c1 c1Var2 = kVar2.f124315r;
                                            if (i29 <= c1Var2.size()) {
                                                while (i28 < i29) {
                                                    h hVar2 = (h) c1Var2.get(i28);
                                                    if (j16 != kVar2.f124308k) {
                                                        int i33 = (kVar2.f124307j - i18) + hVar2.f124288d;
                                                        ArrayList arrayList16 = new ArrayList();
                                                        long j37 = j23;
                                                        int i34 = 0;
                                                        while (true) {
                                                            c1 c1Var3 = hVar2.f124284m;
                                                            if (i34 < c1Var3.size()) {
                                                                f fVar3 = (f) c1Var3.get(i34);
                                                                arrayList16.add(new f(fVar3.f124285a, fVar3.f124286b, fVar3.f124287c, i33, j37, fVar3.f124290f, fVar3.f124291g, fVar3.f124292h, fVar3.f124293i, fVar3.f124294j, fVar3.f124295k, fVar3.f124278l, fVar3.f124279m));
                                                                j37 += fVar3.f124287c;
                                                                i34++;
                                                                arrayList14 = arrayList14;
                                                                i29 = i29;
                                                                c1Var2 = c1Var2;
                                                            } else {
                                                                i14 = i29;
                                                                arrayList4 = arrayList14;
                                                                c1Var = c1Var2;
                                                                hVar2 = new h(hVar2.f124285a, hVar2.f124286b, hVar2.f124283l, hVar2.f124287c, i33, j23, hVar2.f124290f, hVar2.f124291g, hVar2.f124292h, hVar2.f124293i, hVar2.f124294j, hVar2.f124295k, arrayList16);
                                                            }
                                                        }
                                                    } else {
                                                        i14 = i29;
                                                        arrayList4 = arrayList14;
                                                        c1Var = c1Var2;
                                                    }
                                                    arrayList9.add(hVar2);
                                                    j23 += hVar2.f124287c;
                                                    long j38 = hVar2.f124294j;
                                                    if (j38 != -1) {
                                                        j17 = hVar2.f124293i + j38;
                                                    }
                                                    String str11 = hVar2.f124292h;
                                                    if (str11 == null || !str11.equals(Long.toHexString(j18))) {
                                                        str8 = str11;
                                                    }
                                                    j18++;
                                                    i28++;
                                                    i23 = hVar2.f124288d;
                                                    hVar = hVar2.f124286b;
                                                    drmInitData3 = hVar2.f124290f;
                                                    str7 = hVar2.f124291g;
                                                    c1Var2 = c1Var;
                                                    j19 = j23;
                                                    kVar2 = kVar;
                                                    arrayList14 = arrayList4;
                                                    i29 = i14;
                                                }
                                                nVar2 = nVar;
                                                kVar2 = kVar;
                                            }
                                        }
                                        throw new IOException() { // from class: androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException
                                        };
                                    }
                                    arrayList2 = arrayList14;
                                    if (H2.startsWith("#EXT-X-KEY")) {
                                        String j39 = j(H2, K, hashMap3);
                                        String i35 = i(H2, L, "identity", hashMap3);
                                        if ("NONE".equals(j39)) {
                                            treeMap.clear();
                                            drmInitData3 = null;
                                            str7 = null;
                                            str8 = null;
                                        } else {
                                            String i36 = i(H2, O, null, hashMap3);
                                            if (!"identity".equals(i35)) {
                                                String str12 = str9;
                                                str9 = str12 == null ? ("SAMPLE-AES-CENC".equals(j39) || "SAMPLE-AES-CTR".equals(j39)) ? "cenc" : "cbcs" : str12;
                                                DrmInitData.SchemeData c14 = c(H2, i35, hashMap3);
                                                if (c14 != null) {
                                                    treeMap.put(i35, c14);
                                                    str8 = i36;
                                                    drmInitData3 = null;
                                                    str7 = null;
                                                }
                                            } else if ("AES-128".equals(j39)) {
                                                str7 = j(H2, pattern2, hashMap3);
                                                str8 = i36;
                                            }
                                            str8 = i36;
                                            str7 = null;
                                        }
                                        nVar2 = nVar;
                                        kVar2 = kVar;
                                        arrayList14 = arrayList2;
                                    } else {
                                        str3 = str9;
                                        if (H2.startsWith("#EXT-X-BYTERANGE")) {
                                            String j43 = j(H2, G, hashMap3);
                                            int i37 = n0.f53866a;
                                            String[] split2 = j43.split("@", -1);
                                            j26 = Long.parseLong(split2[0]);
                                            if (split2.length > 1) {
                                                j17 = Long.parseLong(split2[1]);
                                            }
                                        } else if (H2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                            i18 = Integer.parseInt(H2.substring(H2.indexOf(58) + 1));
                                            nVar2 = nVar;
                                            kVar2 = kVar;
                                            arrayList14 = arrayList2;
                                            str9 = str3;
                                            arrayList13 = arrayList;
                                            arrayList12 = arrayList15;
                                            hashMap4 = hashMap5;
                                            fVar = fVar2;
                                            z16 = true;
                                        } else if (H2.equals("#EXT-X-DISCONTINUITY")) {
                                            i23++;
                                        } else if (H2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j15 == 0) {
                                                j15 = n0.X(n0.b0(H2.substring(H2.indexOf(58) + 1))) - j23;
                                            } else {
                                                i13 = i17;
                                                hashMap = hashMap3;
                                                str2 = str5;
                                                arrayList3 = arrayList9;
                                            }
                                        } else if (H2.equals("#EXT-X-GAP")) {
                                            nVar2 = nVar;
                                            kVar2 = kVar;
                                            arrayList14 = arrayList2;
                                            str9 = str3;
                                            arrayList13 = arrayList;
                                            arrayList12 = arrayList15;
                                            hashMap4 = hashMap5;
                                            fVar = fVar2;
                                            z18 = true;
                                        } else if (H2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            nVar2 = nVar;
                                            kVar2 = kVar;
                                            arrayList14 = arrayList2;
                                            str9 = str3;
                                            arrayList13 = arrayList;
                                            arrayList12 = arrayList15;
                                            hashMap4 = hashMap5;
                                            fVar = fVar2;
                                            z14 = true;
                                        } else if (H2.equals("#EXT-X-ENDLIST")) {
                                            nVar2 = nVar;
                                            kVar2 = kVar;
                                            arrayList14 = arrayList2;
                                            str9 = str3;
                                            arrayList13 = arrayList;
                                            arrayList12 = arrayList15;
                                            hashMap4 = hashMap5;
                                            fVar = fVar2;
                                            z17 = true;
                                        } else {
                                            if (H2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                long h10 = h(H2, D);
                                                Matcher matcher2 = E.matcher(H2);
                                                if (matcher2.find()) {
                                                    String group = matcher2.group(1);
                                                    group.getClass();
                                                    i15 = Integer.parseInt(group);
                                                } else {
                                                    i15 = -1;
                                                }
                                                arrayList11.add(new g(i15, h10, Uri.parse(b7.c.N(str, j(H2, pattern2, hashMap3)))));
                                            } else if (H2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                if (fVar2 == null && "PART".equals(j(H2, Q, hashMap3))) {
                                                    String j44 = j(H2, pattern2, hashMap3);
                                                    long h13 = h(H2, I);
                                                    long h14 = h(H2, f124344J);
                                                    String hexString = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j18);
                                                    if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                        DrmInitData.SchemeData[] schemeDataArr = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                        DrmInitData drmInitData4 = new DrmInitData(str3, true, schemeDataArr);
                                                        if (drmInitData2 == null) {
                                                            drmInitData2 = b(str3, schemeDataArr);
                                                        }
                                                        drmInitData3 = drmInitData4;
                                                    }
                                                    fVar = (h13 == -1 || h14 != -1) ? new f(j44, hVar, 0L, i23, j19, drmInitData3, str7, hexString, h13 != -1 ? h13 : 0L, h14, false, false, true) : fVar2;
                                                    nVar2 = nVar;
                                                    kVar2 = kVar;
                                                    arrayList14 = arrayList2;
                                                    str9 = str3;
                                                    arrayList13 = arrayList;
                                                    arrayList12 = arrayList15;
                                                    hashMap4 = hashMap5;
                                                }
                                            } else if (H2.startsWith("#EXT-X-PART")) {
                                                String hexString2 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j18);
                                                String j45 = j(H2, pattern2, hashMap3);
                                                long parseDouble2 = (long) (Double.parseDouble(j(H2, f124373p, Collections.emptyMap())) * 1000000.0d);
                                                boolean f14 = f(H2, Z) | (z14 && arrayList2.isEmpty());
                                                boolean f15 = f(H2, f124345a0);
                                                String i38 = i(H2, pattern, null, hashMap3);
                                                if (i38 != null) {
                                                    int i39 = n0.f53866a;
                                                    String[] split3 = i38.split("@", -1);
                                                    j13 = Long.parseLong(split3[0]);
                                                    if (split3.length > 1) {
                                                        j25 = Long.parseLong(split3[1]);
                                                    }
                                                } else {
                                                    j13 = -1;
                                                }
                                                if (j13 == -1) {
                                                    j25 = 0;
                                                }
                                                if (drmInitData3 == null && !treeMap.isEmpty()) {
                                                    DrmInitData.SchemeData[] schemeDataArr2 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                    DrmInitData drmInitData5 = new DrmInitData(str3, true, schemeDataArr2);
                                                    if (drmInitData2 == null) {
                                                        drmInitData2 = b(str3, schemeDataArr2);
                                                    }
                                                    drmInitData3 = drmInitData5;
                                                }
                                                arrayList2.add(new f(j45, hVar, parseDouble2, i23, j19, drmInitData3, str7, hexString2, j25, j13, f15, f14, false));
                                                j19 += parseDouble2;
                                                if (j13 != -1) {
                                                    j25 += j13;
                                                }
                                            } else {
                                                if (H2.startsWith("#EXT-X-DATERANGE") && i(H2, f124354f0, str5, hashMap3).equals("com.apple.hls.interstitial")) {
                                                    String j46 = j(H2, f124352e0, hashMap3);
                                                    String i43 = i(H2, f124366l0, null, hashMap3);
                                                    Uri parse = i43 != null ? Uri.parse(i43) : null;
                                                    String i44 = i(H2, f124368m0, null, hashMap3);
                                                    Uri parse2 = i44 != null ? Uri.parse(i44) : null;
                                                    long X2 = n0.X(n0.b0(j(H2, f124356g0, hashMap3)));
                                                    String i45 = i(H2, f124360i0, null, hashMap3);
                                                    long X3 = i45 != null ? n0.X(n0.b0(i45)) : -9223372036854775807L;
                                                    ArrayList arrayList17 = new ArrayList();
                                                    String i46 = i(H2, f124358h0, null, hashMap3);
                                                    if (i46 != null) {
                                                        for (String str13 : i46.split(",", -1)) {
                                                            String trim = str13.trim();
                                                            trim.getClass();
                                                            trim.hashCode();
                                                            switch (trim.hashCode()) {
                                                                case 79491:
                                                                    if (trim.equals("PRE")) {
                                                                        c13 = 0;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                case 2430593:
                                                                    if (trim.equals("ONCE")) {
                                                                        c13 = 1;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                case 2461856:
                                                                    if (trim.equals("POST")) {
                                                                        c13 = 2;
                                                                        break;
                                                                    }
                                                                    c13 = 65535;
                                                                    break;
                                                                default:
                                                                    c13 = 65535;
                                                                    break;
                                                            }
                                                            switch (c13) {
                                                                case 0:
                                                                case 1:
                                                                case 2:
                                                                    arrayList17.add(trim);
                                                                    break;
                                                            }
                                                        }
                                                    }
                                                    double g16 = g(H2, f124375q, -1.0d);
                                                    long j47 = g16 >= 0.0d ? (long) (g16 * 1000000.0d) : -9223372036854775807L;
                                                    double g17 = g(H2, f124362j0, -1.0d);
                                                    long j48 = g17 >= 0.0d ? (long) (g17 * 1000000.0d) : -9223372036854775807L;
                                                    boolean f16 = f(H2, f124364k0);
                                                    double g18 = g(H2, f124370n0, Double.MIN_VALUE);
                                                    long j49 = g18 != Double.MIN_VALUE ? (long) (g18 * 1000000.0d) : -9223372036854775807L;
                                                    double g19 = g(H2, f124372o0, -1.0d);
                                                    long j53 = g19 >= 0.0d ? (long) (g19 * 1000000.0d) : -9223372036854775807L;
                                                    ArrayList arrayList18 = new ArrayList();
                                                    String i47 = i(H2, f124374p0, null, hashMap3);
                                                    if (i47 != null) {
                                                        String[] split4 = i47.split(",", -1);
                                                        int length = split4.length;
                                                        int i48 = 0;
                                                        while (i48 < length) {
                                                            String trim2 = split4[i48].trim();
                                                            trim2.getClass();
                                                            String[] strArr = split4;
                                                            if (trim2.equals("IN") || trim2.equals("OUT")) {
                                                                arrayList18.add(trim2);
                                                            }
                                                            i48++;
                                                            split4 = strArr;
                                                        }
                                                    }
                                                    ArrayList arrayList19 = new ArrayList();
                                                    String i49 = i(H2, f124376q0, null, hashMap3);
                                                    if (i49 != null) {
                                                        String[] split5 = i49.split(",", -1);
                                                        int length2 = split5.length;
                                                        int i53 = 0;
                                                        while (i53 < length2) {
                                                            String trim3 = split5[i53].trim();
                                                            trim3.getClass();
                                                            String[] strArr2 = split5;
                                                            if (trim3.equals("JUMP") || trim3.equals("SKIP")) {
                                                                arrayList19.add(trim3);
                                                            }
                                                            i53++;
                                                            split5 = strArr2;
                                                        }
                                                    }
                                                    a0.C(4, "initialCapacity");
                                                    Object[] objArr = new Object[4];
                                                    String substring = H2.substring(17);
                                                    Matcher matcher3 = f124380s0.matcher(substring);
                                                    int i54 = 0;
                                                    while (matcher3.find()) {
                                                        String group2 = matcher3.group();
                                                        group2.getClass();
                                                        group2.hashCode();
                                                        char c15 = 65535;
                                                        switch (group2.hashCode()) {
                                                            case -2136701954:
                                                                matcher = matcher3;
                                                                if (group2.equals("X-SNAP=")) {
                                                                    c15 = 0;
                                                                    break;
                                                                }
                                                                break;
                                                            case -148960310:
                                                                matcher = matcher3;
                                                                if (group2.equals("X-PLAYOUT-LIMIT=")) {
                                                                    c15 = 1;
                                                                    break;
                                                                }
                                                                break;
                                                            case 397239341:
                                                                matcher = matcher3;
                                                                if (group2.equals("X-ASSET-LIST=")) {
                                                                    c15 = 2;
                                                                    break;
                                                                }
                                                                break;
                                                            case 1472528844:
                                                                matcher = matcher3;
                                                                if (group2.equals("X-RESTRICT=")) {
                                                                    c15 = 3;
                                                                    break;
                                                                }
                                                                break;
                                                            case 1748487807:
                                                                matcher = matcher3;
                                                                if (group2.equals("X-RESUME-OFFSET=")) {
                                                                    c15 = 4;
                                                                    break;
                                                                }
                                                                break;
                                                            case 1814205923:
                                                                matcher = matcher3;
                                                                if (group2.equals("X-ASSET-URI=")) {
                                                                    c15 = 5;
                                                                    break;
                                                                }
                                                                break;
                                                            default:
                                                                matcher = matcher3;
                                                                break;
                                                        }
                                                        switch (c15) {
                                                            case 0:
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                            case 5:
                                                                i16 = i17;
                                                                str4 = str5;
                                                                arrayList8 = arrayList9;
                                                                break;
                                                            default:
                                                                str4 = str5;
                                                                String substring2 = group2.substring(0, group2.length() - 1);
                                                                String C2 = a.a.C(substring2, "=");
                                                                int length3 = C2.length() + substring.indexOf(C2);
                                                                i16 = i17;
                                                                String substring3 = substring.substring(length3, (substring.length() == length3 + 1 ? 1 : 2) + length3);
                                                                if (substring3.startsWith("\"")) {
                                                                    dVar2 = new d(substring2, j(substring, Pattern.compile(substring2 + "=\"(.+?)\""), hashMap3), 0);
                                                                    arrayList8 = arrayList9;
                                                                } else if (substring3.equals("0x") || substring3.equals("0X")) {
                                                                    arrayList8 = arrayList9;
                                                                    dVar2 = new d(substring2, j(substring, Pattern.compile(substring2 + "=(0[xX][A-F0-9]+)"), hashMap3), 1);
                                                                } else {
                                                                    arrayList8 = arrayList9;
                                                                    dVar2 = new d(substring2, Double.parseDouble(j(substring, Pattern.compile(substring2 + "=([\\d\\.]+)\\b"), Collections.emptyMap())));
                                                                }
                                                                int i55 = i54 + 1;
                                                                int d2 = u0.d(objArr.length, i55);
                                                                if (d2 > objArr.length) {
                                                                    objArr = Arrays.copyOf(objArr, d2);
                                                                }
                                                                objArr[i54] = dVar2;
                                                                i54 = i55;
                                                                break;
                                                        }
                                                        matcher3 = matcher;
                                                        str5 = str4;
                                                        i17 = i16;
                                                        arrayList9 = arrayList8;
                                                    }
                                                    i13 = i17;
                                                    str2 = str5;
                                                    arrayList5 = arrayList9;
                                                    if ((parse2 != null || parse == null) && (parse2 == null || parse != null)) {
                                                        arrayList6 = arrayList;
                                                    } else {
                                                        e eVar = new e(j46, parse, parse2, X2, X3, j47, j48, arrayList17, f16, j49, j53, arrayList18, arrayList19, c1.l(i54, objArr));
                                                        arrayList6 = arrayList;
                                                        arrayList6.add(eVar);
                                                    }
                                                } else {
                                                    i13 = i17;
                                                    str2 = str5;
                                                    arrayList5 = arrayList9;
                                                    arrayList6 = arrayList;
                                                    if (!H2.startsWith("#")) {
                                                        String hexString3 = str7 == null ? null : str8 != null ? str8 : Long.toHexString(j18);
                                                        long j54 = j18 + 1;
                                                        String l13 = l(H2, hashMap3);
                                                        h hVar3 = (h) hashMap5.get(l13);
                                                        if (j26 == -1) {
                                                            j14 = 0;
                                                        } else {
                                                            if (z19 && hVar == null && hVar3 == null) {
                                                                hVar3 = new h(0L, j17, l13, null, null);
                                                                hashMap5.put(l13, hVar3);
                                                            }
                                                            j14 = j17;
                                                        }
                                                        if (drmInitData3 != null || treeMap.isEmpty()) {
                                                            arrayList7 = arrayList6;
                                                            hashMap2 = hashMap3;
                                                            drmInitData = drmInitData3;
                                                        } else {
                                                            arrayList7 = arrayList6;
                                                            hashMap2 = hashMap3;
                                                            DrmInitData.SchemeData[] schemeDataArr3 = (DrmInitData.SchemeData[]) treeMap.values().toArray(new DrmInitData.SchemeData[0]);
                                                            drmInitData = new DrmInitData(str3, true, schemeDataArr3);
                                                            if (drmInitData2 == null) {
                                                                drmInitData2 = b(str3, schemeDataArr3);
                                                            }
                                                        }
                                                        arrayList5.add(new h(l13, hVar != null ? hVar : hVar3, str6, j24, i23, j23, drmInitData, str7, hexString3, j14, j26, z18, arrayList2));
                                                        j19 = j23 + j24;
                                                        ArrayList arrayList20 = new ArrayList();
                                                        if (j26 != -1) {
                                                            j14 += j26;
                                                        }
                                                        j17 = j14;
                                                        hashMap4 = hashMap5;
                                                        j18 = j54;
                                                        str9 = str3;
                                                        drmInitData3 = drmInitData;
                                                        j24 = 0;
                                                        j26 = -1;
                                                        j23 = j19;
                                                        str5 = str2;
                                                        str6 = str5;
                                                        i17 = i13;
                                                        hashMap3 = hashMap2;
                                                        arrayList13 = arrayList7;
                                                        arrayList12 = arrayList15;
                                                        fVar = fVar2;
                                                        z18 = false;
                                                        arrayList14 = arrayList20;
                                                        arrayList9 = arrayList5;
                                                        nVar2 = nVar;
                                                        kVar2 = kVar;
                                                    }
                                                }
                                                arrayList = arrayList6;
                                                hashMap = hashMap3;
                                                arrayList3 = arrayList5;
                                            }
                                            i13 = i17;
                                            hashMap = hashMap3;
                                            str2 = str5;
                                            arrayList3 = arrayList9;
                                        }
                                        nVar2 = nVar;
                                        kVar2 = kVar;
                                        arrayList14 = arrayList2;
                                        str9 = str3;
                                    }
                                }
                                nVar2 = nVar;
                                arrayList9 = arrayList3;
                                arrayList14 = arrayList2;
                                hashMap4 = hashMap5;
                                str9 = str3;
                                str5 = str2;
                                i17 = i13;
                                hashMap3 = hashMap;
                                arrayList13 = arrayList;
                                arrayList12 = arrayList15;
                                fVar = fVar2;
                                kVar2 = kVar;
                            }
                            arrayList13 = arrayList;
                            arrayList12 = arrayList15;
                            hashMap4 = hashMap5;
                            fVar = fVar2;
                        }
                    }
                }
                arrayList13 = arrayList;
            }
        }
        int i56 = i17;
        f fVar4 = fVar;
        ArrayList arrayList21 = arrayList14;
        ArrayList arrayList22 = arrayList12;
        ArrayList arrayList23 = arrayList13;
        ArrayList arrayList24 = arrayList9;
        HashMap hashMap6 = new HashMap();
        for (int i57 = 0; i57 < arrayList11.size(); i57++) {
            g gVar = (g) arrayList11.get(i57);
            long j55 = gVar.f124281b;
            if (j55 == -1) {
                j55 = (j16 + arrayList24.size()) - (arrayList21.isEmpty() ? 1L : 0L);
            }
            int i58 = gVar.f124282c;
            if (i58 == -1 && j29 != -9223372036854775807L) {
                i58 = (arrayList21.isEmpty() ? ((h) com.bumptech.glide.c.P(arrayList24)).f124284m : arrayList21).size() - 1;
            }
            Uri uri = gVar.f124280a;
            hashMap6.put(uri, new g(i58, j55, uri));
        }
        if (fVar4 != null) {
            arrayList21.add(fVar4);
        }
        return new k(i56, str, arrayList22, j27, z15, j15, z16, i18, j16, i19, j28, j29, z14, z17, j15 != 0, drmInitData2, arrayList24, arrayList21, jVar2, hashMap6, arrayList23);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0226, code lost:
    
        if (r2 > 0) goto L99;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:149:0x0483. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bb  */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static v7.n e(androidx.appcompat.app.d r38, java.lang.String r39) {
        /*
            Method dump skipped, instructions count: 1670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.p.e(androidx.appcompat.app.d, java.lang.String):v7.n");
    }

    public static boolean f(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double g(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d2;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String j(String str, Pattern pattern, Map map) {
        String i13 = i(str, pattern, null, map);
        if (i13 != null) {
            return i13;
        }
        throw ParserException.b("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    public static String l(String str, Map map) {
        Matcher matcher = f124378r0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @Override // l8.y
    public final Object k(Uri uri, g7.g gVar) {
        Object e13;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gVar));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int read = bufferedReader.read();
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                throw ParserException.b("Input does not start with the #EXTM3U header.", null);
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i13 = 0;
            while (true) {
                if (i13 >= 7) {
                    while (read != -1 && Character.isWhitespace(read) && !n0.T(read)) {
                        read = bufferedReader.read();
                    }
                    if (n0.T(read)) {
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                n0.g(bufferedReader);
                                throw ParserException.b("Failed to parse the playlist, could not identify any tags.", null);
                            }
                            String trim = readLine.trim();
                            if (!trim.isEmpty()) {
                                if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                                    if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                        break;
                                    }
                                    arrayDeque.add(trim);
                                } else {
                                    arrayDeque.add(trim);
                                    e13 = e(new androidx.appcompat.app.d(arrayDeque, bufferedReader), uri.toString());
                                    break;
                                }
                            }
                        }
                        return e13;
                    }
                } else {
                    if (read != "#EXTM3U".charAt(i13)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i13++;
                }
            }
        } finally {
            n0.g(bufferedReader);
        }
    }

    public p(n nVar, k kVar) {
        this.f124388a = nVar;
        this.f124389b = kVar;
    }
}
