package xt1;

import android.content.Context;
import com.pinterest.api.model.qw;
import dl1.l;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import so.oa;
import x02.i2;
import x02.v1;
import x02.x0;
import x02.z0;

/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f135918a = new a();

    public final l a(String typeName) {
        Map map;
        Intrinsics.checkNotNullParameter(typeName, "jsonType");
        Intrinsics.checkNotNullParameter(typeName, "jsonType");
        qw.Companion.getClass();
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        map = qw.lookupByName;
        qw modelType = (qw) map.get(typeName);
        if (modelType == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(modelType, "modelType");
        Context context = kb0.a.f79058b;
        so1.b bVar = (so1.b) ep.b.g(so1.b.class);
        int i13 = b.f135919a[modelType.ordinal()];
        if (i13 == 1) {
            return (i2) ((oa) bVar).F3.get();
        }
        if (i13 == 2) {
            return (x0) ((oa) bVar).f113765k3.get();
        }
        if (i13 == 3) {
            return ((oa) bVar).G2();
        }
        if (i13 == 4) {
            return (v1) ((oa) bVar).f113960v4.get();
        }
        if (i13 != 5) {
            return null;
        }
        return (z0) ((oa) bVar).B3.get();
    }
}
