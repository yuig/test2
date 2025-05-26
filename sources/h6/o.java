package h6;

import a7.v0;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.core.text.PrecomputedTextCompat;
import androidx.fragment.app.o1;
import androidx.fragment.app.z1;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.impl.WorkDatabase;
import com.appsflyer.internal.AFj1lSDK;
import com.appsflyer.internal.AFj1vSDK;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.pinterest.video.core.view.PinterestVideoView;
import d7.n0;
import dl1.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb.a1;
import m7.c1;
import m7.j1;
import m7.l0;
import net.quikkly.android.ui.CameraPreview;
import pk.v2;
import pk.x0;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f67741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f67742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f67743d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i13) {
        this.f67740a = i13;
        this.f67741b = obj;
        this.f67742c = obj2;
        this.f67743d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        PrecomputedTextCompat precomputedTextCompat;
        PrecomputedText.Params params;
        PrecomputedText create;
        a7.d0 d0Var;
        boolean z13 = true;
        boolean z14 = true;
        boolean z15 = true;
        switch (this.f67740a) {
            case 0:
                q qVar = (q) this.f67741b;
                com.bumptech.glide.d dVar = (com.bumptech.glide.d) this.f67742c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f67743d;
                qVar.getClass();
                try {
                    a0 t13 = d7.b.t(qVar.f67746a);
                    if (t13 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    z zVar = (z) t13.f67719a;
                    synchronized (zVar.f67770d) {
                        zVar.f67772f = threadPoolExecutor;
                    }
                    t13.f67719a.a(new p(dVar, threadPoolExecutor));
                    return;
                } catch (Throwable th3) {
                    dVar.m0(th3);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                List awaitingContainerChanges = (List) this.f67741b;
                z1 operation = (z1) this.f67742c;
                androidx.fragment.app.k this$0 = (androidx.fragment.app.k) this.f67743d;
                Intrinsics.checkNotNullParameter(awaitingContainerChanges, "$awaitingContainerChanges");
                Intrinsics.checkNotNullParameter(operation, "$operation");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (awaitingContainerChanges.contains(operation)) {
                    awaitingContainerChanges.remove(operation);
                    this$0.getClass();
                    androidx.fragment.app.k.a(operation);
                    return;
                }
                return;
            case 2:
                o1 impl = (o1) this.f67741b;
                View view = (View) this.f67742c;
                Rect lastInEpicenterRect = (Rect) this.f67743d;
                Intrinsics.checkNotNullParameter(impl, "$impl");
                Intrinsics.checkNotNullParameter(lastInEpicenterRect, "$lastInEpicenterRect");
                impl.getClass();
                o1.g(lastInEpicenterRect, view);
                return;
            case 3:
                androidx.fragment.app.k this$02 = (androidx.fragment.app.k) this.f67741b;
                View view2 = (View) this.f67742c;
                androidx.fragment.app.f animationInfo = (androidx.fragment.app.f) this.f67743d;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                this$02.f18361a.endViewTransition(view2);
                animationInfo.a();
                return;
            case 4:
                c1 c1Var = (c1) this.f67741b;
                x0 x0Var = (x0) this.f67742c;
                g8.e0 e0Var = (g8.e0) this.f67743d;
                c1Var.getClass();
                v2 i13 = x0Var.i();
                n7.c0 c0Var = (n7.c0) c1Var.f86122c;
                v0 v0Var = c0Var.f89400g;
                v0Var.getClass();
                n7.b0 b0Var = c0Var.f89397d;
                b0Var.getClass();
                b0Var.f89389b = pk.c1.r(i13);
                if (!i13.isEmpty()) {
                    b0Var.f89392e = (g8.e0) i13.get(0);
                    e0Var.getClass();
                    b0Var.f89393f = e0Var;
                }
                if (b0Var.f89391d == null) {
                    b0Var.f89391d = n7.b0.c(v0Var, b0Var.f89389b, b0Var.f89392e, b0Var.f89388a);
                }
                b0Var.e(v0Var.v());
                return;
            case 5:
                j1 j1Var = (j1) this.f67741b;
                Pair pair = (Pair) this.f67742c;
                ((n7.c0) j1Var.f86222b.f86322h).g(((Integer) pair.first).intValue(), (g8.e0) pair.second, (g8.a0) this.f67743d);
                return;
            case 6:
                tb.c cVar = (tb.c) this.f67741b;
                androidx.media3.common.b bVar = (androidx.media3.common.b) this.f67742c;
                m7.j jVar = (m7.j) this.f67743d;
                n8.i0 i0Var = (n8.i0) cVar.f116960b;
                int i14 = n0.f53866a;
                l0 l0Var = ((m7.i0) i0Var).f86205a;
                l0Var.S = bVar;
                n7.c0 c0Var2 = (n7.c0) l0Var.f86285t;
                n7.b w13 = c0Var2.w();
                c0Var2.x(w13, 1017, new n7.o(w13, bVar, jVar, z14 ? 1 : 0));
                return;
            case 7:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f67741b;
                r4.i iVar = (r4.i) this.f67742c;
                Function0 function0 = (Function0) this.f67743d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    iVar.b(function0.invoke());
                    return;
                } catch (Throwable th4) {
                    iVar.d(th4);
                    return;
                }
            case 8:
                lb.o oVar = (lb.o) this.f67741b;
                com.google.common.util.concurrent.c0 c0Var3 = (com.google.common.util.concurrent.c0) this.f67742c;
                a1 a1Var = (a1) this.f67743d;
                String str = lb.o.f82636l;
                oVar.getClass();
                try {
                    z13 = ((Boolean) c0Var3.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (oVar.f82647k) {
                    try {
                        tb.j q13 = b7.c.q(a1Var.f82558a);
                        String str2 = q13.f116981a;
                        if (oVar.c(str2) == a1Var) {
                            oVar.b(str2);
                        }
                        kb.b0.e().a(lb.o.f82636l, lb.o.class.getSimpleName() + " " + str2 + " executed; reschedule = " + z13);
                        Iterator it = oVar.f82646j.iterator();
                        while (it.hasNext()) {
                            ((lb.c) it.next()).b(q13, z13);
                        }
                    } finally {
                    }
                }
                return;
            case 9:
                ((lb.i0) this.f67741b).f82599a.g((lb.t) this.f67742c, (x92.b) this.f67743d);
                return;
            case 10:
                WorkDatabase workDatabase = (WorkDatabase) this.f67741b;
                String str3 = (String) this.f67742c;
                lb.j0 j0Var = (lb.j0) this.f67743d;
                tb.y y13 = workDatabase.y();
                y13.getClass();
                ja.f0 d2 = ja.f0.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                d2.c1(1, str3);
                ja.d0 d0Var2 = y13.f117050a;
                d0Var2.b();
                Cursor m03 = d7.b.m0(d0Var2, d2, false);
                try {
                    ArrayList arrayList = new ArrayList(m03.getCount());
                    while (m03.moveToNext()) {
                        arrayList.add(m03.getString(0));
                    }
                    m03.close();
                    d2.e();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        d7.b.m(j0Var, (String) it2.next());
                    }
                    return;
                } catch (Throwable th5) {
                    m03.close();
                    d2.e();
                    throw th5;
                }
            case 11:
                ((AFj1lSDK) this.f67741b).getMediationNetwork((AFj1vSDK) this.f67742c, (Runnable) this.f67743d);
                return;
            case 12:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.f67741b;
                Intent intent = (Intent) this.f67742c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f67743d;
                int i15 = com.google.firebase.messaging.g.f33779a;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 13:
                q0 this$03 = (q0) this.f67741b;
                dl1.m params2 = (dl1.m) this.f67742c;
                dl1.s model = (dl1.s) this.f67743d;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(params2, "$params");
                Intrinsics.checkNotNullParameter(model, "$model");
                try {
                    this$03.f55276i.c(new kotlin.Pair(params2, model));
                    return;
                } catch (Throwable th6) {
                    this$03.f55276i.onError(th6);
                    return;
                }
            case 14:
                va2.l this$04 = (va2.l) this.f67741b;
                String value = (String) this.f67742c;
                PrecomputedTextCompat.Params param = (PrecomputedTextCompat.Params) this.f67743d;
                boolean z16 = va2.l.f125399x;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(value, "$value");
                Intrinsics.checkNotNullParameter(param, "$param");
                AtomicReference atomicReference = this$04.f125404p;
                value.getClass();
                param.getClass();
                try {
                    Trace.beginSection("PrecomputedText");
                    if (Build.VERSION.SDK_INT < 29 || (params = param.f17948e) == null) {
                        ArrayList arrayList2 = new ArrayList();
                        int length = value.length();
                        int i16 = 0;
                        while (i16 < length) {
                            int indexOf = TextUtils.indexOf((CharSequence) value, '\n', i16, length);
                            i16 = indexOf < 0 ? length : indexOf + 1;
                            arrayList2.add(Integer.valueOf(i16));
                        }
                        int[] iArr = new int[arrayList2.size()];
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            iArr[i17] = ((Integer) arrayList2.get(i17)).intValue();
                        }
                        StaticLayout.Builder.obtain(value, 0, value.length(), param.f17944a, Integer.MAX_VALUE).setBreakStrategy(param.f17946c).setHyphenationFrequency(param.f17947d).setTextDirection(param.f17945b).build();
                        precomputedTextCompat = new PrecomputedTextCompat(value, param);
                    } else {
                        create = PrecomputedText.create(value, params);
                        precomputedTextCompat = new PrecomputedTextCompat(create, param);
                    }
                    atomicReference.set(precomputedTextCompat);
                    return;
                } finally {
                    Trace.endSection();
                }
            case 15:
                hc2.m this_apply = (hc2.m) this.f67741b;
                hc2.m playerWrapper = (hc2.m) this.f67742c;
                ac2.o1 this$05 = (ac2.o1) this.f67743d;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                Intrinsics.checkNotNullParameter(playerWrapper, "$playerWrapper");
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                dc2.g gVar2 = (dc2.g) this_apply;
                a7.i0 i18 = ((a7.h) gVar2.f54407a).i();
                String valueOf = String.valueOf((i18 == null || (d0Var = i18.f1073b) == null) ? null : d0Var.f969a);
                ExoPlayer exoPlayer = gVar2.f54407a;
                if (((l0) exoPlayer).L() == 3) {
                    a7.i0 i19 = ((a7.h) exoPlayer).i();
                    if (Intrinsics.d(i19 != null ? i19.f1072a : null, gVar2.f54409c) && d7.b.f0(valueOf)) {
                        l0 l0Var2 = (l0) ((dc2.g) playerWrapper).f54407a;
                        l0Var2.L0();
                        k8.y yVar = l0Var2.f86269j;
                        Intrinsics.g(yVar, "null cannot be cast to non-null type androidx.media3.exoplayer.trackselection.DefaultTrackSelector");
                        k8.q qVar2 = (k8.q) yVar;
                        dl2.b.W2(qVar2, true);
                        gVar2.f54410d = true;
                        if (this$05.f2011n.a(valueOf)) {
                            return;
                        }
                        this$05.f2023z.postDelayed(new nl1.a(z15 ? 1 : 0, this_apply, qVar2), CameraPreview.AUTOFOCUS_INTERVAL_MILLIS);
                        return;
                    }
                    return;
                }
                return;
            default:
                Context context = (Context) this.f67741b;
                String sourceUrl = (String) this.f67742c;
                kotlin.jvm.internal.j0 performanceTracker = (kotlin.jvm.internal.j0) this.f67743d;
                Integer[] numArr = PinterestVideoView.f52749c1;
                Intrinsics.checkNotNullParameter(sourceUrl, "$sourceUrl");
                Intrinsics.checkNotNullParameter(performanceTracker, "$performanceTracker");
                ac2.v vVar = ac2.w.f2066a;
                Intrinsics.f(context);
                ((cc2.b) performanceTracker.f80434a).f27500s = Boolean.valueOf(((h7.w) ac2.w.b(context)).k(sourceUrl, 1L));
                return;
        }
    }
}
