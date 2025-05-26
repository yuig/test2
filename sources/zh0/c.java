package zh0;

import android.os.Bundle;
import android.os.Parcel;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import tb0.g;
import tb0.h;
import tb0.k;
import xk2.m;
import xk2.v;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final v f141974a = m.b(b.f141973i);

    public static final void a(Bundle bundle, String screenName, Float f13, float f14) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        if (b()) {
            float floatValue = f13 != null ? f13.floatValue() : c(bundle);
            if (floatValue > f14) {
                int i13 = (((int) floatValue) / 50) * 50;
                HashSet hashSet = h.f117076w;
                h hVar = g.f117075a;
                k kVar = new k();
                kVar.c("sizeMb", ">= " + i13);
                kVar.c("screen", screenName);
                hVar.k("LargeBundle", kVar.f117102a);
                hVar.o("sizeMB=" + i13 + ", screen=" + screenName, new IllegalArgumentException("Excessive Bundle size"));
            }
        }
    }

    public static final boolean b() {
        return ((Boolean) f141974a.getValue()).booleanValue();
    }

    public static final float c(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        try {
            obtain.writeBundle(bundle);
            float dataSize = obtain.dataSize() / 1048576.0f;
            obtain.recycle();
            return dataSize;
        } catch (Exception unused) {
            obtain.recycle();
            return -1.0f;
        } catch (Throwable th3) {
            obtain.recycle();
            throw th3;
        }
    }
}
