package me;

import a.cb;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.wy0;
import df.j1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.r2;
import lh0.z3;
import ni1.x2;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static Method f87004a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f87005b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f87006c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f87007d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f87008e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f87009f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f87010g;

    /* renamed from: h, reason: collision with root package name */
    public static Method f87011h;

    /* renamed from: i, reason: collision with root package name */
    public static Method f87012i;

    /* renamed from: j, reason: collision with root package name */
    public static Method f87013j;

    /* renamed from: k, reason: collision with root package name */
    public static Method f87014k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f87015l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f87016m;

    /* renamed from: n, reason: collision with root package name */
    public static Constructor f87017n;

    /* renamed from: o, reason: collision with root package name */
    public static g1 f87018o;

    public static final Object a(Activity activity, Class entryPoint) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return j1.b0(entryPoint, activity);
    }

    public static final Object b(Context context, Class entryPoint) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        return j1.b0(entryPoint, com.bumptech.glide.c.C(context.getApplicationContext()));
    }

    public static boolean c(boolean z13, boolean z14) {
        return z13 && !z14;
    }

    public static boolean f(f30 pin, x2 experimentConfigs) {
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!c(experimentConfigs.Q, experimentConfigs.W)) {
            return false;
        }
        wy0 z53 = pin.z5();
        if (z53 == null) {
            hh t53 = pin.t5();
            z53 = t53 != null ? t53.d() : null;
        }
        wy0 wy0Var = z53;
        if (wy0Var == null) {
            return false;
        }
        Boolean M4 = pin.M4();
        Intrinsics.checkNotNullExpressionValue(M4, "getIsEligibleForPdp(...)");
        return h(experimentConfigs.R, experimentConfigs.S, experimentConfigs.T, experimentConfigs.U, experimentConfigs.V, experimentConfigs.X, wy0Var, M4.booleanValue());
    }

    public static boolean g(r2 experiments, f30 pin) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!c(experiments.W(), experiments.R("enabled_pwt", z3.DO_NOT_ACTIVATE_EXPERIMENT))) {
            return false;
        }
        wy0 z53 = pin.z5();
        if (z53 == null) {
            hh t53 = pin.t5();
            z53 = t53 != null ? t53.d() : null;
        }
        wy0 wy0Var = z53;
        if (wy0Var == null) {
            return false;
        }
        z3 z3Var = a4.f83297a;
        boolean R = experiments.R("enabled_remove_all", z3Var);
        boolean z13 = experiments.R("enabled_show_trusted_and_verified", z3Var) || experiments.R("employees", z3Var);
        boolean R2 = experiments.R("enabled_show_trusted_and_verified_with_checkmark", z3Var);
        boolean R3 = experiments.R("enabled_show_trusted_with_checkmark", z3Var);
        boolean R4 = experiments.R("enabled_show_verified_with_checkmark", z3Var);
        boolean R5 = experiments.R("enabled_text_only", z3Var);
        Boolean M4 = pin.M4();
        Intrinsics.checkNotNullExpressionValue(M4, "getIsEligibleForPdp(...)");
        return h(R, z13, R2, R3, R4, R5, wy0Var, M4.booleanValue());
    }

    public static boolean h(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, wy0 wy0Var, boolean z19) {
        boolean y13 = cb.y(wy0Var, "getIsVerifiedMerchant(...)");
        boolean z23 = dl2.b.V1(wy0Var) && !y13;
        boolean z24 = (z14 || z18) && (z23 || y13);
        boolean z25 = z15 && (z23 || y13);
        boolean z26 = z16 && y13;
        boolean z27 = z17 && z23;
        if (z19 || z13) {
            return false;
        }
        return z24 || z25 || z26 || z27;
    }

    public abstract void d(int i13);

    public abstract void e(Typeface typeface, boolean z13);

    public abstract void i(byte[] bArr, int i13, int i14);
}
