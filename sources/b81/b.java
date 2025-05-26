package b81;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Base64;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import ll.j;
import nm.o;
import nm.q;
import nm.r;
import nm.s;
import nm.u;
import z71.d;
import z71.f;
import z71.g;
import z71.h;
import z71.i;

/* loaded from: classes5.dex */
public final class b implements r {
    @Override // nm.r
    public final Object a(s sVar, Type type, j jVar) {
        Matrix matrix;
        Object obj;
        u i13 = sVar != null ? sVar.i() : null;
        Intrinsics.f(i13);
        u i14 = i13.y("config").i();
        s y13 = i14.y("matrix");
        if (y13 != null) {
            q f13 = y13.f();
            float[] fArr = new float[9];
            for (int i15 = 0; i15 < 9; i15++) {
                fArr[i15] = 0.0f;
            }
            Iterator it = f13.f91364a.iterator();
            int i16 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i17 = i16 + 1;
                if (i16 < 0) {
                    f0.p();
                    throw null;
                }
                s sVar2 = (s) next;
                if (i16 < 9) {
                    fArr[i16] = sVar2.d();
                }
                i16 = i17;
            }
            matrix = new Matrix();
            matrix.setValues(fArr);
        } else {
            matrix = null;
        }
        f fVar = (f) new o().e(i14, f.class);
        s v13 = i14.v("type");
        String p13 = v13 != null ? v13.p() : null;
        if (Intrinsics.d(p13, z71.b.CUTOUT.toString())) {
            h hVar = (h) new o().e(i13, h.class);
            u i18 = i13.y("collageItem").i();
            Intrinsics.f(fVar);
            f config = f.a(fVar, matrix, null, null, 27);
            d dVar = (d) new o().e(i18, d.class);
            String p14 = i18.y("bitmap").i().v("bitmap").p();
            Intrinsics.checkNotNullExpressionValue(p14, "getAsString(...)");
            byte[] decode = Base64.decode(p14, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            Intrinsics.f(dVar);
            d collageItem = d.a(dVar, decodeByteArray);
            hVar.getClass();
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(collageItem, "collageItem");
            obj = new h(config, collageItem);
        } else if (Intrinsics.d(p13, z71.b.BACKGROUND.toString())) {
            g gVar = (g) new o().e(i13, g.class);
            Intrinsics.f(gVar);
            Intrinsics.f(fVar);
            obj = g.c(gVar, f.a(fVar, matrix, null, null, 27));
        } else {
            obj = (i) new o().e(i13, h.class);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "let(...)");
        return obj;
    }
}
