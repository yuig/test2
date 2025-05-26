package yq0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.y2;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final y2 f139746a;

    /* renamed from: b, reason: collision with root package name */
    public final ox.b f139747b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f139748c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f139749d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f139750e;

    public v(y2 experiments, ox.b analyticsApi) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        this.f139746a = experiments;
        this.f139747b = analyticsApi;
        this.f139748c = new LinkedHashMap();
        this.f139750e = new LinkedHashSet();
    }

    public final void a() {
        synchronized (this.f139748c) {
            try {
                if (this.f139749d) {
                    return;
                }
                Field[] declaredFields = RecyclerViewTypes.class.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
                for (Field field : declaredFields) {
                    if (Intrinsics.d(field.getType(), Integer.TYPE)) {
                        String name = field.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        if (kotlin.text.z.p(name, "VIEW_TYPE_", false)) {
                            LinkedHashMap linkedHashMap = this.f139748c;
                            Integer valueOf = Integer.valueOf(field.getInt(RecyclerViewTypes.INSTANCE));
                            String name2 = field.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            linkedHashMap.put(valueOf, name2);
                        }
                    }
                }
                this.f139749d = true;
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
