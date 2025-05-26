package l0;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Base64;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.j0;
import androidx.camera.view.PreviewView;
import androidx.transition.Transition;
import c0.o1;
import c0.p1;
import c0.z;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.to;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.vq;
import com.pinterest.feature.ideaPinCreation.closeup.view.f0;
import com.pinterest.feature.ideaPinCreation.closeup.view.o0;
import com.pinterest.feature.ideaPinCreation.closeup.view.s0;
import com.pinterest.feature.ideaPinCreation.closeup.view.t1;
import g8.a0;
import g8.i0;
import ja.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kb.w0;
import kh2.m0;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import uj2.e0;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements r4.j, o1, d7.r, d7.i, j5.c, sg.a, rg.f, SuccessContinuation, t1, uj2.e, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81204a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81205b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81206c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f81207d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i13) {
        this.f81204a = i13;
        this.f81207d = obj;
        this.f81205b = obj2;
        this.f81206c = obj3;
    }

    @Override // r4.j
    public final Object C(r4.i completer) {
        int i13 = this.f81204a;
        Object obj = this.f81206c;
        Object obj2 = this.f81205b;
        Object obj3 = this.f81207d;
        switch (i13) {
            case 0:
                i iVar = (i) obj3;
                iVar.getClass();
                iVar.f(new w.b(iVar, (z) obj2, (Map) obj, completer, 4), new v.h(3));
                return "Init GlRenderer";
            case 1:
                m0.e eVar = (m0.e) obj3;
                eVar.getClass();
                eVar.f(new w.b(eVar, (z) obj2, (Map) obj, completer, 5), new v.h(4));
                return "Init GlRenderer";
            case 2:
                c0.r rVar = (c0.r) obj2;
                ((b1.d) obj3).getClass();
                b1.c cVar = new b1.c(completer, rVar);
                ((List) obj).add(cVar);
                ((h0) rVar).l(l3.c.s(), cVar);
                return "waitForCaptureResult";
            default:
                String str = (String) obj2;
                Intrinsics.checkNotNullParameter(completer, "completer");
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                completer.a(new u0.n(atomicBoolean, 28), kb.o.INSTANCE);
                ((Executor) obj3).execute(new y(atomicBoolean, completer, (Function0) obj, 1));
                return str;
        }
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.t1
    public final void a() {
        Bitmap createBitmap;
        s0 this$0 = (s0) this.f81207d;
        View stickerRepView = (View) this.f81205b;
        o0 bitmapListener = (o0) this.f81206c;
        int i13 = s0.f46298x;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(stickerRepView, "$stickerRepView");
        Intrinsics.checkNotNullParameter(bitmapListener, "$bitmapListener");
        stickerRepView.measure(View.MeasureSpec.makeMeasureSpec(ml2.c.c(this$0.f46302d), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        stickerRepView.layout(0, 0, stickerRepView.getMeasuredWidth(), stickerRepView.getMeasuredHeight());
        if (stickerRepView.getMeasuredWidth() <= 0 || stickerRepView.getMeasuredHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        } else {
            createBitmap = Bitmap.createBitmap(stickerRepView.getMeasuredWidth(), stickerRepView.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            stickerRepView.draw(new Canvas(createBitmap));
        }
        this$0.f46315q = this$0.f46306h.width() / createBitmap.getWidth();
        bitmapListener.e(createBitmap);
    }

    @Override // d7.i
    public final void accept(Object obj) {
        int i13 = this.f81204a;
        Object obj2 = this.f81206c;
        Object obj3 = this.f81205b;
        g8.h0 h0Var = (g8.h0) this.f81207d;
        switch (i13) {
            case 7:
                ((i0) obj).e(h0Var.f64276a, h0Var.f64277b, (g8.v) obj3, (a0) obj2);
                break;
            default:
                ((i0) obj).p(h0Var.f64276a, (g8.e0) obj3, (a0) obj2);
                break;
        }
    }

    @Override // rg.f
    public final Object apply(Object obj) {
        long insert;
        rg.g gVar = (rg.g) this.f81207d;
        lg.a aVar = (lg.a) this.f81205b;
        lg.b bVar = (lg.b) this.f81206c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        long simpleQueryForLong = gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
        rg.b bVar2 = gVar.f107945c;
        if (simpleQueryForLong >= bVar2.f107935a) {
            gVar.c(new g0.e(aVar.f83172a, og.a.CACHE_FULL, 1L, 1));
            return -1L;
        }
        StringBuilder sb3 = new StringBuilder("backend_name = ? and priority = ?");
        String str = bVar.f83178a;
        ig.c cVar = bVar.f83180c;
        ArrayList arrayList = new ArrayList(Arrays.asList(str, String.valueOf(ug.a.a(cVar))));
        byte[] bArr = bVar.f83179b;
        if (bArr != null) {
            sb3.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb3.append(" and extras is null");
        }
        Long l13 = (Long) rg.g.g(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb3.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new a.e(28));
        if (l13 != null) {
            insert = l13.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", bVar.f83178a);
            contentValues.put("priority", Integer.valueOf(ug.a.a(cVar)));
            contentValues.put("next_request_ms", (Integer) 0);
            if (bArr != null) {
                contentValues.put("extras", Base64.encodeToString(bArr, 0));
            }
            insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        byte[] bArr2 = aVar.f83174c.f83188b;
        int length = bArr2.length;
        int i13 = bVar2.f107939e;
        boolean z13 = length <= i13;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(insert));
        contentValues2.put("transport_name", aVar.f83172a);
        contentValues2.put("timestamp_ms", Long.valueOf(aVar.f83175d));
        contentValues2.put("uptime_ms", Long.valueOf(aVar.f83176e));
        contentValues2.put("payload_encoding", aVar.f83174c.f83187a.f72240a);
        contentValues2.put("code", aVar.f83173b);
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z13));
        contentValues2.put("payload", z13 ? bArr2 : new byte[0]);
        long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z13) {
            int ceil = (int) Math.ceil(bArr2.length / i13);
            for (int i14 = 1; i14 <= ceil; i14++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i14 - 1) * i13, Math.min(i14 * i13, bArr2.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert2));
                contentValues3.put("sequence_num", Integer.valueOf(i14));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(aVar.f83177f).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert2));
            contentValues4.put("name", (String) entry.getKey());
            contentValues4.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(insert2);
    }

    public final void b() {
        b1.i iVar = (b1.i) this.f81207d;
        b1.d dVar = (b1.d) this.f81205b;
        j0 j0Var = (j0) this.f81206c;
        AtomicReference atomicReference = iVar.f20809a.f17045g;
        while (true) {
            if (atomicReference.compareAndSet(dVar, null)) {
                dVar.b(b1.m.IDLE);
                break;
            } else if (atomicReference.get() != dVar) {
                break;
            }
        }
        g0.d dVar2 = dVar.f20795e;
        if (dVar2 != null) {
            dVar2.cancel(false);
            dVar.f20795e = null;
        }
        j0Var.j().f(dVar);
    }

    @Override // sg.a
    public final void c() {
        pg.a aVar = (pg.a) this.f81207d;
        lg.b bVar = (lg.b) this.f81205b;
        lg.a aVar2 = (lg.a) this.f81206c;
        rg.g gVar = (rg.g) aVar.f100039d;
        gVar.getClass();
        ig.c cVar = bVar.f83180c;
        String str = aVar2.f83172a;
        String concat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, "Storing event with priority=" + cVar + ", name=" + str + " for destination " + bVar.f83178a);
        }
        ((Long) gVar.c(new d(gVar, aVar2, bVar, 12))).getClass();
        ((qg.c) aVar.f100036a).a(bVar);
    }

    @Override // uj2.e0
    public final void g(kk2.a emitter) {
        bw0.q observer = (bw0.q) this.f81207d;
        bw0.o this$0 = (bw0.o) this.f81205b;
        String uniqueWorkName = (String) this.f81206c;
        Intrinsics.checkNotNullParameter(observer, "$observer");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(uniqueWorkName, "$uniqueWorkName");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        observer.getClass();
        Intrinsics.checkNotNullParameter(emitter, "<set-?>");
        observer.f24016b = emitter;
        ((w0) this$0.f24013c.getValue()).g(uniqueWorkName).f(observer);
    }

    @Override // c0.o1
    public final void i(c0.k kVar) {
        b1.n nVar;
        b1.i iVar = (b1.i) this.f81207d;
        j0 j0Var = (j0) this.f81205b;
        p1 p1Var = (p1) this.f81206c;
        iVar.getClass();
        m0.p("PreviewView", "Preview transformation info updated. " + kVar);
        boolean z13 = j0Var.g().d() == 0;
        PreviewView previewView = iVar.f20809a;
        b1.f fVar = previewView.f17042d;
        Size size = p1Var.f24300b;
        fVar.getClass();
        m0.p("PreviewTransform", "Transformation info set: " + kVar + " " + size + " " + z13);
        fVar.f20800b = kVar.f24271a;
        fVar.f20801c = kVar.f24272b;
        int i13 = kVar.f24273c;
        fVar.f20803e = i13;
        fVar.f20799a = size;
        fVar.f20804f = z13;
        fVar.f20805g = kVar.f24274d;
        fVar.f20802d = kVar.f24275e;
        if (i13 == -1 || ((nVar = previewView.f17040b) != null && (nVar instanceof b1.t))) {
            previewView.f17043e = true;
        } else {
            previewView.f17043e = false;
        }
        previewView.b();
    }

    @Override // d7.r
    /* renamed from: invoke */
    public final void mo0invoke(Object obj) {
        int i13 = this.f81204a;
        Object obj2 = this.f81205b;
        n7.b bVar = (n7.b) this.f81207d;
        switch (i13) {
            case 5:
                ((n7.c) obj).t(bVar, (g8.v) obj2, (a0) this.f81206c);
                break;
            default:
                ((n7.c) obj).A(bVar, (androidx.media3.common.b) obj2);
                break;
        }
    }

    @Override // uj2.e
    public final void n(fk2.f emitter) {
        vn0 mediaList = (vn0) this.f81207d;
        to toVar = (to) this.f81205b;
        f0 pageView = (f0) this.f81206c;
        Intrinsics.checkNotNullParameter(mediaList, "$mediaList");
        Intrinsics.checkNotNullParameter(pageView, "$pageView");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        bo0 k13 = mediaList.k();
        long startTimeMs = k13.getStartTimeMs();
        if (toVar != null) {
            k13 = mediaList.n(toVar.c());
            startTimeMs = toVar.d();
        }
        k01 videoItem = k13.getVideoItem();
        Unit unit = null;
        if (videoItem != null) {
            Matrix displayMatrix = k13.getDisplayMatrix();
            uv0.e listener = new uv0.e(emitter, 0);
            long startTimeMs2 = mediaList.getStartTimeMs() + startTimeMs;
            boolean isFromFrontFacingCamera = k13.getIsFromFrontFacingCamera();
            pageView.getClass();
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            Intrinsics.checkNotNullParameter(listener, "listener");
            pageView.D().f52564p = listener;
            int intValue = ((Number) videoItem.f39240c.f135234a).intValue();
            int intValue2 = ((Number) videoItem.f39240c.f135235b).intValue();
            RectF rectF = pageView.P;
            if (rectF == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float width = rectF.width();
            float f13 = (intValue2 * width) / intValue;
            Matrix t03 = pageView.t0(displayMatrix, true);
            RectF rectF2 = pageView.P;
            if (rectF2 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float width2 = rectF2.width();
            RectF rectF3 = pageView.P;
            if (rectF3 == null) {
                Intrinsics.r("canvasRect");
                throw null;
            }
            float height = rectF3.height();
            Matrix f03 = ig1.b.f0(width2, height, intValue, intValue2);
            if (t03 == null) {
                t03 = ig1.b.Q(width2, height, intValue, intValue2, f03);
            }
            vq p03 = ig1.b.p0(intValue, intValue2, f03, t03);
            Matrix C = f0.C(width, f13, p03);
            int c13 = ml2.c.c(p03.o());
            int c14 = ml2.c.c(p03.i());
            ag1.b bVar = pageView.f46161g;
            if (bVar == null) {
                Intrinsics.r("dataManager");
                throw null;
            }
            Bitmap Z = u2.Z(bVar, videoItem.e(), startTimeMs2, c13, c14, isFromFrontFacingCamera ? ig1.b.X() : null);
            if (Z != null) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(Z, ml2.c.c((float) Math.ceil(width)), ml2.c.c((float) Math.ceil(f13)), false);
                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                pageView.D().setImageBitmap(createScaledBitmap);
            }
            pageView.D().setScaleType(ImageView.ScaleType.MATRIX);
            pageView.D().setImageMatrix(C);
            bs1.c.U1(pageView.D());
            unit = Unit.f80348a;
        }
        if (unit == null) {
            emitter.d(new RuntimeException("Story Pin mediaList missing first videoItem"));
        }
    }

    @Override // j5.c
    public final void onCancel() {
        Runnable runnable = (Runnable) this.f81207d;
        Transition transition = (Transition) this.f81205b;
        Runnable runnable2 = (Runnable) this.f81206c;
        if (runnable != null) {
            runnable.run();
        } else {
            transition.cancel();
            runnable2.run();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f81207d;
        String str = (String) this.f81205b;
        com.google.firebase.messaging.r rVar = (com.google.firebase.messaging.r) this.f81206c;
        String str2 = (String) obj;
        com.google.firebase.messaging.s d2 = FirebaseMessaging.d(firebaseMessaging.f33731b);
        nl.g gVar = firebaseMessaging.f33730a;
        gVar.b();
        String d13 = "[DEFAULT]".equals(gVar.f91218b) ? "" : gVar.d();
        String a13 = firebaseMessaging.f33737h.a();
        synchronized (d2) {
            String a14 = com.google.firebase.messaging.r.a(System.currentTimeMillis(), str2, a13);
            if (a14 != null) {
                SharedPreferences.Editor edit = d2.f33811a.edit();
                edit.putString(d13 + "|T|" + str + "|*", a14);
                edit.commit();
            }
        }
        if (rVar == null || !str2.equals(rVar.f33808a)) {
            nl.g gVar2 = firebaseMessaging.f33730a;
            gVar2.b();
            if ("[DEFAULT]".equals(gVar2.f91218b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb3 = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.b();
                    sb3.append(gVar2.f91218b);
                    Log.d("FirebaseMessaging", sb3.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new com.google.firebase.messaging.h(firebaseMessaging.f33731b).c(intent);
            }
        }
        return Tasks.forResult(str2);
    }
}
