package bw0;

import com.pinterest.api.model.uu;
import com.pinterest.feature.ideaPinCreation.worker.UploadIdeaPinImageMediaWorker;
import ja.c0;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kb.e0;
import kb.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final c f24007a;

    public j(c commonWorkUtils) {
        Intrinsics.checkNotNullParameter(commonWorkUtils, "commonWorkUtils");
        this.f24007a = commonWorkUtils;
    }

    public static c0 a(String str, int i13, int i14, String str2) {
        c0 c0Var = new c0(1);
        c0Var.j("MEDIA_TYPE", uu.IMAGE.getValue());
        c0Var.h(i13, "MEDIA_INDEX");
        c0Var.h(i14, "MEDIA_COUNT");
        c0Var.j("IDEA_PIN_CREATION_SESSION_ID", str);
        c0Var.j("IDEA_PIN_LOCAL_DRAFT_ID", str2);
        return c0Var;
    }

    public static f0 b(String str, String str2, Set earlierUploadedPageIds, kb.l earlyUploadedMediaData, String creationSessionId, String creationDraftId, String typeTag) {
        Intrinsics.checkNotNullParameter(earlierUploadedPageIds, "earlierUploadedPageIds");
        Intrinsics.checkNotNullParameter(earlyUploadedMediaData, "earlyUploadedMediaData");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        Intrinsics.checkNotNullParameter(creationDraftId, "creationDraftId");
        Intrinsics.checkNotNullParameter(typeTag, "typeTag");
        String str3 = str + "_adjusted";
        c0 a13 = a(creationSessionId, -1, -1, creationDraftId);
        if (!earlierUploadedPageIds.isEmpty()) {
            a13.f(earlyUploadedMediaData);
        }
        a13.j("MEDIA_URI", str2);
        a13.j("STORY_PIN_LOCAL_PAGE_ID", str3);
        kb.l b13 = a13.b();
        Intrinsics.checkNotNullParameter(UploadIdeaPinImageMediaWorker.class, "workerClass");
        e0 e0Var = (e0) ((e0) ((e0) ((e0) ((e0) new e0(UploadIdeaPinImageMediaWorker.class).f(c.f23969a)).h(b13)).a(typeTag)).a(str3)).e(kb.a.LINEAR, 10000L, TimeUnit.MILLISECONDS);
        e0Var.i();
        return (f0) e0Var.b();
    }
}
