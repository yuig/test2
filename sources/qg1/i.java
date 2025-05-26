package qg1;

import android.os.Build;
import com.pinterest.api.model.tp;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.storypin.util.IdeaPinKibanaLogger$Log$Payload;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.e0;
import kotlin.text.z;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import oy.d1;
import oy.f1;
import oy.u1;
import rl2.g0;
import s92.o;
import tb0.p;
import vy.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f103838a;

    /* renamed from: b, reason: collision with root package name */
    public final m f103839b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f103840c;

    /* renamed from: d, reason: collision with root package name */
    public final tb0.h f103841d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f103842e;

    /* renamed from: f, reason: collision with root package name */
    public Long f103843f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f103844g;

    /* renamed from: h, reason: collision with root package name */
    public final v f103845h;

    public i(d0 pinalytics, m mVar, b60.b bVar, tb0.h crashReporting) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        this.f103838a = pinalytics;
        this.f103839b = mVar;
        this.f103840c = bVar;
        this.f103841d = crashReporting;
        this.f103845h = xk2.m.b(h.f103837i);
    }

    public static HashMap a(i iVar, tp tpVar, String str, Long l13, Long l14, String str2, r32.c cVar, String str3, String str4, String str5, Integer num, Integer num2, Boolean bool, String str6, String str7, String str8, String str9, Boolean bool2, String str10, int i13) {
        String str11;
        String str12;
        tp tpVar2 = (i13 & 1) != 0 ? null : tpVar;
        String str13 = (i13 & 2) != 0 ? null : str;
        Long l15 = (i13 & 4) != 0 ? null : l13;
        Long l16 = (i13 & 8) != 0 ? null : l14;
        String str14 = (i13 & 16) != 0 ? null : str2;
        r32.c cVar2 = (i13 & 32) != 0 ? null : cVar;
        String str15 = (i13 & 64) != 0 ? null : str3;
        String str16 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str4;
        String str17 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str5;
        Integer num3 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : num;
        Integer num4 = (i13 & 1024) != 0 ? null : num2;
        Boolean bool3 = (i13 & 2048) != 0 ? null : bool;
        String str18 = (i13 & 4096) != 0 ? null : str6;
        String str19 = (i13 & 8192) != 0 ? null : str7;
        String str20 = (i13 & 32768) != 0 ? null : str9;
        Boolean bool4 = (i13 & 65536) != 0 ? null : bool2;
        String str21 = (i13 & 131072) != 0 ? null : str10;
        iVar.getClass();
        String str22 = str21;
        HashMap hashMap = new HashMap();
        if (tpVar2 != null) {
            str11 = str19;
            str12 = str18;
            hashMap.put("num_image_pages", String.valueOf(kh2.j.c0(tpVar2)));
        } else {
            str11 = str19;
            str12 = str18;
        }
        String MODEL = Build.MODEL;
        if (MODEL != null && !z.j(MODEL)) {
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            hashMap.put("device_version", e0.C(30, MODEL));
        }
        String str23 = (String) ly1.c.f85155a.getValue();
        if (str23 != null && !z.j(str23)) {
            hashMap.put("device_cpu", e0.C(30, str23));
        }
        String str24 = Build.VERSION.RELEASE;
        if (str24 != null && !z.j(str24)) {
            hashMap.put("os_version", str24);
        }
        if (str13 != null) {
        }
        v vVar = iVar.f103845h;
        if (l15 != null) {
            long longValue = l15.longValue();
            ((pb0.g) ((pb0.a) vVar.getValue())).getClass();
        }
        if (iVar.f103844g) {
            hashMap.put("is_resumed", "true");
        }
        if (l16 != null) {
            long longValue2 = l16.longValue();
            ((pb0.g) ((pb0.a) vVar.getValue())).getClass();
        }
        if (str14 != null) {
        }
        if (cVar2 != null) {
        }
        if (str15 != null) {
        }
        if (str16 != null) {
        }
        if (str17 != null) {
        }
        if (num3 != null) {
        }
        if (num4 != null) {
        }
        if (bool3 != null) {
        }
        if (str12 != null) {
        }
        if (str11 != null) {
        }
        if (str8 != null) {
        }
        String str25 = str20;
        if (str25 != null) {
        }
        Boolean bool5 = bool4;
        if (Intrinsics.d(bool5, Boolean.TRUE)) {
            hashMap.put("is_scheduled", bool5.toString());
        }
        if (str22 != null) {
            hashMap.put("media_export_skipped", str22);
        }
        return hashMap;
    }

    public static void b(i iVar, String uniqueIdentifier, String str, String str2, int i13, boolean z13, String str3, r32.c cVar, Boolean bool, o pwtResult, int i14) {
        String str4 = (i14 & 2) != 0 ? null : str;
        boolean z14 = (i14 & 16) != 0 ? false : z13;
        String str5 = (i14 & 32) != 0 ? null : str3;
        r32.c cVar2 = (i14 & 64) != 0 ? null : cVar;
        Boolean bool2 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? bool : null;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        new u1(uniqueIdentifier, str4, str2, i13, z14, str5, bool2, pwtResult).i();
        iVar.g(bool2, cVar2);
    }

    public static void c(i iVar, String str, String str2, String str3, r32.c cVar, Boolean bool, o pwtResult, int i13) {
        String str4 = (i13 & 2) != 0 ? null : str2;
        String str5 = (i13 & 4) != 0 ? null : str3;
        if ((i13 & 8) != 0) {
            cVar = null;
        }
        if ((i13 & 16) != 0) {
            bool = null;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        new f1(str, str4, str5, bool, pwtResult).i();
        iVar.g(bool, cVar);
    }

    public static void d(i iVar, Exception exception, boolean z13, String str, r32.c failureReason, String str2, String str3, String str4, Integer num, Boolean bool, String str5, String str6, tp tpVar, String creationSessionId, String str7, boolean z14, String str8, int i13) {
        boolean z15 = (i13 & 2) != 0 ? false : z13;
        String str9 = (i13 & 16) != 0 ? null : str2;
        String str10 = (i13 & 32) != 0 ? null : str3;
        String str11 = (i13 & 64) != 0 ? null : str4;
        Integer num2 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : num;
        Boolean bool2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : bool;
        String str12 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str5;
        String str13 = (i13 & 1024) != 0 ? null : str6;
        String str14 = (i13 & 32768) != 0 ? null : str8;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        HashMap a13 = a(iVar, tpVar, null, iVar.f103843f, null, str, failureReason, str9, str10, str11, null, num2, bool2, str12, str13, creationSessionId, str7, Boolean.valueOf(z14), str14, 522);
        if (iVar.f103842e) {
            h32.f1 f1Var = z15 ? h32.f1.STORY_PIN_CREATE_USER_FAILURE : h32.f1.STORY_PIN_CREATE_FAILURE;
            iVar.j(iVar.f103839b, tpVar, f1Var, null, a13);
            String str15 = a13 + " [numImages=" + kh2.j.c0(tpVar) + "][numVideos=" + kh2.j.K2(tpVar) + "]";
            boolean p13 = g0.p(exception);
            final String obj = f1Var.toString();
            final Exception exc = p13 ? new Exception("'Caused By' was filtered, see breadcrumbs") : exception;
            Exception exc2 = new Exception(obj, exc) { // from class: com.pinterest.feature.storypin.util.IdeaPinUploadLogger$IdeaPinUploadLoggerException
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(obj, exc);
                    Intrinsics.checkNotNullParameter(obj, "msg");
                    Intrinsics.checkNotNullParameter(exc, "cause");
                }
            };
            tb0.h hVar = iVar.f103841d;
            if (p13) {
                Throwable cause = exception.getCause();
                for (int i14 = 0; cause != null && i14 <= 4; i14++) {
                    hVar.h("Caused By #" + i14 + ": " + cause);
                    cause = Intrinsics.d(cause.getCause(), cause) ? null : cause.getCause();
                }
            }
            hVar.q(exc2, str15, p.IDEA_PINS_CREATION);
        } else {
            f(iVar, f.FAIL_WITH_NO_ATTEMPT, null, tpVar, a13, 6);
        }
        iVar.f103842e = false;
        iVar.f103843f = null;
        iVar.f103844g = false;
        h(iVar, null, bool2, str, failureReason, str9, str12, false, o.ERROR, 65);
    }

    public static /* synthetic */ void f(i iVar, f fVar, h32.f1 f1Var, tp tpVar, HashMap hashMap, int i13) {
        if ((i13 & 2) != 0) {
            f1Var = null;
        }
        iVar.e(fVar, f1Var, null, tpVar, hashMap);
    }

    public static void h(i iVar, String str, Boolean bool, String str2, r32.c cVar, String str3, String str4, boolean z13, o oVar, int i13) {
        String str5 = (i13 & 1) != 0 ? null : str;
        Boolean bool2 = (i13 & 2) != 0 ? null : bool;
        String str6 = (i13 & 4) != 0 ? null : str2;
        r32.c cVar2 = (i13 & 8) != 0 ? null : cVar;
        String str7 = (i13 & 16) != 0 ? null : str3;
        String str8 = (i13 & 32) != 0 ? null : str4;
        boolean z14 = (i13 & 64) != 0 ? false : z13;
        iVar.getClass();
        new oy.j(str5, bool2, str6, cVar2, str7, str8, z14, oVar).i();
    }

    public static void i(i iVar, tp tpVar, d1 d1Var, g prepublishWorkInfo, int i13, int i14, int i15) {
        String str;
        d1 initiatedBy = (i15 & 2) != 0 ? d1.USER : d1Var;
        int i16 = (i15 & 8) != 0 ? 0 : i13;
        int i17 = (i15 & 16) != 0 ? 0 : i14;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(initiatedBy, "initiatedBy");
        Intrinsics.checkNotNullParameter(prepublishWorkInfo, "prepublishWorkInfo");
        int c03 = kh2.j.c0(tpVar);
        int K2 = kh2.j.K2(tpVar);
        if (tpVar == null || (str = tpVar.getId()) == null) {
            str = "";
        }
        new oy.k(initiatedBy, c03, K2, str, prepublishWorkInfo.f103829a, prepublishWorkInfo.f103831c, prepublishWorkInfo.f103833e, prepublishWorkInfo.f103835g, prepublishWorkInfo.f103830b, prepublishWorkInfo.f103832d, prepublishWorkInfo.f103834f, prepublishWorkInfo.f103836h, i16, i17).i();
    }

    public final void e(f fVar, h32.f1 f1Var, String str, tp tpVar, HashMap hashMap) {
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.put("logging_error_name", fVar.name());
        if (f1Var != null) {
            hashMap2.put("logging_error_event", f1Var.toString());
        }
        this.f103838a.u(h32.f1.STORY_PIN_LOGGING_ERROR, str, kh2.j.Z(tpVar), hashMap2, false);
    }

    public final void g(Boolean bool, r32.c cVar) {
        if (Intrinsics.d(bool, Boolean.TRUE)) {
            h(this, null, null, "User canceled publish", cVar, null, null, bool.booleanValue(), o.ABORTED, 51);
        }
    }

    public final void j(m analyticsApi, tp tpVar, h32.f1 eventType, String str, HashMap auxData) {
        String userId;
        this.f103838a.u(eventType, str, kh2.j.Z(tpVar), auxData, false);
        if (analyticsApi != null) {
            b60.b bVar = this.f103840c;
            if ((bVar != null ? ((b60.d) bVar).f() : null) != null) {
                userId = com.bumptech.glide.d.Q(bVar).getUid();
                Intrinsics.checkNotNullExpressionValue(userId, "getUid(...)");
            } else {
                userId = "";
            }
            Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(auxData, "auxData");
            Intrinsics.checkNotNullParameter(userId, "userId");
            a metadata = new a(userId, null, 2, null);
            String obj = eventType.toString();
            int c03 = kh2.j.c0(tpVar);
            int K2 = kh2.j.K2(tpVar);
            String str2 = (String) auxData.get("pin_id");
            String str3 = (String) auxData.get("upload_time");
            Long valueOf = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
            String str4 = (String) auxData.get("processing_time");
            IdeaPinKibanaLogger$Log$Payload payload = new IdeaPinKibanaLogger$Log$Payload(obj, str2, Integer.valueOf(c03), Integer.valueOf(K2), valueOf, str4 != null ? Long.valueOf(Long.parseLong(str4)) : null, (String) auxData.get("story_pin_create_failure_message"), (String) auxData.get("media_upload_failure_reason"), (String) auxData.get("media_status_failure_upload_ids"), (String) auxData.get("status_code"), (String) auxData.get("media_status_failure_reason"), (String) auxData.get("story_pin_template_type"), (String) auxData.get("is_draft"), (String) auxData.get("entry_type"), (String) auxData.get("idea_pin_creation_session_id"), (String) auxData.get("is_scheduled"), (String) auxData.get("media_export_skipped"));
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            Intrinsics.checkNotNullParameter(payload, "payload");
            b bVar2 = new b("story_pin_creation_event", metadata, payload, null, null, 0L, 56, null);
            ms0.b bVar3 = new ms0.b();
            bVar3.b(bVar2);
            analyticsApi.i(bVar3, ox.a.f97979i);
        }
    }
}
