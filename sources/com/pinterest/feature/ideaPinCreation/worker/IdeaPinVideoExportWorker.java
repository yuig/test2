package com.pinterest.feature.ideaPinCreation.worker;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.work.WorkerParameters;
import aw0.g;
import bw0.f;
import bw0.o;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.dk;
import com.pinterest.api.model.ek;
import com.pinterest.api.model.fk;
import com.pinterest.api.model.fr;
import com.pinterest.api.model.j01;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.n10;
import com.pinterest.api.model.nq;
import com.pinterest.api.model.qq;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.uk;
import com.pinterest.api.model.vk;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.wk;
import com.pinterest.feature.video.worker.base.BaseWorker;
import com.pinterest.mediaPipeline.PipelineException;
import ff0.j;
import gi1.e;
import h32.f1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.CancellationException;
import jg1.i;
import kb.y;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh0.s1;
import nt0.d;
import org.jetbrains.annotations.NotNull;
import oy.a;
import oy.h2;
import r32.c;
import sv0.l;
import tb0.h;
import tb0.p;
import x02.i2;
import x02.x0;
import x02.x2;
import xj2.b;
import xk2.k;
import xk2.m;
import xk2.n;
import xk2.w;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fBu\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/worker/IdeaPinVideoExportWorker;", "Lcom/pinterest/feature/video/worker/base/BaseWorker;", "Lgi1/e;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lag1/b;", "ideaPinComposeDataManager", "Lbw0/f;", "storyPinWorkUtils", "Lbw0/o;", "supportWorkUtils", "Ltb0/h;", "crashReporting", "Llh0/s1;", "experiments", "Lx02/i2;", "pinRepository", "Lx02/x2;", "userRepository", "Lsv0/l;", "s3UploadHelper", "Lx02/x0;", "boardRepository", "Lnt0/d;", "animatedStickerRepository", "Lzf1/e;", "fontManager", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lag1/b;Lbw0/f;Lbw0/o;Ltb0/h;Llh0/s1;Lx02/i2;Lx02/x2;Lsv0/l;Lx02/x0;Lnt0/d;Lzf1/e;)V", "vt1/a", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinVideoExportWorker extends BaseWorker implements e {
    public final k A;
    public final k B;
    public Long C;
    public final k D;
    public final k E;
    public final k F;
    public final k G;
    public final k H;
    public final k I;

    /* renamed from: J, reason: collision with root package name */
    public final k f46653J;
    public final k K;
    public int L;
    public i M;
    public boolean N;
    public int O;
    public final LinkedHashSet P;
    public final b Q;
    public boolean R;

    /* renamed from: k, reason: collision with root package name */
    public final Context f46654k;

    /* renamed from: l, reason: collision with root package name */
    public final ag1.b f46655l;

    /* renamed from: m, reason: collision with root package name */
    public final f f46656m;

    /* renamed from: n, reason: collision with root package name */
    public final o f46657n;

    /* renamed from: o, reason: collision with root package name */
    public final h f46658o;

    /* renamed from: p, reason: collision with root package name */
    public final s1 f46659p;

    /* renamed from: q, reason: collision with root package name */
    public final i2 f46660q;

    /* renamed from: r, reason: collision with root package name */
    public final x2 f46661r;

    /* renamed from: s, reason: collision with root package name */
    public final l f46662s;

    /* renamed from: t, reason: collision with root package name */
    public final x0 f46663t;

    /* renamed from: u, reason: collision with root package name */
    public final d f46664u;

    /* renamed from: v, reason: collision with root package name */
    public final zf1.e f46665v;

    /* renamed from: w, reason: collision with root package name */
    public final k f46666w;

    /* renamed from: x, reason: collision with root package name */
    public final k f46667x;

    /* renamed from: y, reason: collision with root package name */
    public final k f46668y;

    /* renamed from: z, reason: collision with root package name */
    public final k f46669z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinVideoExportWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters, @NotNull ag1.b ideaPinComposeDataManager, @NotNull f storyPinWorkUtils, @NotNull o supportWorkUtils, @NotNull h crashReporting, @NotNull s1 experiments, @NotNull i2 pinRepository, @NotNull x2 userRepository, @NotNull l s3UploadHelper, @NotNull x0 boardRepository, @NotNull d animatedStickerRepository, @NotNull zf1.e fontManager) {
        super("IdeaPinVideoExportWorker cancelled", context, workerParameters, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(storyPinWorkUtils, "storyPinWorkUtils");
        Intrinsics.checkNotNullParameter(supportWorkUtils, "supportWorkUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(s3UploadHelper, "s3UploadHelper");
        Intrinsics.checkNotNullParameter(boardRepository, "boardRepository");
        Intrinsics.checkNotNullParameter(animatedStickerRepository, "animatedStickerRepository");
        Intrinsics.checkNotNullParameter(fontManager, "fontManager");
        this.f46654k = context;
        this.f46655l = ideaPinComposeDataManager;
        this.f46656m = storyPinWorkUtils;
        this.f46657n = supportWorkUtils;
        this.f46658o = crashReporting;
        this.f46659p = experiments;
        this.f46660q = pinRepository;
        this.f46661r = userRepository;
        this.f46662s = s3UploadHelper;
        this.f46663t = boardRepository;
        this.f46664u = animatedStickerRepository;
        this.f46665v = fontManager;
        n nVar = n.NONE;
        this.f46666w = m.a(nVar, new g(this, 3));
        this.f46667x = m.a(nVar, new g(this, 15));
        this.f46668y = m.a(nVar, new g(this, 4));
        this.f46669z = m.a(nVar, new g(this, 9));
        this.A = m.a(nVar, new g(this, 8));
        this.B = m.a(nVar, new g(this, 7));
        this.D = m.a(nVar, new g(this, 10));
        this.E = m.a(nVar, new g(this, 2));
        this.F = m.a(nVar, new g(this, 1));
        this.G = m.a(nVar, new g(this, 6));
        this.H = m.a(nVar, new g(this, 5));
        this.I = m.a(nVar, new g(this, 14));
        this.f46653J = m.a(nVar, new g(this, 13));
        this.K = m.a(nVar, new g(this, 0));
        this.P = new LinkedHashSet();
        this.Q = new b();
    }

    public static Bitmap t(Bitmap bitmap, nq nqVar) {
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Intrinsics.f(config);
        Bitmap copy = bitmap.copy(config, true);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Color.parseColor(nqVar.getConfig().getColorHex()), PorterDuff.Mode.SRC_ATOP);
        Paint paint = new Paint();
        paint.setColorFilter(porterDuffColorFilter);
        new Canvas(copy).drawBitmap(copy, 0.0f, 0.0f, paint);
        Intrinsics.f(copy);
        return copy;
    }

    public static void x(IdeaPinVideoExportWorker ideaPinVideoExportWorker, s92.o pwtResult, String str, String str2, c cVar, Boolean bool, int i13) {
        String str3 = (i13 & 2) != 0 ? null : str;
        String str4 = (i13 & 4) != 0 ? null : str2;
        c cVar2 = (i13 & 8) != 0 ? null : cVar;
        Boolean bool2 = (i13 & 16) == 0 ? bool : null;
        WorkerParameters workerParameters = ideaPinVideoExportWorker.f78963b;
        HashSet hashSet = workerParameters.f19999c;
        Intrinsics.checkNotNullExpressionValue(hashSet, "getTags(...)");
        ideaPinVideoExportWorker.f46657n.getClass();
        if (o.c(hashSet)) {
            return;
        }
        qg1.i iVar = ideaPinVideoExportWorker.f46655l.f15134g;
        String uniqueIdentifier = (String) ideaPinVideoExportWorker.f46667x.getValue();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        Intrinsics.checkNotNullParameter(pwtResult, "pwtResult");
        long j13 = 0;
        long length = str3 != null ? new File(str3).length() : 0L;
        if (str3 != null) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str3);
            k01.f39239g.getClass();
            j13 = j01.f(str3, mediaMetadataRetriever);
            mediaMetadataRetriever.release();
        }
        new oy.m(new h2(uniqueIdentifier, workerParameters.f20000d, length, j13, str4, bool2, pwtResult)).i();
        iVar.g(bool2, cVar2);
    }

    @Override // kb.a0
    public final void f() {
        x(this, s92.o.ABORTED, null, "onStopped() got invoked, work is canceled", c.VIDEO_UPLOAD_EXPORT_FAILED, Boolean.valueOf(this.f46655l.f15140m), 2);
        i iVar = this.M;
        if (iVar != null) {
            iVar.a();
        }
        if (this.Q.f135163b) {
            return;
        }
        this.Q.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void j() {
        int i13;
        int i14;
        long j13;
        int i15;
        long j14;
        int i16;
        q0 q0Var;
        Iterator it;
        long j15;
        int i17;
        int i18;
        String str;
        k01 videoItem;
        Uri uri;
        long length;
        Uri uri2;
        int i19;
        int i23;
        IdeaPinVideoExportWorker ideaPinVideoExportWorker = this;
        String str2 = (String) ideaPinVideoExportWorker.F.getValue();
        String str3 = (String) ideaPinVideoExportWorker.E.getValue();
        boolean v13 = v();
        boolean i24 = ideaPinVideoExportWorker.f46656m.i();
        ag1.b bVar = ideaPinVideoExportWorker.f46655l;
        bVar.c(str2, str3, v13, i24);
        tp tpVar = (tp) ideaPinVideoExportWorker.G.getValue();
        WorkerParameters workerParameters = ideaPinVideoExportWorker.f78963b;
        HashSet hashSet = workerParameters.f19999c;
        Intrinsics.checkNotNullExpressionValue(hashSet, "getTags(...)");
        ideaPinVideoExportWorker.f46657n.getClass();
        if (!o.c(hashSet)) {
            k kVar = ideaPinVideoExportWorker.f46667x;
            String uniqueIdentifier = (String) kVar.getValue();
            String pageId = (String) kVar.getValue();
            bVar.f15134g.getClass();
            Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            vn0 mediaList = tpVar != null ? tpVar.getMediaList() : null;
            List<bo0> items = mediaList != null ? mediaList.getItems() : null;
            if (items != null) {
                List list = items;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i23 = 0;
                } else {
                    Iterator it2 = list.iterator();
                    i23 = 0;
                    while (it2.hasNext()) {
                        if (((bo0) it2.next()).u() && (i23 = i23 + 1) < 0) {
                            f0.o();
                            throw null;
                        }
                    }
                }
                i13 = i23;
            } else {
                i13 = 0;
            }
            if (items != null) {
                List list2 = items;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    i19 = 0;
                } else {
                    Iterator it3 = list2.iterator();
                    i19 = 0;
                    while (it3.hasNext()) {
                        if (((bo0) it3.next()).v() && (i19 = i19 + 1) < 0) {
                            f0.o();
                            throw null;
                        }
                    }
                }
                i14 = i19;
            } else {
                i14 = 0;
            }
            if (items != null) {
                j13 = 0;
                for (bo0 bo0Var : items) {
                    if (bo0Var.u()) {
                        d30 photoItem = bo0Var.getPhotoItem();
                        if (photoItem != null && (uri2 = photoItem.f41101b) != null) {
                            length = c0.d.R2(uri2).length();
                        }
                        length = 0;
                    } else {
                        if (bo0Var.v() && (videoItem = bo0Var.getVideoItem()) != null && (uri = videoItem.f41101b) != null) {
                            length = c0.d.R2(uri).length();
                        }
                        length = 0;
                    }
                    j13 += length;
                }
            } else {
                j13 = 0;
            }
            if (items != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it4 = items.iterator();
                while (it4.hasNext()) {
                    bo0 bo0Var2 = (bo0) it4.next();
                    if (bo0Var2.u()) {
                        d30 photoItem2 = bo0Var2.getPhotoItem();
                        it = it4;
                        if (photoItem2 != null) {
                            j15 = j13;
                            str = "dimensions: " + photoItem2.h().f80346a + "x" + photoItem2.h().f80347b + ", path: " + photoItem2.e();
                            i17 = i13;
                            i18 = i14;
                        } else {
                            j15 = j13;
                            i17 = i13;
                            i18 = i14;
                            str = null;
                        }
                    } else {
                        it = it4;
                        j15 = j13;
                        if (bo0Var2.v()) {
                            k01 videoItem2 = bo0Var2.getVideoItem();
                            if (videoItem2 != null) {
                                w wVar = videoItem2.f39240c;
                                i17 = i13;
                                i18 = i14;
                                str = "dimensions: " + wVar.f135234a + "x" + wVar.f135235b + ", rotation: " + wVar.f135236c + ", path: " + videoItem2.e() + ", duration: " + videoItem2.f39242e;
                            }
                            i17 = i13;
                            i18 = i14;
                            str = null;
                        } else {
                            i17 = i13;
                            i18 = i14;
                            str = "unrecognized media";
                        }
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                    i13 = i17;
                    i14 = i18;
                    it4 = it;
                    j13 = j15;
                }
                i15 = i14;
                j14 = j13;
                i16 = i13;
                q0Var = arrayList;
            } else {
                i15 = i14;
                j14 = j13;
                i16 = i13;
                q0Var = q0.f80391a;
            }
            new oy.n(new oy.i2(uniqueIdentifier, workerParameters.f20000d, pageId, i16, i15, items != null ? items.size() : 0, j14, mediaList != null ? mediaList.v() : 0L, CollectionsKt.Z(q0Var, null, null, null, 0, null, null, 63))).i();
            ideaPinVideoExportWorker = this;
        }
        if (z.j((String) ideaPinVideoExportWorker.f46666w.getValue())) {
            throw new MissingFormatArgumentException("Missing required dstPath input data.");
        }
        try {
            super.j();
        } catch (CancellationException e13) {
            ideaPinVideoExportWorker.f46658o.q(e13, "Worker cancellation from checkWork(), isEarlyUploadWork = " + v(), p.IDEA_PINS_CREATION);
            throw e13;
        }
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void m(CancellationException e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        new a().i();
        if (this.N) {
            w(f1.STORY_PIN_VIDEO_EXPORT_CANCELLED, e13.getMessage());
            i iVar = this.M;
            if (iVar != null) {
                iVar.a();
            }
        }
        if (this.Q.f135163b) {
            return;
        }
        this.Q.dispose();
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final void n(Exception e13) {
        String message;
        File dir;
        Intrinsics.checkNotNullParameter(e13, "e");
        Intrinsics.checkNotNullParameter(e13, "e");
        boolean z13 = ((e13 instanceof FileNotFoundException) || (e13 instanceof PipelineException)) && (message = e13.getMessage()) != null && StringsKt.E(message, "No space left on device", false);
        RuntimeException runtimeException = new RuntimeException("Failed to export video: " + e13, e13);
        if (z13) {
            if (j.f62103a) {
                dir = new File("sp_videos");
            } else {
                Context context = kb0.a.f79058b;
                dir = m60.f0.j0().getDir("sp_videos", 0);
                Intrinsics.f(dir);
            }
            this.f46658o.h(a.a.g("Internal Free space: ", dir.getFreeSpace()));
        }
        String message2 = runtimeException.getMessage();
        if (message2 == null) {
            message2 = "not available";
        }
        String str = message2;
        x(this, s92.o.ERROR, null, str, null, null, 26);
        w(f1.STORY_PIN_VIDEO_EXPORT_FAILED, str);
        if (v()) {
            return;
        }
        k().f(e.c(this, null, z13 ? dq1.f.story_pin_creation_error_no_space_left : this.R ? aq1.h.story_pin_creation_error_media_not_on_device : aq1.h.story_pin_creation_error_video_export, 7));
        ag1.b bVar = this.f46655l;
        qg1.i.d(bVar.f15134g, runtimeException, z13 || this.R, runtimeException.getMessage(), c.VIDEO_UPLOAD_EXPORT_FAILED, null, null, null, null, null, null, null, bVar.f15133f, (String) this.E.getValue(), bVar.f15130c, this.f46656m.i(), null, 34800);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03da  */
    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker.p():void");
    }

    @Override // com.pinterest.feature.video.worker.base.BaseWorker
    public final y q() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArr = (String[]) this.f46668y.getValue();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(str);
        }
        String[] value = (String[]) arrayList.toArray(new String[0]);
        Intrinsics.checkNotNullParameter("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        linkedHashMap.put("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE", value);
        String[] strArr2 = (String[]) this.D.getValue();
        ArrayList arrayList2 = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            arrayList2.add(str2);
        }
        String[] value2 = (String[]) arrayList2.toArray(new String[0]);
        Intrinsics.checkNotNullParameter("STORY_PIN_PAGE_ID_AND_TRACKING_ID", "key");
        Intrinsics.checkNotNullParameter(value2, "value");
        linkedHashMap.put("STORY_PIN_PAGE_ID_AND_TRACKING_ID", value2);
        kb.l lVar = new kb.l(linkedHashMap);
        bk.f.e0(lVar);
        y yVar = new y(lVar);
        Intrinsics.checkNotNullExpressionValue(yVar, "success(...)");
        return yVar;
    }

    public final void s(Bitmap bitmap, List list, qq qqVar, RectF rectF) {
        Pair y13 = y(qqVar);
        ek ekVar = (ek) y13.f80346a;
        vk vkVar = (vk) y13.f80347b;
        List b13 = e0.b(new dw0.a(0, bitmap));
        Matrix matrix = qqVar.getConfig().getMatrix();
        if (matrix == null) {
            matrix = new Matrix();
        }
        long j13 = 1000;
        list.add(new fr(b13, matrix, rectF.width(), rectF.height(), qqVar.getDurationConfig().getStartTimeMs() * j13, qqVar.getDurationConfig().getEndTimeMs() * j13, ekVar, vkVar));
    }

    public final float u() {
        return ((Number) this.K.getValue()).floatValue();
    }

    public final boolean v() {
        if (!this.f46656m.h() && !((Boolean) this.B.getValue()).booleanValue()) {
            HashSet hashSet = this.f78963b.f19999c;
            Intrinsics.checkNotNullExpressionValue(hashSet, "getTags(...)");
            this.f46657n.getClass();
            if (!o.c(hashSet)) {
                return false;
            }
        }
        return true;
    }

    public final void w(f1 f1Var, String str) {
        vn0 mediaList;
        String str2 = v() ? "EarlyUpload" : "RegularUpload";
        ag1.b bVar = this.f46655l;
        HashMap a13 = qg1.i.a(bVar.f15134g, null, null, null, this.C, str, null, null, null, null, Integer.valueOf(this.f78963b.f20000d), null, null, str2, null, (String) this.E.getValue(), null, null, null, 241127);
        tp tpVar = bVar.f15133f;
        a13.put("video_duration", String.valueOf((tpVar == null || (mediaList = tpVar.getMediaList()) == null) ? null : Long.valueOf(mediaList.v())));
        k kVar = this.f46666w;
        if (new File((String) kVar.getValue()).exists()) {
            a13.put("file_size_mb", String.valueOf(r3.length() / vb0.m.MEGABYTE.getBytes$common_release()));
        }
        a13.put("failure_count", String.valueOf(this.O));
        LinkedHashSet linkedHashSet = this.P;
        if (!linkedHashSet.isEmpty()) {
            a13.put("composer_features", CollectionsKt.w0(linkedHashSet).toString());
        }
        l().u(f1Var, (String) kVar.getValue(), kh2.j.Z(bVar.f15133f), a13, false);
    }

    public final Pair y(qq qqVar) {
        dk dkVar;
        uk ukVar;
        if (!uv0.p.c(qqVar) || !this.f46659p.c()) {
            return new Pair(dk.Instant, uk.Instant);
        }
        fk enterTransitionType = qqVar.getDurationConfig().getEnterTransitionType();
        Intrinsics.checkNotNullParameter(enterTransitionType, "<this>");
        switch (n10.f40282a[enterTransitionType.ordinal()]) {
            case 1:
                dkVar = dk.Instant;
                break;
            case 2:
                dkVar = dk.SlideInRight;
                break;
            case 3:
                dkVar = dk.FadeIn;
                break;
            case 4:
                dkVar = dk.Expand;
                break;
            case 5:
                dkVar = dk.SlideInLeft;
                break;
            case 6:
                dkVar = dk.SlideInUp;
                break;
            case 7:
                dkVar = dk.SlideInDown;
                break;
            case 8:
                dkVar = dk.Spread;
                break;
            case 9:
                dkVar = dk.ScaleInUp;
                break;
            case 10:
                dkVar = dk.ScaleInDown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        wk exitTransitionType = qqVar.getDurationConfig().getExitTransitionType();
        Intrinsics.checkNotNullParameter(exitTransitionType, "<this>");
        switch (n10.f40283b[exitTransitionType.ordinal()]) {
            case 1:
                ukVar = uk.Instant;
                break;
            case 2:
                ukVar = uk.FadeOut;
                break;
            case 3:
                ukVar = uk.Shrink;
                break;
            case 4:
                ukVar = uk.SlideOutLeft;
                break;
            case 5:
                ukVar = uk.SlideOutRight;
                break;
            case 6:
                ukVar = uk.SlideOutDown;
                break;
            case 7:
                ukVar = uk.SlideOutUp;
                break;
            case 8:
                ukVar = uk.Collapse;
                break;
            case 9:
                ukVar = uk.ScaleOutUp;
                break;
            case 10:
                ukVar = uk.ScaleOutDown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new Pair(dkVar, ukVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r13v2, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0059 -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(aw0.g r9, long r10, long r12, bl2.c r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof aw0.m
            if (r0 == 0) goto L13
            r0 = r14
            aw0.m r0 = (aw0.m) r0
            int r1 = r0.f20573w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20573w = r1
            goto L18
        L13:
            aw0.m r0 = new aw0.m
            r0.<init>(r8, r14)
        L18:
            java.lang.Object r14 = r0.f20571u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f20573w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            long r9 = r0.f20570t
            long r11 = r0.f20569s
            kotlin.jvm.functions.Function0 r13 = r0.f20568r
            ue.c.H(r14)
            goto L5d
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            ue.c.H(r14)
        L38:
            r4 = 0
            int r14 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r14 <= 0) goto L63
            java.lang.Object r14 = r9.invoke()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L63
            r0.f20568r = r9
            r0.f20569s = r12
            r0.f20570t = r10
            r0.f20573w = r3
            java.lang.Object r14 = lb.l0.S(r12, r0)
            if (r14 != r1) goto L59
            return r1
        L59:
            r6 = r12
            r13 = r9
            r9 = r10
            r11 = r6
        L5d:
            long r9 = r9 - r11
            r6 = r9
            r9 = r13
            r12 = r11
            r10 = r6
            goto L38
        L63:
            kotlin.Unit r9 = kotlin.Unit.f80348a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker.z(aw0.g, long, long, bl2.c):java.lang.Object");
    }
}
