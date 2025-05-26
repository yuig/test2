package uv0;

import a.cb;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import ao2.j1;
import ao2.l0;
import ao2.v0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.f3;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gw;
import com.pinterest.api.model.jq;
import com.pinterest.api.model.kq;
import com.pinterest.api.model.lq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.qw;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vv;
import com.pinterest.feature.mediagallery.MediaGalleryActivity;
import com.pinterest.feature.video.worker.StatusMediaWorker;
import com.pinterest.feature.video.worker.VideoPinCreateMediaWorker;
import com.pinterest.framework.multisection.datasource.pagedlist.RetrofitPagedRemoteRequest;
import com.pinterest.repository.TypedId;
import h32.u0;
import i51.c0;
import i51.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kg.t;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pw0.x;
import qz.f0;
import rh1.q1;
import u50.r;
import uj2.e0;
import uj2.s;
import x02.y1;
import x02.z1;
import zp.y;
import zp.z;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements uj2.e, s, y, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f123154b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f123155c;

    public /* synthetic */ a(int i13, Object obj, Object obj2) {
        this.f123153a = i13;
        this.f123154b = obj;
        this.f123155c = obj2;
    }

    @Override // zp.y
    public final void d(z event) {
        c0 this$0 = (c0) this.f123154b;
        r eventIntake = (r) this.f123155c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(eventIntake, "$eventIntake");
        Intrinsics.checkNotNullParameter(event, "event");
        this$0.getClass();
        boolean z13 = event.f142584a;
        f0 f0Var = new f0();
        f0Var.d(Boolean.valueOf(z13), "show_all_pins");
        this$0.f71583c.a(f0Var.i()).r(tk2.e.f118017c).l(wj2.c.a()).o(new g51.g(20, new p70.a(eventIntake, 19)), new g51.g(21, w.f71614o));
        eventIntake.a(new i51.k(u0.ALL_PINS_VISIBILITY_SWITCH, event.f142584a));
    }

    @Override // uj2.e0
    public final void g(final kk2.a emitter) {
        d12.i repositoryBatcher;
        d12.i repositoryBatcher2;
        int i13 = this.f123153a;
        Object params = this.f123155c;
        Object obj = this.f123154b;
        switch (i13) {
            case 11:
                ok1.d this$0 = (ok1.d) obj;
                String boardId = (String) params;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(boardId, "$boardId");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                this$0.f95458c.getClass();
                Object b13 = gw.b(boardId);
                if (b13 == null) {
                    b13 = (v7) this$0.f95457b.O(boardId);
                }
                if (b13 == null) {
                    emitter.c(new IllegalStateException(a.a.k("Board with ID: ", boardId, " NOT found in data repository")));
                    return;
                } else {
                    emitter.b(b13);
                    return;
                }
            case 12:
                tb.f this$02 = (tb.f) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(params, "$params");
                Intrinsics.checkNotNullParameter(emitter, "e");
                this$02.Y(params);
                return;
            case 13:
                TypedId[] typedIds = (TypedId[]) obj;
                RetrofitPagedRemoteRequest this$03 = (RetrofitPagedRemoteRequest) params;
                Intrinsics.checkNotNullParameter(typedIds, "$typedIds");
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(emitter, "it");
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (typedIds.length == 0) {
                    emitter.b(arrayList2);
                    return;
                }
                qw qwVar = typedIds[0].f50452b;
                for (TypedId typedId : typedIds) {
                    if (qwVar != typedId.f50452b) {
                        repositoryBatcher2 = this$03.getRepositoryBatcher();
                        arrayList2.addAll(((d12.h) repositoryBatcher2).b(qwVar, arrayList));
                        arrayList.clear();
                        qwVar = typedId.f50452b;
                    }
                    arrayList.add(typedId.f50451a);
                }
                repositoryBatcher = this$03.getRepositoryBatcher();
                arrayList2.addAll(((d12.h) repositoryBatcher).b(qwVar, arrayList));
                emitter.b(arrayList2);
                return;
            case 14:
            case 15:
            default:
                final Task this_asSingle = (Task) obj;
                final Function1 throwableWrapper = (Function1) params;
                Intrinsics.checkNotNullParameter(this_asSingle, "$this_asSingle");
                Intrinsics.checkNotNullParameter(throwableWrapper, "$throwableWrapper");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                this_asSingle.addOnCompleteListener(new OnCompleteListener() { // from class: r42.e
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        Object result;
                        uj2.c0 emitter2 = emitter;
                        Intrinsics.checkNotNullParameter(emitter2, "$emitter");
                        Function1 throwableWrapper2 = throwableWrapper;
                        Intrinsics.checkNotNullParameter(throwableWrapper2, "$throwableWrapper");
                        Task this_asSingle2 = this_asSingle;
                        Intrinsics.checkNotNullParameter(this_asSingle2, "$this_asSingle");
                        Intrinsics.checkNotNullParameter(task, "task");
                        Task task2 = this_asSingle2.isSuccessful() ? task : null;
                        if (task2 == null || (result = task2.getResult()) == null) {
                            ((kk2.a) emitter2).c((Throwable) throwableWrapper2.invoke(task.getException()));
                        } else {
                            ((kk2.a) emitter2).b(result);
                        }
                    }
                });
                return;
            case 16:
                String key = (String) obj;
                z1 this$04 = (z1) params;
                gi2.b bVar = z1.f131544c;
                Intrinsics.checkNotNullParameter(key, "$key");
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                Object obj2 = y1.f131537d;
                ReentrantReadWriteLock.ReadLock readLock = gi2.b.Q(key).readLock();
                readLock.lock();
                try {
                    mc.a a13 = this$04.f131550b.a(key);
                    if (a13 != null && a13.f86882d >= System.currentTimeMillis()) {
                        this$04.f131549a.put(key, a13);
                        obj2 = new y1(a13);
                    }
                    Unit unit = Unit.f80348a;
                    readLock.unlock();
                    emitter.b(obj2);
                    return;
                } catch (Throwable th3) {
                    readLock.unlock();
                    throw th3;
                }
        }
    }

    @Override // uj2.e
    public final void n(fk2.f emitter) {
        int i13 = this.f123153a;
        int i14 = 1;
        Object obj = this.f123155c;
        Object obj2 = this.f123154b;
        switch (i13) {
            case 0:
                com.pinterest.feature.ideaPinCreation.closeup.view.f0 pageView = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj2;
                kq overlayBlock = (kq) obj;
                Intrinsics.checkNotNullParameter(pageView, "$pageView");
                Intrinsics.checkNotNullParameter(overlayBlock, "$overlayBlock");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                pageView.T0(overlayBlock, new d(emitter, 2), new d(emitter, 3));
                break;
            case 1:
                com.pinterest.feature.ideaPinCreation.closeup.view.f0 pageView2 = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj2;
                oq overlayBlock2 = (oq) obj;
                Intrinsics.checkNotNullParameter(pageView2, "$pageView");
                Intrinsics.checkNotNullParameter(overlayBlock2, "$overlayBlock");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                pageView2.r1(overlayBlock2);
                emitter.b();
                break;
            case 2:
                com.pinterest.feature.ideaPinCreation.closeup.view.f0 pageView3 = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj2;
                mq overlayBlock3 = (mq) obj;
                Intrinsics.checkNotNullParameter(pageView3, "$pageView");
                Intrinsics.checkNotNullParameter(overlayBlock3, "$overlayBlock");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                pageView3.n1(overlayBlock3, new d(emitter, 6), new d(emitter, 7));
                break;
            case 3:
                com.pinterest.feature.ideaPinCreation.closeup.view.f0 pageView4 = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj2;
                lq overlayBlock4 = (lq) obj;
                Intrinsics.checkNotNullParameter(pageView4, "$pageView");
                Intrinsics.checkNotNullParameter(overlayBlock4, "$overlayBlock");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                pageView4.Y0(overlayBlock4, new d(emitter, 4), new d(emitter, 5));
                break;
            case 4:
                com.pinterest.feature.ideaPinCreation.closeup.view.f0 pageView5 = (com.pinterest.feature.ideaPinCreation.closeup.view.f0) obj2;
                jq overlayBlock5 = (jq) obj;
                Intrinsics.checkNotNullParameter(pageView5, "$pageView");
                Intrinsics.checkNotNullParameter(overlayBlock5, "$overlayBlock");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                pageView5.S0(overlayBlock5, new d(emitter, 0), new d(emitter, i14));
                break;
            case 5:
            case 6:
            case 7:
            default:
                String str = (String) obj;
                ClipboardManager clipboardManager = ((gs1.d) obj2).f66080a;
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str));
                    emitter.b();
                    break;
                } else {
                    emitter.d(new IllegalStateException("Error accessing ClipboardManager"));
                    break;
                }
            case 8:
                uf1.c this$0 = (uf1.c) obj2;
                d30 photoItem = (d30) obj;
                int i15 = uf1.c.K;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(photoItem, "$photoItem");
                Intrinsics.checkNotNullParameter(emitter, "emitter");
                this$0.f52564p = new e(emitter, 1);
                RectF rectF = this$0.f122109J;
                Pair E = t.E(photoItem, rectF.width());
                this$0.P0(new File(photoItem.e()), ((Number) E.f80346a).intValue(), ((Number) E.f80347b).intValue());
                Context context = this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                float width = rectF.width();
                float height = rectF.height();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(photoItem, "photoItem");
                Matrix matrix = new Matrix();
                Pair E2 = t.E(photoItem, width);
                int intValue = ((Number) E2.f80346a).intValue();
                int intValue2 = ((Number) E2.f80347b).intValue();
                if (intValue >= intValue2) {
                    matrix.setRectToRect(new RectF(0.0f, 0.0f, intValue, intValue2), new RectF(0.0f, 0.0f, width, height), Matrix.ScaleToFit.CENTER);
                } else {
                    float f13 = intValue;
                    float f14 = intValue2;
                    float max = Math.max(width / f13, height / f14);
                    matrix.postScale(max, max);
                    matrix.postTranslate((width - (f13 * max)) / 2.0f, cb.a(f14, max, height, 2.0f));
                }
                matrix.mapRect(new RectF(0.0f, 0.0f, intValue, intValue2));
                this$0.setImageMatrix(matrix);
                break;
        }
    }

    @Override // uj2.s
    public final void o(fk2.f it) {
        x xVar;
        int i13 = this.f123153a;
        int i14 = 0;
        int i15 = 1;
        Object obj = this.f123155c;
        Object obj2 = this.f123154b;
        switch (i13) {
            case 5:
                MediaGalleryActivity this$0 = (MediaGalleryActivity) obj2;
                Bundle extras = (Bundle) obj;
                int i16 = MediaGalleryActivity.f46708o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(extras, "$extras");
                Intrinsics.checkNotNullParameter(it, "it");
                this$0.getClass();
                boolean z13 = extras.getBoolean("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD");
                Bundle bundle = new Bundle();
                bundle.putBoolean("com.pinterest.EXTRA_ENABLE_VIDEO_UPLOAD", z13);
                if (extras.containsKey("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE")) {
                    String string = extras.getString("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE");
                    if (string == null) {
                        string = "";
                    }
                    xVar = x.valueOf(string);
                } else {
                    vb0.j.f125466a.J(new IllegalStateException("A MediaGalleryType is required"), tb0.p.MEDIA_GALLERY);
                    xVar = x.IdeaPinPageAdd;
                }
                bundle.putString("com.pinterest.EXTRA_MEDIA_GALLERY_TYPE", xVar.name());
                bundle.putInt("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS", extras.getInt("com.pinterest.EXTRA_MEDIA_GALLERY_MAX_SELECTED_ITEMS"));
                bundle.putString("com.pinterest.EXTRA_AGGREGATED_UID", extras.getString("com.pinterest.EXTRA_AGGREGATED_UID"));
                Bundle bundle2 = this$0.f46716i;
                if (bundle2 != null) {
                    bundle.putBundle("com.pinterest.EXTRA_MEDIA_GALLERY_EXTRA_BUNDLE", bundle2);
                }
                it.c(bundle);
                it.b();
                break;
            case 6:
                vv.a endpoint = (vv.a) obj2;
                Object obj3 = (HttpUrl) obj;
                Intrinsics.checkNotNullParameter(endpoint, "$endpoint");
                Intrinsics.checkNotNullParameter(it, "metricEmitter");
                int attempts = endpoint.getAttempts();
                while (i14 < attempts) {
                    it.c(obj3);
                    i14++;
                }
                it.b();
                break;
            case 9:
                StatusMediaWorker this$02 = (StatusMediaWorker) obj2;
                String id3 = (String) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(id3, "$id");
                Intrinsics.checkNotNullParameter(it, "emitter");
                ((o20.a) this$02.f49014o.getValue()).a(id3).r(tk2.e.f118017c).o(new q1(1, new ed1.m(this$02, it, id3, 18)), new q1(2, new nr.m(it, i15)));
                break;
            case 10:
                VideoPinCreateMediaWorker this$03 = (VideoPinCreateMediaWorker) obj2;
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(pin, "$pin");
                Intrinsics.checkNotNullParameter(it, "it");
                y42.f fVar = this$03.f49022p;
                Context context = this$03.f78962a;
                Intrinsics.checkNotNullExpressionValue(context, "getApplicationContext(...)");
                fVar.a(context, pin);
                it.b();
                break;
            case 15:
                yx1.p this$04 = (yx1.p) obj2;
                f30 pin2 = (f30) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(pin2, "$pin");
                Intrinsics.checkNotNullParameter(it, "observable");
                this$04.getClass();
                Intrinsics.checkNotNullParameter(it, "observable");
                Intrinsics.checkNotNullParameter(pin2, "pin");
                f3 z33 = pin2.z3();
                Map G = z33 != null ? z33.G() : null;
                if (G == null) {
                    G = z0.d();
                }
                if (!(!G.isEmpty())) {
                    Date date = this$04.f140397l;
                    if (date == null) {
                        if (!pin2.e5().booleanValue()) {
                            yx1.e eVar = (yx1.e) this$04.getView();
                            Date U3 = pin2.U3();
                            if (U3 == null) {
                                U3 = pin2.G6();
                            }
                            ((yx1.j) eVar).e8(new yx1.w(U3));
                            it.c(new cy1.e(pin2, pin2.U3()));
                            it.b();
                            break;
                        } else {
                            boolean[] zArr = pin2.f37485h3;
                            if (zArr.length > 177 && zArr[177] && pin2.i6() != null) {
                                String i63 = pin2.i6();
                                Intrinsics.f(i63);
                                this$04.addDisposable(this$04.f140391f.T(i63).s().o(new ru1.d(28, new yx1.n(this$04, it, pin2, i14)), new ru1.d(29, new yx1.n(this$04, it, pin2, i15))));
                                break;
                            } else {
                                it.c(new cy1.e(pin2, this$04.f140397l));
                                it.b();
                                break;
                            }
                        }
                    } else {
                        it.c(new cy1.e(pin2, date));
                        it.b();
                        break;
                    }
                } else {
                    it.c(new cy1.e(pin2, this$04.f140397l));
                    it.b();
                    break;
                }
            default:
                jo2.d dVar = new jo2.d(kotlin.jvm.internal.j.y(j1.f20166a, v0.f20220b.plus((CoroutineContext) obj2), l0.ATOMIC, new jo2.g((do2.i) obj, it, null)));
                int i17 = it.f62432a;
                switch (i17) {
                    case 0:
                        bk2.a aVar = new bk2.a(dVar);
                        switch (i17) {
                            case 0:
                                bk2.c.set(it, aVar);
                                break;
                            default:
                                bk2.c.set(it, aVar);
                                break;
                        }
                    default:
                        bk2.a aVar2 = new bk2.a(dVar);
                        switch (i17) {
                            case 0:
                                bk2.c.set(it, aVar2);
                                break;
                            default:
                                bk2.c.set(it, aVar2);
                                break;
                        }
                }
        }
    }
}
