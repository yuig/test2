package sv0;

import android.content.Context;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.cv;
import com.pinterest.api.model.gv;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kb.t0;
import kh2.g3;
import kotlin.UninitializedPropertyAccessException;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;

/* loaded from: classes5.dex */
public final class l implements p {

    /* renamed from: o, reason: collision with root package name */
    public static final xk2.k f115350o;

    /* renamed from: p, reason: collision with root package name */
    public static final xk2.k f115351p;

    /* renamed from: a, reason: collision with root package name */
    public final o20.b f115352a;

    /* renamed from: b, reason: collision with root package name */
    public final o20.a f115353b;

    /* renamed from: c, reason: collision with root package name */
    public final bw0.f f115354c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f115355d;

    /* renamed from: e, reason: collision with root package name */
    public final fe0.b f115356e;

    /* renamed from: f, reason: collision with root package name */
    public final q f115357f;

    /* renamed from: g, reason: collision with root package name */
    public final ag1.b f115358g;

    /* renamed from: h, reason: collision with root package name */
    public final tb0.h f115359h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f115360i;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f115361j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f115362k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f115363l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f115364m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f115365n;

    static {
        xk2.n nVar = xk2.n.NONE;
        f115350o = xk2.m.a(nVar, j.f115346i);
        f115351p = xk2.m.a(nVar, i.f115345i);
    }

    public l(o20.b s3MediaUploadService, o20.a mediaUploadService, bw0.f ideaPinWorkUtils, Context context, fe0.b networkSpeedDataProvider, q networkType, ag1.b ideaPinComposeDataManager, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(s3MediaUploadService, "s3MediaUploadService");
        Intrinsics.checkNotNullParameter(mediaUploadService, "mediaUploadService");
        Intrinsics.checkNotNullParameter(ideaPinWorkUtils, "ideaPinWorkUtils");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkSpeedDataProvider, "networkSpeedDataProvider");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f115352a = s3MediaUploadService;
        this.f115353b = mediaUploadService;
        this.f115354c = ideaPinWorkUtils;
        this.f115355d = context;
        this.f115356e = networkSpeedDataProvider;
        this.f115357f = networkType;
        this.f115358g = ideaPinComposeDataManager;
        this.f115359h = crashReporting;
        this.f115360i = new LinkedHashMap();
        this.f115361j = new LinkedHashMap();
        this.f115362k = new LinkedHashMap();
        this.f115363l = new LinkedHashMap();
        this.f115364m = new ArrayList();
        this.f115365n = new LinkedHashMap();
    }

    public static kb.l a(gv gvVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String e13 = gvVar.c().e();
        Intrinsics.checkNotNullExpressionValue(e13, "getAccessKeyId(...)");
        String g13 = gvVar.c().g();
        Intrinsics.checkNotNullExpressionValue(g13, "getSecretAccessKey(...)");
        String h10 = gvVar.c().h();
        Intrinsics.checkNotNullExpressionValue(h10, "getSessionToken(...)");
        String[] value = (String[]) f0.j(g3.M("access_key", e13), g3.M("secret_key", g13), g3.M("session_token", h10), g3.M("expiration_time", String.valueOf(gvVar.c().f().intValue()))).toArray(new String[0]);
        Intrinsics.checkNotNullParameter("s3_access_credentials", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        linkedHashMap.put("s3_access_credentials", value);
        String j13 = gvVar.d().j();
        if (j13 == null) {
            j13 = "";
        }
        String h13 = gvVar.d().h();
        Intrinsics.checkNotNullExpressionValue(h13, "getUploadBucket(...)");
        String g14 = gvVar.d().g();
        Intrinsics.checkNotNullExpressionValue(g14, "getKeySignature(...)");
        String[] value2 = (String[]) f0.j(g3.M("aws_region", j13), g3.M("s3_bucket_name", h13), g3.M("s3_upload_key_signature", g14)).toArray(new String[0]);
        Intrinsics.checkNotNullParameter("s3_upload_space_identifiers", "key");
        Intrinsics.checkNotNullParameter(value2, "value");
        linkedHashMap.put("s3_upload_space_identifiers", value2);
        String f13 = gvVar.d().f();
        Intrinsics.checkNotNullParameter("s3_upload_key", "key");
        linkedHashMap.put("s3_upload_key", f13);
        String i13 = gvVar.d().i();
        Intrinsics.checkNotNullExpressionValue(i13, "getUploadId(...)");
        long parseLong = Long.parseLong(i13);
        Intrinsics.checkNotNullParameter("MEDIA_ID", "key");
        linkedHashMap.put("MEDIA_ID", Long.valueOf(parseLong));
        kb.l lVar = new kb.l(linkedHashMap);
        bk.f.e0(lVar);
        return lVar;
    }

    public static boolean j(Long l13) {
        if (l13 != null) {
            return ((int) (TimeUnit.SECONDS.toMinutes(l13.longValue()) - TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis()))) < 15;
        }
        vb0.j.f125466a.F("IdeaPinCreation S3 Credential's expirationTime is null, will make an unnecessary refresh api call to get new credentials", tb0.p.IDEA_PINS_CREATION, new Object[0]);
        return true;
    }

    public final kb.l b(String pageId) {
        kb.l lVar;
        Object obj;
        this.f115354c.f23968a.getClass();
        List workInfoList = bw0.c.c();
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(workInfoList, "workInfoList");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : workInfoList) {
            Set set = ((t0) obj2).f79032c;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.d((String) it.next(), "video_register")) {
                        arrayList.add(obj2);
                        break;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        loop2: while (true) {
            lVar = null;
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            Set set2 = ((t0) obj).f79032c;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it3 = set2.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.d((String) it3.next(), pageId)) {
                        break loop2;
                    }
                }
            }
        }
        t0 t0Var = (t0) obj;
        if (t0Var != null) {
            kb.l lVar2 = kb.l.f79018b;
            kb.l lVar3 = t0Var.f79033d;
            lVar = Intrinsics.d(lVar3, lVar2) ? t0Var.f79034e : lVar3;
        }
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("Failed to find register worker data for this page");
    }

    public final kb.l c(String registerMediaType, int i13, tp tpVar) {
        String str;
        o20.b bVar = this.f115352a;
        if (tpVar == null) {
            gv gvVar = (gv) bVar.b(registerMediaType, i13).d();
            Intrinsics.f(gvVar);
            return a(gvVar);
        }
        vn0 mediaList = tpVar.getMediaList();
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(registerMediaType, "registerMediaType");
        tb0.h crashReporting = this.f115359h;
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        if (mediaList.getItems().isEmpty()) {
            throw new IllegalStateException("Empty Media List while generating upload aux data");
        }
        xw0.b bVar2 = new xw0.b(new xw0.c(new ArrayList()), registerMediaType, i13);
        Iterator it = ig1.b.e0(mediaList).iterator();
        long j13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                f0.p();
                throw null;
            }
            bo0 bo0Var = (bo0) next;
            k01 videoItem = bo0Var.getVideoItem();
            if (videoItem != null && !videoItem.g()) {
                EnumSet errorState = videoItem.f39243f;
                Intrinsics.checkNotNullExpressionValue(errorState, "errorState");
                if (!errorState.isEmpty()) {
                    str = "Error State: " + errorState + " ";
                } else {
                    str = "";
                }
                if (((Number) videoItem.f39240c.f135234a).intValue() <= 0) {
                    str = str + "Invalid Width: " + videoItem.f39240c.f135234a + ". ";
                }
                if (((Number) videoItem.f39240c.f135235b).intValue() <= 0) {
                    str = str + "Invalid Height: " + videoItem.f39240c.f135235b + ". ";
                }
                if (((Number) videoItem.f39240c.f135236c).intValue() == -1) {
                    str = str + "Invalid Rotation: " + videoItem.f39240c.f135236c + ". ";
                }
                long j14 = videoItem.f39242e;
                if (j14 == -1) {
                    str = str + "Invalid duration: " + j14 + ". ";
                }
                String str2 = videoItem.f39241d;
                if (str2 == null) {
                    str = a.a.l(str, "Invalid mimeType: ", str2, ". ");
                }
                File file = new File(videoItem.e());
                crashReporting.h("Invalid Video: " + (str + "exists=" + file.exists() + " size=" + file.length()));
                throw new IllegalStateException("Video item is invalid (generateClipsAuxData)");
            }
            long endTimeMs = bo0Var.getEndTimeMs() - bo0Var.getStartTimeMs();
            bVar2.getUploadAuxData().getClips().add(new xw0.a(i14 == 0 ? -1L : j13, endTimeMs, bo0Var.getPhotoItem() != null));
            j13 += endTimeMs;
            i14 = i15;
        }
        gv gvVar2 = (gv) bVar.a(bVar2).d();
        Intrinsics.f(gvVar2);
        return a(gvVar2);
    }

    public final e d(String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        e eVar = (e) this.f115360i.get(pageId);
        return eVar == null ? h(b(pageId), pageId) : eVar;
    }

    public final int e(String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        LinkedHashMap linkedHashMap = this.f115361j;
        Integer num = (Integer) linkedHashMap.get(pageId);
        if (num != null) {
            return num.intValue();
        }
        int d2 = b(pageId).d("transfer_record_id", -1);
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        linkedHashMap.put(pageId, Integer.valueOf(d2));
        return d2;
    }

    public final TransferUtility f(String str) {
        TransferUtility transferUtility = (TransferUtility) this.f115362k.get(str);
        return transferUtility == null ? g(str) : transferUtility;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility g(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sv0.l.g(java.lang.String):com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility");
    }

    public final e h(kb.l workerData, String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(workerData, "workerData");
        String[] i13 = workerData.i("s3_access_credentials");
        String[] i14 = workerData.i("s3_upload_space_identifiers");
        if (i13 == null || i14 == null) {
            throw new UninitializedPropertyAccessException("Failed to initialize S3Params from register worker data s3AccessCredentialArray = " + i13 + " and s3UploadSpaceIdentifierArray = " + i14);
        }
        LinkedHashMap z23 = g3.z2(i13);
        LinkedHashMap z24 = g3.z2(i14);
        String str = (String) z24.get("s3_bucket_name");
        String str2 = str == null ? "" : str;
        String h10 = workerData.h("s3_upload_key");
        String str3 = h10 == null ? "" : h10;
        String str4 = (String) z24.get("s3_upload_key_signature");
        String str5 = str4 == null ? "" : str4;
        String str6 = (String) z24.get("aws_region");
        String str7 = str6 == null ? "" : str6;
        String str8 = (String) z23.get("access_key");
        if (str8 == null) {
            str8 = "";
        }
        String str9 = (String) z23.get("secret_key");
        String str10 = str9 == null ? "" : str9;
        String str11 = (String) z23.get("session_token");
        String str12 = str11 == null ? "" : str11;
        String str13 = (String) z23.get("expiration_time");
        Long valueOf = str13 != null ? Long.valueOf(Long.parseLong(str13)) : null;
        String valueOf2 = String.valueOf(workerData.g("MEDIA_ID", 0L));
        String str14 = str5;
        String str15 = str3;
        Long l13 = valueOf;
        String str16 = str2;
        e s3Params = new e(str2, str3, str5, str7, str8, str10, str12, l13, valueOf2);
        Intrinsics.checkNotNullParameter(s3Params, "<this>");
        Intrinsics.checkNotNullParameter(s3Params, "<this>");
        if (str8.length() == 0 || str10.length() == 0 || str12.length() == 0) {
            throw new MissingFormatArgumentException("One or more S3 Access credential data is missing");
        }
        Intrinsics.checkNotNullParameter(s3Params, "<this>");
        if (str16.length() == 0 || str15.length() == 0 || str14.length() == 0) {
            StringBuilder w13 = a.a.w("One or more S3 upload space identifier data is missing; bucketName=", str16, ", uploadKey=", str15, ", uploadKeySignature=");
            w13.append(str14);
            throw new MissingFormatArgumentException(w13.toString());
        }
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(s3Params, "s3Params");
        this.f115360i.put(pageId, s3Params);
        return s3Params;
    }

    public final TransferObserver i(File mediaFile, String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        g(pageId);
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(mediaFile, "mediaFile");
        TransferObserver g13 = f(pageId).g(mediaFile, d(pageId).f115332b);
        Intrinsics.checkNotNullExpressionValue(g13, "upload(...)");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.f115361j.put(pageId, Integer.valueOf(g13.f28656a));
        return g13;
    }

    public final e k(String pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        e d2 = d(pageId);
        cv cvVar = (cv) this.f115352a.c(d2.f115332b, d2.f115333c).d();
        String accessKey = cvVar.b().e();
        Intrinsics.checkNotNullExpressionValue(accessKey, "getAccessKeyId(...)");
        String secret = cvVar.b().g();
        Intrinsics.checkNotNullExpressionValue(secret, "getSecretAccessKey(...)");
        String sessionToken = cvVar.b().h();
        Intrinsics.checkNotNullExpressionValue(sessionToken, "getSessionToken(...)");
        Long valueOf = Long.valueOf(cvVar.b().f().intValue());
        String bucketName = d2.f115331a;
        Intrinsics.checkNotNullParameter(bucketName, "bucketName");
        String uploadKey = d2.f115332b;
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        String uploadKeySignature = d2.f115333c;
        Intrinsics.checkNotNullParameter(uploadKeySignature, "uploadKeySignature");
        String region = d2.f115334d;
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        String mediaId = d2.f115339i;
        Intrinsics.checkNotNullParameter(mediaId, "mediaId");
        return new e(bucketName, uploadKey, uploadKeySignature, region, accessKey, secret, sessionToken, valueOf, mediaId);
    }
}
