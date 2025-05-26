package com.bumptech.glide;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ao2.v0;
import com.google.firebase.messaging.q;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.MalformedJsonException;
import com.pinterest.api.model.ap0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.n90;
import com.pinterest.api.model.om0;
import com.pinterest.api.model.r70;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.s01;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.uo0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.yo0;
import com.pinterest.api.model.zo0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenDescription;
import com.pinterest.navigation.Navigation;
import df.j1;
import h32.a4;
import h32.d4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import h32.w0;
import h32.x3;
import h32.y1;
import h32.z1;
import i2.s;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;
import kb.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import lb.e0;
import lb.l0;
import m60.f0;
import nm.t;
import nx.d0;
import org.xmlpull.v1.XmlPullParserException;
import pk.a0;
import pk.a2;
import pk.b2;
import qa2.h0;
import qm.n1;
import so.oa;
import t3.f2;

/* loaded from: classes.dex */
public abstract class d {
    public static final float A(int i13, i2.o oVar) {
        s sVar = (s) oVar;
        return ((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b)).getResources().getDimension(i13) / ((n4.b) sVar.m(f2.f115983f)).b();
    }

    public static final z1 A0(z1 z1Var, Function1 updateBlock) {
        Intrinsics.checkNotNullParameter(z1Var, "<this>");
        Intrinsics.checkNotNullParameter(updateBlock, "updateBlock");
        y1 y1Var = new y1(z1Var);
        updateBlock.invoke(y1Var);
        return y1Var.a();
    }

    public static final boolean B(int i13, int i14) {
        return i13 == i14;
    }

    public static final String B0(List list) {
        Object obj;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter("Content-Type", "name");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (z.i(((qc.f) obj).f103431a, "Content-Type", true)) {
                break;
            }
        }
        qc.f fVar = (qc.f) obj;
        if (fVar != null) {
            return fVar.f103432b;
        }
        return null;
    }

    public static final BitmapDrawable C(rm1.d dVar, Context context) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        rm1.g gVar = dVar.f108695a;
        Drawable c03 = bs1.c.c0(context, gVar.b(context));
        d7.b.A0(c03, dl2.b.x0(context, dVar.f108696b.getColorAttrRes()));
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return d7.b.p0(c03, resources, dl2.b.F0(context, gVar.a()), dl2.b.F0(context, gVar.a()));
    }

    public static int C0(Object obj) {
        if (obj == null) {
            return 4;
        }
        if (obj instanceof String) {
            return l0.J((String) obj).length;
        }
        int i13 = 16;
        if (obj instanceof Boolean) {
            return 16;
        }
        if (obj instanceof Integer) {
            return 4;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return 8;
        }
        int i14 = 0;
        if (obj instanceof List) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                i14 += C0(it.next());
            }
        } else {
            if (obj instanceof wc.c) {
                return l0.J(((wc.c) obj).f129079a).length + 16;
            }
            if (!(obj instanceof Map)) {
                throw new IllegalStateException(("Unknown field type in Record: '" + obj + '\'').toString());
            }
            Map map = (Map) obj;
            Iterator it2 = map.keySet().iterator();
            int i15 = 0;
            while (it2.hasNext()) {
                i15 += C0(it2.next());
            }
            i13 = 16 + i15;
            Iterator it3 = map.values().iterator();
            while (it3.hasNext()) {
                i14 += C0(it3.next());
            }
        }
        return i13 + i14;
    }

    public static final BitmapDrawable D(rm1.d dVar, Context context, g92.d theme) {
        int drawableRes;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        rm1.g gVar = dVar.f108695a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(theme, "theme");
        if (gVar instanceof rm1.f) {
            drawableRes = ((rm1.f) gVar).f108702a.drawableRes(context, theme);
        } else {
            if (!(gVar instanceof rm1.e)) {
                throw new NoWhenBranchMatchedException();
            }
            drawableRes = ((rm1.e) gVar).f108700a.drawableRes(context, theme);
        }
        Drawable c03 = bs1.c.c0(context, drawableRes);
        d7.b.A0(c03, dl2.b.x0(context, dVar.f108696b.getColorAttrRes()));
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return d7.b.p0(c03, resources, dl2.b.F0(context, gVar.a()), dl2.b.F0(context, gVar.a()));
    }

    public static boolean D0(File file, String str) {
        byte[] bytes = str.getBytes();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static final b60.b E() {
        Context context = kb0.a.f79058b;
        return ((oa) ((b60.c) l0.k0(f0.X(), b60.c.class))).l2();
    }

    public static final void E0(String uid, Function1 block) {
        Intrinsics.checkNotNullParameter(nc2.h.f90405a, "<this>");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(block, "block");
        nc2.l videoState = nc2.h.a(uid);
        block.invoke(videoState);
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(videoState, "videoState");
        nc2.h.f90407c.put(uid, videoState);
    }

    public static final boolean F(nl1.d dVar, String key) {
        Bundle arguments;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ScreenDescription screenDescription = dVar.f76937a;
        if (screenDescription == null || (arguments = screenDescription.getF49207c()) == null) {
            arguments = dVar.getArguments();
        }
        if (arguments != null && arguments.containsKey(key)) {
            return arguments.getBoolean(key, false);
        }
        Bundle arguments2 = dVar.getArguments();
        if (arguments2 == null || !arguments2.containsKey(key)) {
            Navigation navigation = dVar.I;
            if (navigation != null) {
                return navigation.S(key, false);
            }
            return false;
        }
        Bundle arguments3 = dVar.getArguments();
        if (arguments3 != null) {
            return arguments3.getBoolean(key, false);
        }
        return false;
    }

    public static final boolean G(nl1.d dVar, String key, boolean z13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ScreenDescription screenDescription = dVar.f76937a;
        Boolean bool = null;
        Bundle f49207c = screenDescription != null ? screenDescription.getF49207c() : null;
        if (f49207c != null && f49207c.containsKey(key)) {
            return f49207c.getBoolean(key, z13);
        }
        ll.j jVar = dVar.V;
        if (jVar == null) {
            Navigation navigation = dVar.I;
            return navigation != null ? navigation.S(key, z13) : z13;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        Intent intent = (Intent) jVar.f83754b;
        if (intent != null && intent.hasExtra(key)) {
            bool = Boolean.valueOf(((Intent) jVar.f83754b).getBooleanExtra(key, false));
        }
        return bool != null ? bool.booleanValue() : z13;
    }

    public static ColorStateList H(Context context, TypedArray typedArray, int i13) {
        int resourceId;
        ColorStateList b13;
        return (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0 || (b13 = d5.a.b(context, resourceId)) == null) ? typedArray.getColorStateList(i13) : b13;
    }

    public static ColorStateList I(Context context, x92.b bVar, int i13) {
        int C;
        ColorStateList b13;
        return (!bVar.G(i13) || (C = bVar.C(i13, 0)) == 0 || (b13 = d5.a.b(context, C)) == null) ? bVar.u(i13) : b13;
    }

    public static int J(Context context, TypedArray typedArray, int i13, int i14) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i13, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i13, i14);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i14);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable K(Context context, TypedArray typedArray, int i13) {
        int resourceId;
        Drawable I;
        return (!typedArray.hasValue(i13) || (resourceId = typedArray.getResourceId(i13, 0)) == 0 || (I = c.I(context, resourceId)) == null) ? typedArray.getDrawable(i13) : I;
    }

    public static r4.l L(r4.j jVar) {
        r4.i iVar = new r4.i();
        iVar.f106124c = new r4.n();
        r4.l lVar = new r4.l(iVar);
        iVar.f106123b = lVar;
        iVar.f106122a = jVar.getClass();
        try {
            Object C = jVar.C(iVar);
            if (C != null) {
                iVar.f106122a = C;
            }
        } catch (Exception e13) {
            lVar.a(e13);
        }
        return lVar;
    }

    public static final String M(uo0 uo0Var, String largeImageWidth, String fallbackLargeImageWidth) {
        sr srVar;
        Map d2;
        sr srVar2;
        Map d13;
        om0 p13;
        Map d14;
        sr srVar3;
        Map d15;
        String j13;
        om0 q13;
        Map d16;
        sr srVar4;
        Map d17;
        Intrinsics.checkNotNullParameter(uo0Var, "<this>");
        Intrinsics.checkNotNullParameter(largeImageWidth, "largeImageWidth");
        Intrinsics.checkNotNullParameter(fallbackLargeImageWidth, "fallbackLargeImageWidth");
        Intrinsics.checkNotNullParameter(uo0Var, "<this>");
        Intrinsics.checkNotNullParameter(largeImageWidth, "largeImageWidth");
        Intrinsics.checkNotNullParameter(fallbackLargeImageWidth, "fallbackLargeImageWidth");
        om0 q14 = uo0Var.q();
        if (q14 == null || (d17 = q14.d()) == null || (srVar = (sr) d17.get(largeImageWidth)) == null) {
            om0 q15 = uo0Var.q();
            srVar = (q15 == null || (d2 = q15.d()) == null) ? null : (sr) d2.get(fallbackLargeImageWidth);
        }
        if (srVar != null) {
            Double k13 = srVar.k();
            Intrinsics.checkNotNullExpressionValue(k13, "getWidth(...)");
            double doubleValue = k13.doubleValue();
            Double h10 = srVar.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getHeight(...)");
            if (doubleValue > h10.doubleValue() && (q13 = uo0Var.q()) != null && (d16 = q13.d()) != null && (srVar4 = (sr) d16.get("1200x")) != null) {
                srVar = srVar4;
            }
        }
        if (srVar != null && (j13 = srVar.j()) != null) {
            return j13;
        }
        Intrinsics.checkNotNullParameter(uo0Var, "<this>");
        Intrinsics.checkNotNullParameter(largeImageWidth, "largeImageWidth");
        Intrinsics.checkNotNullParameter(fallbackLargeImageWidth, "fallbackLargeImageWidth");
        Intrinsics.checkNotNullParameter(uo0Var, "<this>");
        Intrinsics.checkNotNullParameter(largeImageWidth, "largeImageWidth");
        Intrinsics.checkNotNullParameter(fallbackLargeImageWidth, "fallbackLargeImageWidth");
        om0 p14 = uo0Var.p();
        if (p14 == null || (d15 = p14.d()) == null || (srVar2 = (sr) d15.get(largeImageWidth)) == null) {
            om0 p15 = uo0Var.p();
            srVar2 = (p15 == null || (d13 = p15.d()) == null) ? null : (sr) d13.get(fallbackLargeImageWidth);
        }
        if (srVar2 != null) {
            Double k14 = srVar2.k();
            Intrinsics.checkNotNullExpressionValue(k14, "getWidth(...)");
            double doubleValue2 = k14.doubleValue();
            Double h13 = srVar2.h();
            Intrinsics.checkNotNullExpressionValue(h13, "getHeight(...)");
            if (doubleValue2 > h13.doubleValue() && (p13 = uo0Var.p()) != null && (d14 = p13.d()) != null && (srVar3 = (sr) d14.get("1200x")) != null) {
                srVar2 = srVar3;
            }
        }
        String j14 = srVar2 != null ? srVar2.j() : null;
        return j14 == null ? "" : j14;
    }

    public static final List N(nl1.d dVar, String key, List defaultValue) {
        ArrayList Q1;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        ScreenDescription screenDescription = dVar.f76937a;
        Bundle f49207c = screenDescription != null ? screenDescription.getF49207c() : null;
        if (f49207c != null && f49207c.containsKey(key)) {
            ArrayList<Integer> integerArrayList = f49207c.getIntegerArrayList(key);
            return integerArrayList == null ? defaultValue : integerArrayList;
        }
        ll.j jVar = dVar.V;
        if (jVar != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = (Intent) jVar.f83754b;
            Q1 = intent != null ? intent.getIntegerArrayListExtra(key) : null;
            if (Q1 == null) {
                return defaultValue;
            }
        } else {
            Navigation navigation = dVar.I;
            Q1 = navigation != null ? navigation.Q1(key) : null;
            if (Q1 == null) {
                return defaultValue;
            }
        }
        return Q1;
    }

    public static final int O(nl1.d dVar, String key, int i13) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ScreenDescription screenDescription = dVar.f76937a;
        Integer num = null;
        Bundle f49207c = screenDescription != null ? screenDescription.getF49207c() : null;
        if (f49207c != null && f49207c.containsKey(key)) {
            return f49207c.getInt(key, i13);
        }
        ll.j jVar = dVar.V;
        if (jVar == null) {
            Navigation navigation = dVar.I;
            return navigation != null ? navigation.q1(i13, key) : i13;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        Intent intent = (Intent) jVar.f83754b;
        if (intent != null && intent.hasExtra(key)) {
            num = Integer.valueOf(((Intent) jVar.f83754b).getIntExtra(key, -1));
        }
        return num != null ? num.intValue() : i13;
    }

    public static final int P(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Boolean S4 = f30Var.S4();
        Intrinsics.checkNotNullExpressionValue(S4, "getIsFullWidth(...)");
        if (S4.booleanValue() && n60.o.B(f30Var, "getIsPromoted(...)")) {
            return yi1.s.f139154n;
        }
        Boolean S42 = f30Var.S4();
        Intrinsics.checkNotNullExpressionValue(S42, "getIsFullWidth(...)");
        return S42.booleanValue() ? yi1.s.f139153m : yi1.s.f139152l;
    }

    public static final wy0 Q(b60.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        wy0 f13 = ((b60.d) bVar).f();
        if (f13 != null) {
            return f13;
        }
        throw new IllegalAccessException("Active User not found");
    }

    public static final Parcelable R(nl1.d dVar, String key) {
        Parcelable b23;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ScreenDescription screenDescription = dVar.f76937a;
        Bundle f49207c = screenDescription != null ? screenDescription.getF49207c() : null;
        if (f49207c == null || !f49207c.containsKey(key)) {
            ll.j jVar = dVar.V;
            if (jVar != null) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intent intent = (Intent) jVar.f83754b;
                b23 = intent != null ? intent.getParcelableExtra(key) : null;
                if (b23 == null) {
                    return null;
                }
            } else {
                Navigation navigation = dVar.I;
                if (navigation == null || (b23 = navigation.b2(key)) == null) {
                    return null;
                }
            }
        } else {
            b23 = f49207c.getParcelable(key);
            if (b23 == null) {
                return null;
            }
        }
        return b23;
    }

    public static final f30 S(qa2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.getC0();
    }

    public static final wa2.a T(qa2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return bVar.getPinDrawable();
    }

    public static final z1 U(h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        return h0Var.getE0();
    }

    public static final Serializable V(nl1.d dVar, String key, Serializable serializable) {
        Bundle arguments;
        Serializable Z0;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ScreenDescription screenDescription = dVar.f76937a;
        if (screenDescription == null || (arguments = screenDescription.getF49207c()) == null) {
            arguments = dVar.getArguments();
        }
        if (arguments != null && arguments.containsKey(key)) {
            return arguments.getSerializable(key);
        }
        Bundle arguments2 = dVar.getArguments();
        if (arguments2 == null || !arguments2.containsKey(key)) {
            Navigation navigation = dVar.I;
            if (navigation == null || (Z0 = navigation.Z0(key, serializable)) == null) {
                return serializable;
            }
        } else {
            Bundle arguments3 = dVar.getArguments();
            if (arguments3 == null || (Z0 = arguments3.getSerializable(key)) == null) {
                return serializable;
            }
        }
        return Z0;
    }

    public static final Serializable W(nl1.d dVar, String key) {
        Serializable serializableExtra;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        ScreenDescription screenDescription = dVar.f76937a;
        Bundle f49207c = screenDescription != null ? screenDescription.getF49207c() : null;
        if (f49207c == null || !f49207c.containsKey(key)) {
            ll.j jVar = dVar.V;
            if (jVar == null) {
                Navigation navigation = dVar.I;
                if (navigation != null) {
                    return navigation.Z0(key, null);
                }
                return null;
            }
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = (Intent) jVar.f83754b;
            serializableExtra = intent != null ? intent.getSerializableExtra(key) : null;
            if (serializableExtra == null) {
                return null;
            }
        } else {
            serializableExtra = f49207c.getSerializable(key);
            if (serializableExtra == null) {
                return null;
            }
        }
        return serializableExtra;
    }

    public static final String X(nl1.d dVar, String key) {
        String g23;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter("", "defaultValue");
        ScreenDescription screenDescription = dVar.f76937a;
        Bundle f49207c = screenDescription != null ? screenDescription.getF49207c() : null;
        if (f49207c != null && f49207c.containsKey(key)) {
            String string = f49207c.getString(key, "");
            Intrinsics.f(string);
            return string;
        }
        Bundle arguments = dVar.getArguments();
        if (arguments == null || !arguments.containsKey(key)) {
            Navigation navigation = dVar.I;
            return (navigation == null || (g23 = navigation.g2(key, "")) == null) ? "" : g23;
        }
        Bundle arguments2 = dVar.getArguments();
        String string2 = arguments2 != null ? arguments2.getString(key, "") : null;
        return string2 == null ? "" : string2;
    }

    public static final List Y(nl1.d dVar, String key, q0 defaultValue) {
        ArrayList M;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        ScreenDescription screenDescription = dVar.f76937a;
        Bundle f49207c = screenDescription != null ? screenDescription.getF49207c() : null;
        if (f49207c != null && f49207c.containsKey(key)) {
            ArrayList<String> stringArrayList = f49207c.getStringArrayList(key);
            return stringArrayList == null ? defaultValue : stringArrayList;
        }
        ll.j jVar = dVar.V;
        if (jVar != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intent intent = (Intent) jVar.f83754b;
            M = intent != null ? intent.getStringArrayListExtra(key) : null;
            if (M == null) {
                return defaultValue;
            }
        } else {
            Navigation navigation = dVar.I;
            M = navigation != null ? navigation.M(key) : null;
            if (M == null) {
                return defaultValue;
            }
        }
        return M;
    }

    public static final String Z(nl1.d dVar, String key, String defaultValue) {
        String g23;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        ScreenDescription screenDescription = dVar.f76937a;
        Bundle f49207c = screenDescription != null ? screenDescription.getF49207c() : null;
        if (f49207c != null && f49207c.containsKey(key)) {
            String string = f49207c.getString(key, defaultValue);
            Intrinsics.f(string);
            return string;
        }
        ll.j jVar = dVar.V;
        if (jVar == null) {
            Navigation navigation = dVar.I;
            return (navigation == null || (g23 = navigation.g2(key, defaultValue)) == null) ? defaultValue : g23;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        Intent intent = (Intent) jVar.f83754b;
        String stringExtra = intent != null ? intent.getStringExtra(key) : null;
        return stringExtra == null ? defaultValue : stringExtra;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        if (r1 == false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(i2.d2 r10, kotlin.jvm.functions.Function2 r11, i2.o r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.a(i2.d2, kotlin.jvm.functions.Function2, i2.o, int):void");
    }

    public static final boolean a0(uo0 uo0Var) {
        Boolean bool;
        boolean z13;
        Intrinsics.checkNotNullParameter(uo0Var, "<this>");
        List<ro0> o13 = uo0Var.o();
        if (o13 != null) {
            for (ro0 ro0Var : o13) {
            }
        }
        yo0 yo0Var = new yo0();
        List o14 = uo0Var.o();
        if (o14 != null) {
            ArrayList Q = CollectionsKt.Q(o14);
            if (!Q.isEmpty()) {
                Iterator it = Q.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(((ro0) it.next()).a(yo0Var), Boolean.TRUE)) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            bool = Boolean.valueOf(z13);
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [i2.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(i2.d2[] r7, kotlin.jvm.functions.Function2 r8, i2.o r9, int r10) {
        /*
            i2.s r9 = (i2.s) r9
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            r9.Y(r0)
            i2.z1 r0 = r9.o()
            i2.t1 r1 = i2.u.f71306b
            r2 = 201(0xc9, float:2.82E-43)
            r9.T(r2, r1)
            boolean r1 = r9.O
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L27
            q2.l r1 = q2.l.f102116g
            q2.l r1 = bf.b.q0(r7, r0, r1)
            q2.l r0 = r9.f0(r0, r1)
            r9.I = r2
        L25:
            r1 = r3
            goto L6c
        L27:
            i2.v2 r1 = r9.F
            int r4 = r1.f71324g
            java.lang.Object r1 = r1.g(r4, r3)
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            kotlin.jvm.internal.Intrinsics.g(r1, r4)
            i2.z1 r1 = (i2.z1) r1
            i2.v2 r5 = r9.F
            int r6 = r5.f71324g
            java.lang.Object r5 = r5.g(r6, r2)
            kotlin.jvm.internal.Intrinsics.g(r5, r4)
            i2.z1 r5 = (i2.z1) r5
            q2.l r4 = bf.b.q0(r7, r0, r5)
            boolean r6 = r9.z()
            if (r6 == 0) goto L5d
            boolean r6 = r9.f71288x
            if (r6 != 0) goto L5d
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r4)
            if (r5 != 0) goto L58
            goto L5d
        L58:
            r9.O()
            r0 = r1
            goto L25
        L5d:
            q2.l r0 = r9.f0(r0, r4)
            boolean r4 = r9.f71288x
            if (r4 != 0) goto L6b
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r1 != 0) goto L25
        L6b:
            r1 = r2
        L6c:
            if (r1 == 0) goto L75
            boolean r4 = r9.O
            if (r4 != 0) goto L75
            r9.H(r0)
        L75:
            boolean r4 = r9.f71286v
            i2.z0 r5 = r9.f71287w
            r5.b(r4)
            r9.f71286v = r1
            r9.f71264J = r0
            i2.t1 r1 = i2.u.f71307c
            r4 = 202(0xca, float:2.83E-43)
            r9.R(r4, r1, r0, r3)
            int r0 = r10 >> 3
            r0 = r0 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.invoke(r9, r0)
            r9.r(r3)
            r9.r(r3)
            int r0 = r5.a()
            if (r0 == 0) goto L9f
            goto La0
        L9f:
            r2 = r3
        La0:
            r9.f71286v = r2
            r0 = 0
            r9.f71264J = r0
            i2.f2 r9 = r9.t()
            if (r9 == 0) goto Lb3
            k1.z r0 = new k1.z
            r1 = 6
            r0.<init>(r7, r8, r10, r1)
            r9.f71113d = r0
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.b(i2.d2[], kotlin.jvm.functions.Function2, i2.o, int):void");
    }

    public static final boolean b0(uo0 uo0Var) {
        Boolean bool;
        boolean z13;
        Intrinsics.checkNotNullParameter(uo0Var, "<this>");
        List<ro0> o13 = uo0Var.o();
        if (o13 != null) {
            for (ro0 ro0Var : o13) {
            }
        }
        zo0 zo0Var = new zo0();
        List o14 = uo0Var.o();
        if (o14 != null) {
            ArrayList Q = CollectionsKt.Q(o14);
            if (!Q.isEmpty()) {
                Iterator it = Q.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(((ro0) it.next()).a(zo0Var), Boolean.TRUE)) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            bool = Boolean.valueOf(z13);
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final a3.d c(long j13, long j14) {
        return new a3.d(a3.c.d(j13), a3.c.e(j13), a3.f.d(j14) + a3.c.d(j13), a3.f.b(j14) + a3.c.e(j13));
    }

    public static final boolean c0(uo0 uo0Var) {
        Boolean bool;
        boolean z13;
        Intrinsics.checkNotNullParameter(uo0Var, "<this>");
        List<ro0> o13 = uo0Var.o();
        if (o13 != null) {
            for (ro0 ro0Var : o13) {
            }
        }
        ap0 ap0Var = new ap0();
        List o14 = uo0Var.o();
        if (o14 != null) {
            ArrayList Q = CollectionsKt.Q(o14);
            if (!Q.isEmpty()) {
                Iterator it = Q.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.d(((ro0) it.next()).a(ap0Var), Boolean.TRUE)) {
                        z13 = true;
                        break;
                    }
                }
            }
            z13 = false;
            bool = Boolean.valueOf(z13);
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void d(x92.b bVar) {
        n60.o.w(bVar, "explorearticle.type", "explorearticle.content_type", "explorearticle.id", "explorearticle.title");
        bVar.e("explorearticle.subtitle");
        bVar.h("explorearticle.cover_images", "236x");
        bVar.h("explorearticle.cover_images", "474x");
        n60.o.A(bVar, "explorearticle.cover_images", "280x280", "explorearticle.dominant_colors", "explorearticle.story_category");
        n60.o.w(bVar, "explorearticle.curator()", "explorearticle.video_cover_pin()", "explorearticle.show_cover", "explorearticle.action");
        bVar.e("explorearticle.cover_positions()");
        bVar.e("explorearticle.cover_shuffle_assets()");
    }

    public static boolean d0(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static void e(x92.b bVar) {
        j1.i(bVar);
        bVar.e("user.first_name");
        bVar.e("user.username");
        bVar.e("user.last_name");
        bVar.e("user.age_in_years");
        n60.o.w(bVar, "user.gender", "user.custom_gender", "user.partner()", "user.show_creator_profile");
        n60.o.w(bVar, "user.follower_count", "user.country", "user.should_show_messaging", "user.should_default_comments_off");
        n60.o.w(bVar, "user.is_private_profile", "user.is_under_16", "user.is_under_18", "user.avatar_color_index");
        bVar.e("user.save_behavior");
        bVar.e("user.vto_beauty_access_status");
    }

    public static final boolean e0(Uri uri, List pathSegments) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        int size = pathSegments.size();
        return (size == 1 && Intrinsics.d("pinterestlens", uri.getHost()) && Intrinsics.d("virtual_try_on", pathSegments.get(0))) || (size == 2 && Intrinsics.d("pinterestlens", pathSegments.get(0)) && Intrinsics.d("virtual_try_on", pathSegments.get(1)));
    }

    public static final String f0(f30 f30Var) {
        String t13;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        n90 W5 = f30Var.W5();
        if (W5 != null && (t13 = W5.t()) != null) {
            return t13;
        }
        n90 W52 = f30Var.W5();
        if (W52 != null) {
            return W52.u();
        }
        return null;
    }

    public static void g(String str, boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.ByteArrayOutputStream g0(java.io.File r7) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2f
            int r2 = r1.available()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L29
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L29
            r1.read(r2)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L29
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L29
            r3.<init>()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L29
            r3.write(r2)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r3.flush()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L24
            r1.close()     // Catch: java.lang.Exception -> L1d
        L1d:
            r3.close()     // Catch: java.lang.Exception -> L20
        L20:
            return r3
        L21:
            r7 = move-exception
        L22:
            r0 = r1
            goto L73
        L24:
            r2 = move-exception
            goto L32
        L26:
            r7 = move-exception
            r3 = r0
            goto L22
        L29:
            r2 = move-exception
            r3 = r0
            goto L32
        L2c:
            r7 = move-exception
            r3 = r0
            goto L73
        L2f:
            r2 = move-exception
            r1 = r0
            r3 = r1
        L32:
            java.lang.String r4 = r7.getPath()     // Catch: java.lang.Throwable -> L21
            java.lang.String r5 = "MY_HOME_FEED"
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L68
            java.util.HashSet r4 = tb0.h.f117076w     // Catch: java.lang.Throwable -> L21
            tb0.h r4 = tb0.g.f117075a     // Catch: java.lang.Throwable -> L21
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r6.<init>()     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = r7.getPath()     // Catch: java.lang.Throwable -> L21
            r6.append(r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = " org_msg:"
            r6.append(r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = r2.getMessage()     // Catch: java.lang.Throwable -> L21
            r6.append(r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = r6.toString()     // Catch: java.lang.Throwable -> L21
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L21
            java.lang.String r7 = "IOUtils:LoadFile"
            r4.o(r7, r5)     // Catch: java.lang.Throwable -> L21
        L68:
            if (r1 == 0) goto L6d
            r1.close()     // Catch: java.lang.Exception -> L6d
        L6d:
            if (r3 == 0) goto L72
            r3.close()     // Catch: java.lang.Exception -> L72
        L72:
            return r0
        L73:
            if (r0 == 0) goto L78
            r0.close()     // Catch: java.lang.Exception -> L78
        L78:
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.lang.Exception -> L7d
        L7d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.g0(java.io.File):java.io.ByteArrayOutputStream");
    }

    public static void h(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static final void h0(f30 makeupProductPin, d0 pinalytics, Integer num, u0 elementType) {
        w0 h03;
        Intrinsics.checkNotNullParameter(makeupProductPin, "makeupProductPin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        s01 O6 = makeupProductPin.O6();
        r70 f13 = O6 != null ? O6.f() : null;
        if (f13 != null) {
            pinalytics.p();
            f1 f1Var = f1.VIRTUAL_TRY_ON_PIN_APPLY;
            String f39332b = makeupProductPin.getF39332b();
            HashMap hashMap = new HashMap();
            bs1.c.G1("vto_brand_name", f13.h(), hashMap);
            bs1.c.G1("vto_product_line", f13.j(), hashMap);
            bs1.c.G1("vto_shade_name", f13.l(), hashMap);
            bs1.c.G1("vto_makeup_type", f13.k(), hashMap);
            bs1.c.G1("vto_product_gtin", f13.i(), hashMap);
            bs1.c.G1("vto_product_sku", f13.m(), hashMap);
            if (num != null) {
                hashMap.put("vto_swatch_index", num.toString());
            }
            h03 = pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1Var, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : f39332b, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
            if (h03 != null) {
                return;
            }
        }
        d0.v(pinalytics, f1.VIRTUAL_TRY_ON_PIN_APPLY, makeupProductPin.getF39332b(), false, 12);
    }

    public static void i(String str, boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static final i0 i0(g0 g0Var, a4 a4Var, d4 d4Var, String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        return new i0(d4Var, a4Var, new x3(null, null, null, null, null, id3, null, null, null, null, null, null, null, null, null, null, null), g0Var, null, null);
    }

    public static void j(boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException();
        }
    }

    public static final void j0(Context context) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            b0 e13 = b0.e();
            str = e0.f82588a;
            e13.a(str, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry entry : k0(context).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        b0 e14 = b0.e();
                        str3 = e0.f82588a;
                        e14.i(str3, "Over-writing contents of " + file2);
                    }
                    String str4 = file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed";
                    b0 e15 = b0.e();
                    str2 = e0.f82588a;
                    e15.a(str2, str4);
                }
            }
        }
    }

    public static void k(String str, int i13, int i14, int i15) {
        if (i13 < i14) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i14 + ", " + i15 + "] (too low)");
        }
        if (i13 <= i15) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i14 + ", " + i15 + "] (too high)");
    }

    public static Map k0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        Intrinsics.checkNotNullParameter(context, "context");
        File file = new File(ve.h.w(context), "androidx.work.workdb");
        String[] strArr = e0.f82589b;
        int a13 = y0.a(strArr.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (String str : strArr) {
            linkedHashMap.put(new File(databasePath.getPath() + str), new File(file.getPath() + str));
        }
        return z0.k(linkedHashMap, new Pair(databasePath, file));
    }

    public static void l(int i13) {
        if (i13 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static ArrayList l0(Object... objArr) {
        int length = objArr.length;
        a0.C(length, "arraySize");
        ArrayList arrayList = new ArrayList(d7.b.r0(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static void m(bi.f fVar) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != fVar.getLooper()) {
            throw new IllegalStateException(a.a.m("Must be called on ", fVar.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void n(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void o(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static final boolean o0(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void p(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException(str);
        }
    }

    public static e5.e p0(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            x0(xmlResourceParser);
            return null;
        }
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b5.d.FontFamily);
        String string = obtainAttributes.getString(b5.d.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(b5.d.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(b5.d.FontFamily_fontProviderQuery);
        String string4 = obtainAttributes.getString(b5.d.FontFamily_fontProviderFallbackQuery);
        int resourceId = obtainAttributes.getResourceId(b5.d.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(b5.d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(b5.d.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = obtainAttributes.getString(b5.d.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlResourceParser.next() != 3) {
                x0(xmlResourceParser);
            }
            List r03 = r0(resourceId, resources);
            return new e5.h(new m5.c(string, string2, string3, r03), string4 != null ? new m5.c(string, string2, string4, r03) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlResourceParser.next() != 3) {
            if (xmlResourceParser.getEventType() == 2) {
                if (xmlResourceParser.getName().equals("font")) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), b5.d.FontFamilyFont);
                    int i13 = obtainAttributes2.getInt(obtainAttributes2.hasValue(b5.d.FontFamilyFont_fontWeight) ? b5.d.FontFamilyFont_fontWeight : b5.d.FontFamilyFont_android_fontWeight, 400);
                    boolean z13 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(b5.d.FontFamilyFont_fontStyle) ? b5.d.FontFamilyFont_fontStyle : b5.d.FontFamilyFont_android_fontStyle, 0);
                    int i14 = obtainAttributes2.hasValue(b5.d.FontFamilyFont_ttcIndex) ? b5.d.FontFamilyFont_ttcIndex : b5.d.FontFamilyFont_android_ttcIndex;
                    String string6 = obtainAttributes2.getString(obtainAttributes2.hasValue(b5.d.FontFamilyFont_fontVariationSettings) ? b5.d.FontFamilyFont_fontVariationSettings : b5.d.FontFamilyFont_android_fontVariationSettings);
                    int i15 = obtainAttributes2.getInt(i14, 0);
                    int i16 = obtainAttributes2.hasValue(b5.d.FontFamilyFont_font) ? b5.d.FontFamilyFont_font : b5.d.FontFamilyFont_android_font;
                    int resourceId2 = obtainAttributes2.getResourceId(i16, 0);
                    String string7 = obtainAttributes2.getString(i16);
                    obtainAttributes2.recycle();
                    while (xmlResourceParser.next() != 3) {
                        x0(xmlResourceParser);
                    }
                    arrayList.add(new e5.g(i13, i15, resourceId2, string7, string6, z13));
                } else {
                    x0(xmlResourceParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e5.f((e5.g[]) arrayList.toArray(new e5.g[0]));
    }

    public static void q() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static nm.s q0(um.a aVar) {
        boolean z13;
        try {
            try {
                aVar.K();
                z13 = false;
            } catch (MalformedJsonException e13) {
                throw new JsonSyntaxException((Throwable) e13);
            } catch (IOException e14) {
                throw new JsonIOException((Throwable) e14);
            } catch (NumberFormatException e15) {
                throw new JsonSyntaxException((Throwable) e15);
            }
        } catch (EOFException e16) {
            e = e16;
            z13 = true;
        }
        try {
            return n1.B.c(aVar);
        } catch (EOFException e17) {
            e = e17;
            if (z13) {
                return t.f91365a;
            }
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    public static void r(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static List r0(int i13, Resources resources) {
        if (i13 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i13);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i14 = 0; i14 < obtainTypedArray.length(); i14++) {
                    int resourceId = obtainTypedArray.getResourceId(i14, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i13);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void s(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List s0(tc.f r12) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.s0(tc.f):java.util.List");
    }

    public static void t(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static final void t0(String uid, Function1 block) {
        Intrinsics.checkNotNullParameter(nc2.h.f90405a, "<this>");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(uid, "uid");
        if (nc2.h.f90407c.get(uid) != null) {
            block.invoke(nc2.h.a(uid));
        }
    }

    public static void u(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static gk2.f0 u0(oc.a aVar) {
        uj2.a0 scheduler = tk2.e.f118017c;
        Intrinsics.checkNotNullExpressionValue(scheduler, "io()");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        do2.i d2 = aVar.d();
        jo2.i iVar = new jo2.i(scheduler);
        io2.a[] aVarArr = io2.j.f73346a;
        xp2.a bVar = new io2.b(d2, v0.f20220b.plus(iVar));
        int i13 = uj2.h.f122339a;
        return new gk2.f0(bVar instanceof uj2.h ? (uj2.h) bVar : new fk2.d0(bVar, 2));
    }

    public static void v(String str, boolean z13) {
        if (!z13) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r7 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0093, code lost:
    
        if (r7 == null) goto L136;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void v0(l82.e r12, wa2.m r13) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.v0(l82.e, wa2.m):void");
    }

    public static void w(String str, boolean z13) {
        if (!z13) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void x0(XmlResourceParser xmlResourceParser) {
        int i13 = 1;
        while (i13 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i13++;
            } else if (next == 3) {
                i13--;
            }
        }
    }

    public static final StaticLayout y(CharSequence source, int i13, TextPaint paint, int i14, Layout.Alignment alignment, TextUtils.TruncateAt truncateAt, int i15, int i16, TextDirectionHeuristic textDirectionHeuristic) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(textDirectionHeuristic, "textDirectionHeuristic");
        if (i14 <= 0) {
            source = "";
            truncateAt = null;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        StaticLayout build = StaticLayout.Builder.obtain(source, 0, i13, paint, i14).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(false).setEllipsizedWidth(i15).setEllipsize(truncateAt).setMaxLines(i16).setTextDirection(textDirectionHeuristic).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static AbstractList y0(ok.t tVar, List list) {
        return list instanceof RandomAccess ? new a2(tVar, list) : new b2(tVar, list);
    }

    public static /* synthetic */ StaticLayout z(CharSequence charSequence, int i13, TextPaint textPaint, int i14, Layout.Alignment alignment, TextUtils.TruncateAt truncateAt, int i15, int i16) {
        TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
        return y(charSequence, i13, textPaint, i14, alignment, truncateAt, i15, i16, FIRSTSTRONG_LTR);
    }

    public static final i0 z0(i0 i0Var, Function1 updateBlock) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        Intrinsics.checkNotNullParameter(updateBlock, "updateBlock");
        h32.h0 h0Var = new h32.h0(i0Var);
        updateBlock.invoke(h0Var);
        return h0Var.a();
    }

    public abstract void f(am2.d dVar);

    public abstract void m0(Throwable th3);

    public abstract void n0(q qVar);

    public void w0(am2.d member, Collection overridden) {
        Intrinsics.checkNotNullParameter(member, "member");
        Intrinsics.checkNotNullParameter(overridden, "overridden");
        member.n0(overridden);
    }

    public abstract void x(am2.d dVar, am2.d dVar2);
}
