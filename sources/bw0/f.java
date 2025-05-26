package bw0;

import android.net.Uri;
import com.pinterest.api.model.UploadStatus;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.tp;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinS3CredentialsWorker;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinS3MediaUploadWorker;
import com.pinterest.feature.ideaPinCreation.worker.IdeaPinVideoExportWorker;
import com.pinterest.feature.ideaPinCreation.worker.UploadIdeaPinImageMediaWorker;
import ja.c0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kb.f0;
import kb.t0;
import kb.w0;
import kh2.g3;
import kh2.w;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lh0.s1;
import xk2.v;

/* loaded from: classes5.dex */
public final class f extends b {

    /* renamed from: b, reason: collision with root package name */
    public final i f23975b;

    /* renamed from: c, reason: collision with root package name */
    public final l f23976c;

    /* renamed from: d, reason: collision with root package name */
    public final j f23977d;

    /* renamed from: e, reason: collision with root package name */
    public final k f23978e;

    /* renamed from: f, reason: collision with root package name */
    public final o f23979f;

    /* renamed from: g, reason: collision with root package name */
    public final ag1.b f23980g;

    /* renamed from: h, reason: collision with root package name */
    public final tb0.h f23981h;

    /* renamed from: i, reason: collision with root package name */
    public final s1 f23982i;

    /* renamed from: j, reason: collision with root package name */
    public final v f23983j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c commonWorkUtils, i earlyUploadWorkUtils, l videoUploadWorkUtils, j imageUploadWorkUtils, k storyPinPublishWorkUtils, o supportWorkUtils, ag1.b ideaPinComposeDataManager, tb0.h crashReporting, s1 experiments) {
        super(commonWorkUtils);
        Intrinsics.checkNotNullParameter(commonWorkUtils, "commonWorkUtils");
        Intrinsics.checkNotNullParameter(earlyUploadWorkUtils, "earlyUploadWorkUtils");
        Intrinsics.checkNotNullParameter(videoUploadWorkUtils, "videoUploadWorkUtils");
        Intrinsics.checkNotNullParameter(imageUploadWorkUtils, "imageUploadWorkUtils");
        Intrinsics.checkNotNullParameter(storyPinPublishWorkUtils, "storyPinPublishWorkUtils");
        Intrinsics.checkNotNullParameter(supportWorkUtils, "supportWorkUtils");
        Intrinsics.checkNotNullParameter(ideaPinComposeDataManager, "ideaPinComposeDataManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f23975b = earlyUploadWorkUtils;
        this.f23976c = videoUploadWorkUtils;
        this.f23977d = imageUploadWorkUtils;
        this.f23978e = storyPinPublishWorkUtils;
        this.f23979f = supportWorkUtils;
        this.f23980g = ideaPinComposeDataManager;
        this.f23981h = crashReporting;
        this.f23982i = experiments;
        this.f23983j = xk2.m.b(e.f23972j);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(5:2|3|(1:49)(1:7)|8|9)|(15:44|45|12|13|(1:42)(1:17)|(1:19)(1:41)|(1:21)|22|24|25|(2:36|37)|27|(1:34)|31|32)|11|12|13|(1:15)|42|(0)(0)|(0)|22|24|25|(0)|27|(1:29)|34|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064 A[Catch: Exception -> 0x0069, TryCatch #2 {Exception -> 0x0069, blocks: (B:13:0x004d, B:15:0x0055, B:17:0x0059, B:19:0x0064, B:22:0x006f), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static xk2.w e(java.lang.Exception r8) {
        /*
            java.lang.String r0 = "message"
            java.lang.String r1 = "["
            java.lang.String r2 = "e"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            r2 = 0
            java.lang.Throwable r3 = r8.getCause()     // Catch: java.lang.Exception -> L2e
            java.lang.String r4 = "null cannot be cast to non-null type com.pinterest.error.NetworkResponseError"
            kotlin.jvm.internal.Intrinsics.g(r3, r4)     // Catch: java.lang.Exception -> L2e
            com.pinterest.error.NetworkResponseError r3 = (com.pinterest.error.NetworkResponseError) r3     // Catch: java.lang.Exception -> L2e
            v.f1 r3 = r3.f45043a     // Catch: java.lang.Exception -> L2e
            if (r3 == 0) goto L32
            java.lang.Object r3 = r3.f123451d     // Catch: java.lang.Exception -> L2e
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Exception -> L2e
            if (r3 == 0) goto L32
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Exception -> L2e
            java.lang.String r5 = "defaultCharset(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch: java.lang.Exception -> L2e
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Exception -> L2e
            r5.<init>(r3, r4)     // Catch: java.lang.Exception -> L2e
            goto L33
        L2e:
            r0 = r2
            r4 = r0
            goto La8
        L32:
            r5 = r2
        L33:
            nm.s r3 = df.j1.p1(r5)     // Catch: java.lang.Exception -> L2e
            nm.u r3 = r3.i()     // Catch: java.lang.Exception -> L2e
            nm.s r4 = r3.v(r0)     // Catch: java.lang.Exception -> L2e
            java.lang.String r5 = ""
            if (r4 != 0) goto L45
        L43:
            r4 = r5
            goto L4d
        L45:
            nm.s r4 = r3.v(r0)     // Catch: java.lang.Exception -> L43
            java.lang.String r4 = r4.p()     // Catch: java.lang.Exception -> L43
        L4d:
            java.lang.String r6 = "error"
            nm.s r6 = r3.v(r6)     // Catch: java.lang.Exception -> L69
            if (r6 == 0) goto L61
            boolean r7 = r6 instanceof nm.u     // Catch: java.lang.Exception -> L69
            if (r7 == 0) goto L61
            vd0.c r7 = new vd0.c     // Catch: java.lang.Exception -> L69
            nm.u r6 = (nm.u) r6     // Catch: java.lang.Exception -> L69
            r7.<init>(r6)     // Catch: java.lang.Exception -> L69
            goto L62
        L61:
            r7 = r2
        L62:
            if (r7 == 0) goto L6b
            java.lang.String r0 = r7.o(r0, r5)     // Catch: java.lang.Exception -> L69
            goto L6c
        L69:
            r0 = r2
            goto La8
        L6b:
            r0 = r2
        L6c:
            if (r0 != 0) goto L6f
            r0 = r5
        L6f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L69
            r6.<init>(r1)     // Catch: java.lang.Exception -> L69
            r6.append(r0)     // Catch: java.lang.Exception -> L69
            java.lang.String r0 = "]["
            r6.append(r0)     // Catch: java.lang.Exception -> L69
            r6.append(r4)     // Catch: java.lang.Exception -> L69
            java.lang.String r0 = "]"
            r6.append(r0)     // Catch: java.lang.Exception -> L69
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> L69
            r1 = 500(0x1f4, float:7.0E-43)
            java.lang.String r0 = kotlin.text.e0.C(r1, r0)     // Catch: java.lang.Exception -> L69
            java.lang.String r6 = "code"
            nm.s r7 = r3.v(r6)     // Catch: java.lang.Exception -> La8
            if (r7 != 0) goto L97
            goto L9f
        L97:
            nm.s r3 = r3.v(r6)     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = r3.p()     // Catch: java.lang.Exception -> L9f
        L9f:
            java.lang.String r3 = "optString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)     // Catch: java.lang.Exception -> La8
            java.lang.String r2 = kotlin.text.e0.C(r1, r5)     // Catch: java.lang.Exception -> La8
        La8:
            if (r0 == 0) goto Lb0
            boolean r1 = kotlin.text.z.j(r0)
            if (r1 == 0) goto Lb4
        Lb0:
            java.lang.String r0 = r8.getMessage()
        Lb4:
            xk2.w r8 = new xk2.w
            r8.<init>(r0, r2, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bw0.f.e(java.lang.Exception):xk2.w");
    }

    public static ArrayList g(String pageId, ArrayList completedMediaWorkInfoList) {
        Intrinsics.checkNotNullParameter(completedMediaWorkInfoList, "completedMediaWorkInfoList");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        ArrayList arrayList = new ArrayList();
        for (Object obj : completedMediaWorkInfoList) {
            Set set = ((t0) obj).f79032c;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (Intrinsics.d(pageId, (String) it.next())) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public final void b() {
        this.f23981h.h("Idea Pin Publish: Cancel all unfinished work");
        v vVar = this.f23983j;
        ((w0) vVar.getValue()).c("STORY_PIN_UPLOAD_WORK");
        ((w0) vVar.getValue()).c("ADDITIONAL_IMAGE_UPLOAD_WORK");
        this.f23980g.f15134g.getClass();
        new oy.i(2, 0).i();
    }

    public final void c(tp page, String creationSessionId, String creationDraftId, boolean z13, boolean z14) {
        String str;
        kb.l lVar;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        j jVar;
        String str7;
        LinkedHashSet linkedHashSet;
        kb.q qVar;
        String str8;
        so.a aVar;
        f fVar;
        kb.l lVar2;
        String e03;
        r rVar;
        so.a a13;
        String str9;
        String str10;
        boolean z15;
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        String str11 = "creationDraftId";
        Intrinsics.checkNotNullParameter(creationDraftId, "creationDraftId");
        if (z14) {
            os0.b bVar = os0.b.f97497a;
            os0.b.d().f(new com.pinterest.feature.video.model.d(com.pinterest.feature.video.model.e.IDEA_PIN_PRE_UPLOAD_BEGIN, null, 0, null, 0.0f, 0.0f, 0L, null, null, null, null, 2046));
        }
        this.f23968a.getClass();
        ArrayList successfullyUploadedPageWorkInfos = g(page.getId(), i.b(this.f23975b, c.c()));
        String pageId = page.getId();
        Intrinsics.checkNotNullParameter(successfullyUploadedPageWorkInfos, "successfullyUploadedPageWorkInfos");
        String str12 = "pageId";
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        LinkedHashSet earlierUploadedPageIds = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = successfullyUploadedPageWorkInfos.iterator();
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            if (t0Var.f79032c.contains(pageId)) {
                kb.l lVar3 = t0Var.f79033d;
                Iterator it2 = it;
                String str13 = str11;
                String str14 = str12;
                long g13 = lVar3.g("MEDIA_ID", 0L);
                if (g13 != 0) {
                    linkedHashSet2.add(g3.M(pageId, String.valueOf(g13)));
                    if (t0Var.f79032c.contains("image_upload")) {
                        String h10 = lVar3.h("IMAGE_SIGNATURE");
                        if (h10 == null) {
                            h10 = "";
                        }
                        if (h10.length() != 0) {
                            linkedHashSet3.add(g3.M(pageId, h10));
                        }
                    }
                    earlierUploadedPageIds.add(pageId);
                }
                it = it2;
                str11 = str13;
                str12 = str14;
            }
        }
        String str15 = str11;
        String str16 = str12;
        g f13 = f(pageId, c.c());
        if (f13 != null) {
            earlierUploadedPageIds.addAll(f13.f23984a);
            linkedHashSet2.addAll(f13.f23985b);
            linkedHashSet3.addAll(f13.f23986c);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] value = (String[]) linkedHashSet2.toArray(new String[0]);
        Intrinsics.checkNotNullParameter("STORY_PIN_PAGE_ID_AND_TRACKING_ID", "key");
        Intrinsics.checkNotNullParameter(value, "value");
        linkedHashMap.put("STORY_PIN_PAGE_ID_AND_TRACKING_ID", value);
        String[] value2 = (String[]) linkedHashSet3.toArray(new String[0]);
        Intrinsics.checkNotNullParameter("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE", "key");
        Intrinsics.checkNotNullParameter(value2, "value");
        linkedHashMap.put("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE", value2);
        int size = linkedHashSet2.size();
        Intrinsics.checkNotNullParameter("PAGE_COUNT_FROM_LAST_SESSION", "key");
        linkedHashMap.put("PAGE_COUNT_FROM_LAST_SESSION", Integer.valueOf(size));
        kb.l lVar4 = new kb.l(linkedHashMap);
        bk.f.e0(lVar4);
        boolean z16 = !page.R() || z13;
        o oVar = this.f23979f;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(earlierUploadedPageIds, "earlierUploadedPageIds");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        Intrinsics.checkNotNullParameter(creationDraftId, str15);
        if (z16 && !(!earlierUploadedPageIds.isEmpty())) {
            String id3 = page.getId();
            String localAdjustedImagePath = page.getLocalAdjustedImagePath();
            s0 s0Var = s0.f80394a;
            kb.l lVar5 = kb.l.f79018b;
            oVar.f24011a.getClass();
            str = "earlierUploadedPageIds";
            lVar = lVar4;
            str2 = str15;
            str3 = "image_upload";
            f0 b13 = j.b(id3, localAdjustedImagePath, s0Var, lVar5, creationSessionId, creationDraftId, "support_work");
            kb.q qVar2 = kb.q.REPLACE;
            List b14 = e0.b(b13);
            oVar.f24012b.getClass();
            c.b("ADDITIONAL_IMAGE_UPLOAD_WORK", qVar2, b14).b();
        } else {
            str = "earlierUploadedPageIds";
            str3 = "image_upload";
            lVar = lVar4;
            str2 = str15;
        }
        kb.q workPolicy = kb.q.REPLACE;
        boolean contains = earlierUploadedPageIds.contains(page.getId());
        j jVar2 = this.f23977d;
        if (contains) {
            str4 = "workPolicy";
            str5 = "page";
            str6 = "creationSessionId";
            jVar = jVar2;
            str7 = str2;
            linkedHashSet = earlierUploadedPageIds;
            qVar = workPolicy;
            str8 = creationDraftId;
            aVar = null;
        } else {
            if (page.R()) {
                LinkedHashSet linkedHashSet4 = z16 ? null : earlierUploadedPageIds;
                kb.l lVar6 = z16 ? null : lVar;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(page, "page");
                Intrinsics.checkNotNullParameter(workPolicy, "workPolicy");
                Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
                Intrinsics.checkNotNullParameter(creationDraftId, str2);
                linkedHashSet = earlierUploadedPageIds;
                String id4 = page.getId();
                String path = page.getLocalAdjustedImagePath();
                d30 B = page.B();
                String e13 = B != null ? B.e() : null;
                Boolean contentModified = page.getContentModified();
                if (contentModified != null) {
                    boolean booleanValue = contentModified.booleanValue();
                    str10 = str16;
                    str9 = "page";
                    z15 = booleanValue;
                } else {
                    str9 = "page";
                    str10 = str16;
                    z15 = false;
                }
                Intrinsics.checkNotNullParameter(id4, str10);
                Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
                Intrinsics.checkNotNullParameter(creationDraftId, str2);
                str7 = str2;
                String typeTag = str3;
                Intrinsics.checkNotNullParameter(typeTag, "typeTag");
                str6 = "creationSessionId";
                c0 a14 = j.a(creationSessionId, 0, 1, creationDraftId);
                a14.j("STORY_PIN_LOCAL_PAGE_ID", id4);
                a14.j("RAW_MEDIA_PATH", e13);
                a14.g("IDEA_PIN_IS_MODIFIED", z15);
                a14.j("MEDIA_URI", path);
                if (path == null) {
                    path = "";
                }
                Intrinsics.checkNotNullParameter(path, "path");
                a14.g("MEDIA_EXPORT_SKIPPED", z.h(il2.m.h(new File(path)), "_copy_from_source", true));
                if (linkedHashSet4 != null && !linkedHashSet4.isEmpty()) {
                    Intrinsics.f(lVar6);
                    a14.f(lVar6);
                }
                Intrinsics.checkNotNullParameter(UploadIdeaPinImageMediaWorker.class, "workerClass");
                List b15 = e0.b((f0) ((kb.e0) ((kb.e0) ((kb.e0) ((kb.e0) ((kb.e0) new kb.e0(UploadIdeaPinImageMediaWorker.class).f(c.f23969a)).h(a14.b())).a(typeTag)).a(id4)).e(kb.a.LINEAR, 10000L, TimeUnit.MILLISECONDS)).b());
                jVar2.f24007a.getClass();
                a13 = c.a(workPolicy, b15, null);
                str4 = "workPolicy";
                str5 = str9;
                jVar = jVar2;
                qVar = workPolicy;
                str8 = creationDraftId;
            } else {
                str6 = "creationSessionId";
                str7 = str2;
                linkedHashSet = earlierUploadedPageIds;
                LinkedHashSet linkedHashSet5 = z16 ? null : linkedHashSet;
                if (z16) {
                    lVar2 = null;
                    fVar = this;
                } else {
                    fVar = this;
                    lVar2 = lVar;
                }
                l lVar7 = fVar.f23976c;
                lVar7.getClass();
                Intrinsics.checkNotNullParameter(page, "page");
                Intrinsics.checkNotNullParameter(workPolicy, "workPolicy");
                Intrinsics.checkNotNullParameter(creationSessionId, str6);
                Intrinsics.checkNotNullParameter(creationDraftId, str7);
                s1 experiments = fVar.f23982i;
                Intrinsics.checkNotNullParameter(experiments, "experiments");
                Intrinsics.checkNotNullParameter(page, "page");
                boolean d2 = Intrinsics.d(page.getContentModified(), Boolean.FALSE);
                if (d2) {
                    k01 videoItem = page.getMediaList().e().getVideoItem();
                    Intrinsics.f(videoItem);
                    e03 = videoItem.e();
                } else {
                    e03 = gi2.b.e0(false);
                }
                Uri fromFile = Uri.fromFile(new File(e03));
                String id5 = page.getId();
                long v13 = page.v();
                Intrinsics.f(fromFile);
                str5 = "page";
                str4 = "workPolicy";
                jVar = jVar2;
                c0 w13 = w.w(fromFile, e03, 0, Long.valueOf(v13), Float.valueOf(0.5625f));
                UploadStatus.f35584g.getClass();
                String str17 = UploadStatus.f35585h;
                w13.j("REGISTER_MEDIA_TYPE", str17);
                w13.j("STORY_PIN_LOCAL_PAGE_ID", id5);
                w13.h(0, "MEDIA_INDEX");
                w13.h(1, "MEDIA_COUNT");
                w13.j("IDEA_PIN_CREATION_SESSION_ID", creationSessionId);
                w13.j("IDEA_PIN_LOCAL_DRAFT_ID", creationDraftId);
                w13.g("MEDIA_EXPORT_SKIPPED", d2);
                if (linkedHashSet5 != null && !linkedHashSet5.isEmpty()) {
                    Intrinsics.f(lVar2);
                    w13.f(lVar2);
                }
                kb.l b16 = w13.b();
                kb.l lVar8 = lVar2;
                Intrinsics.checkNotNullParameter(IdeaPinS3CredentialsWorker.class, "workerClass");
                kb.e0 e0Var = new kb.e0(IdeaPinS3CredentialsWorker.class);
                kb.g gVar = c.f23969a;
                LinkedHashSet linkedHashSet6 = linkedHashSet5;
                kb.e0 e0Var2 = (kb.e0) ((kb.e0) ((kb.e0) ((kb.e0) e0Var.f(gVar)).h(b16)).a(id5)).a("video_register");
                kb.a aVar2 = kb.a.LINEAR;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                f0 f0Var = (f0) ((kb.e0) e0Var2.e(aVar2, 10000L, timeUnit)).b();
                Intrinsics.checkNotNullParameter(IdeaPinS3MediaUploadWorker.class, "workerClass");
                f0 f0Var2 = (f0) ((kb.e0) ((kb.e0) ((kb.e0) ((kb.e0) ((kb.e0) new kb.e0(IdeaPinS3MediaUploadWorker.class).f(gVar)).h(b16)).a(id5)).a("video_upload")).e(aVar2, 10000L, timeUnit)).b();
                if (d2) {
                    rVar = new r(kotlin.collections.f0.l(f0Var, f0Var2));
                    str8 = creationDraftId;
                } else {
                    c0 c0Var = new c0(1);
                    c0Var.j("VIDEO_EXPORT_DST_PATH", e03);
                    c0Var.j("STORY_PIN_LOCAL_PAGE_ID", id5);
                    c0Var.h(0, "MEDIA_INDEX");
                    c0Var.h(1, "MEDIA_COUNT");
                    c0Var.j("IDEA_PIN_CREATION_SESSION_ID", creationSessionId);
                    str8 = creationDraftId;
                    c0Var.j("IDEA_PIN_LOCAL_DRAFT_ID", str8);
                    c0Var.j("REGISTER_MEDIA_TYPE", str17);
                    c0Var.h(0, "REGISTER_MEDIA_ROTATION");
                    if (linkedHashSet6 != null && !linkedHashSet6.isEmpty()) {
                        Intrinsics.f(lVar8);
                        c0Var.f(lVar8);
                    }
                    kb.l b17 = c0Var.b();
                    Intrinsics.checkNotNullParameter(IdeaPinVideoExportWorker.class, "workerClass");
                    rVar = new r(kotlin.collections.f0.l((f0) ((kb.e0) ((kb.e0) ((kb.e0) ((kb.e0) ((kb.e0) new kb.e0(IdeaPinVideoExportWorker.class).f(gVar)).h(b17)).a(id5)).a("video_export")).e(aVar2, 10000L, timeUnit)).b(), f0Var, f0Var2));
                }
                lVar7.f24009a.getClass();
                qVar = workPolicy;
                a13 = c.a(qVar, rVar.f24017a, null);
            }
            aVar = a13;
        }
        if (z16) {
            jVar.getClass();
            Intrinsics.checkNotNullParameter(qVar, str4);
            Intrinsics.checkNotNullParameter(page, str5);
            LinkedHashSet linkedHashSet7 = linkedHashSet;
            Intrinsics.checkNotNullParameter(linkedHashSet7, str);
            kb.l earlyUploadedMediaData = lVar;
            Intrinsics.checkNotNullParameter(earlyUploadedMediaData, "earlyUploadedMediaData");
            Intrinsics.checkNotNullParameter(creationSessionId, str6);
            Intrinsics.checkNotNullParameter(str8, str7);
            List b18 = e0.b(j.b(page.getId(), page.getLocalAdjustedImagePath(), linkedHashSet7, earlyUploadedMediaData, creationSessionId, creationDraftId, "cover_image_upload"));
            jVar.f24007a.getClass();
            aVar = c.a(qVar, b18, aVar);
        }
        if (aVar != null) {
            aVar.b();
        }
    }

    public final g f(String str, List list) {
        Map d2;
        Map d13;
        i iVar = this.f23975b;
        iVar.getClass();
        t0 a13 = i.a(list);
        if (a13 == null) {
            a13 = (t0) CollectionsKt.firstOrNull(i.b(iVar, list));
        }
        if (a13 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kb.l lVar = a13.f79033d;
        String[] i13 = lVar.i("STORY_PIN_PAGE_ID_AND_TRACKING_ID");
        LinkedHashMap z23 = i13 != null ? g3.z2(i13) : null;
        if (z23 != null) {
            d2 = new LinkedHashMap();
            for (Map.Entry entry : z23.entrySet()) {
                if (Intrinsics.d(str, (String) entry.getKey())) {
                    d2.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            d2 = z0.d();
        }
        String[] i14 = lVar.i("STORY_PIN_IMAGE_KEY_AND_IMAGE_SIGNATURE");
        LinkedHashMap z24 = i14 != null ? g3.z2(i14) : null;
        if (z24 != null) {
            d13 = new LinkedHashMap();
            for (Map.Entry entry2 : z24.entrySet()) {
                if (Intrinsics.d(str, (String) entry2.getKey())) {
                    d13.put(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            d13 = z0.d();
        }
        linkedHashSet.addAll(d2.keySet());
        ArrayList arrayList = new ArrayList(d2.size());
        for (Map.Entry entry3 : d2.entrySet()) {
            arrayList.add(g3.M((String) entry3.getKey(), (String) entry3.getValue()));
        }
        ArrayList arrayList2 = new ArrayList(d13.size());
        for (Map.Entry entry4 : d13.entrySet()) {
            arrayList2.add(g3.M((String) entry4.getKey(), (String) entry4.getValue()));
        }
        return new g(linkedHashSet, CollectionsKt.J0(arrayList), CollectionsKt.J0(arrayList2));
    }

    public final boolean h() {
        this.f23968a.getClass();
        List c13 = c.c();
        boolean z13 = false;
        if (!(c13 instanceof Collection) || !c13.isEmpty()) {
            Iterator it = c13.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((t0) it.next()).f79032c.contains("publish")) {
                    z13 = true;
                    break;
                }
            }
        }
        return !z13;
    }

    public final boolean i() {
        this.f23968a.getClass();
        List c13 = c.c();
        if ((c13 instanceof Collection) && c13.isEmpty()) {
            return false;
        }
        Iterator it = c13.iterator();
        while (it.hasNext()) {
            if (((t0) it.next()).f79032c.contains("is_scheduled")) {
                return true;
            }
        }
        return false;
    }
}
