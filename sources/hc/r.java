package hc;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final tb.c f68672a = tb.c.k("x", "y");

    public static int a(ic.d dVar) {
        dVar.a();
        int s13 = (int) (dVar.s1() * 255.0d);
        int s14 = (int) (dVar.s1() * 255.0d);
        int s15 = (int) (dVar.s1() * 255.0d);
        while (dVar.hasNext()) {
            dVar.E();
        }
        dVar.d();
        return Color.argb(255, s13, s14, s15);
    }

    public static PointF b(ic.d dVar, float f13) {
        int i13 = q.f68671a[dVar.g().ordinal()];
        if (i13 == 1) {
            float s13 = (float) dVar.s1();
            float s14 = (float) dVar.s1();
            while (dVar.hasNext()) {
                dVar.E();
            }
            return new PointF(s13 * f13, s14 * f13);
        }
        if (i13 == 2) {
            dVar.a();
            float s15 = (float) dVar.s1();
            float s16 = (float) dVar.s1();
            while (dVar.g() != ic.c.END_ARRAY) {
                dVar.E();
            }
            dVar.d();
            return new PointF(s15 * f13, s16 * f13);
        }
        if (i13 != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + dVar.g());
        }
        dVar.c();
        float f14 = 0.0f;
        float f15 = 0.0f;
        while (dVar.hasNext()) {
            int k13 = dVar.k(f68672a);
            if (k13 == 0) {
                f14 = d(dVar);
            } else if (k13 != 1) {
                dVar.m();
                dVar.E();
            } else {
                f15 = d(dVar);
            }
        }
        dVar.e();
        return new PointF(f14 * f13, f15 * f13);
    }

    public static ArrayList c(ic.d dVar, float f13) {
        ArrayList arrayList = new ArrayList();
        dVar.a();
        while (dVar.g() == ic.c.BEGIN_ARRAY) {
            dVar.a();
            arrayList.add(b(dVar, f13));
            dVar.d();
        }
        dVar.d();
        return arrayList;
    }

    public static float d(ic.d dVar) {
        ic.c g13 = dVar.g();
        int i13 = q.f68671a[g13.ordinal()];
        if (i13 == 1) {
            return (float) dVar.s1();
        }
        if (i13 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + g13);
        }
        dVar.a();
        float s13 = (float) dVar.s1();
        while (dVar.hasNext()) {
            dVar.E();
        }
        dVar.d();
        return s13;
    }
}
