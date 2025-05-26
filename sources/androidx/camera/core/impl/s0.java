package androidx.camera.core.impl;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class s0 {

    /* renamed from: i */
    public static final c f16964i = new c(Integer.TYPE, null, "camerax.core.captureConfig.rotation");

    /* renamed from: j */
    public static final c f16965j = new c(Integer.class, null, "camerax.core.captureConfig.jpegQuality");

    /* renamed from: k */
    public static final c f16966k = new c(Range.class, null, "camerax.core.captureConfig.resolvedFrameRate");

    /* renamed from: a */
    public final List f16967a;

    /* renamed from: b */
    public final v0 f16968b;

    /* renamed from: c */
    public final int f16969c;

    /* renamed from: d */
    public final boolean f16970d;

    /* renamed from: e */
    public final List f16971e;

    /* renamed from: f */
    public final boolean f16972f;

    /* renamed from: g */
    public final u2 f16973g;

    /* renamed from: h */
    public final z f16974h;

    public s0(ArrayList arrayList, v1 v1Var, int i13, boolean z13, ArrayList arrayList2, boolean z14, u2 u2Var, z zVar) {
        this.f16967a = arrayList;
        this.f16968b = v1Var;
        this.f16969c = i13;
        this.f16971e = Collections.unmodifiableList(arrayList2);
        this.f16972f = z14;
        this.f16973g = u2Var;
        this.f16974h = zVar;
        this.f16970d = z13;
    }

    public final int a() {
        Object obj = this.f16973g.f16977a.get("CAPTURE_CONFIG_ID_KEY");
        if (obj == null) {
            return -1;
        }
        return ((Integer) obj).intValue();
    }

    public final int b() {
        Integer num = (Integer) this.f16968b.j(z2.f17025wn, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int c() {
        Integer num = (Integer) this.f16968b.j(z2.f17026xn, 0);
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
