package r0;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewStub;
import androidx.camera.core.impl.v2;
import com.github.mustachejava.MustacheException;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.shuffles.cutout.editor.ui.refine.EditMaskImageView;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import so.oa;

/* loaded from: classes2.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f105618a;

    /* renamed from: b */
    public final /* synthetic */ Object f105619b;

    /* renamed from: c */
    public final /* synthetic */ Object f105620c;

    /* renamed from: d */
    public final /* synthetic */ Object f105621d;

    /* renamed from: e */
    public final /* synthetic */ Object f105622e;

    /* renamed from: f */
    public final /* synthetic */ Object f105623f;

    public /* synthetic */ p0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f105618a = i13;
        this.f105619b = obj;
        this.f105620c = obj2;
        this.f105621d = obj3;
        this.f105622e = obj4;
        this.f105623f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p01.j jVar;
        Object m13;
        boolean z13;
        Throwable th3;
        int i13 = 1;
        switch (this.f105618a) {
            case 0:
                v0 v0Var = (v0) this.f105619b;
                l0.s sVar = (l0.s) this.f105620c;
                androidx.camera.core.impl.j0 j0Var = (androidx.camera.core.impl.j0) this.f105621d;
                s0.a aVar = (s0.a) this.f105622e;
                v2 v2Var = (v2) this.f105623f;
                if (j0Var == v0Var.c()) {
                    v0Var.f105663t = sVar.d(j0Var, true);
                    c1 c1Var = (c1) aVar.f(s0.a.f110289b);
                    Objects.requireNonNull(c1Var);
                    c1Var.a(v0Var.f105663t, v2Var);
                    v0Var.L();
                    return;
                }
                return;
            case 1:
                URL openIdKeyUrl = (URL) this.f105619b;
                kotlin.jvm.internal.j0 result = (kotlin.jvm.internal.j0) this.f105620c;
                String kid = (String) this.f105621d;
                ReentrantLock lock = (ReentrantLock) this.f105622e;
                Condition condition = (Condition) this.f105623f;
                Intrinsics.checkNotNullParameter(openIdKeyUrl, "$openIdKeyUrl");
                Intrinsics.checkNotNullParameter(result, "$result");
                Intrinsics.checkNotNullParameter(kid, "$kid");
                Intrinsics.checkNotNullParameter(lock, "$lock");
                URLConnection openConnection = openIdKeyUrl.openConnection();
                if (openConnection == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        Intrinsics.checkNotNullExpressionValue(inputStream, "connection.inputStream");
                        Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
                        String z23 = kh2.j.z2(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                        httpURLConnection.getInputStream().close();
                        result.f80434a = new JSONObject(z23).optString(kid);
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                            Unit unit = Unit.f80348a;
                        } finally {
                        }
                    } catch (Throwable th4) {
                        httpURLConnection.disconnect();
                        lock.lock();
                        try {
                            condition.signal();
                            Unit unit2 = Unit.f80348a;
                            throw th4;
                        } finally {
                        }
                    }
                } catch (Exception e13) {
                    String name = lf.a.class.getName();
                    String message = e13.getMessage();
                    if (message == null) {
                        message = "Error getting public key";
                    }
                    Log.d(name, message);
                    httpURLConnection.disconnect();
                    lock.lock();
                    try {
                        condition.signal();
                        Unit unit3 = Unit.f80348a;
                    } finally {
                    }
                }
                return;
            case 2:
                cg.h hVar = (cg.h) this.f105619b;
                Callable callable = (Callable) this.f105620c;
                Writer writer = (Writer) this.f105621d;
                List list = (List) this.f105622e;
                gg.c cVar = (gg.c) this.f105623f;
                hVar.getClass();
                try {
                    Writer q13 = hVar.q(writer, callable.call(), list);
                    if (q13 instanceof gg.c) {
                        gg.c cVar2 = (gg.c) q13;
                        cVar2.getClass();
                        try {
                            cVar2.f64889a.await();
                        } catch (InterruptedException e14) {
                            throw new MustacheException("Interrupted while waiting for completion", e14);
                        }
                    }
                    synchronized (cVar) {
                        cVar.f64891c.append((CharSequence) cVar.f64890b);
                        cVar.f64889a.countDown();
                    }
                    return;
                } catch (Throwable th5) {
                    cVar.f64892d = th5;
                    cVar.f64889a.countDown();
                    return;
                }
            case 3:
                tp.g gVar = (tp.g) this.f105619b;
                Resources resources = (Resources) this.f105620c;
                rp0.d dVar = (rp0.d) this.f105621d;
                wy0 wy0Var = (wy0) this.f105622e;
                String str = (String) this.f105623f;
                int i14 = tp.g.f118732l;
                gVar.getClass();
                s60.c cVar3 = new s60.c(gVar.f118741i, new h32.i0(null, null, null, h32.g0.MODAL_DIALOG, null, h32.u0.USER_BLOCK_BUTTON), gVar.f118734b.getUid());
                Context context = kb0.a.f79058b;
                gVar.f118736d.a(new s60.d(cVar3, ((oa) ((so1.b) pk.a0.M(m60.f0.X(), so1.b.class))).G2()).d(wy0Var.getUid()).o(new tp.b(gVar, resources, str, wy0Var, dVar), new xo.l(6)));
                return;
            case 4:
                tp.m mVar = (tp.m) this.f105619b;
                Resources resources2 = (Resources) this.f105620c;
                rp0.d dVar2 = (rp0.d) this.f105621d;
                wy0 wy0Var2 = (wy0) this.f105622e;
                String str2 = (String) this.f105623f;
                int i15 = tp.m.f118757k;
                mVar.getClass();
                s60.c cVar4 = new s60.c(mVar.f118762e, new h32.i0(null, null, null, h32.g0.MODAL_DIALOG, null, h32.u0.USER_BLOCK_BUTTON), mVar.f118759b.getUid());
                Context context2 = kb0.a.f79058b;
                mVar.f118764g.a(new s60.d(cVar4, ((oa) ((so1.b) pk.a0.M(m60.f0.X(), so1.b.class))).G2()).d(wy0Var2.getUid()).o(new tp.h(mVar, resources2, str2, wy0Var2, dVar2), new xo.l(11)));
                return;
            case 5:
                q01.y this$0 = (q01.y) this.f105619b;
                String pinId = (String) this.f105620c;
                vh story = (vh) this.f105621d;
                List filterObjects = (List) this.f105622e;
                uk1.d presenterPinalytics = (uk1.d) this.f105623f;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(pinId, "$pinId");
                Intrinsics.checkNotNullParameter(story, "$story");
                Intrinsics.checkNotNullParameter(filterObjects, "$filterObjects");
                Intrinsics.checkNotNullParameter(presenterPinalytics, "$presenterPinalytics");
                String uid = story.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                if (this$0.f101852l == null && (jVar = this$0.f101856p) != null) {
                    View inflate = ((ViewStub) this$0.f101841a.findViewById(n80.c.related_filters_carousel_stub)).inflate();
                    Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.feature.pin.closeup.filters.view.RelatedPinsFiltersCarouselView");
                    RelatedPinsFiltersCarouselView relatedPinsFiltersCarouselView = (RelatedPinsFiltersCarouselView) inflate;
                    bs1.c.X0(relatedPinsFiltersCarouselView);
                    m60.w wVar = m60.u.f85943a;
                    Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
                    p01.p pVar = new p01.p(pinId, jVar, filterObjects, uid, wVar, new yk1.a(relatedPinsFiltersCarouselView.getResources(), relatedPinsFiltersCarouselView.getContext().getTheme()), presenterPinalytics, this$0.f101846f);
                    this$0.f101847g.d(relatedPinsFiltersCarouselView, pVar);
                    this$0.f101853m = pVar;
                    this$0.f101852l = relatedPinsFiltersCarouselView;
                    q01.k listener = new q01.k(this$0, i13);
                    PinCloseupFragment pinCloseupFragment = (PinCloseupFragment) this$0.f101843c;
                    pinCloseupFragment.getClass();
                    Intrinsics.checkNotNullParameter(listener, "listener");
                    pinCloseupFragment.N1.add(listener);
                    this$0.f101844d.addScrollListener(listener);
                    return;
                }
                return;
            case 6:
                EditMaskImageView this$02 = (EditMaskImageView) this.f105619b;
                ByteBuffer buffer = (ByteBuffer) this.f105620c;
                x62.k maskDrawable = (x62.k) this.f105621d;
                x62.f action = (x62.f) this.f105622e;
                Function1 onPush = (Function1) this.f105623f;
                ql2.g gVar2 = EditMaskImageView.f51946q;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(buffer, "$buffer");
                Intrinsics.checkNotNullParameter(maskDrawable, "$maskDrawable");
                Intrinsics.checkNotNullParameter(action, "$action");
                Intrinsics.checkNotNullParameter(onPush, "$onPush");
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        buffer.clear();
                        maskDrawable.f133985e.copyPixelsToBuffer(buffer);
                        gZIPOutputStream.write(buffer.array());
                        Unit unit4 = Unit.f80348a;
                        dl2.b.J(gZIPOutputStream, null);
                        m13 = byteArrayOutputStream.toByteArray();
                    } finally {
                    }
                } catch (Throwable th6) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    m13 = ue.c.m(th6);
                }
                if (!(m13 instanceof xk2.r)) {
                    byte[] bArr = (byte[]) m13;
                    x62.g gVar3 = (x62.g) this$02.f51956j.peek();
                    x62.f fVar = x62.f.INVERT_MASK;
                    LinkedList linkedList = this$02.f51956j;
                    if (action == fVar) {
                        if ((gVar3 != null ? gVar3.f133971c : null) == fVar) {
                            linkedList.poll();
                            this$02.post(new x62.b(this$02, 1));
                            return;
                        }
                    }
                    Intrinsics.f(bArr);
                    x62.g gVar4 = new x62.g(bArr, this$02.f51951e, action);
                    linkedList.push(gVar4);
                    this$02.f51957k.clear();
                    this$02.post(new x62.d(onPush, gVar4, 1));
                    this$02.post(new x62.b(this$02, 1));
                    return;
                }
                return;
            default:
                zi2.c cVar5 = (zi2.c) this.f105619b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f105620c;
                AtomicReference atomicReference = (AtomicReference) this.f105621d;
                AtomicInteger atomicInteger = (AtomicInteger) this.f105622e;
                zi2.c cVar6 = (zi2.c) this.f105623f;
                synchronized (cVar5.f142041d) {
                    try {
                        Boolean bool = cVar5.f142038a;
                        z13 = bool != null && bool.booleanValue();
                    } finally {
                    }
                }
                if (!z13) {
                    atomicBoolean.set(true);
                    synchronized (cVar5.f142041d) {
                        th3 = cVar5.f142039b;
                    }
                    if (th3 != null) {
                        while (!atomicReference.compareAndSet(null, th3) && atomicReference.get() == null) {
                        }
                    }
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    if (atomicBoolean.get()) {
                        cVar6.a((Throwable) atomicReference.get());
                        return;
                    } else {
                        cVar6.d();
                        return;
                    }
                }
                return;
        }
    }
}
