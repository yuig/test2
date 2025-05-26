package v;

import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import com.pinterest.activity.create.PinItActivity;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.feature.video.worker.VideoPinCreateMediaWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final /* synthetic */ class u2 implements r4.j, uj2.e0, uj2.s, uj2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f123684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f123687d;

    public /* synthetic */ u2(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f123685b = obj;
        this.f123684a = obj2;
        this.f123686c = obj3;
        this.f123687d = obj4;
    }

    @Override // r4.j
    public final Object C(r4.i iVar) {
        String str;
        v2 v2Var = (v2) this.f123685b;
        List list = (List) this.f123684a;
        w.h hVar = (w.h) this.f123686c;
        x.s sVar = (x.s) this.f123687d;
        synchronized (v2Var.f123697a) {
            synchronized (v2Var.f123697a) {
                synchronized (v2Var.f123697a) {
                    try {
                        List list2 = v2Var.f123707k;
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((androidx.camera.core.impl.z0) it.next()).b();
                            }
                            v2Var.f123707k = null;
                        }
                    } finally {
                    }
                }
                if (!list.isEmpty()) {
                    int i13 = 0;
                    do {
                        try {
                            ((androidx.camera.core.impl.z0) list.get(i13)).d();
                            i13++;
                        } catch (DeferrableSurface$SurfaceClosedException e13) {
                            for (int i14 = i13 - 1; i14 >= 0; i14--) {
                                ((androidx.camera.core.impl.z0) list.get(i14)).b();
                            }
                            throw e13;
                        }
                    } while (i13 < list.size());
                }
                v2Var.f123707k = list;
            }
            com.bumptech.glide.d.v("The openCaptureSessionCompleter can only set once!", v2Var.f123705i == null);
            v2Var.f123705i = iVar;
            ((sp2.i) hVar.f126926a).J(sVar);
            str = "openCaptureSession[session=" + v2Var + "]";
        }
        return str;
    }

    @Override // uj2.e0
    public final void g(kk2.a emitter) {
        List list = (List) this.f123684a;
        vd0.a imageUrlsJsonArray = (vd0.a) this.f123685b;
        ConcurrentHashMap pinnableImagesMap = (ConcurrentHashMap) this.f123686c;
        PinItActivity this$0 = (PinItActivity) this.f123687d;
        int i13 = PinItActivity.f34916p;
        Intrinsics.checkNotNullParameter(imageUrlsJsonArray, "$imageUrlsJsonArray");
        Intrinsics.checkNotNullParameter(pinnableImagesMap, "$pinnableImagesMap");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.add((PinnableImage) list.get(i14));
            }
        }
        int d2 = imageUrlsJsonArray.d();
        for (int i15 = 0; i15 < d2; i15++) {
            String l13 = imageUrlsJsonArray.l(i15);
            if (pinnableImagesMap.containsKey(l13)) {
                PinnableImage pinnableImage = (PinnableImage) pinnableImagesMap.get(l13);
                if (pinnableImage == null) {
                    tb0.h hVar = this$0.f34920e;
                    if (hVar == null) {
                        Intrinsics.r("crashReporting");
                        throw null;
                    }
                    hVar.q(new Exception("PinItActivity Null pinnableImage"), df.j1.U("parsePinnableImage null pinnableImage %s", new Object[]{l13}), tb0.p.PIN_BUILDER);
                } else {
                    arrayList.add(pinnableImage);
                }
            }
        }
        emitter.b(arrayList);
    }

    @Override // uj2.e
    public final void n(fk2.f emitter) {
        mr1.c activityProvider = (mr1.c) this.f123685b;
        nr1.e this$0 = (nr1.e) this.f123684a;
        u5.l credentialManager = (u5.l) this.f123686c;
        nr1.a credential = (nr1.a) this.f123687d;
        Intrinsics.checkNotNullParameter(activityProvider, "$activityProvider");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(credentialManager, "$credentialManager");
        Intrinsics.checkNotNullParameter(credential, "$credential");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        activityProvider.H3(new aw0.j(this$0, credentialManager, credential, emitter, 29));
    }

    @Override // uj2.s
    public final void o(fk2.f it) {
        VideoPinCreateMediaWorker this$0 = (VideoPinCreateMediaWorker) this.f123685b;
        Map<String, RequestBody> paramsMap = (Map) this.f123684a;
        MultipartBody.Part part = (MultipartBody.Part) this.f123686c;
        x10.c params = (x10.c) this.f123687d;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(paramsMap, "$paramsMap");
        Intrinsics.checkNotNullParameter(params, "$params");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f49021o.a(paramsMap, part).r(tk2.e.f118017c).l(wj2.c.a()).o(new rh1.q1(3, new oh1.u(8, it, this$0)), new rh1.q1(4, new ed1.m(this$0, params, it, 19)));
    }

    public /* synthetic */ u2(List list, vd0.a aVar, ConcurrentHashMap concurrentHashMap, PinItActivity pinItActivity) {
        this.f123684a = list;
        this.f123685b = aVar;
        this.f123686c = concurrentHashMap;
        this.f123687d = pinItActivity;
    }
}
