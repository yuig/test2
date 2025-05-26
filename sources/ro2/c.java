package ro2;

import androidx.lifecycle.k0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.p2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class c implements no2.i {

    /* renamed from: d */
    public static final b f108975d = new b(new k(false, false, false, false, false, true, "    ", false, false, "type", false, true, false, false, a.POLYMORPHIC), to2.g.f118716a);

    /* renamed from: a */
    public final k f108976a;

    /* renamed from: b */
    public final to2.d f108977b;

    /* renamed from: c */
    public final k0 f108978c = new k0(7);

    public c(k kVar, to2.d dVar) {
        this.f108976a = kVar;
        this.f108977b = dVar;
    }

    public final Object a(no2.a deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        so2.g0 g0Var = new so2.g0(string);
        Object m13 = new so2.c0(this, so2.i0.OBJ, g0Var, deserializer.a(), null).m(deserializer);
        if (g0Var.e() == 10) {
            return m13;
        }
        so2.g0.n(g0Var, "Expected EOF after parsing, but had " + g0Var.f114793e.charAt(g0Var.f114789a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(no2.h serializer, Object obj) {
        char[] cArr;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        so2.r rVar = new so2.r();
        so2.e eVar = so2.e.f114775d;
        synchronized (eVar) {
            kotlin.collections.v vVar = (kotlin.collections.v) eVar.f130083c;
            cArr = null;
            char[] cArr2 = (char[]) (vVar.isEmpty() ? null : vVar.removeLast());
            if (cArr2 != null) {
                eVar.f130082b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];
        }
        rVar.f114809a = cArr;
        try {
            p2.Y(this, rVar, serializer, obj);
            return rVar.toString();
        } finally {
            rVar.b();
        }
    }
}
