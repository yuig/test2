package y31;

import android.net.Uri;
import com.pinterest.api.model.j01;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pc0;
import com.pinterest.api.model.uu;
import com.pinterest.feature.video.worker.ProfileCoverImageUploadCleanupAndRefreshWorker;
import com.pinterest.feature.video.worker.RegisterMediaWorker;
import com.pinterest.feature.video.worker.StatusMediaWorker;
import com.pinterest.feature.video.worker.UpdateProfileCoverVideoWorker;
import com.pinterest.feature.video.worker.UploadAWSMediaWorker;
import com.pinterest.feature.video.worker.UploadProfileCoverImageMediaWorker;
import java.util.LinkedHashMap;
import kb.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f136823i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f136824j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Uri f136825k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, Uri uri, int i13) {
        super(0);
        this.f136823i = i13;
        this.f136824j = qVar;
        this.f136825k = uri;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f136823i) {
            case 0:
                m289invoke();
                break;
            default:
                m289invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m289invoke() {
        int i13 = this.f136823i;
        Uri uri = this.f136825k;
        q qVar = this.f136824j;
        switch (i13) {
            case 0:
                w0 w0Var = (w0) qVar.f136847f.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String value = uu.IMAGE.getValue();
                Intrinsics.checkNotNullParameter("MEDIA_TYPE", "key");
                linkedHashMap.put("MEDIA_TYPE", value);
                String uri2 = uri.toString();
                Intrinsics.checkNotNullParameter("MEDIA_URI", "key");
                linkedHashMap.put("MEDIA_URI", uri2);
                kb.l lVar = new kb.l(linkedHashMap);
                bk.f.e0(lVar);
                Intrinsics.checkNotNullParameter(UploadProfileCoverImageMediaWorker.class, "workerClass");
                kb.e0 e0Var = new kb.e0(UploadProfileCoverImageMediaWorker.class);
                kb.g gVar = qVar.f136848g;
                kb.f0 f0Var = (kb.f0) ((kb.e0) ((kb.e0) e0Var.f(gVar)).h(lVar)).b();
                Intrinsics.checkNotNullParameter(StatusMediaWorker.class, "workerClass");
                kb.f0 f0Var2 = (kb.f0) ((kb.e0) ((kb.e0) new kb.e0(StatusMediaWorker.class).f(gVar)).h(lVar)).b();
                Intrinsics.checkNotNullParameter(ProfileCoverImageUploadCleanupAndRefreshWorker.class, "workerClass");
                w0Var.a("UPLOAD_MEDIA_WORKER_TAG", kb.q.REPLACE, f0Var).k(f0Var2).k((kb.f0) ((kb.e0) ((kb.e0) new kb.e0(ProfileCoverImageUploadCleanupAndRefreshWorker.class).f(gVar)).h(lVar)).b()).b();
                return;
            default:
                w0 w0Var2 = (w0) qVar.f136847f.getValue();
                String path = uri.getPath();
                if (path != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    String value2 = pc0.REGISTER_TYPE_COVER_VIDEO.getValue();
                    Intrinsics.checkNotNullParameter("REGISTER_MEDIA_TYPE", "key");
                    linkedHashMap2.put("REGISTER_MEDIA_TYPE", value2);
                    k01.f39239g.getClass();
                    int g13 = j01.g(path);
                    if (g13 == -1) {
                        g13 = 0;
                    }
                    Intrinsics.checkNotNullParameter("REGISTER_MEDIA_ROTATION", "key");
                    linkedHashMap2.put("REGISTER_MEDIA_ROTATION", Integer.valueOf(g13));
                    String value3 = uu.VIDEO.getValue();
                    Intrinsics.checkNotNullParameter("MEDIA_TYPE", "key");
                    linkedHashMap2.put("MEDIA_TYPE", value3);
                    String uri3 = uri.toString();
                    Intrinsics.checkNotNullParameter("MEDIA_URI", "key");
                    linkedHashMap2.put("MEDIA_URI", uri3);
                    long c13 = j01.c(path);
                    Intrinsics.checkNotNullParameter("video_duration", "key");
                    linkedHashMap2.put("video_duration", Long.valueOf(c13));
                    float b13 = j01.b(path);
                    Intrinsics.checkNotNullParameter("aspect_ratio", "key");
                    linkedHashMap2.put("aspect_ratio", Float.valueOf(b13));
                    kb.l lVar2 = new kb.l(linkedHashMap2);
                    bk.f.e0(lVar2);
                    Intrinsics.checkNotNullParameter(RegisterMediaWorker.class, "workerClass");
                    kb.e0 e0Var2 = new kb.e0(RegisterMediaWorker.class);
                    kb.g gVar2 = qVar.f136848g;
                    kb.f0 f0Var3 = (kb.f0) ((kb.e0) ((kb.e0) e0Var2.f(gVar2)).h(lVar2)).b();
                    Intrinsics.checkNotNullParameter(UploadAWSMediaWorker.class, "workerClass");
                    kb.f0 f0Var4 = (kb.f0) ((kb.e0) ((kb.e0) new kb.e0(UploadAWSMediaWorker.class).f(gVar2)).h(lVar2)).b();
                    Intrinsics.checkNotNullParameter(StatusMediaWorker.class, "workerClass");
                    kb.f0 f0Var5 = (kb.f0) ((kb.e0) ((kb.e0) new kb.e0(StatusMediaWorker.class).f(gVar2)).h(lVar2)).b();
                    Intrinsics.checkNotNullParameter(UpdateProfileCoverVideoWorker.class, "workerClass");
                    kb.f0 f0Var6 = (kb.f0) ((kb.e0) ((kb.e0) new kb.e0(UpdateProfileCoverVideoWorker.class).f(gVar2)).h(lVar2)).b();
                    Intrinsics.checkNotNullParameter(ProfileCoverImageUploadCleanupAndRefreshWorker.class, "workerClass");
                    w0Var2.a("UPLOAD_MEDIA_WORKER_TAG", kb.q.REPLACE, f0Var3).k(f0Var4).k(f0Var5).k(f0Var6).k((kb.f0) ((kb.e0) ((kb.e0) new kb.e0(ProfileCoverImageUploadCleanupAndRefreshWorker.class).f(gVar2)).h(lVar2)).b()).b();
                    return;
                }
                throw new NullPointerException("Video media path to upload is null.");
        }
    }
}
