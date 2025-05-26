package org.chromium.net;

import J.N;
import am2.c0;
import am2.c1;
import am2.v0;
import am2.w0;
import am2.x0;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RemoteViews;
import com.google.android.gms.ads.RequestConfiguration;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.xrenderer.RustBridge$Effect;
import dm2.b1;
import f72.a0;
import h32.a4;
import io.embrace.android.embracesdk.spans.ErrorCode;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.t0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import ot1.b0;
import ot1.i0;
import pc.d0;
import pd2.q0;
import pn2.h0;
import pn2.w1;
import q8.k0;
import r72.r1;
import r72.s1;
import rb2.r;
import xk2.e0;

/* loaded from: classes4.dex */
public class y implements p62.b, p62.c, si2.c, si2.e, ti2.d, x0, i01.e, q8.u, qd.d, Callback, r3.h, yb0.h, nf2.l, sp2.h, r, tm0.c, hl1.a, j01.c, ka.a, d0, re1.c {
    public static final od2.a I(String str) {
        byte[] bytes = RustBridge$Effect.f52859a.colorEffectByName(str);
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        ef2.a aVar = ff2.b.f62108f;
        Intrinsics.f(wrap);
        ff2.b table = ef2.a.g(wrap);
        Intrinsics.checkNotNullParameter(table, "table");
        return new od2.a(table.h(), table.j(), ig1.b.b1(table.i()), bp1.h.j(table.g()));
    }

    public static final od2.b J(String str) {
        byte[] bytes = RustBridge$Effect.f52859a.distortionEffectByName(str);
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        ef2.a aVar = ff2.b.f62108f;
        Intrinsics.f(wrap);
        ff2.b table = ef2.a.g(wrap);
        Intrinsics.checkNotNullParameter(table, "table");
        return new od2.b(table.h(), table.j(), ig1.b.b1(table.i()), bp1.h.j(table.g()));
    }

    public static final nd2.b K(String str) {
        byte[] bytes = RustBridge$Effect.f52859a.filterByName(str);
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        ByteBuffer _bb = ByteBuffer.wrap(bytes);
        ef2.a aVar = ff2.a.f62107f;
        Intrinsics.f(_bb);
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        ff2.a table = new ff2.a();
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        Intrinsics.checkNotNullParameter(table, "obj");
        _bb.order(ByteOrder.LITTLE_ENDIAN);
        int position = _bb.position() + _bb.getInt(_bb.position());
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        table.c(position, _bb);
        Intrinsics.checkNotNullParameter(table, "table");
        int b13 = table.b(4);
        if (b13 == 0) {
            throw new AssertionError("No value for (required) field name");
        }
        String d2 = table.d(b13 + table.f87566a);
        int b14 = table.b(6);
        IntRange q13 = ql2.s.q(0, b14 != 0 ? table.f(b14) : 0);
        ArrayList arrayList = new ArrayList(g0.q(q13, 10));
        ql2.k it = q13.iterator();
        while (it.f104109c) {
            int b15 = it.b();
            int b16 = table.b(6);
            if (b16 == 0) {
                throw new IndexOutOfBoundsException(a.a.e("Index out of range: ", b15, ", vector shaders is empty"));
            }
            arrayList.add(table.d((b15 * 4) + table.e(b16)));
        }
        int b17 = table.b(8);
        if (b17 == 0) {
            throw new AssertionError("No value for (required) field script");
        }
        String d13 = table.d(b17 + table.f87566a);
        ef2.b obj = new ef2.b();
        Intrinsics.checkNotNullParameter(obj, "obj");
        int b18 = table.b(10);
        if (b18 == 0) {
            throw new AssertionError("No value for (required) field settings");
        }
        int a13 = table.a(b18 + table.f87566a);
        ByteBuffer _bb2 = table.f87567b;
        Intrinsics.checkNotNullExpressionValue(_bb2, "bb");
        Intrinsics.checkNotNullParameter(_bb2, "_bb");
        Intrinsics.checkNotNullParameter(_bb2, "_bb");
        obj.c(a13, _bb2);
        q0 b19 = ig1.b.b1(obj);
        ef2.b obj2 = new ef2.b();
        Intrinsics.checkNotNullParameter(obj2, "obj");
        int b23 = table.b(12);
        if (b23 == 0) {
            throw new AssertionError("No value for (required) field assets");
        }
        int a14 = table.a(b23 + table.f87566a);
        ByteBuffer _bb3 = table.f87567b;
        Intrinsics.checkNotNullExpressionValue(_bb3, "bb");
        Intrinsics.checkNotNullParameter(_bb3, "_bb");
        Intrinsics.checkNotNullParameter(_bb3, "_bb");
        obj2.c(a14, _bb3);
        return new nd2.b(d2, arrayList, d13, b19, bp1.h.j(obj2));
    }

    public static final od2.c L(String str) {
        byte[] bytes = RustBridge$Effect.f52859a.kernelEffectByName(str);
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        ByteBuffer wrap = ByteBuffer.wrap(bytes);
        ef2.a aVar = ff2.b.f62108f;
        Intrinsics.f(wrap);
        ff2.b table = ef2.a.g(wrap);
        Intrinsics.checkNotNullParameter(table, "table");
        return new od2.c(table.h(), table.j(), ig1.b.b1(table.i()), bp1.h.j(table.g()));
    }

    public static bp1.g M(Object user) {
        Intrinsics.checkNotNullParameter(user, "user");
        if (user instanceof z40.d0) {
            return new bp1.g(new bp1.d((z40.d0) user));
        }
        if (user instanceof wy0) {
            return new bp1.g(new bp1.e((wy0) user));
        }
        throw new IllegalArgumentException(a.a.i("User type not allowed ", user));
    }

    public static yl2.g N(yl2.c functionClass, boolean z13) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(functionClass, "functionClass");
        List list = functionClass.f139371k;
        yl2.g gVar = new yl2.g(functionClass, null, am2.c.DECLARATION, z13);
        dm2.d t03 = functionClass.t0();
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((c1) obj).r() != w1.IN_VARIANCE) {
                break;
            }
            arrayList.add(obj);
        }
        t0 M0 = CollectionsKt.M0(arrayList);
        ArrayList arrayList2 = new ArrayList(g0.q(M0, 10));
        Iterator it = M0.iterator();
        while (true) {
            q5.x0 x0Var = (q5.x0) it;
            if (!x0Var.hasNext()) {
                kotlin.collections.q0 q0Var2 = q0Var;
                gVar.y0(null, t03, q0Var2, q0Var2, arrayList2, ((c1) CollectionsKt.b0(list)).j(), c0.ABSTRACT, am2.s.f15577e);
                gVar.f55585x = true;
                return gVar;
            }
            IndexedValue indexedValue = (IndexedValue) x0Var.next();
            int i13 = indexedValue.f80349a;
            c1 c1Var = (c1) indexedValue.f80350b;
            String b13 = c1Var.getName().b();
            Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
            if (Intrinsics.d(b13, RequestConfiguration.MAX_AD_CONTENT_RATING_T)) {
                lowerCase = "instance";
            } else if (Intrinsics.d(b13, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = b13.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            bm2.g gVar2 = bm2.h.f23540a;
            ym2.g e13 = ym2.g.e(lowerCase);
            Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
            h0 j13 = c1Var.j();
            Intrinsics.checkNotNullExpressionValue(j13, "getDefaultType(...)");
            v0 NO_SOURCE = w0.f15602a;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            kotlin.collections.q0 q0Var3 = q0Var;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new b1(gVar, null, i13, gVar2, e13, j13, false, false, false, null, NO_SOURCE));
            arrayList2 = arrayList3;
            q0Var = q0Var3;
        }
    }

    public static ae2.d O(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        nd2.a block = new nd2.a(bitmap, 6);
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter("", "tag");
        Intrinsics.checkNotNullParameter(block, "block");
        return (ae2.d) block.invoke();
    }

    public static y P() {
        return new y();
    }

    public static xl2.g Q() {
        return (xl2.g) xl2.g.f135268f.getValue();
    }

    public static nf2.g R() {
        nf2.g a13 = nf2.f.f90499e.a();
        if (a13 != null) {
            return a13;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public static PendingIntent S(Context context, Class widgetClass, Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(widgetClass, "widgetClass");
        Intent intent = new Intent(context, (Class<?>) widgetClass);
        intent.setAction("ANDROID_WIDGET_CLICK");
        if (str != null && Build.VERSION.SDK_INT >= 29) {
            intent.setIdentifier(str);
        }
        intent.putExtras(bundle);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public static boolean T() {
        return zo1.b.f142327c;
    }

    public static r1 U(a0 from) {
        Intrinsics.checkNotNullParameter(from, "from");
        String value = from.f61222a;
        int i13 = s1.f106649a;
        Intrinsics.checkNotNullParameter(value, "value");
        return new r1(value, from.f61223b, from.f61224c, from.f61225d, from.f61226e, from.f61227f, from.f61228g, from.f61229h, from.f61230i, from.f61231j);
    }

    public static ot1.g0 X(ot1.w bitReader, i0 multiBitReader, ot1.d0 golombCodeReader) {
        Intrinsics.checkNotNullParameter(bitReader, "bitReader");
        Intrinsics.checkNotNullParameter(multiBitReader, "multiBitReader");
        Intrinsics.checkNotNullParameter(golombCodeReader, "golombCodeReader");
        int b13 = ((int) golombCodeReader.b()) + 1;
        int b14 = (int) multiBitReader.b(4);
        int b15 = (int) multiBitReader.b(4);
        ArrayList arrayList = new ArrayList(b13);
        for (int i13 = 0; i13 < b13; i13++) {
            long b16 = golombCodeReader.b() + 1;
            xk2.d0 d0Var = e0.f135207b;
            arrayList.add(new b0(b16, golombCodeReader.b() + 1, bitReader.a() != 0));
        }
        return new ot1.g0(b14, b15, arrayList, ((int) multiBitReader.b(5)) + 1, ((int) multiBitReader.b(5)) + 1, ((int) multiBitReader.b(5)) + 1, (int) multiBitReader.b(5));
    }

    public static void Y() {
        zo1.b.f142327c = false;
    }

    public static void a0(Context context, Class widgetClass, AppWidgetManager appWidgetManager, int i13) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(widgetClass, "widgetClass");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), xc2.f.layout_widget_logged_out);
        Iterator it = f0.j(Integer.valueOf(xc2.e.widget_log_in_button), Integer.valueOf(xc2.e.widget_error_root)).iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            int i14 = xc2.c.f134550d;
            Bundle a13 = n60.o.a("WIDGET_CLICK_TYPE", "WIDGET_LOG_IN_CLICK");
            Unit unit = Unit.f80348a;
            remoteViews.setOnClickPendingIntent(intValue, S(context, widgetClass, a13, null));
        }
        appWidgetManager.updateAppWidget(i13, remoteViews);
    }

    @Override // q8.u
    public void A() {
    }

    @Override // p62.c
    public void B(ke2.d item, int i13) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // re1.c
    public List C() {
        return kotlin.collections.q0.f80391a;
    }

    @Override // q8.u
    public k0 D(int i13, int i14) {
        return new q8.r();
    }

    @Override // p62.c
    public void E(ke2.d item, Integer num) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // yb0.h
    public void G6() {
    }

    @Override // si2.c
    public si2.c H(si2.g gVar) {
        return this;
    }

    @Override // yb0.h
    public void H0(boolean z13) {
    }

    public void V() {
        N.MJdorYDE();
    }

    public void W() {
        N.M6C2IQIc();
    }

    public void Z(View view, int i13, int i14) {
    }

    @Override // nf2.l
    public boolean addSpanAttribute(String spanId, String key, String value) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return false;
    }

    @Override // nf2.l
    public boolean addSpanEvent(String spanId, String name, Long l13, Map map) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        Intrinsics.checkNotNullParameter(name, "name");
        return false;
    }

    @Override // qd.d
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // si2.e
    public si2.d build() {
        return si2.a.f113007a;
    }

    @Override // r3.h
    public Object c(r3.i iVar) {
        return iVar.f106070a.invoke();
    }

    @Override // p62.b
    public void d(Integer num) {
    }

    @Override // i01.e
    public String e() {
        return null;
    }

    @Override // i01.e
    public String f() {
        return null;
    }

    @Override // qd.d
    public Bitmap g(int i13, int i14, Bitmap.Config config) {
        return Bitmap.createBitmap(i13, i14, config);
    }

    @Override // qd.d
    public Bitmap h(int i13, int i14, Bitmap.Config config) {
        return Bitmap.createBitmap(i13, i14, config);
    }

    @Override // p62.b
    public void i(int i13) {
    }

    @Override // q8.u
    public void j(q8.e0 e0Var) {
    }

    @Override // j01.c
    public u01.r k(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (pin.M4().booleanValue() || hf0.b.n()) {
            return null;
        }
        return new u01.g(pin);
    }

    @Override // rb2.r
    public void l(oo1.a conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
    }

    @Override // si2.c
    public void n() {
    }

    @Override // si2.c
    public si2.c o(ri2.e eVar, Object obj) {
        return this;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException e13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        response.close();
    }

    @Override // qd.d
    public void p(int i13) {
    }

    @Override // qd.d
    public void q() {
    }

    @Override // si2.c
    public si2.c r(String str) {
        return this;
    }

    @Override // nf2.l
    public boolean recordCompletedSpan(String name, long j13, long j14, ErrorCode errorCode, String str, Map map, List list) {
        Intrinsics.checkNotNullParameter(name, "name");
        return false;
    }

    @Override // nf2.l
    public Object recordSpan(String name, String str, Map map, List list, Function0 code) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(code, "code");
        return code.invoke();
    }

    @Override // sp2.h
    public void s(Level level, String str, Throwable th3) {
        PrintStream printStream = System.out;
        printStream.println("[" + level + "] " + str);
        th3.printStackTrace(printStream);
    }

    @Override // nf2.l
    public String startSpan(String name, String str, Long l13) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // nf2.l
    public boolean stopSpan(String spanId, ErrorCode errorCode, Long l13) {
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        return false;
    }

    @Override // si2.c
    public si2.c t(String str) {
        return this;
    }

    @Override // yb0.h
    public void t2() {
    }

    @Override // sp2.h
    public void u(String str, Level level) {
        System.out.println("[" + level + "] " + str);
    }

    @Override // tm0.c
    public om0.n v(pm0.l collaborators) {
        lk0.b n03;
        Intrinsics.checkNotNullParameter(collaborators, "collaborators");
        if (collaborators instanceof pm0.g0) {
            n03 = null;
        } else {
            if (!(collaborators instanceof pm0.a0)) {
                throw new NoWhenBranchMatchedException();
            }
            pm0.a0 a0Var = (pm0.a0) collaborators;
            pm0.r rVar = a0Var.f100633a;
            n03 = gi2.b.n0(rVar.f100690a, a0Var.f100634b, a0Var.f100635c, false, rVar.f100691b);
        }
        om0.m mVar = om0.m.f96537a;
        if (n03 == null) {
            return mVar;
        }
        List list = n03.f83642b;
        Intrinsics.checkNotNullExpressionValue(list, "<get-collaborators>(...)");
        if (!(!list.isEmpty())) {
            return mVar;
        }
        Intrinsics.checkNotNullExpressionValue(list, "<get-collaborators>(...)");
        List<lk0.a> list2 = list;
        ArrayList arrayList = new ArrayList(g0.q(list2, 10));
        for (lk0.a aVar : list2) {
            arrayList.add(new sl1.e(aVar.f83638c, aVar.f83636a, aVar.f83639d, aVar.f83640e));
        }
        return new om0.l(new sl1.i(arrayList, Math.max(n03.f83643c, list.size()), sl1.h.MD, n03.f83641a, 0, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM));
    }

    @Override // i01.e
    public ArrayList w() {
        return null;
    }

    @Override // si2.c
    public si2.c x(long j13, TimeUnit timeUnit) {
        return this;
    }

    @Override // i01.e
    public int y() {
        return 0;
    }

    @Override // i01.e
    public String z() {
        String obj = a4.FEED_HOME.toString();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = obj.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // ti2.d
    /* renamed from: build */
    public ti2.c mo74build() {
        return ti2.a.f117760a;
    }
}
