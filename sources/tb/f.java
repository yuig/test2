package tb;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.activity.k0;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.media3.common.ParserException;
import ao2.l0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kb.i0;
import kh2.k3;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1.f1;
import pc.c0;
import pc.d0;
import pc.e0;
import pc.f0;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a */
    public static long f116965a;

    /* renamed from: b */
    public static Method f116966b;

    /* renamed from: c */
    public static Method f116967c;

    /* renamed from: d */
    public static Method f116968d;

    /* renamed from: e */
    public static Method f116969e;

    /* renamed from: f */
    public static ThreadPoolExecutor f116970f;

    /* renamed from: g */
    public static final /* synthetic */ int f116971g = 0;

    public static void A(String str, boolean z13) {
        if (!z13) {
            throw ParserException.a(str, null);
        }
    }

    public static final void B(long j13, f1 f1Var) {
        if (f1Var == f1.Vertical) {
            if (n4.a.g(j13) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
            }
        } else if (n4.a.h(j13) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.".toString());
        }
    }

    public static void C(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e13) {
                throw e13;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] D(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            jArr[i13] = iArr[i13];
        }
        return jArr;
    }

    public static void E(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    public static void F(k6.b bVar, OutputStream outputStream, int i13) {
        byte[] bArr = new byte[8192];
        while (i13 > 0) {
            int min = Math.min(i13, 8192);
            int read = bVar.read(bArr, 0, min);
            if (read != min) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i13 -= read;
            outputStream.write(bArr, 0, read);
        }
    }

    public static final long G() {
        return Thread.currentThread().getId();
    }

    public static final boolean H(int i13, int i14) {
        return i13 == i14;
    }

    public static final r4.l I(ub.j jVar, String debugTag, Function0 block) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(debugTag, "debugTag");
        Intrinsics.checkNotNullParameter(block, "block");
        r4.l L = com.bumptech.glide.d.L(new l0.d(jVar, debugTag, block, 10));
        Intrinsics.checkNotNullExpressionValue(L, "getFuture { completer ->… }\n        debugTag\n    }");
        return L;
    }

    public static final float J(float f13) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f13) & 8589934591L) / 3)) + 709952852);
        float f14 = intBitsToFloat - ((intBitsToFloat - (f13 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f14 - ((f14 - (f13 / (f14 * f14))) * 0.33333334f);
    }

    public static Object K(c0 c0Var, Object obj) {
        e0 operation = e0.f99540i;
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, c0Var);
    }

    public static ApiException L(Status status) {
        return status.f30753h != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static c0 M(c0 c0Var, d0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.d(c0Var.getKey(), key)) {
            return c0Var;
        }
        return null;
    }

    public static float N(String[] strArr, int i13) {
        float parseFloat = Float.parseFloat(strArr[i13]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static void O(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final void P(i2.o oVar, Function2 function2) {
        Intrinsics.g(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        dl2.b.y(2, function2);
        function2.invoke(oVar, 1);
    }

    public static boolean Q() {
        if (Build.VERSION.SDK_INT >= 29) {
            return ta.a.c();
        }
        try {
            if (f116966b == null) {
                f116965a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f116966b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f116966b.invoke(null, Long.valueOf(f116965a))).booleanValue();
        } catch (Exception e13) {
            O("isTagEnabled", e13);
            return false;
        }
    }

    public static boolean R(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static r4.l S(CoroutineContext context, Function2 block) {
        l0 start = l0.DEFAULT;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(block, "block");
        r4.l L = com.bumptech.glide.d.L(new n7.o(context, start, block, 4));
        Intrinsics.checkNotNullExpressionValue(L, "getFuture { completer ->…owable)\n        }\n    }\n}");
        return L;
    }

    public static final bk.f T(final bk.f tracer, final String label, final ub.j executor, final Function0 block) {
        Intrinsics.checkNotNullParameter(tracer, "tracer");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(block, "block");
        final androidx.lifecycle.l0 state = new androidx.lifecycle.l0(i0.Go);
        r4.l future = com.bumptech.glide.d.L(new r4.j() { // from class: kb.j0
            @Override // r4.j
            public final Object C(r4.i completer) {
                Intrinsics.checkNotNullParameter(completer, "completer");
                executor.execute(new k0(tracer, label, block, state, completer, 0));
                return Unit.f80348a;
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->…}\n            }\n        }");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(future, "future");
        return new bk.f();
    }

    public static final float U(float f13, float f14, float f15) {
        return (f15 * f14) + ((1 - f15) * f13);
    }

    public static final int V(int i13, float f13, int i14) {
        return i13 + ((int) Math.round((i14 - i13) * f13));
    }

    public static f0 W(c0 c0Var, d0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.d(c0Var.getKey(), key) ? pc.y.f99612b : c0Var;
    }

    public static final ParcelableSnapshotMutableIntState X(int i13) {
        int i14 = i2.c.f71081b;
        return new ParcelableSnapshotMutableIntState(i13);
    }

    public static f0 Z(c0 c0Var, f0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return context == pc.y.f99612b ? c0Var : (f0) context.d(c0Var);
    }

    public static int c0(Context context, int i13, int i14) {
        TypedValue W0 = com.bumptech.glide.c.W0(context, i13);
        return (W0 == null || W0.type != 16) ? i14 : W0.data;
    }

    public static TimeInterpolator d0(Context context, int i13, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i13, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!R(valueOf, "cubic-bezier") && !R(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!R(valueOf, "cubic-bezier")) {
            if (R(valueOf, "path")) {
                return new PathInterpolator(k3.J(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
        if (split.length == 4) {
            return new PathInterpolator(N(split, 0), N(split, 1), N(split, 2), N(split, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
    }

    public static final void e0(View view, k0 onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(androidx.activity.l0.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }

    public static final void f0(i2.o oVar, Object obj, Function2 function2) {
        i2.s sVar = (i2.s) oVar;
        if (sVar.O || !Intrinsics.d(sVar.J(), obj)) {
            sVar.g0(obj);
            sVar.d(obj, function2);
        }
    }

    public static void g0(int i13, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ta.a.d(i13, k0(str));
            return;
        }
        String k03 = k0(str);
        try {
            if (f116969e == null) {
                f116969e = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f116969e.invoke(null, Long.valueOf(f116965a), k03, Integer.valueOf(i13));
        } catch (Exception e13) {
            O("traceCounter", e13);
        }
    }

    public static final boolean h0(pc.m mVar, Map variableValues) {
        boolean z13;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(variableValues, "variableValues");
        Iterator it = mVar.f99585d.iterator();
        do {
            z13 = false;
            if (!it.hasNext()) {
                return false;
            }
            ((pc.k) it.next()).getClass();
            Object obj = variableValues.get("shouldRequestPinsubTopicId");
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            if (bool != null) {
                z13 = bool.booleanValue();
            }
        } while (z13);
        return true;
    }

    public static boolean i0(String str) {
        return str == null || str.isEmpty();
    }

    public static Bitmap j0(Drawable drawable, int i13, int i14, int i15) {
        if ((i15 & 1) != 0) {
            i13 = drawable.getIntrinsicWidth();
        }
        if ((i15 & 2) != 0) {
            i14 = drawable.getIntrinsicHeight();
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (i13 == bitmapDrawable.getBitmap().getWidth() && i14 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i13, i14, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i16 = bounds.left;
        int i17 = bounds.top;
        int i18 = bounds.right;
        int i19 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i13, i14);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i16, i17, i18, i19);
        return createBitmap;
    }

    public static String k0(String str) {
        return str.length() <= 127 ? str : str.substring(0, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
    }

    public static void l0(wa2.l lVar, int i13) {
        lVar.setBounds(i13, lVar.getBounds().top, lVar.getBounds().right, lVar.getBounds().bottom);
    }

    public static ThreadPoolExecutor m0() {
        if (f116970f == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new pd.a(2));
            f116970f = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f116970f;
    }

    public static final ArrayList t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            nk.j jVar = (nk.j) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", jVar.f91081a);
            bundle.putLong("event_timestamp", jVar.f91082b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final ExecutorService u(boolean z13) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new kb.e(z13));
        Intrinsics.checkNotNullExpressionValue(newFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return newFixedThreadPool;
    }

    public static String w(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b13 : bArr) {
            sb3.append(String.format("%02x", Byte.valueOf(b13)));
        }
        return sb3.toString();
    }

    public abstract void Y(Object obj);

    public abstract void a0(r4.g gVar, r4.g gVar2);

    public abstract void b0(r4.g gVar, Thread thread);

    public abstract String v();

    public abstract boolean x(r4.h hVar, r4.d dVar, r4.d dVar2);

    public abstract boolean y(r4.h hVar, Object obj, Object obj2);

    public abstract boolean z(r4.h hVar, r4.g gVar, r4.g gVar2);
}
