package bk;

import J.N;
import ac2.b1;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.datastore.core.CorruptionException;
import androidx.lifecycle.a1;
import androidx.lifecycle.z0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import com.pinterest.video.core.view.PinterestVideoView;
import d7.n0;
import h32.d4;
import h32.i3;
import i2.f2;
import i2.g2;
import i2.y2;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kb.i0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import l82.g0;
import l82.h0;
import lb.l0;
import nx.e1;
import pc.p0;
import pc.r0;
import pk.c1;
import pk.v2;
import s2.e0;
import s2.f0;

/* loaded from: classes.dex */
public class f implements o7.w, h8.q, ha.d, ka.a, u6.b, ar0.f, ar0.j, a6.a, ak2.g, com.google.crypto.tink.shaded.protobuf.i, g4.p, g4.t, ml1.d, kotlin.coroutines.h, k8.s, i0, l9.j, at1.g, at1.h {
    public f(Context context) {
        context.getApplicationContext();
    }

    public static Typeface A(String str, g4.l lVar, int i13) {
        Typeface create;
        if (g4.j.a(i13, 0) && Intrinsics.d(lVar, g4.l.f63469d) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.f63474a, g4.j.a(i13, 1));
        return create;
    }

    public static long E() {
        return System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void F(Activity activity, androidx.lifecycle.q event) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(event, "event");
        if (activity instanceof androidx.lifecycle.z) {
            androidx.lifecycle.s lifecycle = ((androidx.lifecycle.z) activity).getLifecycle();
            if (lifecycle instanceof androidx.lifecycle.b0) {
                ((androidx.lifecycle.b0) lifecycle).e(event);
            }
        }
    }

    public static void H(u50.s event, l82.e resultBuilder, h0 lens) {
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.a(event, resultBuilder);
    }

    public static void I(l82.e resultBuilder, h0 lens, u50.s... events) {
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(events, "$events");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        for (u50.s sVar : events) {
            lens.a(sVar, resultBuilder);
        }
    }

    public static final void K(DataInputStream dataInputStream) {
        short readShort = dataInputStream.readShort();
        if (readShort != -21521) {
            throw new IllegalStateException(a.a.d("Magic number doesn't match: ", readShort).toString());
        }
        short readShort2 = dataInputStream.readShort();
        if (readShort2 != 1) {
            throw new IllegalStateException(a.a.d("Unsupported version number: ", readShort2).toString());
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable L(byte b13, DataInputStream dataInputStream) {
        if (b13 == 0) {
            return null;
        }
        if (b13 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b13 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b13 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b13 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b13 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b13 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b13 == 7) {
            return dataInputStream.readUTF();
        }
        int i13 = 0;
        if (b13 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r03 = new Boolean[readInt];
            while (i13 < readInt) {
                r03[i13] = Boolean.valueOf(dataInputStream.readBoolean());
                i13++;
            }
            return r03;
        }
        if (b13 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r04 = new Byte[readInt2];
            while (i13 < readInt2) {
                r04[i13] = Byte.valueOf(dataInputStream.readByte());
                i13++;
            }
            return r04;
        }
        if (b13 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r05 = new Integer[readInt3];
            while (i13 < readInt3) {
                r05[i13] = Integer.valueOf(dataInputStream.readInt());
                i13++;
            }
            return r05;
        }
        if (b13 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r06 = new Long[readInt4];
            while (i13 < readInt4) {
                r06[i13] = Long.valueOf(dataInputStream.readLong());
                i13++;
            }
            return r06;
        }
        if (b13 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r07 = new Float[readInt5];
            while (i13 < readInt5) {
                r07[i13] = Float.valueOf(dataInputStream.readFloat());
                i13++;
            }
            return r07;
        }
        if (b13 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r08 = new Double[readInt6];
            while (i13 < readInt6) {
                r08[i13] = Double.valueOf(dataInputStream.readDouble());
                i13++;
            }
            return r08;
        }
        if (b13 != 14) {
            throw new IllegalStateException(a.a.d("Unsupported type ", b13));
        }
        int readInt7 = dataInputStream.readInt();
        ?? r13 = new String[readInt7];
        while (i13 < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (Intrinsics.d(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r13[i13] = readUTF;
            i13++;
        }
        return r13;
    }

    public static a1 M(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
        Intrinsics.g(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
        return (a1) findFragmentByTag;
    }

    public static AudioAttributes O(a7.f fVar, boolean z13) {
        return z13 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) fVar.a().f66449b;
    }

    public static s2.i P() {
        return (s2.i) s2.p.f110666a.a();
    }

    public static int R(boolean z13, boolean z14) {
        return z13 ? z14 ? wa2.s.f128901n0 : wa2.s.f128900m0 : wa2.s.f128899l0;
    }

    public static pa.c S(h1.b refHolder, SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(refHolder, "refHolder");
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        pa.c cVar = (pa.c) refHolder.f66449b;
        if (cVar != null) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            if (Intrinsics.d(cVar.f99351a, sqLiteDatabase)) {
                return cVar;
            }
        }
        pa.c cVar2 = new pa.c(sqLiteDatabase);
        refHolder.f66449b = cVar2;
        return cVar2;
    }

    public static void T(l82.e resultBuilder, h0 lens) {
        Intrinsics.checkNotNullParameter(resultBuilder, "<this>");
        Intrinsics.checkNotNullParameter(lens, "lens");
        Intrinsics.checkNotNullParameter(lens, "$lens");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        lens.b(resultBuilder);
    }

    public static void U(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            z0.Companion.getClass();
            Intrinsics.checkNotNullParameter(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new z0());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new a1(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static boolean V(i3 i3Var) {
        Long l13;
        Long l14 = i3Var.f67099g;
        return l14 != null && l14.longValue() == -1 && (l13 = i3Var.f67089a) != null && l13.longValue() == 0;
    }

    public static boolean W() {
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        return (f13 != null ? f13.Y3() : null) != null;
    }

    public static s2.i X(s2.i iVar) {
        if (iVar instanceof e0) {
            e0 e0Var = (e0) iVar;
            if (e0Var.f110632t == tb.f.G()) {
                e0Var.f110630r = null;
                return iVar;
            }
        }
        if (iVar instanceof f0) {
            f0 f0Var = (f0) iVar;
            if (f0Var.f110637i == tb.f.G()) {
                f0Var.f110636h = null;
                return iVar;
            }
        }
        s2.i h10 = s2.p.h(iVar, null, false);
        h10.j();
        return h10;
    }

    public static void Y(vy.m analyticsApi) {
        cc2.o oVar = cc2.o.f27540b;
        boolean z13 = oVar != null && oVar.e() >= 50;
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        cc2.o oVar2 = cc2.o.f27540b;
        if (oVar2 != null && z13) {
            analyticsApi.i(oVar2, new c72.o(oVar2, 27));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List Z(y2 y2Var, int i13, y2 y2Var2, boolean z13, boolean z14, boolean z15) {
        q0 q0Var;
        boolean D;
        int i14;
        int i15;
        int i16;
        int q13 = y2Var.q(i13);
        int i17 = i13 + q13;
        int f13 = y2Var.f(y2Var.f71377b, y2Var.p(i13));
        int f14 = y2Var.f(y2Var.f71377b, y2Var.p(i17));
        int i18 = f14 - f13;
        boolean z16 = i13 >= 0 && (y2Var.f71377b[(y2Var.p(i13) * 5) + 1] & 201326592) != 0;
        y2Var2.s(q13);
        y2Var2.t(i18, y2Var2.f71395t);
        if (y2Var.f71382g < i17) {
            y2Var.w(i17);
        }
        if (y2Var.f71386k < f14) {
            y2Var.x(f14, i17);
        }
        int[] iArr = y2Var2.f71377b;
        int i19 = y2Var2.f71395t;
        int i23 = i19 * 5;
        kotlin.collections.z.g(i23, i13 * 5, i17 * 5, y2Var.f71377b, iArr);
        Object[] objArr = y2Var2.f71378c;
        int i24 = y2Var2.f71384i;
        kotlin.collections.z.h(i24, f13, f14, y2Var.f71378c, objArr);
        int i25 = y2Var2.f71397v;
        iArr[i23 + 2] = i25;
        int i26 = i19 - i13;
        int i27 = i19 + q13;
        int f15 = i24 - y2Var2.f(iArr, i19);
        int i28 = y2Var2.f71388m;
        int i29 = y2Var2.f71387l;
        int length = objArr.length;
        boolean z17 = z16;
        int i33 = i28;
        int i34 = i19;
        while (i34 < i27) {
            if (i34 != i19) {
                int i35 = (i34 * 5) + 2;
                iArr[i35] = iArr[i35] + i26;
            }
            int i36 = i27;
            int f16 = y2Var2.f(iArr, i34) + f15;
            if (i33 < i34) {
                i15 = i19;
                i16 = 0;
            } else {
                i15 = i19;
                i16 = y2Var2.f71386k;
            }
            iArr[(i34 * 5) + 4] = y2.h(f16, i16, i29, length);
            if (i34 == i33) {
                i33++;
            }
            i34++;
            i19 = i15;
            i27 = i36;
        }
        int i37 = i19;
        int i38 = i27;
        y2Var2.f71388m = i33;
        int n13 = l0.n(y2Var.f71379d, i13, y2Var.n());
        int n14 = l0.n(y2Var.f71379d, i17, y2Var.n());
        if (n13 < n14) {
            ArrayList arrayList = y2Var.f71379d;
            ArrayList arrayList2 = new ArrayList(n14 - n13);
            for (int i39 = n13; i39 < n14; i39++) {
                i2.d dVar = (i2.d) arrayList.get(i39);
                dVar.f71087a += i26;
                arrayList2.add(dVar);
            }
            y2Var2.f71379d.addAll(l0.n(y2Var2.f71379d, y2Var2.f71395t, y2Var2.n()), arrayList2);
            arrayList.subList(n13, n14).clear();
            q0Var = arrayList2;
        } else {
            q0Var = q0.f80391a;
        }
        if (!q0Var.isEmpty()) {
            HashMap hashMap = y2Var.f71380e;
            HashMap hashMap2 = y2Var2.f71380e;
            if (hashMap != null && hashMap2 != null) {
                int size = q0Var.size();
                for (int i43 = 0; i43 < size; i43++) {
                }
            }
        }
        int i44 = y2Var2.f71397v;
        y2Var2.J(i25);
        int z18 = y2Var.z(y2Var.f71377b, i13);
        if (!z15) {
            i14 = 1;
            D = false;
        } else if (z13) {
            boolean z19 = z18 >= 0;
            if (z19) {
                y2Var.K();
                y2Var.a(z18 - y2Var.f71395t);
                y2Var.K();
            }
            y2Var.a(i13 - y2Var.f71395t);
            boolean C = y2Var.C();
            if (z19) {
                y2Var.G();
                y2Var.i();
                y2Var.G();
                y2Var.i();
            }
            D = C;
            i14 = 1;
        } else {
            D = y2Var.D(i13, q13);
            i14 = 1;
            y2Var.E(f13, i18, i13 - 1);
        }
        if (!(!D)) {
            i2.u.i("Unexpectedly removed anchors");
            throw null;
        }
        y2Var2.f71390o += l0.m(iArr, i37) ? i14 : l0.o(iArr, i37);
        if (z14) {
            y2Var2.f71395t = i38;
            y2Var2.f71384i = i24 + i18;
        }
        if (z17) {
            y2Var2.P(i25);
        }
        return q0Var;
    }

    public static Object a0(Function0 function0, Function1 function1) {
        s2.i e0Var;
        if (function1 == null) {
            return function0.invoke();
        }
        s2.i iVar = (s2.i) s2.p.f110666a.a();
        if (iVar instanceof e0) {
            e0 e0Var2 = (e0) iVar;
            if (e0Var2.f110632t == tb.f.G()) {
                Function1 function12 = e0Var2.f110630r;
                Function1 function13 = e0Var2.f110631s;
                try {
                    ((e0) iVar).f110630r = s2.p.l(function1, function12, true);
                    ((e0) iVar).f110631s = s2.p.b(null, function13);
                    return function0.invoke();
                } finally {
                    e0Var2.f110630r = function12;
                    e0Var2.f110631s = function13;
                }
            }
        }
        if (iVar == null || (iVar instanceof s2.c)) {
            e0Var = new e0(iVar instanceof s2.c ? (s2.c) iVar : null, function1, null, true, false);
        } else {
            if (function1 == null) {
                return function0.invoke();
            }
            e0Var = iVar.t(function1);
        }
        try {
            s2.i j13 = e0Var.j();
            try {
                return function0.invoke();
            } finally {
                s2.i.p(j13);
            }
        } finally {
            e0Var.c();
        }
    }

    public static r0 b0(Object obj) {
        return obj == null ? p0.f99597a : new pc.q0(obj);
    }

    public static void c0(s2.i iVar, s2.i iVar2, Function1 function1) {
        if (iVar != iVar2) {
            iVar2.getClass();
            s2.i.p(iVar);
            iVar2.c();
        } else if (iVar instanceof e0) {
            ((e0) iVar).f110630r = function1;
        } else if (iVar instanceof f0) {
            ((f0) iVar).f110636h = function1;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + iVar).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d0(wo2.k r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String[] r0 = tc.b.f117170h
            r1 = 34
            r7.p1(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L17:
            if (r3 >= r2) goto L40
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L26
            r5 = r0[r5]
            if (r5 != 0) goto L33
            goto L3d
        L26:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2d
            java.lang.String r5 = "\\u2028"
            goto L33
        L2d:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3d
            java.lang.String r5 = "\\u2029"
        L33:
            if (r4 >= r3) goto L38
            r7.I1(r4, r3, r8)
        L38:
            r7.l0(r5)
            int r4 = r3 + 1
        L3d:
            int r3 = r3 + 1
            goto L17
        L40:
            if (r4 >= r2) goto L45
            r7.I1(r4, r2, r8)
        L45:
            r7.p1(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.f.d0(wo2.k, java.lang.String):void");
    }

    public static byte[] e0(kb.l data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(data.f79019a.size());
                for (Map.Entry entry : data.f79019a.entrySet()) {
                    f0(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized".toString());
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dl2.b.J(dataOutputStream, null);
                Intrinsics.checkNotNullExpressionValue(byteArray, "{\n                ByteAr…          }\n            }");
                return byteArray;
            } finally {
            }
        } catch (IOException e13) {
            kb.b0.e().d(kb.m.f79020a, "Error in Data#toByteArray: ", e13);
            return new byte[0];
        }
    }

    public static final void f0(DataOutputStream dataOutputStream, String str, Object obj) {
        int i13;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + k0.f80436a.b(obj.getClass()).f());
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            kotlin.jvm.internal.l0 l0Var = k0.f80436a;
            rl2.d b13 = l0Var.b(cls);
            if (Intrinsics.d(b13, l0Var.b(Boolean[].class))) {
                i13 = 8;
            } else if (Intrinsics.d(b13, l0Var.b(Byte[].class))) {
                i13 = 9;
            } else if (Intrinsics.d(b13, l0Var.b(Integer[].class))) {
                i13 = 10;
            } else if (Intrinsics.d(b13, l0Var.b(Long[].class))) {
                i13 = 11;
            } else if (Intrinsics.d(b13, l0Var.b(Float[].class))) {
                i13 = 12;
            } else if (Intrinsics.d(b13, l0Var.b(Double[].class))) {
                i13 = 13;
            } else {
                if (!Intrinsics.d(b13, l0Var.b(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + l0Var.b(objArr.getClass()).e());
                }
                i13 = 14;
            }
            dataOutputStream.writeByte(i13);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i13 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i13 == 9) {
                    Byte b14 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b14 != null ? b14.byteValue() : (byte) 0);
                } else if (i13 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i13 == 11) {
                    Long l13 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l13 != null ? l13.longValue() : 0L);
                } else if (i13 == 12) {
                    Float f13 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f13 != null ? f13.floatValue() : 0.0f);
                } else if (i13 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i13 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static void g0(l82.e eVar, g0 transformation) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(transformation, "transformation");
        transformation.i(eVar);
    }

    public static final e1 m(nx.a aVar, String str) {
        d4 d4Var;
        h32.i0 generateLoggingContext = aVar.generateLoggingContext();
        if (generateLoggingContext == null || (d4Var = generateLoggingContext.f67081a) == null) {
            return null;
        }
        return new e1(generateLoggingContext.f67082b, d4Var, str, aVar.getUniqueScreenKey());
    }

    public static void q(y2 y2Var, List list, g2 g2Var) {
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                int c13 = y2Var.c((i2.d) list.get(i13));
                int H = y2Var.H(y2Var.f71377b, y2Var.p(c13));
                Object obj = H < y2Var.f(y2Var.f71377b, y2Var.p(c13 + 1)) ? y2Var.f71378c[y2Var.g(H)] : i2.n.f71185a;
                f2 f2Var = obj instanceof f2 ? (f2) obj : null;
                if (f2Var != null) {
                    f2Var.f71111b = g2Var;
                }
            }
        }
    }

    public static void s(String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        Trace.beginSection(tb.f.k0(label));
    }

    public static re2.g t(String str, int i13, re2.e eVar, wo2.j jVar) {
        eVar.f107694a = str;
        jVar.m0(i13);
        eVar.f107695b = jVar.a1(jVar.f130711b);
        eVar.f107696c = re2.d.I16;
        return eVar.a();
    }

    public static re2.g u(String str, int i13, re2.e eVar, wo2.j jVar) {
        eVar.f107694a = str;
        jVar.g0(i13);
        eVar.f107695b = jVar.a1(jVar.f130711b);
        eVar.f107696c = re2.d.I32;
        return eVar.a();
    }

    public static re2.g w(String str, String str2, re2.e eVar, wo2.j jVar) {
        eVar.f107694a = str;
        jVar.r0(str2);
        eVar.f107695b = jVar.a1(jVar.f130711b);
        eVar.f107696c = re2.d.STRING;
        return eVar.a();
    }

    public static qa2.a x(f30 pin, wa2.m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        qa2.a aVar = pinFeatureConfig.f128859f0;
        if (aVar != null) {
            return aVar;
        }
        if (pinFeatureConfig.B) {
            return qa2.a.CLAIMED_CONTENT;
        }
        if (n60.o.B(pin, "getIsPromoted(...)")) {
            return qa2.a.PROMOTED;
        }
        Boolean Y4 = pin.Y4();
        Intrinsics.checkNotNullExpressionValue(Y4, "getIsNative(...)");
        return Y4.booleanValue() ? qa2.a.CREATED_BY : b40.b0(pin) ? qa2.a.PICK_FOR_YOU : b40.A0(pin) ? qa2.a.INTEREST_PIN : pinFeatureConfig.f128850b ? qa2.a.ONTO_BOARD : qa2.a.PINNED_BY;
    }

    public static wy0 y(f30 pin, boolean z13, boolean z14, qa2.a attributionReason, es.a adFormats, boolean z15) {
        wy0 d2;
        hh t53;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(attributionReason, "attributionReason");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        if (z15) {
            wy0 z53 = pin.z5();
            if (z53 != null) {
                return z53;
            }
            hh t54 = pin.t5();
            if (t54 != null) {
                return t54.d();
            }
            return null;
        }
        es.c cVar = (es.c) adFormats;
        if (cVar.T(pin)) {
            wy0 n13 = b40.n(pin);
            if (n13 == null) {
                return null;
            }
            vy0 H4 = n13.H4();
            wy0 a63 = pin.a6();
            if (a63 != null) {
                H4.K(a63.U2());
                H4.D0(a63.P3());
                H4.N(a63.Z2());
            }
            return H4.a();
        }
        if (b40.r0(pin)) {
            wy0 N = b40.N(pin);
            return N == null ? pin.I5() : N;
        }
        if (!z13 && cVar.O(pin)) {
            return b40.N(pin);
        }
        if (!z14) {
            if (b40.Q0(pin) || b40.b1(pin) || b40.s0(pin)) {
                return b40.n(pin);
            }
            return null;
        }
        if (attributionReason == qa2.a.CREATED_BY) {
            wy0 z54 = pin.z5();
            return z54 == null ? pin.I5() : z54;
        }
        if (attributionReason != qa2.a.CLAIMED_CONTENT) {
            return pin.I5();
        }
        hh t55 = pin.t5();
        if (t55 == null || (d2 = t55.d()) == null || !Intrinsics.d(d2.I3(), Boolean.TRUE) || (t53 = pin.t5()) == null) {
            return null;
        }
        return t53.d();
    }

    public static PinterestVideoView z(Context context, nx.d0 pinalytics, int i13, int i14) {
        Integer[] numArr = PinterestVideoView.f52749c1;
        if ((i14 & 2) != 0) {
            pinalytics = sh.f.a();
            Intrinsics.checkNotNullExpressionValue(pinalytics, "get(...)");
        }
        if ((i14 & 4) != 0) {
            i13 = b1.video_view_default;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        View inflate = LayoutInflater.from(context).inflate(i13, (ViewGroup) null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.video.core.view.PinterestVideoView");
        PinterestVideoView pinterestVideoView = (PinterestVideoView) inflate;
        pinterestVideoView.W0 = pinalytics;
        return pinterestVideoView;
    }

    @Override // g4.t
    public Typeface B(g4.l lVar, int i13) {
        return A(null, lVar, i13);
    }

    @Override // ml1.d
    public float C() {
        return hf0.b.f69002b;
    }

    public k8.t[] D(k8.r[] rVarArr, l8.e eVar) {
        k8.t bVar;
        v2 w13 = k8.b.w(rVarArr);
        k8.t[] tVarArr = new k8.t[rVarArr.length];
        for (int i13 = 0; i13 < rVarArr.length; i13++) {
            k8.r rVar = rVarArr[i13];
            if (rVar != null) {
                int[] iArr = rVar.f78574b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        bVar = new k8.u(iArr[0], rVar.f78575c, rVar.f78573a);
                    } else {
                        long j13 = 25000;
                        bVar = new k8.b(rVar.f78573a, iArr, rVar.f78575c, eVar, 10000, j13, j13, 1279, 719, 0.7f, 0.75f, (c1) w13.get(i13), d7.e.f53809a);
                    }
                    tVarArr[i13] = bVar;
                }
            }
        }
        return tVarArr;
    }

    @Override // ka.a
    public void G(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db3.d("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }

    public boolean J() {
        return this instanceof g;
    }

    public AudioTrack N(o7.m mVar, a7.f fVar, int i13) {
        int i14 = n0.f53866a;
        if (i14 < 23) {
            return new AudioTrack(O(fVar, mVar.f93144a), n0.s(mVar.f93146c, mVar.f93148e, mVar.f93145b), mVar.f93149f, 1, i13);
        }
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(O(fVar, mVar.f93144a)).setAudioFormat(n0.s(mVar.f93146c, mVar.f93148e, mVar.f93145b)).setTransferMode(1).setBufferSizeInBytes(mVar.f93149f).setSessionId(i13);
        if (i14 >= 29) {
            sessionId.setOffloadedPlayback(mVar.f93147d);
        }
        return sessionId.build();
    }

    public void Q(float f13, float f14, float f15, z zVar) {
        zVar.d(f13, 0.0f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.i
    public byte[] a(byte[] bArr, int i13, int i14) {
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        return bArr2;
    }

    @Override // ar0.f
    public boolean b(int i13, int i14) {
        return i13 <= i14 + 9;
    }

    @Override // ha.d
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // h8.q
    public long g() {
        throw new NoSuchElementException();
    }

    @Override // l9.j
    public int h(androidx.media3.common.b bVar) {
        String str = bVar.f18765o;
        if (str != null) {
            str.hashCode();
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(a.a.j("Unsupported MIME type: ", str));
    }

    @Override // ha.d
    public void i(int i13, Object obj) {
        String str;
        switch (i13) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i13 == 6 || i13 == 7 || i13 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    @Override // g4.t
    public Typeface j(g4.n nVar, g4.l lVar, int i13) {
        nVar.getClass();
        return A("sans-serif", lVar, i13);
    }

    @Override // h8.q
    public long k() {
        throw new NoSuchElementException();
    }

    @Override // a6.a
    public Object l(CorruptionException corruptionException) {
        throw corruptionException;
    }

    public void n(long j13, String str, byte[][] bArr, boolean z13, long j14) {
        N.Muq3ic6p(j13, str, bArr, z13, j14);
    }

    @Override // h8.q
    public boolean next() {
        return false;
    }

    public void o(long j13, String str, int i13, int i14) {
        N.MyRIv1Ij(j13, str, i13, i14);
    }

    @Override // at1.h
    public boolean onResourcesError(String str) {
        return false;
    }

    @Override // at1.h
    public void onResourcesReady(int i13) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l9.j
    public l9.l p(androidx.media3.common.b bVar) {
        String str = bVar.f18765o;
        if (str != null) {
            char c13 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c13 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c13 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c13 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c13 = '\b';
                        break;
                    }
                    break;
            }
            List list = bVar.f18768r;
            switch (c13) {
                case 0:
                    return new n9.i(list);
                case 1:
                    return new m.h(3);
                case 2:
                    return new u9.a();
                case 3:
                    return new sp2.i(18, (Object) null);
                case 4:
                    return new s9.a(list);
                case 5:
                    return new p9.b(list);
                case 6:
                    return new m.h(list);
                case 7:
                    return new q9.a();
                case '\b':
                    return new r9.e();
            }
        }
        throw new IllegalArgumentException(a.a.j("Unsupported MIME type: ", str));
    }

    @Override // l9.j
    public boolean r(androidx.media3.common.b bVar) {
        String str = bVar.f18765o;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // ak2.g
    public boolean test(Object obj) {
        return true;
    }

    @Override // ml1.d
    public float v() {
        return hf0.b.f69003c;
    }

    public f() {
        Process.myTid();
    }
}
