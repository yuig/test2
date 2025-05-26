package com.pinterest.feature.ideaPinCreation.worker;

import ag1.b;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import androidx.work.WorkerParameters;
import aw0.n;
import aw0.o;
import aw0.p;
import com.pinterest.api.model.Cdo;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.kq;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mo;
import com.pinterest.api.model.mp;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.pq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.so;
import com.pinterest.api.model.to;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.tq;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.vq;
import com.pinterest.api.model.wn0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.video.worker.base.BaseWorker;
import dl1.l;
import dl1.t;
import el.a;
import et1.j;
import h22.f;
import h32.f1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kb.y;
import kh2.b0;
import kh2.g0;
import kh2.g3;
import kh2.k3;
import kh2.m2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.e0;
import kotlin.text.z;
import m60.d;
import nm.q;
import nm.u;
import org.jetbrains.annotations.NotNull;
import t3.s1;
import tb0.g;
import tb0.h;
import vd0.c;
import xk2.m;
import xk2.v;
import xk2.w;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BK\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/worker/LogRawIPDWorker;", "Lcom/pinterest/feature/video/worker/base/BaseWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lh22/f;", "storyPinService", "Lag1/b;", "ideaPinComposeDataManager", "Ldl1/t;", "Lcom/pinterest/api/model/v7;", "boardRepository", "Lbw0/f;", "storyPinWorkUtils", "Lb60/b;", "activeUserManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lh22/f;Lag1/b;Ldl1/t;Lbw0/f;Lb60/b;)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LogRawIPDWorker extends BaseWorker {
    public final v A;
    public final v B;
    public final v C;
    public final v D;
    public final v E;
    public final v F;
    public final v G;
    public final v H;

    /* renamed from: k, reason: collision with root package name */
    public final Context f46670k;

    /* renamed from: l, reason: collision with root package name */
    public final f f46671l;

    /* renamed from: m, reason: collision with root package name */
    public final b f46672m;

    /* renamed from: n, reason: collision with root package name */
    public final t f46673n;

    /* renamed from: o, reason: collision with root package name */
    public final bw0.f f46674o;

    /* renamed from: p, reason: collision with root package name */
    public final b60.b f46675p;

    /* renamed from: q, reason: collision with root package name */
    public final v f46676q;

    /* renamed from: r, reason: collision with root package name */
    public final v f46677r;

    /* renamed from: s, reason: collision with root package name */
    public final v f46678s;

    /* renamed from: t, reason: collision with root package name */
    public final v f46679t;

    /* renamed from: u, reason: collision with root package name */
    public final v f46680u;

    /* renamed from: v, reason: collision with root package name */
    public final v f46681v;

    /* renamed from: w, reason: collision with root package name */
    public final v f46682w;

    /* renamed from: x, reason: collision with root package name */
    public final v f46683x;

    /* renamed from: y, reason: collision with root package name */
    public final v f46684y;

    /* renamed from: z, reason: collision with root package name */
    public final v f46685z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogRawIPDWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull f storyPinService, @NotNull b ideaPinComposeDataManager, @NotNull t boardRepository, @NotNull bw0.f storyPinWorkUtils, @NotNull b60.b activeUserManager) {
        super("LogRawIPDWorker cancelled", context, workerParameters, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(storyPinService, "storyPinService");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(storyPinWorkUtils, "storyPinWorkUtils");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f46670k = context;
        this.f46671l = storyPinService;
        this.f46672m = ideaPinComposeDataManager;
        this.f46673n = boardRepository;
        this.f46674o = storyPinWorkUtils;
        this.f46675p = activeUserManager;
        this.f46676q = m.b(new o(this, 13));
        this.f46677r = m.b(new o(this, 12));
        this.f46678s = m.b(new o(this, 5));
        this.f46679t = m.b(new o(this, 6));
        this.f46680u = m.b(new o(this, 7));
        this.f46681v = m.b(new o(this, 10));
        this.f46682w = m.b(new o(this, 17));
        this.f46683x = m.b(new o(this, 1));
        this.f46684y = m.b(new o(this, 2));
        this.f46685z = m.b(new o(this, 3));
        this.A = m.b(new o(this, 15));
        this.B = m.b(new o(this, 0));
        this.C = m.b(new o(this, 9));
        this.D = m.b(new o(this, 8));
        this.E = m.b(new o(this, 4));
        this.F = m.b(new o(this, 16));
        this.G = m.b(new o(this, 14));
        this.H = m.b(new o(this, 11));
    }

    public static void F(String str, p pVar) {
        j jVar = new j();
        try {
            try {
                jVar.d(str);
                int trackCount = jVar.f60034a.getTrackCount();
                for (int i13 = 0; i13 < trackCount; i13++) {
                    MediaFormat a13 = jVar.a(i13);
                    String[] strArr = mg1.b.f87148a;
                    Object string = a13 != null ? a13.getString("mime") : null;
                    if (string == null) {
                        string = "";
                    }
                    pVar.invoke(a13, string);
                }
            } catch (Exception unused) {
                HashSet hashSet = h.f117076w;
                g.f117075a.q(new IllegalStateException("Missing Data"), "LogRawIPDWorker - Unable to extract media data for: " + str, tb0.p.IDEA_PINS_CREATION);
            }
            jVar.b();
        } catch (Throwable th3) {
            jVar.b();
            throw th3;
        }
    }

    public final String A() {
        return (String) this.F.getValue();
    }

    public final int B() {
        return ((Number) this.f46682w.getValue()).intValue();
    }

    public final boolean C() {
        return ((Boolean) this.f46681v.getValue()).booleanValue();
    }

    public final void D(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        if (str == null || (str2 = e0.C(4096, str)) == null) {
            str2 = "";
        }
        hashMap.put("error_message", str2);
        l().g(f1.RAW_IPD_LOG_FAILURE, (String) this.E.getValue(), hashMap, false);
    }

    public final void E(long j13) {
        HashMap hashMap = new HashMap();
        hashMap.put("upload_time", String.valueOf(j13));
        l().g(f1.RAW_IPD_LOG_SUCCESS, (String) this.E.getValue(), hashMap, false);
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        D("Worker failed: " + y(e13));
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void p() {
        LogRawIPDWorker logRawIPDWorker;
        c cVar;
        Exception exc;
        c cVar2;
        u uVar;
        String path;
        so canvasAspectRatio;
        u uVar2;
        u uVar3;
        String str;
        float f13;
        Context context;
        String str2;
        String str3;
        String str4;
        q qVar;
        String str5;
        q qVar2;
        Exception exc2;
        String str6;
        float f14;
        Context context2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        float f15;
        String str20;
        String str21;
        String str22;
        q qVar3;
        u uVar4;
        String str23;
        q qVar4;
        long currentTimeMillis;
        boolean z13;
        List split$default;
        List split$default2;
        t tVar;
        String str24;
        v vVar = this.H;
        v vVar2 = this.D;
        v vVar3 = this.C;
        v vVar4 = this.f46684y;
        v vVar5 = this.f46677r;
        v vVar6 = this.A;
        v vVar7 = this.f46683x;
        v vVar8 = this.f46676q;
        c cVar3 = new c();
        try {
            cVar2 = new c();
            uVar = cVar2.f125623a;
            cVar2.t("draft_id", v());
            cVar2.t("story_pin_creation_id", w());
            try {
                cVar2.r(Integer.valueOf(((tp) vVar8.getValue()) == null ? 0 : 1), "page_count");
                cVar2.t("publish_app_version", ((d) d.a()).d());
                cVar2.t("os_version", String.valueOf(Build.VERSION.SDK_INT));
                cVar2.t("device_model", Build.MODEL);
                cVar2.t("platform", "Android");
                wy0 f16 = ((b60.d) this.f46675p).f();
                if (f16 != null) {
                    try {
                        path = f16.getPath();
                    } catch (Exception e13) {
                        e = e13;
                        exc = e;
                        logRawIPDWorker = this;
                        cVar = cVar3;
                        logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                    }
                } else {
                    path = null;
                }
                cVar2.t("user_id", path);
                cVar2.t("story_pin_data_id", A());
                try {
                    cVar2.t("pin_id", (String) this.E.getValue());
                    cVar2.t("pin_image_signature", z());
                    cVar2.t("title", ((wn0) vVar5.getValue()).getPinTitle());
                    cVar2.s("is_baked_in", Boolean.TRUE);
                    cVar2.r(Integer.valueOf(B()), "template_type");
                    cVar2.t("entry_type", x());
                    cVar2.s("is_draft", Boolean.valueOf(C()));
                    String str25 = (String) vVar7.getValue();
                    if (str25 != null && !z.j(str25)) {
                        try {
                            cVar2.t("board_id", (String) vVar7.getValue());
                            tVar = this.f46673n;
                            try {
                                str24 = (String) vVar7.getValue();
                                Intrinsics.f(str24);
                            } catch (Exception e14) {
                                e = e14;
                            }
                        } catch (Exception e15) {
                            e = e15;
                        }
                        try {
                            v7 v7Var = (v7) ((l) tVar).O(str24);
                            if (v7Var != null) {
                                cVar2.s("is_board_secret", Boolean.valueOf(kh2.d.M0(v7Var)));
                                Unit unit = Unit.f80348a;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            exc = e;
                            logRawIPDWorker = this;
                            cVar = cVar3;
                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                        }
                    }
                    String str26 = (String) vVar4.getValue();
                    if (str26 != null && !z.j(str26)) {
                        try {
                            cVar2.t("board_section_id", (String) vVar4.getValue());
                        } catch (Exception e17) {
                            e = e17;
                            exc = e;
                            logRawIPDWorker = this;
                            cVar = cVar3;
                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                        }
                    }
                    cVar2.s("are_comments_allowed", Boolean.valueOf(u()));
                    cVar2.s("are_stela_recs_enabled", Boolean.valueOf(s()));
                    cVar2.s("is_paid_partnership", Boolean.valueOf(((String) vVar6.getValue()) != null));
                    String str27 = (String) vVar6.getValue();
                    if (str27 != null && !z.j(str27)) {
                        try {
                            cVar2.t("sponsor_id", (String) vVar6.getValue());
                        } catch (Exception e18) {
                            e = e18;
                            exc = e;
                            logRawIPDWorker = this;
                            cVar = cVar3;
                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                        }
                    }
                    if (!z.j((String) vVar3.getValue())) {
                        try {
                            split$default2 = StringsKt__StringsKt.split$default((String) vVar3.getValue(), new String[]{","}, false, 0, 6, null);
                            try {
                                q qVar5 = new q();
                                Iterator it = split$default2.iterator();
                                while (it.hasNext()) {
                                    qVar5.t(new nm.v((String) it.next()));
                                }
                                uVar.r("tag_ids", qVar5);
                            } catch (Exception e19) {
                                e = e19;
                                exc = e;
                                logRawIPDWorker = this;
                                cVar = cVar3;
                                logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                            }
                        } catch (Exception e23) {
                            e = e23;
                        }
                    }
                    if (!z.j((String) vVar2.getValue())) {
                        try {
                            split$default = StringsKt__StringsKt.split$default((String) vVar2.getValue(), new String[]{","}, false, 0, 6, null);
                        } catch (Exception e24) {
                            e = e24;
                        }
                        try {
                            q qVar6 = new q();
                            Iterator it2 = split$default.iterator();
                            while (it2.hasNext()) {
                                qVar6.t(new nm.v((String) it2.next()));
                            }
                            uVar.r("freeform_tags", qVar6);
                        } catch (Exception e25) {
                            e = e25;
                            exc = e;
                            logRawIPDWorker = this;
                            cVar = cVar3;
                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                        }
                    }
                    String str28 = (String) vVar.getValue();
                    if (str28 != null && str28.length() != 0) {
                        try {
                            cVar2.t("link", (String) vVar.getValue());
                        } catch (Exception e26) {
                            e = e26;
                            exc = e;
                            logRawIPDWorker = this;
                            cVar = cVar3;
                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                        }
                    }
                    canvasAspectRatio = ((wn0) vVar5.getValue()).getCanvasAspectRatio();
                    canvasAspectRatio.getClass();
                } catch (Exception e27) {
                    e = e27;
                    logRawIPDWorker = this;
                    cVar = cVar3;
                }
            } catch (Exception e28) {
                e = e28;
                logRawIPDWorker = this;
                cVar = cVar3;
                exc = e;
                logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
            }
        } catch (Exception e29) {
            e = e29;
            logRawIPDWorker = this;
        }
        try {
            cVar2.t("canvas_aspect_ratio", canvasAspectRatio instanceof mo ? "original" : canvasAspectRatio.toString());
            tp tpVar = (tp) vVar8.getValue();
            if (tpVar != null) {
                String localAdjustedImagePath = tpVar.getLocalAdjustedImagePath();
                if (localAdjustedImagePath != null) {
                    d30 item = new d30(localAdjustedImagePath, null, 2, false ? 1 : 0);
                    try {
                        Intrinsics.checkNotNullParameter(item, "item");
                        int f17 = new k6.g(item.e()).f(1, "Orientation");
                        Pair pair = (f17 == 6 || f17 == 8) ? new Pair(item.h().f80347b, item.h().f80346a) : item.h();
                        cVar2.r((Number) pair.f80346a, "canvas_width");
                        cVar2.r((Number) pair.f80347b, "canvas_height");
                        Unit unit2 = Unit.f80348a;
                    } catch (Exception e33) {
                        e = e33;
                        exc = e;
                        logRawIPDWorker = this;
                        cVar = cVar3;
                        logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                    }
                }
                to coverImageData = tpVar.getCoverImageData();
                if (coverImageData != null) {
                    int mediaIndex = coverImageData.getMediaIndex();
                    long mediaOffsetMs = coverImageData.getMediaOffsetMs();
                    try {
                        u uVar5 = new u();
                        uVar5.s(Integer.valueOf(mediaIndex), "clip_index");
                        float f18 = 1000L;
                        uVar5.s(Float.valueOf(mediaOffsetMs / f18), "clip_time");
                        uVar.r("cover_image_media_data", uVar5);
                        if (mediaIndex == 0 && mediaOffsetMs == 0) {
                            z13 = false;
                            cVar2.s("is_custom_cover_image", Boolean.valueOf(z13));
                            cVar2.r(Float.valueOf(ig1.b.P(tpVar) / f18), "cover_image_time");
                        }
                        z13 = true;
                        cVar2.s("is_custom_cover_image", Boolean.valueOf(z13));
                        cVar2.r(Float.valueOf(ig1.b.P(tpVar) / f18), "cover_image_time");
                    } catch (Exception e34) {
                        e = e34;
                        exc = e;
                        logRawIPDWorker = this;
                        cVar = cVar3;
                        logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                    }
                } else {
                    cVar2.s("is_custom_cover_image", Boolean.FALSE);
                    cVar2.r(Float.valueOf(0.0f), "cover_image_time");
                    Unit unit3 = Unit.f80348a;
                }
                Unit unit4 = Unit.f80348a;
            }
            q qVar7 = new q();
            tp tpVar2 = (tp) vVar8.getValue();
            if (tpVar2 != null) {
                try {
                    uVar2 = new u();
                } catch (Exception e35) {
                    e = e35;
                }
                try {
                    uVar2.s(0, "index");
                    uVar2.u("background_color", tpVar2.getPageBackgroundColor());
                    ArrayList e03 = ig1.b.e0(tpVar2.getMediaList());
                    vn0 mediaList = tpVar2.getMediaList();
                    long v13 = tpVar2.R() ? 5000L : mediaList.v();
                    float f19 = 1000L;
                    uVar2.s(Float.valueOf(v13 / f19), "page_duration");
                    try {
                        u uVar6 = new u();
                        uVar3 = uVar;
                        uVar6.s(Integer.valueOf(mediaList.getStartMediaIndex()), "start_media_index");
                        uVar6.s(Integer.valueOf(mediaList.getEndMediaIndex()), "end_media_index");
                        uVar6.s(Float.valueOf(mediaList.getStartTimeMs() / f19), "start_time");
                        String str29 = "board_id";
                        uVar6.s(Float.valueOf(mediaList.getEndTimeMs() / f19), "end_time");
                        Unit unit5 = Unit.f80348a;
                        uVar2.r("local_media_list", uVar6);
                        try {
                            u uVar7 = new u();
                            uVar7.s(Float.valueOf((ig1.b.R(mediaList.getStartMediaIndex(), e03) + mediaList.getStartTimeMs()) / f19), "start_time");
                            uVar7.s(Float.valueOf((ig1.b.R(mediaList.getEndMediaIndex(), e03) + mediaList.getEndTimeMs()) / f19), "end_time");
                            uVar2.r("trimmed_time_range", uVar7);
                            try {
                                u uVar8 = new u();
                                uVar8.s(Float.valueOf(tpVar2.getAudioMix().getMusic()), "music");
                                uVar8.s(Float.valueOf(tpVar2.getAudioMix().getVideo()), "video_audio");
                                uVar2.r("audio_mix", uVar8);
                                try {
                                    q qVar8 = new q();
                                    float t13 = t();
                                    boolean R = tpVar2.R();
                                    String str30 = "pin_id";
                                    String str31 = "user_id";
                                    long j13 = v13;
                                    String str32 = "height";
                                    String str33 = "width";
                                    q qVar9 = qVar8;
                                    String str34 = "block_style";
                                    Context context3 = this.f46670k;
                                    try {
                                        if (R) {
                                            bo0 bo0Var = (bo0) CollectionsKt.U(0, tpVar2.getMediaList().getItems());
                                            if (bo0Var != null) {
                                                d30 photoItem = bo0Var.getPhotoItem();
                                                k01 videoItem = bo0Var.getVideoItem();
                                                if (photoItem != null && videoItem != null) {
                                                    try {
                                                        uVar4 = new u();
                                                        uVar4.u("track_type", "image");
                                                        Matrix displayMatrix = bo0Var.getDisplayMatrix();
                                                        if (displayMatrix == null) {
                                                            displayMatrix = new Matrix();
                                                        }
                                                        str = "track_type";
                                                        try {
                                                            uVar4.r("block_style", g3.n2(context3, ig1.b.q0(context3, t13, videoItem, bo0Var.getDisplayMatrix()), t13, ig1.b.a0(displayMatrix)).f125623a);
                                                            uVar4.u("file_path", photoItem.e());
                                                            uVar4.s((Number) photoItem.h().f80346a, "width");
                                                            uVar4.s((Number) photoItem.h().f80347b, "height");
                                                        } catch (Exception e36) {
                                                            e = e36;
                                                        }
                                                    } catch (Exception e37) {
                                                        e = e37;
                                                    }
                                                    try {
                                                        u uVar9 = new u();
                                                        uVar9.s(Float.valueOf(bo0Var.getStartTimeMs() / f19), "start_time");
                                                        uVar9.s(Float.valueOf(bo0Var.getEndTimeMs() / f19), "end_time");
                                                        uVar4.r("trimmed_time_range", uVar9);
                                                        uVar4.s(Float.valueOf(new File(photoItem.e()).length() / 1048576), "file_size");
                                                        String absoluteFilePath = photoItem.e();
                                                        Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
                                                        try {
                                                            int N = StringsKt.N(absoluteFilePath, ".", 0, 6);
                                                            if (N >= 0) {
                                                                String substring = absoluteFilePath.substring(N + 1);
                                                                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                                                str23 = substring.toLowerCase();
                                                                Intrinsics.checkNotNullExpressionValue(str23, "toLowerCase(...)");
                                                            } else {
                                                                str23 = "";
                                                            }
                                                            uVar4.u("file_type", str23);
                                                            q qVar10 = qVar9;
                                                            qVar10.t(uVar4);
                                                            qVar3 = qVar10;
                                                            f13 = t13;
                                                            context = context3;
                                                            str2 = "width";
                                                            str3 = "height";
                                                            str5 = "end_time";
                                                            str4 = "block_style";
                                                            qVar = qVar3;
                                                        } catch (Exception e38) {
                                                            exc2 = e38;
                                                            exc = exc2;
                                                            logRawIPDWorker = this;
                                                            cVar = cVar3;
                                                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                        }
                                                    } catch (Exception e39) {
                                                        e = e39;
                                                        exc = e;
                                                        logRawIPDWorker = this;
                                                        cVar = cVar3;
                                                        logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                    }
                                                }
                                            }
                                            str = "track_type";
                                            qVar3 = qVar9;
                                            f13 = t13;
                                            context = context3;
                                            str2 = "width";
                                            str3 = "height";
                                            str5 = "end_time";
                                            str4 = "block_style";
                                            qVar = qVar3;
                                        } else {
                                            str = "track_type";
                                            String str35 = ".";
                                            String str36 = "file_type";
                                            String str37 = "substring(...)";
                                            String str38 = "absoluteFilePath";
                                            String str39 = "trimmed_time_range";
                                            String str40 = "file_size";
                                            String str41 = "toLowerCase(...)";
                                            Iterator it3 = e03.iterator();
                                            while (it3.hasNext()) {
                                                bo0 bo0Var2 = (bo0) it3.next();
                                                String str42 = str41;
                                                c cVar4 = new c();
                                                String str43 = str37;
                                                u uVar10 = cVar4.f125623a;
                                                String str44 = str35;
                                                String str45 = str38;
                                                String str46 = str;
                                                cVar4.t(str46, "video");
                                                k01 videoItem2 = bo0Var2.getVideoItem();
                                                if (videoItem2 != null) {
                                                    Matrix displayMatrix2 = bo0Var2.getDisplayMatrix();
                                                    if (displayMatrix2 == null) {
                                                        displayMatrix2 = new Matrix();
                                                    }
                                                    str = str46;
                                                    float a03 = ig1.b.a0(displayMatrix2);
                                                    String str47 = str40;
                                                    try {
                                                        uVar10.r(str34, g3.n2(context3, ig1.b.q0(context3, t13, videoItem2, bo0Var2.getDisplayMatrix()), t13, a03).f125623a);
                                                        cVar4.t("file_path", videoItem2.e());
                                                        cVar4.r((Number) videoItem2.h().f135234a, str33);
                                                        cVar4.r((Number) videoItem2.h().f135235b, str32);
                                                        float f23 = t13;
                                                        context2 = context3;
                                                        cVar4.r(Float.valueOf(videoItem2.j() / f19), "duration");
                                                        cVar4.r(Float.valueOf(1.0f), "playback_speed");
                                                        cVar4.s("is_from_manual_split", Boolean.FALSE);
                                                        cVar4.s("is_converted_from_image", Boolean.valueOf(bo0Var2.getPhotoItem() != null));
                                                        try {
                                                            u uVar11 = new u();
                                                            String str48 = str32;
                                                            uVar11.s(Float.valueOf(bo0Var2.getStartTimeMs() / f19), "start_time");
                                                            uVar11.s(Float.valueOf(bo0Var2.getEndTimeMs() / f19), "end_time");
                                                            Unit unit6 = Unit.f80348a;
                                                            uVar10.r(str39, uVar11);
                                                            f14 = f23;
                                                            str40 = str47;
                                                            cVar4.r(Float.valueOf(new File(videoItem2.e()).length() / 1048576), str40);
                                                            String e43 = videoItem2.e();
                                                            str15 = str45;
                                                            Intrinsics.checkNotNullParameter(e43, str15);
                                                            str14 = str48;
                                                            str8 = str44;
                                                            str10 = str34;
                                                            try {
                                                                int N2 = StringsKt.N(e43, str8, 0, 6);
                                                                if (N2 >= 0) {
                                                                    String substring2 = e43.substring(N2 + 1);
                                                                    str7 = str43;
                                                                    Intrinsics.checkNotNullExpressionValue(substring2, str7);
                                                                    str16 = substring2.toLowerCase();
                                                                    str11 = str42;
                                                                    Intrinsics.checkNotNullExpressionValue(str16, str11);
                                                                    str12 = str33;
                                                                } else {
                                                                    str11 = str42;
                                                                    str7 = str43;
                                                                    str12 = str33;
                                                                    str16 = "";
                                                                }
                                                                str13 = str36;
                                                                cVar4.t(str13, str16);
                                                                str9 = str39;
                                                                F(videoItem2.e(), new p(cVar4, 0));
                                                            } catch (Exception e44) {
                                                                exc2 = e44;
                                                                exc = exc2;
                                                                logRawIPDWorker = this;
                                                                cVar = cVar3;
                                                                logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                            }
                                                        } catch (Exception e45) {
                                                            e = e45;
                                                            exc = e;
                                                            logRawIPDWorker = this;
                                                            cVar = cVar3;
                                                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                        }
                                                    } catch (Exception e46) {
                                                        e = e46;
                                                    }
                                                } else {
                                                    f14 = t13;
                                                    context2 = context3;
                                                    str = str46;
                                                    str7 = str43;
                                                    str8 = str44;
                                                    str9 = str39;
                                                    str10 = str34;
                                                    str11 = str42;
                                                    str12 = str33;
                                                    str13 = str36;
                                                    str14 = str32;
                                                    str15 = str45;
                                                }
                                                q qVar11 = qVar9;
                                                qVar11.t(uVar10);
                                                qVar9 = qVar11;
                                                str35 = str8;
                                                str36 = str13;
                                                str37 = str7;
                                                str41 = str11;
                                                t13 = f14;
                                                str33 = str12;
                                                str39 = str9;
                                                str34 = str10;
                                                context3 = context2;
                                                str38 = str15;
                                                str32 = str14;
                                            }
                                            f13 = t13;
                                            context = context3;
                                            str2 = str33;
                                            String str49 = str39;
                                            str3 = str32;
                                            String str50 = str38;
                                            String str51 = str35;
                                            str4 = str34;
                                            q qVar12 = qVar9;
                                            String str52 = str36;
                                            String str53 = str37;
                                            String str54 = str41;
                                            if (tpVar2.getAudioList().a()) {
                                                c cVar5 = new c();
                                                u uVar12 = cVar5.f125623a;
                                                String str55 = str;
                                                cVar5.t(str55, "music");
                                                Cdo musicItem = tpVar2.getAudioList().getMusicItem();
                                                if (musicItem != null) {
                                                    str = str55;
                                                    qVar2 = qVar12;
                                                    cVar5.s("is_royalty_free", musicItem.getMetadata().v());
                                                    cVar5.t("music_id", musicItem.getMetadata().getPath());
                                                    cVar5.t("file_path", musicItem.getAudioItem().e());
                                                    str5 = "end_time";
                                                    cVar5.r(Float.valueOf(new File(musicItem.getAudioItem().e()).length() / 1048576), str40);
                                                    String e47 = musicItem.getAudioItem().e();
                                                    Intrinsics.checkNotNullParameter(e47, str50);
                                                    try {
                                                        int N3 = StringsKt.N(e47, str51, 0, 6);
                                                        if (N3 >= 0) {
                                                            String substring3 = e47.substring(N3 + 1);
                                                            Intrinsics.checkNotNullExpressionValue(substring3, str53);
                                                            String lowerCase = substring3.toLowerCase();
                                                            Intrinsics.checkNotNullExpressionValue(lowerCase, str54);
                                                            str6 = lowerCase;
                                                        } else {
                                                            str6 = "";
                                                        }
                                                        cVar5.t(str52, str6);
                                                        cVar5.s("is_continuous", Boolean.FALSE);
                                                        float longValue = ((Number) musicItem.getTrimmedTimeRangeMs().f80346a).longValue() / f19;
                                                        float longValue2 = ((Number) musicItem.getTrimmedTimeRangeMs().f80347b).longValue() / f19;
                                                        try {
                                                            u uVar13 = new u();
                                                            uVar13.s(Float.valueOf(longValue), "start_time");
                                                            uVar13.s(Float.valueOf(longValue2), str5);
                                                            uVar12.r(str49, uVar13);
                                                            uVar12.r("playback_time_range", uVar13);
                                                            F(musicItem.getAudioItem().e(), new p(cVar5, 1));
                                                            Unit unit7 = Unit.f80348a;
                                                        } catch (Exception e48) {
                                                            e = e48;
                                                            exc = e;
                                                            logRawIPDWorker = this;
                                                            cVar = cVar3;
                                                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                        }
                                                    } catch (Exception e49) {
                                                        exc2 = e49;
                                                        exc = exc2;
                                                        logRawIPDWorker = this;
                                                        cVar = cVar3;
                                                        logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                    }
                                                } else {
                                                    qVar2 = qVar12;
                                                    str5 = "end_time";
                                                    str = str55;
                                                }
                                                q qVar13 = qVar2;
                                                qVar13.t(uVar12);
                                                qVar = qVar13;
                                            } else {
                                                qVar = qVar12;
                                                str5 = "end_time";
                                            }
                                        }
                                        if (tpVar2.N()) {
                                            try {
                                                u uVar14 = new u();
                                                str17 = str;
                                                uVar14.u(str17, "drawing");
                                                try {
                                                    u uVar15 = new u();
                                                    uVar15.s(Float.valueOf(0.0f), "x_coord");
                                                    uVar15.s(Float.valueOf(0.0f), "y_coord");
                                                    uVar15.s(Float.valueOf(100.0f), str2);
                                                    uVar15.s(Float.valueOf(100.0f), str3);
                                                    uVar15.s(Float.valueOf(0.0f), "rotation");
                                                    str18 = str4;
                                                    uVar14.r(str18, uVar15);
                                                    ArrayList arrayList = new ArrayList();
                                                    ArrayList arrayList2 = new ArrayList();
                                                    for (mp mpVar : tpVar2.getDrawingPathList()) {
                                                        arrayList.add(mpVar.getBrushColor());
                                                        int i13 = n.f20574a[mpVar.getBrushType().ordinal()];
                                                        if (i13 == 1) {
                                                            str19 = "dash";
                                                        } else if (i13 == 2) {
                                                            str19 = "pen";
                                                        } else if (i13 == 3) {
                                                            str19 = "neon";
                                                        } else if (i13 == 4) {
                                                            str19 = "arrow";
                                                        } else {
                                                            if (i13 != 5) {
                                                                throw new NoWhenBranchMatchedException();
                                                            }
                                                            str19 = "eraser";
                                                        }
                                                        arrayList2.add(str19);
                                                    }
                                                    try {
                                                        q qVar14 = new q();
                                                        Iterator it4 = arrayList.iterator();
                                                        while (it4.hasNext()) {
                                                            qVar14.t(new nm.v((String) it4.next()));
                                                        }
                                                        uVar14.r("stroke_colors", qVar14);
                                                        try {
                                                            q qVar15 = new q();
                                                            Iterator it5 = arrayList2.iterator();
                                                            while (it5.hasNext()) {
                                                                qVar15.t(new nm.v((String) it5.next()));
                                                            }
                                                            uVar14.r("stroke_types", qVar15);
                                                            qVar.t(uVar14);
                                                        } catch (Exception e53) {
                                                            exc2 = e53;
                                                            exc = exc2;
                                                            logRawIPDWorker = this;
                                                            cVar = cVar3;
                                                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                        }
                                                    } catch (Exception e54) {
                                                        exc2 = e54;
                                                    }
                                                } catch (Exception e55) {
                                                    e = e55;
                                                    exc = e;
                                                    logRawIPDWorker = this;
                                                    cVar = cVar3;
                                                    logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                }
                                            } catch (Exception e56) {
                                                e = e56;
                                            }
                                        } else {
                                            str18 = str4;
                                            str17 = str;
                                        }
                                        Iterator it6 = tpVar2.getOverlayBlocks().iterator();
                                        q qVar16 = qVar;
                                        while (it6.hasNext()) {
                                            qq qqVar = (qq) it6.next();
                                            c cVar6 = new c();
                                            u uVar16 = cVar6.f125623a;
                                            Matrix matrix = qqVar.getConfig().getMatrix();
                                            if (matrix == null) {
                                                matrix = new Matrix();
                                            }
                                            float a04 = ig1.b.a0(matrix);
                                            vq rotatedRect = qqVar.getConfig().getRotatedRect();
                                            if (rotatedRect == null) {
                                                rotatedRect = new vq();
                                            }
                                            float f24 = f13;
                                            Context context4 = context;
                                            try {
                                                cVar6.f125623a.r(str18, g3.n2(context4, rotatedRect, f24, a04).f125623a);
                                                tq durationConfig = qqVar.getDurationConfig();
                                                try {
                                                    u uVar17 = new u();
                                                    f13 = f24;
                                                    context = context4;
                                                    uVar17.s(Float.valueOf(durationConfig.getStartTimeMs() / f19), "start_time");
                                                    q qVar17 = qVar16;
                                                    Iterator it7 = it6;
                                                    long j14 = j13;
                                                    uVar17.s(Float.valueOf(durationConfig.g(j14) / f19), str5);
                                                    Unit unit8 = Unit.f80348a;
                                                    uVar16.r("playback_time_range", uVar17);
                                                    if (qqVar instanceof oq) {
                                                        cVar6.t(str17, "text");
                                                        cVar6.t("text", ((oq) qqVar).getText());
                                                        try {
                                                            u uVar18 = new u();
                                                            String colorHex = g3.w2((oq) qqVar);
                                                            uVar18.u("color", m2.I1(colorHex));
                                                            try {
                                                                Intrinsics.checkNotNullParameter(colorHex, "colorHex");
                                                                float f25 = 255;
                                                                uVar18.s(Float.valueOf(((Color.parseColor(colorHex) >> 24) & 255) / f25), "alpha");
                                                                uVar16.r("text_color", uVar18);
                                                                oq oqVar = (oq) qqVar;
                                                                try {
                                                                    Intrinsics.checkNotNullParameter(oqVar, "<this>");
                                                                    String colorHex2 = k3.o0(oqVar.getHighlightType(), oqVar.getConfig().getColorHex());
                                                                    if (colorHex2 != null) {
                                                                        try {
                                                                            u uVar19 = new u();
                                                                            f15 = f19;
                                                                            uVar19.u("color", m2.I1(colorHex2));
                                                                            try {
                                                                                Intrinsics.checkNotNullParameter(colorHex2, "colorHex");
                                                                                uVar19.s(Float.valueOf(((Color.parseColor(colorHex2) >> 24) & 255) / f25), "alpha");
                                                                                uVar16.r("highlight_color", uVar19);
                                                                            } catch (Exception e57) {
                                                                                exc2 = e57;
                                                                                exc = exc2;
                                                                                logRawIPDWorker = this;
                                                                                cVar = cVar3;
                                                                                logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                                            }
                                                                        } catch (Exception e58) {
                                                                            e = e58;
                                                                            exc = e;
                                                                            logRawIPDWorker = this;
                                                                            cVar = cVar3;
                                                                            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                                                                        }
                                                                    } else {
                                                                        f15 = f19;
                                                                    }
                                                                    cVar6.t("text_alignment", b0.P1(((oq) qqVar).getAlignment()));
                                                                    cVar6.t("highlight_type", k3.S1(((oq) qqVar).getHighlightType()));
                                                                    cVar6.t("font_id", ((oq) qqVar).getFontId());
                                                                    cVar6.r(Float.valueOf(((oq) qqVar).getFontSize()), "font_size");
                                                                    str22 = str29;
                                                                    str21 = str30;
                                                                    str20 = str31;
                                                                } catch (Exception e59) {
                                                                    exc2 = e59;
                                                                }
                                                            } catch (Exception e63) {
                                                                exc2 = e63;
                                                            }
                                                        } catch (Exception e64) {
                                                            e = e64;
                                                        }
                                                    } else {
                                                        f15 = f19;
                                                        if (qqVar instanceof lq) {
                                                            cVar6.t(str17, "interactive_sticker");
                                                            cVar6.t("sticker_type", "mention");
                                                            str20 = str31;
                                                            cVar6.t(str20, ((lq) qqVar).getUserId());
                                                            cVar6.t("sticker_color", qqVar.getConfig().getColorHex());
                                                            str22 = str29;
                                                            str21 = str30;
                                                        } else {
                                                            str20 = str31;
                                                            if (qqVar instanceof mq) {
                                                                cVar6.t(str17, "interactive_sticker");
                                                                cVar6.t("sticker_type", "product");
                                                                str21 = str30;
                                                                cVar6.t(str21, ((mq) qqVar).getPinId());
                                                                cVar6.t("sticker_color", qqVar.getConfig().getColorHex());
                                                                a42.o variantType = ((mq) qqVar).getVariantType();
                                                                cVar6.r(variantType != null ? Integer.valueOf(variantType.getValue()) : null, "variant_type");
                                                            } else {
                                                                str21 = str30;
                                                                if (qqVar instanceof pq) {
                                                                    cVar6.t(str17, "interactive_sticker");
                                                                    cVar6.t("sticker_type", "VTO");
                                                                    cVar6.t(str21, ((pq) qqVar).getPinId());
                                                                    cVar6.t("sticker_color", qqVar.getConfig().getColorHex());
                                                                } else if (qqVar instanceof nq) {
                                                                    cVar6.t(str17, "static_sticker");
                                                                    cVar6.t("sticker_id", ((nq) qqVar).getStickerDetails().getPath());
                                                                    cVar6.t("sticker_color", qqVar.getConfig().getColorHex());
                                                                    cVar6.s("is_animated", Boolean.valueOf(g0.e0(((nq) qqVar).getStickerDetails())));
                                                                } else if (qqVar instanceof jq) {
                                                                    cVar6.t(str17, "interactive_sticker");
                                                                    cVar6.t("sticker_type", "board");
                                                                    String str56 = str29;
                                                                    cVar6.t(str56, ((jq) qqVar).getBoardId());
                                                                    cVar6.t("sticker_color", qqVar.getConfig().getColorHex());
                                                                    cVar6.r(Integer.valueOf(((jq) qqVar).getVariantType().getValue()), "variant_type");
                                                                    str22 = str56;
                                                                } else {
                                                                    str22 = str29;
                                                                    if (!(qqVar instanceof kq)) {
                                                                        throw new NoWhenBranchMatchedException();
                                                                    }
                                                                    cVar6.t(str17, "interactive_sticker");
                                                                    cVar6.t("sticker_type", "image");
                                                                }
                                                            }
                                                            str22 = str29;
                                                        }
                                                    }
                                                    a.B(Unit.f80348a);
                                                    qVar17.t(uVar16);
                                                    str29 = str22;
                                                    qVar16 = qVar17;
                                                    str31 = str20;
                                                    j13 = j14;
                                                    str30 = str21;
                                                    it6 = it7;
                                                    f19 = f15;
                                                } catch (Exception e65) {
                                                    e = e65;
                                                }
                                            } catch (Exception e66) {
                                                exc2 = e66;
                                            }
                                        }
                                        uVar2.r("tracks", qVar16);
                                        q qVar18 = qVar7;
                                        qVar18.t(uVar2);
                                        Unit unit9 = Unit.f80348a;
                                        qVar4 = qVar18;
                                    } catch (Exception e67) {
                                        e = e67;
                                    }
                                } catch (Exception e68) {
                                    e = e68;
                                }
                            } catch (Exception e69) {
                                e = e69;
                            }
                        } catch (Exception e73) {
                            e = e73;
                        }
                    } catch (Exception e74) {
                        e = e74;
                    }
                } catch (Exception e75) {
                    logRawIPDWorker = this;
                    exc = e75;
                    cVar = cVar3;
                    logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
                }
            } else {
                qVar4 = qVar7;
                uVar3 = uVar;
            }
            cVar = cVar3;
            try {
                cVar.f125623a.r("metadata", uVar3);
                cVar.f125623a.r("pages", qVar4);
                currentTimeMillis = System.currentTimeMillis();
                logRawIPDWorker = this;
            } catch (Exception e76) {
                e = e76;
                logRawIPDWorker = this;
            }
            try {
                tt1.a aVar = (tt1.a) logRawIPDWorker.f46671l.e(cVar).d();
                if (aVar.b() == 0) {
                    logRawIPDWorker.E(System.currentTimeMillis() - currentTimeMillis);
                } else {
                    logRawIPDWorker.D("API call returned with error: " + aVar.d() + "; rawIPDJson: " + cVar);
                }
                Unit unit10 = Unit.f80348a;
            } catch (Exception e77) {
                e = e77;
                exc = e;
                logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
            }
        } catch (Exception e78) {
            e = e78;
            logRawIPDWorker = this;
            cVar = cVar3;
            exc = e;
            logRawIPDWorker.D("onStart failed with error: " + logRawIPDWorker.y(exc) + "; rawIPDJson: " + cVar);
        }
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final y q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = (String) this.E.getValue();
        Intrinsics.checkNotNullParameter("PIN_ID", "key");
        linkedHashMap.put("PIN_ID", str);
        kb.l lVar = new kb.l(linkedHashMap);
        bk.f.e0(lVar);
        y yVar = new y(lVar);
        Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
        return yVar;
    }

    public final boolean s() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    public final float t() {
        return (float) ((wn0) this.f46677r.getValue()).getCanvasAspectRatio().d();
    }

    public final boolean u() {
        return ((Boolean) this.f46685z.getValue()).booleanValue();
    }

    public final String v() {
        return (String) this.f46678s.getValue();
    }

    public final String w() {
        return (String) this.f46679t.getValue();
    }

    public final String x() {
        return (String) this.f46680u.getValue();
    }

    public final String y(Exception exc) {
        this.f46674o.getClass();
        w e13 = bw0.f.e(exc);
        String str = (String) e13.f135234a;
        String str2 = (String) e13.f135235b;
        if (str2 != null) {
            return s1.c("responseCode: ", str2, "; msg: ", str);
        }
        String stackTraceString = Log.getStackTraceString(exc);
        Intrinsics.f(stackTraceString);
        return stackTraceString;
    }

    public final String z() {
        return (String) this.G.getValue();
    }
}
