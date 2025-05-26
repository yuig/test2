package aa0;

import android.content.Context;
import c72.n;
import g72.i0;
import g72.u4;
import g72.v1;
import java.util.LinkedHashMap;
import k62.h;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.h0;
import r72.j0;
import xk2.m;
import xk2.v;

/* loaded from: classes5.dex */
public final class d implements j62.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1616a;

    /* renamed from: b, reason: collision with root package name */
    public final n f1617b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f1618c;

    /* renamed from: d, reason: collision with root package name */
    public final v f1619d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f1620e;

    /* renamed from: f, reason: collision with root package name */
    public final v f1621f;

    /* renamed from: g, reason: collision with root package name */
    public final v f1622g;

    public d(Context context, n entityMapper, h0 experiments) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entityMapper, "entityMapper");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f1616a = context;
        this.f1617b = entityMapper;
        this.f1618c = experiments;
        this.f1619d = m.b(new b(this, 0));
        this.f1620e = q0.f80391a;
        this.f1621f = m.b(new b(this, 1));
        this.f1622g = m.b(new b(this, 2));
    }

    public static k62.a b(d dVar, i0 i0Var, int i13, String str) {
        return d(dVar, dVar.f1617b.d(i0Var, false), i13, str, c.f1614l);
    }

    public static k62.a c(d dVar, u4 u4Var, int i13, String str) {
        return d(dVar, dVar.f1617b.f(u4Var), i13, str, c.f1612j);
    }

    public static k62.a d(d dVar, j0 j0Var, int i13, String str, Function1 function1) {
        String string = dVar.f1616a.getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        function1.invoke(linkedHashMap);
        return new k62.a(j0Var, new k62.b(string, linkedHashMap, str, false));
    }

    public static k62.d e(d dVar, int i13, int i14, h hVar, int i15) {
        if ((i15 & 8) != 0) {
            hVar = h.DEFAULT;
        }
        q0 q0Var = q0.f80391a;
        String string = dVar.f1616a.getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new k62.d(string, i14, "", hVar, q0Var);
    }

    public final k62.a a(v1 v1Var, int i13, String str, Function1 function1) {
        return d(this, this.f1617b.b(v1Var, false), i13, str, function1);
    }
}
