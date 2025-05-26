package x62;

import a7.d0;
import a7.i0;
import ac2.o1;
import ac2.v;
import ac2.w;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import androidx.media3.exoplayer.ExoPlayer;
import com.pinterest.shuffles.core.ui.model.BitmapMaskModel;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import io.embrace.android.embracesdk.internal.payload.Envelope;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import jk2.p2;
import k8.y;
import kh2.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;
import net.quikkly.android.ui.CameraPreview;
import pq2.a1;
import s80.y2;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f133964c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f133965d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i13) {
        this.f133962a = i13;
        this.f133964c = obj;
        this.f133965d = obj2;
        this.f133963b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        d0 d0Var;
        int i13 = this.f133962a;
        r7 = null;
        Uri uri = null;
        Object obj = this.f133963b;
        Object obj2 = this.f133965d;
        Object obj3 = this.f133964c;
        switch (i13) {
            case 0:
                Bitmap bitmap = (Bitmap) obj3;
                EditMaskImageView this$0 = (EditMaskImageView) obj2;
                Function1 onComplete = (Function1) obj;
                ql2.g gVar = EditMaskImageView.f51946q;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(onComplete, "$onComplete");
                try {
                    Bitmap b13 = t62.a.b(bitmap);
                    String V1 = b0.V1(b13, 0, 0, 0, 0, -16777216, true, true, 15);
                    RectF rectF = new RectF();
                    if (V1 != null) {
                        b0.T1(b13.getWidth(), b13.getHeight(), V1).computeBounds(rectF, true);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(b13, (int) rectF.left, (int) rectF.top, (int) rectF.width(), (int) rectF.height());
                    Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                    this$0.post(new c(onComplete, V1, new BitmapMaskModel(rectF.left / b13.getWidth(), rectF.top / b13.getHeight(), rectF.width() / b13.getWidth(), rectF.height() / b13.getHeight(), b0.T(createBitmap))));
                    break;
                } catch (Exception unused) {
                    this$0.post(new y2(1, onComplete));
                    return;
                }
            case 1:
                Function1 onComplete2 = (Function1) obj;
                String str = (String) obj3;
                BitmapMaskModel bitmapMask = (BitmapMaskModel) obj2;
                ql2.g gVar2 = EditMaskImageView.f51946q;
                Intrinsics.checkNotNullParameter(onComplete2, "$onComplete");
                Intrinsics.checkNotNullParameter(bitmapMask, "$bitmapMask");
                onComplete2.invoke(new MaskModel(str != null ? str : null, bitmapMask));
                break;
            case 2:
                hc2.m playerWrapper = (hc2.m) obj3;
                o1 this$02 = (o1) obj2;
                Runnable coolDownRunnable = (Runnable) obj;
                Intrinsics.checkNotNullParameter(playerWrapper, "$playerWrapper");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(coolDownRunnable, "$coolDownRunnable");
                dc2.g gVar3 = (dc2.g) playerWrapper;
                if (((l0) gVar3.f54407a).L() == 3) {
                    ExoPlayer exoPlayer = gVar3.f54407a;
                    a7.h hVar = (a7.h) exoPlayer;
                    i0 i14 = hVar.i();
                    if (Intrinsics.d(i14 != null ? i14.f1072a : null, gVar3.f54409c)) {
                        i0 i15 = hVar.i();
                        if (i15 != null && (d0Var = i15.f1073b) != null) {
                            uri = d0Var.f969a;
                        }
                        if (d7.b.f0(String.valueOf(uri))) {
                            l0 l0Var = (l0) exoPlayer;
                            l0Var.L0();
                            y yVar = l0Var.f86269j;
                            Intrinsics.g(yVar, "null cannot be cast to non-null type androidx.media3.exoplayer.trackselection.DefaultTrackSelector");
                            dl2.b.W2((k8.q) yVar, true);
                            gVar3.f54410d = true;
                            this$02.f2023z.postDelayed(coolDownRunnable, CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
                            break;
                        }
                    }
                }
                break;
            case 3:
                Context context = (Context) obj3;
                String sourceUrl = (String) obj2;
                cc2.b performanceTracker = (cc2.b) obj;
                Integer[] numArr = PinterestVideoView.f52749c1;
                Intrinsics.checkNotNullParameter(sourceUrl, "$sourceUrl");
                Intrinsics.checkNotNullParameter(performanceTracker, "$performanceTracker");
                v vVar = w.f2066a;
                Intrinsics.f(context);
                performanceTracker.f27500s = Boolean.valueOf(((h7.w) w.b(context)).k(sourceUrl, 1L));
                break;
            case 4:
                qg2.g gVar4 = (qg2.g) obj3;
                qg2.b bVar = (qg2.b) obj2;
                String str2 = (String) obj;
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    ((qg2.e) gVar4.f103862a).b(bVar.f103855c);
                    break;
                } catch (Throwable th3) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    ue.c.m(th3);
                    return;
                }
            case 5:
                bh2.b bVar2 = (bh2.b) obj3;
                Envelope envelope = (Envelope) obj2;
                yg2.d metadata = (yg2.d) obj;
                lh2.b bVar3 = bVar2.f22813d;
                try {
                    boolean z13 = metadata.f139035e;
                    yg2.f fVar = metadata.f139034d;
                    dh2.e eVar = bVar2.f22812c;
                    dh2.e eVar2 = z13 ? bVar2.f22811b : eVar;
                    fn1.k action = new fn1.k(metadata, bVar2, envelope, 25);
                    eVar2.getClass();
                    Intrinsics.checkNotNullParameter(metadata, "metadata");
                    Intrinsics.checkNotNullParameter(action, "action");
                    al1.j action2 = new al1.j(17, action);
                    dh2.d dVar = eVar2.f55027b;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(metadata, "metadata");
                    Intrinsics.checkNotNullParameter(action2, "action");
                    try {
                        dVar.d(metadata, action2);
                    } catch (Throwable th4) {
                        ((lh2.e) dVar.f55022b).b(lh2.g.PAYLOAD_STORAGE_FAIL, th4);
                    }
                    ConcurrentHashMap concurrentHashMap = bVar2.f22818i;
                    yg2.d dVar2 = (yg2.d) concurrentHashMap.get(fVar);
                    if (metadata.f139035e) {
                        ((ch2.d) bVar2.f22810a).e();
                    } else {
                        concurrentHashMap.put(fVar, metadata);
                        if (!bh2.b.f22809j.contains(fVar)) {
                            ((lh2.e) bVar3).b(lh2.g.INTAKE_UNEXPECTED_TYPE, new IllegalStateException("Unexpected envelope type cache attempt: " + fVar));
                        }
                    }
                    if (dVar2 != null) {
                        bp1.h.i(eVar, dVar2);
                        break;
                    }
                } catch (Throwable th5) {
                    ((lh2.e) bVar3).b(lh2.g.INTAKE_FAIL, th5);
                    return;
                }
                break;
            case 6:
                pq2.l lVar = (pq2.l) obj2;
                a1 a1Var = (a1) obj;
                pq2.r rVar = (pq2.r) ((p2) obj3).f76641c;
                if (!rVar.f101078b.f()) {
                    lVar.l(rVar, a1Var);
                    break;
                } else {
                    lVar.e(new IOException("Canceled"), rVar);
                    break;
                }
            default:
                ((pq2.l) obj2).e((Throwable) obj, (pq2.r) ((p2) obj3).f76641c);
                break;
        }
    }

    public /* synthetic */ c(Function1 function1, String str, BitmapMaskModel bitmapMaskModel) {
        this.f133962a = 1;
        this.f133963b = function1;
        this.f133964c = str;
        this.f133965d = bitmapMaskModel;
    }
}
